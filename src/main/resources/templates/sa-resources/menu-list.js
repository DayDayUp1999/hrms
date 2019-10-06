var menuList =	[
	{
		id: '100',
		name: '使用说明',
		icon: 'el-icon-s-platform',
		url: 'sa-html/sa-doc.html'
	},
	{
		id: '1',
		name: '部门管理',
		icon: 'el-icon-s-order',
		info: '部门管理设置',
		childList: [
			{
				id: '1-1',
				name: '部门信息管理',
				url: 'sa-html/home/swiper.html'
			},
			{
				id: '1-2',
				name: '部门职位管理',
				url: 'sa-html/home/swiper.html'
			},

		]
	},
	{
		id: '2',
		name: '职员管理',
		icon: 'el-icon-s-check',
		info: '职员管理设置',
		childList: [
			{
				id: '2-1',
				name: '员工信息管理',
				url: 'sa-html/home/swiper.html'
			},
			{
				id: '2-2',
				name: '员工职位管理',
				url: 'sa-html/home/swiper.html'
			},

		]
	},
	{
		id: '3',
		name: '考勤管理',
		icon: 'el-icon-date',
		info: '考勤管理设置',
		childList: [
			{
				id: '3-1',
				name: '请假管理',
				url: 'sa-html/attendance/attendance-manage.html'
			},
			{
				id: '3-2',
				name: '考勤状况',
				url: 'sa-html/attendance/attendance-list.html'
			},

		]
	},
	{
		id: '4',
		name: '奖惩管理',
		icon: 'el-icon-medal-1',
		info: '奖惩管理设置',
		childList: [
			{
				id: '4-1',
				name: '奖惩信息',
				url: 'sa-html/reward/reward-list.html'
			},
		]
	},
	{
		id: '5',
		name: '薪资管理',
		icon: 'el-icon-wallet',
		info: '薪资管理设置',
		childList: [
			{
				id: '5-1',
				name: '员工工资信息',
				url: 'sa-html/home/swiper.html'
			},
			{
				id: '5-2',
				name: '员工工资录入',
				url: 'sa-html/home/swiper.html'
			},
		]
	},
	{
		id: '6',
		name: '报表管理',
		icon: 'el-icon-s-data',
		info: '报表管理设置',
		childList: [
			{
				id: '6-1',
				name: '部门人数统计',
				url: 'sa-html/home/swiper.html'
			},
			{
				id: '6-2',
				name: '员工工资统计',
				url: 'sa-html/home/swiper.html'
			},
			{
				id: '6-3',
				name: '考勤信息统计',
				url: 'sa-html/home/swiper.html'
			},

		]
	},
	{
		id: '7',
		name: '系统管理',
		icon: 'el-icon-setting',
		info: '系统设置',
		childList: [
			{
				id: '7-1',
				name: '用户管理',
				url: 'sa-html/home/swiper.html'
			},
			{
				id: '7-2',
				name: '角色设置',
				url: 'sa-html/home/swiper.html'
			},
			{
				id: '7-3',
				name: '个人信息维护',
				url: 'sa-html/home/swiper.html'
			},

		]
	},
	{
		id: '400',
		name: '***首页设置****',
		icon: 'el-icon-table-lamp',
		info: '首页的一些设置',
		childList: [
			{
				id: '4-2',
				name: '轮播图设置',
				url: 'sa-html/home/swiper.html'
			},

		]
	},
	{
		id: '10',
		name: '用户管理',
		icon: 'el-icon-user',
		info: '对用户列表、添加、统计等等...',
		childList: [
			{
				id: '1-1',
				name: '用户列表',
				url: 'sa-html/user/user-list.html'
			},
			{
				id: '1-2',
				name: '用户添加',
				url: 'sa-html/user/user-add.html'
			},
			{
				id: '1-3',
				name: '用户统计',
				childList: [
					{
						id: '1-3-1',
						name: '注册量统计',
						url: 'sa-html/user/user-chart.html'
					}
				]
			}
		]
	},
	{
		id: '12',
		name: '权限控制',
		icon: 'el-icon-unlock',
		info: '对系统角色权限的分配等设计，敏感度较高，请谨慎授权',
		childList: [
			{
				id: '2-1',
				name: '角色列表',
				url: 'sa-html/role/role-list.html'
			},
			{
				id: '2-2',
				name: '菜单列表',
				url: 'sa-html/role/menu-list.html'
			}
		]
	},
	{
		id: '13',
		name: '文章管理',
		icon: 'el-icon-document-copy',
		info: '对文章的增删改查、维护',
		childList: [
			{
				id: '3-1',
				name: '文章列表',
				url: 'sa-html/article/art-list.html'
			},
			{
				id: '3-2',
				name: '文章发表',
				url: 'sa-html/article/art-add.html'
			}
		]
	},
	{
		id: '14',
		name: '系统设置',
		icon: 'el-icon-setting',
		info: '对系统运行时的一些参数的设置',
		childList: [
			{
				id: '4-1',
				name: '服务器设置',
				url: 'sa-html/cfg/system-cfg.html',
				info: '对服务器参数的设置'	// 菜单的介绍，在设置角色分配权限时将会用到此字段
			}

		]
	},
	//  ========= 示例 外部链接 点击从新窗口打开 ================
	{
		id: '18',
		name: '外部链接',
		icon: 'el-icon-link',
		info: '示例：外部链接',
		childList: [
			{
				id: '8-1',
				name: '外部链接1',
				url: 'https://www.baidu.com/',
				is_blank: true
			},
			{
				id: '8-2',
				name: '外部链接2',
				url: 'http://yanzhi21.com/',
				is_blank: true
			},
		]
	},
	//  ========= 示例 隐藏的菜单，最终将不会显示在菜单栏里 ================
	{
		id: '110',
		name: '一个隐藏菜单',
		url: 'https://www.baidu.com/',
		is_blank: true,
		is_show: false// 隐藏
	},
	//  ========= 示例 指定parent_id，将被添加到其指定的父菜单childList里 ================
	{
		id: '4-3',
		name: '404页面',
		url: 'sa-html/cfg/404.html',
		parent_id: 400	// 父菜单id
	},
	{
		id: '4-4',
		name: '500页面',
		url: 'sa-html/cfg/500.html',
		parent_id: 400	// 父菜单id
	}
]
