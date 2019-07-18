import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import DetailUser from '@/components/DetailUser'
import about from '@/components/AboutUser'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/about',
      name: 'about',
      component: about
    },
    {
      path: '/about/detail/:id',
      name: 'DetailUser',
      component: DetailUser
    },

  
  ]
})
