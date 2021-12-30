<template>
    <a-layout-footer style="text-align: center">
        <b>Copyright</b> ©2021 Created by chuikokching
    </a-layout-footer>
</template>

<script lang="ts">
    import {defineComponent} from 'vue';

    export default defineComponent({
        name: 'the-footer'
    });
</script>

<style scoped>
    .ant-layout-footer {
        bottom: 0;
        width: 100%;
        position: fixed;

    }

</style>