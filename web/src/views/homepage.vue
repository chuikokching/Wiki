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
        z-index: 10;
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

    .main{
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