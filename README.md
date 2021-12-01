# 前后端分离的博客系统

后端： jwt和token做跨域身份验证，shiro-redis缓存会话信息。shiro做登录和权限校验，在AccountRealm中重写。JwtFilter继承Shiro内置的AuthenticatingFilter，一个内置了自动登录方法的过滤器。

前端：element-ui包的基本构建，axios做前后端的对接。



搭建过程：https://blog.csdn.net/weixin_43247803/article/details/113666136

