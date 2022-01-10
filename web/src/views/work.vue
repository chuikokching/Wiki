<template>

    <the-header></the-header>
    <the-sidebar></the-sidebar>
    <div class="work">
        <h1>This is a work page.</h1>
    </div>
</template>

<script lang="ts">
    import {defineComponent} from 'vue';
    import TheHeader from '@/components/the-header.vue';
    import TheSidebar from '@/components/the-sidebar.vue';


    export default defineComponent({
        name: 'app',
        components:{
            TheHeader,TheSidebar
        }
    });
</script>

<style scoped>

</style>