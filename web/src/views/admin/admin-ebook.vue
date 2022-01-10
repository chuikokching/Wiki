<template>
    <the-header></the-header>
    <div class="adminebook">
        <h1>关于admin-ebook</h1>
    </div>
</template>

<script lang="ts">
    import {defineComponent} from 'vue';
    import TheHeader from '@/components/the-header.vue';

    export default defineComponent({
        name: 'app',
        components:{
            TheHeader
        }
    });
</script>

<style scoped>

</style>