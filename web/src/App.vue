<template>
  <a-layout>
    <the-header></the-header> <!--名字和the-header.vue里面的defineComponent.name一样-->
    <router-view/>
    <the-footer></the-footer> <!--名字和the-footer.vue里面的defineComponent.name一样-->
  </a-layout>
</template>


<script lang="ts">
    import {defineComponent} from 'vue';
    import TheHeader from '@/components/the-header.vue';
    import TheFooter from '@/components/the-footer.vue';

    export default defineComponent({
        name: 'app',
        components:{
            TheHeader,TheFooter
        }
    });
</script>

<style>


  .ant-row-rtl #components-layout-demo-top-side-2 .logo {
    float: right;
    margin: 16px 0 16px 24px;
  }

  .site-layout-background {
    background: #fff;
  }
</style>