<template>
    <div class="homepage">
        <div class="page">关于主页!!!</div>
        <section>
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

    .page{
        width: 100%;
        height: 450px;
        background-color: #dce0e6;
    }

    .main{
        width: 100%;
        height: auto;
    }

    .menu{
        float:left;
        width: 60%;
        height: 950px;
        background-color: #8cc8ff;
    }

    .profilebar{
        float:left;
        width: 40%;
        height: 950px;
        background-color: #eaff8f;
    }
</style>