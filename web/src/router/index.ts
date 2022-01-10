import {createRouter, createWebHistory, RouteRecordRaw} from 'vue-router'
import Home from '../views/homepage.vue'
import About from '../views/about.vue'
import AdminEbook from '../views/admin/admin-ebook.vue'
import Ebook from '../views/ebook.vue'
import Contact from '../views/contact.vue'
import Blog from '../views/blog.vue'
import Album from '../views/album.vue'
import Work from '../views/work.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
      component: About
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    //component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
      path: '/admin/ebook',
      name: 'AdminEbook',
      component: AdminEbook
  },
    {
        path: '/ebook',
        name: 'Ebook',
        component: Ebook
    },
    {
        path: '/contact',
        name: 'Contact',
        component: Contact
    }
    ,
    {
        path: '/blog',
        name: 'Blog',
        component: Blog
    }
    ,
    {
        path: '/album',
        name: 'Album',
        component: Album
    }
    ,
    {
        path: '/work',
        name: 'Work',
        component: Work
    }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
