<template>
  <the-header></the-header>
  <div class="about">
    <h1>This is an about page</h1>
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