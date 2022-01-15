<template>
    <the-header></the-header>

    <a-table
            :columns="columns"
            :row-key="record => record.id"
            :data-source="ebooks"
            :pagination="pagination"
            :loading="loading"
            @change="handleTableChange"
    >
        <template #cover="{ text: cover }">
            <img v-if="cover" :src="cover" alt="avatar" />
        </template>
        <template v-slot:action="{ text, record }">
            <a-space size="small">
                <a-button type="primary" @click="edit(record)">
                    编辑
                </a-button>
                <a-button type="danger">
                    删除
                </a-button>
            </a-space>
        </template>
    </a-table>

    <a-modal v-model:visible="modalVisible" title="知识库表单" @ok="handleModalOk">
        <template #footer>
            <a-button key="back" @click="handleCancel">Return</a-button>
            <a-button key="submit" type="primary" :loading="modalLoading" @click="handleModalOk">Submit</a-button>
        </template>
        <a-form :model="ebook" :label-col="{ span: 6 }" :wrapper-col="{ span: 18 }">
            <a-form-item label="封面">
                <a-input v-model:value="ebook.cover" />
            </a-form-item>
            <a-form-item label="名称">
                <a-input v-model:value="ebook.name" />
            </a-form-item>
            <a-form-item label="分类一">
                <a-input v-model:value="ebook.category1Id" />
            </a-form-item>
            <a-form-item label="分类二">
                <a-input v-model:value="ebook.category2Id" />
            </a-form-item>
            <a-form-item label="描述">
                <a-input v-model:value="ebook.desc" type="textarea" />
            </a-form-item>
        </a-form>
    </a-modal>

</template>

<script lang="ts">
    import {defineComponent, onMounted, ref} from 'vue';
    import TheHeader from '@/components/the-header.vue';
    import axios from 'axios';


    export default defineComponent({
        name: 'AdminEbook',
        components:{
            TheHeader
        },
        setup() {

            //==========表单=============
            const ebook = ref({});
            const modalLoading = ref(false);
            const modalVisible = ref(false);
            const edit = (record: any) => {
                modalVisible.value = true;
                ebook.value=record;
            };

            const handleModalOk = () => {
                modalLoading.value = true;

                axios.post("/ebook/save", ebook.value).then((response) => {

                    const data = response.data; //data = commonResp
                    if(data.success){
                        modalLoading.value = false;
                        modalVisible.value = false;


                        //重新加载列表
                        handleQuery({
                            page:pagination.value.current,
                            size:pagination.value.pageSize,
                        });
                    }

                });
            };

            const handleCancel = () => {
                modalVisible.value = false;
            };

            const ebooks = ref();
            const pagination = ref({
                current: 1, //当前页
                pageSize: 4, //每页条数
                total: 0
            });
            const loading = ref(false);

            const columns = [
                {
                    title: '封面',
                    dataIndex: 'cover',
                    slots: { customRender: 'cover' }
                },
                {
                    title: '名称',
                    dataIndex: 'name'
                },
                {
                    title: '分类一',
                    key: 'category1Id',
                    dataIndex: 'category1Id'
                },
                {
                    title: '分类二',
                    dataIndex: 'category2Id'
                },
                {
                    title: '文档数',
                    dataIndex: 'docCount'
                },
                {
                    title: '阅读数',
                    dataIndex: 'viewCount'
                },
                {
                    title: '点赞数',
                    dataIndex: 'voteCount'
                },
                {
                    title: 'Action',
                    key: 'action',
                    slots: { customRender: 'action' }
                }
            ];

            /**
             * 数据查询
             **/
            const handleQuery = (p: any) => {
                loading.value = true;
                axios.get("/ebook/list", {
                    params: {
                        page:p.page,
                        size:p.size
                    }
                }).then((response) => {
                    loading.value = false;
                    const data = response.data;
                    ebooks.value = data.content.list;

                    // 重置分页按钮
                    pagination.value.current = p.page;
                    pagination.value.total = data.content.total;
                });
            };

            /**
             * 表格点击页码时触发
             */
            const handleTableChange = (pagination: any) => {
                console.log("看看自带的分页参数都有啥：" + pagination);
                handleQuery({
                    page: pagination.current,
                    size: pagination.pageSize
                });
            };

            onMounted(() => {
                handleQuery({
                    page:1,
                    size:pagination.value.pageSize,
                });
            });

            return {
                ebooks,
                pagination,
                columns,
                loading,
                handleTableChange,
                modalVisible,
                modalLoading,
                handleCancel,
                handleModalOk,
                edit,
                ebook,
            }
        }
    });

</script>

<style scoped>

    img {
        width: 50px;
        height: 50px;
    }
</style>