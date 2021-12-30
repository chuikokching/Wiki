import {createApp} from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import Antd from 'ant-design-vue';
import 'ant-design-vue/dist/antd.css';
import * as Icons from '@ant-design/icons-vue';

const app = createApp(App);

app.use(Antd).use(store).use(router).mount('#app');

//引入全部图标
const icons : any = Icons;
for(const i in icons)
{
    app.component(i,icons[i]);
}


console.log('Environment:',process.env.NODE_ENV); //读取环境变量
console.log('Server:',process.env.VUE_APP_SERVER);