<template>
    <a-layout-header class="header">
        <div class="logo">

        </div>
        <a-menu
                theme="light"
                mode="horizontal"
                v-model:selectedKeys="selectedKeys1"
                :style="{ lineHeight: '90px', height: '90px'}"
        >
            <a-menu-item key="homepage">
                <router-link to="/"><a-icon type="solution" width="50px" height="50px" fill="red"/> 首页</router-link>
            </a-menu-item>
            <a-menu-item key="aboutme">
                <router-link to="/about">关于我</router-link>
            </a-menu-item>
            <a-menu-item key="ebook">
                <router-link to="/ebook">知识库</router-link>
            </a-menu-item>
            <a-menu-item key="adminebook">
                <router-link to="/admin/ebook">管理台</router-link>
            </a-menu-item>
        </a-menu>
    </a-layout-header>
</template>

<script lang="ts">
    import {defineComponent} from 'vue';

    export default defineComponent({
        name: 'the-header'
    });


</script>

<style scoped>
    .ant-layout-header{
        width: 100%;

        height: 90px;
        background-color: #ffffff;
    }

    .logo {
        float: left;
        width: 120px;
        height: 60px;
        margin: 16px 24px 16px 0;
        background: #8cc8ff;
    }
</style>