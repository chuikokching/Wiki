<template>
    <the-header></the-header>
    <the-sidebar></the-sidebar>
    <div class="album">
        <h1>This is an album page.</h1>
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