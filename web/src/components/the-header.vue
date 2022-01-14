<template>
    <a-layout-header class="header">

    <div class="container">
        <div class="logo">
            <a href="/">InfernoFlame</a>
        </div>

        <a-menu
                theme="light"
                mode="horizontal"
                v-model:selectedKeys="selectedKeys1"
                :style="{ lineHeight: '90px', height: '94px'}"
        >
            <a-menu-item key="homepage">
                <router-link to="/">首页</router-link>
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
            <a-menu-item key="toggle">
            </a-menu-item>
        </a-menu>

    </div>
    <a-divider type="horizontal" />
        <!--<div class="test">测试模块</div>-->
    </a-layout-header>
</template>

<script lang="ts">
    import {defineComponent} from 'vue';

    export default defineComponent({
        name: 'the-header',
    });

</script>


<style scoped>
    .ant-layout-header{
        width: 100%;
        padding: 0px;
        height: 91px;
        background-color: #ffffff;
        z-index:300;
    }

    .ant-divider-horizontal {
        display: flex;
        clear: both;
        width: 100%;
        min-width: 100%;
        margin: 0;
    }

    .logo{
        float: left;
        width: 150px;
        height: 65px;
        margin: 12px 24px 16px 16px;
        margin-left: 50px;
    }

    .logo a{
        font-size: 40px;
        text-decoration: none;
        color:#333333;
        font-weight: 600;
        font-family: "Arial Black";
    }

    .container{
        display: flex;
        justify-content: space-between;
    }

    .split_line{
        height: 1px;
        background-color: #001529;
    }

</style>