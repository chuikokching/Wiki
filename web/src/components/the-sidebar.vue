<template>

    <div class="main">
        <li style="--l:20%"><router-link to="/">首页</router-link></li>
        <li style="--l:30%"><router-link to="/blog">文档</router-link></li>
        <li style="--l:40%"><router-link to="/album">相册</router-link></li>
        <li style="--l:50%"><router-link to="/work">作品</router-link></li>
        <li style="--l:60%"><router-link to="/ebook">知识库</router-link></li>
        <li style="--l:70%"><router-link to="/about">关于我</router-link></li>
        <li style="--l:80%"><router-link to="/contact">联系我</router-link></li>
        <div class="top"></div>
        <div class="middle"></div>
        <div class="bottom"></div>
    </div>
</template>

<script lang="ts">
    import {defineComponent} from 'vue';

    export default defineComponent({
        name: 'the-sidebar'
    });
</script>

<style scoped>
    .main { /* 菜单主体，默认宽度为10px,定位于屏幕左侧中间，不随页面滚动变化位置 */
        width: 10px;
        height: 700px;
        position: fixed;
        left: 0px;
        top: 50%;
        transform: translate(0%, -50%);
        background: black;
        overflow: hidden;
        transition: 0.4s linear;
        z-index: 200;
    }

    .main:hover { /* 展开尺寸130px,右侧圆角效果 */
        width: 155px;
        border-top-right-radius: 30px;
        border-bottom-right-radius: 30px;
    }

    .main:hover li a { /* 展开后超级链接字体为白色 */
        color: white;
        transition: 0.3s linear 0.4s;
    }

    .main::after,
    .main::before { /* 全高半宽 */
        width: 50%;
        height: 100%;
        position: absolute;
        content: "";
        z-index: -1;
    }

    .main::before { /* 左半边 */
        left: 0;
        top: 0;
        background: #722ed1;
    }

    .main::after { /* 右半边 */
        right: 0;
        top: 0;
        background: black;
    }

    .main .top { /* 上半部分黑色遮盖条，左下圆角效果 */
        width: calc(100% - 30px);
        margin-left:30px;
        height: 20%;
        background: black;
        border-bottom-left-radius: 20px;
        top: 0;
        left: 0;
        transition: 0.2s linear;
    }

    .main .middle { /* 中间部分蓝色底色，圆角效果 */
        width: calc(100% - 60px);
        height: 10%;
        background: #722ed1;
        margin-left: 40px;
        border-radius: 20px;
    }

    .main .bottom { /* 下半部分黑色遮盖条，左上圆角效果 */
        width: calc(100% - 30px);
        height: 100%;
        margin-left: 30px;
        background: black;
        border-top-left-radius: 20px;
    }

    .main li { /* 每条list占10%的高度,定位于菜单条中间 */
        position: absolute;
        top: var(--l);
        width: 100%;
        height: 60%;
        font-size: 20px;
        height: 10%;
        box-sizing: border-box;
        justify-content: center;
        display: flex;
        align-items: center;
    }

    li a { /* 默认文字颜色为无色 */
        color: transparent;
        transition: 0.3s linear;
    }

    /* 根据列表顺序通过改变顶部遮盖的高度，改变中部背景颜色的垂直位置 */
    li:nth-child(1):hover~.top {
        height: 20%;
    }

    li:nth-child(2):hover~.top {
        height: 30%;
    }

    li:nth-child(3):hover~.top {
        height: 40%;
    }

    li:nth-child(4):hover~.top {
        height: 50%;
    }

    li:nth-child(5):hover~.top{
        height: 60%;
    }

    li:nth-child(6):hover~.top {
        height: 70%;
    }
    li:nth-child(7):hover~.top {
        height: 80%;
    }

</style>