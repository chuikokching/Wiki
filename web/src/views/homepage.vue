<template>
    <div class="homepage">
        <section>

        <div class="v1">
            <video src="../../public/video/22222.mp4" loop="loop" type="video/mp4" autoplay="autoplay"></video>
        </div>

        <div class="headercontainer">
            <div class="logo">
                <a href="/">InfernoFlame</a>
            </div>

            <div class="leftlogo">
                <a href="/">TestBottom</a>
            </div>
        </div>

        <div class="content">
            <div class="container">
                <h1></h1>
                <h3></h3>
                <p></p>
                <span></span>
            </div>
        </div>

        <div class="main">
            <li style="--l:20%"><router-link to="/">首页</router-link></li>
            <li style="--l:30%"><router-link to="/about">文档</router-link></li>
            <li style="--l:40%"><router-link to="/about">相册</router-link></li>
            <li style="--l:50%"><router-link to="/about">作品</router-link></li>
            <li style="--l:60%"><router-link to="/ebook">知识库</router-link></li>
            <li style="--l:70%"><router-link to="/about">关于我</router-link></li>
            <li style="--l:80%"><router-link to="/about">联系我</router-link></li>
            <div class="top"></div>
            <div class="middle"></div>
            <div class="bottom"></div>
        </div>


        <div class="maincontainer">
            <div class="menu">个人站点导航!!!</div>
            <div class="profilebar">个人资料!!!</div>
        </div>

        <div>
            <a-back-top />
            <strong style="color: rgba(64, 64, 64, 0.6)"></strong>
        </div>
        </section>
    </div>
</template>


<style scoped>


    *{
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    .content{
        width: 100%;
        height: 100vh;
        display: flex;
        align-items: center;
        z-index: 5;
    }


    .container{
        width: 80%;
        margin: 0 auto;
        line-height: 1.8;
    }

    .container h1{
        width: 38%;
        font-size: 50px;
        font-weight: 400;
        border-bottom: 2px solid #fff;
    }

    .container h3{
        width:60%;
        font-size: 38px;
        font-weight: 400;
    }

    .container p{
        width: 60%;
        padding-top: 40px;
        font-size: 18px;
    }

    .container span{
        font-size: 40px;
        color: rgba(56,186,183,1);
        font-weight: 400;
        display: block;
        margin-top: 40px;
        position: relative;
        top: 0;
        animation: move is infinite;
    }

    @keyframes move{
        0%{
            top:0;
        }

        50%{
            top:20px;
        }
        100%{
            top:0;
        }
    }

    .v1{
        width: 100%;
        height: 100vh;
        position: absolute;
        top: 0;
        left: 0;
        z-index: 10;
        display: block;
    }

    .v1 video{
        width: 100%;
        height: 100%;
        object-fit: cover;
    }

    .headercontainer{
        width: 100%;
        position: absolute;
        top: 0;
        left: 0;
        z-index: 100;
        display: flex;
        justify-content: space-between;
    }

    .logo{
        position: relative;
        top: 50px;
        left: 50px;
    }

    .leftlogo{
        position: relative;
        top: 50px;
        right: 50px;
    }


    /*--*/

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


    /*--*/

    .maincontainer{
        float: left;
        width: 100%;
        height: auto;
    }

    .menu{
        float: left;
        width: 60%;
        height: 950px;
        background-color: #8cc8ff;
    }


    .profilebar{
        float: left;
        width: 40%;
        height: 950px;
        background-color: #eaff8f;
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
        color:#ffffff;
        font-weight: 600;
        font-family: "Arial Black";
    }
</style>