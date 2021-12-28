<template>
  <a-layout>

    <a-layout-sider width="200" style="background: #fff">
      <a-menu
              mode="inline"
              v-model:selectedKeys="selectedKeys2"
              v-model:openKeys="openKeys"
              :style="{ height: '100%', borderRight: 0 }"
      >
        <a-sub-menu key="sub1">
          <template #title>
              <span>
                <user-outlined />
                subnav 11111
              </span>
          </template>
          <a-menu-item key="1">option1</a-menu-item>
          <a-menu-item key="2">option2</a-menu-item>
          <a-menu-item key="3">option3</a-menu-item>
          <a-menu-item key="4">option4</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub2">
          <template #title>
              <span>
                <laptop-outlined />
                subnav 2
              </span>
          </template>
          <a-menu-item key="5">option5</a-menu-item>
          <a-menu-item key="6">option6</a-menu-item>
          <a-menu-item key="7">option7</a-menu-item>
          <a-menu-item key="8">option8</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub3">
          <template #title>
              <span>
                <notification-outlined />
                subnav 3
              </span>
          </template>
          <a-menu-item key="9">option9</a-menu-item>
          <a-menu-item key="10">option10</a-menu-item>
          <a-menu-item key="11">option11</a-menu-item>
          <a-menu-item key="12">option12</a-menu-item>
        </a-sub-menu>
      </a-menu>
    </a-layout-sider>
    <a-layout-content
            :style="{ background: '#fff', padding: '24px', margin: 0, minHeight: '280px' }"
    >

        <pre>{{ebooks}}
            {{books}}
        </pre>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
    import {defineComponent, onMounted, reactive, ref, toRef} from 'vue';
    import axios from 'axios';

    export default defineComponent({
        name: 'Home',
        setup(){
        console.log("setup");
        const ebooks = ref(); //响应式数据
        const ebook = reactive({book:[]}); //里面存放json对象,book才是响应式变量

        //初始化逻辑都放到onMounted里面, setup放参数定义,方法定义
        onMounted(()=>{
            console.log("onMounted");
            axios.get("http://localhost:8880/ebook/list?name=Mysql").then((response)=>{
                const data = response.data;
                ebooks.value = data.content;
                ebook.book = data.content;
                console.log(response);
            });
        });

            return {ebooks,books: toRef(ebook,"book")}  //这里面的books是随便起的名字
        }

});
</script>
