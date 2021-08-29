<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Karen
  Date: 2021/8/26
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><%--使用 layui --%>
<head>
    <meta charset="utf-8">
    <title>ACM</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/layui/2.6.8/css/layui.css"  media="all">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">

    <base href="${pageContext.request.contextPath}/">

</head>
<body>

    <%--顶部导航栏--%>
    <jsp:include page="common.jsp"></jsp:include>

    <div class="addMemberForm">
        <%--成员信息表单--%>
        <form class="layui-form" action="/ACMManageSystem/toAddMember" lay-filter="example" method="post">

            <div class="layui-form-item">
                <label class="layui-form-label">昵称</label>
                <div class="layui-input-block">
                    <input type="text" name="nickname" lay-verify="title" autocomplete="off" placeholder="昵称（两个字以内）" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">姓名</label>
                <div class="layui-input-block">
                    <input type="text" name="name" lay-verify="title" autocomplete="off" placeholder="姓名" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">学号</label>
                <div class="layui-input-block">
                    <input type="text" name="studentNumber" lay-verify="title" autocomplete="off" placeholder="学号" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">院系</label>
                <div class="layui-input-block">
                    <input type="text" name="department" lay-verify="title" autocomplete="off" placeholder="院系" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">专业</label>
                <div class="layui-input-block">
                    <input type="text" name="major" lay-verify="title" autocomplete="off" placeholder="专业" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">年级</label>
                <div class="layui-input-block">
                    <input type="text"  name="grade" lay-verify="title" autocomplete="off" placeholder="年级" class="layui-input">
                </div>
            </div>


            <div class="layui-form-item">
                <label class="layui-form-label">班级</label>
                <div class="layui-input-block">
                    <input type="text" name="className" lay-verify="title" autocomplete="off" placeholder="班级" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">身份证号</label>
                <div class="layui-input-block">
                    <input type="text" name="idCard" lay-verify="title" autocomplete="off" placeholder="身份证号" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">手机号</label>
                <div class="layui-input-block">
                    <input type="text" name="phoneNumber" lay-verify="title" autocomplete="off" placeholder="手机号" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">邮箱</label>
                <div class="layui-input-block">
                    <input type="text" name="email" lay-verify="title" autocomplete="off" placeholder="邮箱" class="layui-input">
                </div>
            </div>


            <div class="layui-form-item">
                <label class="layui-form-label">登录密码</label>
                <div class="layui-input-block">
                    <input type="password" name="password" placeholder="请输入密码" autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">加入ACM</label>
                <div class="layui-input-block">
                    <input type="date" name="joinDate"  autocomplete="off" >
                </div>
            </div>

            <%--默认值--%>
            <input type="text" name="photoName" value="photoName" hidden="hidden">

            <input  type="text" name="isExit" value="0" hidden="hidden">
            <div>
                <button type="submit" class="layui-btn">addMember</button>
            </div>

        </form>

    </div>



</body>
</html>
