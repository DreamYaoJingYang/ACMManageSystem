<%--
  Created by IntelliJ IDEA.
  User: Karen
  Date: 2021/8/26
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><%--使用 layui --%>
    <meta charset="utf-8">
    <title>ACM</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/layui/2.6.8/css/layui.css"  media="all">

    <base href="${pageContext.request.contextPath}/">
</head>
<body>
<ul class="layui-nav layui-bg-blue" lay-bar="disabled">
    <li class="layui-nav-item"><a href="">ACM</a></li>
    <li class="layui-nav-item"><a href="">Members</a></li>
    <li class="layui-nav-item"><a href="">managers</a></li>
    <li class="layui-nav-item">
        <a href="javascript:;">operation</a>
        <dl class="layui-nav-child">
            <dd><a href=""></a></dd>
            <dd><a href="jsp/addMember.jsp">addMember</a></dd>
            <dd><a href="">managers</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item"><a href="">community</a></li>
</ul>

<script src="https://cdnjs.cloudflare.com/ajax/libs/layui/2.6.8/layui.js" charset="utf-8"></script>
<script>
    layui.use('element', function(){
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
        //监听导航点击
        element.on('nav(demo)', function(elem){
            layer.msg(elem.text());
        });
    });
</script>


</body>
</html>

