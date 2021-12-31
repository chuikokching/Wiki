<template>
    <a-layout-header class="header">
        <div class="logo" />
        <a-menu
                theme="dark"
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
        height: 90px;
    }
</style>