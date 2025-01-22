import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import zuopinxinxi from '@/views/modules/zuopinxinxi/list'
    import news from '@/views/modules/news/list'
    import gongsi from '@/views/modules/gongsi/list'
    import waibaoyingzheng from '@/views/modules/waibaoyingzheng/list'
    import zaixianjiaoliu from '@/views/modules/zaixianjiaoliu/list'
    import zaixianhuifu from '@/views/modules/zaixianhuifu/list'
    import zuopindingdan from '@/views/modules/zuopindingdan/list'
    import users from '@/views/modules/users/list'
    import waibaoxuqiu from '@/views/modules/waibaoxuqiu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import liuchengzhuizong from '@/views/modules/liuchengzhuizong/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/zuopinxinxi',
        name: '作品信息',
        component: zuopinxinxi
      }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/gongsi',
        name: '公司',
        component: gongsi
      }
      ,{
	path: '/waibaoyingzheng',
        name: '外包应征',
        component: waibaoyingzheng
      }
      ,{
	path: '/zaixianjiaoliu',
        name: '在线交流',
        component: zaixianjiaoliu
      }
      ,{
	path: '/zaixianhuifu',
        name: '在线回复',
        component: zaixianhuifu
      }
      ,{
	path: '/zuopindingdan',
        name: '作品订单',
        component: zuopindingdan
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
      ,{
	path: '/waibaoxuqiu',
        name: '外包需求',
        component: waibaoxuqiu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/messages',
        name: '留言反馈',
        component: messages
      }
      ,{
	path: '/liuchengzhuizong',
        name: '流程追踪',
        component: liuchengzhuizong
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
