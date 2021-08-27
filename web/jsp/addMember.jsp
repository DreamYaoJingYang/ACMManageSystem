<%--
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
        <form class="layui-form" action="" lay-filter="example">

            <div class="layui-form-item">
                <label class="layui-form-label">昵称</label>
                <div class="layui-input-block">
                    <input type="text" name="nickname" lay-verify="title" autocomplete="off" placeholder="昵称（两个字以内）" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">姓名</label>
                <div class="layui-input-block">
                    <input type="text" name="username" lay-verify="title" autocomplete="off" placeholder="姓名" class="layui-input">
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
                    <input type="text" name="grade" lay-verify="title" autocomplete="off" placeholder="年级" class="layui-input">
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
                <label class="layui-form-label">选择框</label>
                <div class="layui-input-block">
                    <select name="interest" lay-filter="aihao">
                        <option value=""></option>
                        <option value="0">写作</option>
                        <option value="1">阅读</option>
                        <option value="2">游戏</option>
                        <option value="3">音乐</option>
                        <option value="4">旅行</option>
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">复选框</label>
                <div class="layui-input-block">
                    <input type="checkbox" name="like[write]" title="写作">
                    <input type="checkbox" name="like[read]" title="阅读">
                    <input type="checkbox" name="like[daze]" title="发呆">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">开关</label>
                <div class="layui-input-block">
                    <input type="checkbox" name="close" lay-skin="switch" lay-text="ON|OFF">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">单选框</label>
                <div class="layui-input-block">
                    <input type="radio" name="sex" value="男" title="男" checked="">
                    <input type="radio" name="sex" value="女" title="女">
                </div>
            </div>
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">文本域</label>
                <div class="layui-input-block">
                    <textarea placeholder="请输入内容" class="layui-textarea" name="desc"></textarea>
                </div>
            </div>

            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button type="button" class="layui-btn layui-btn-normal" id="LAY-component-form-setval">赋值</button>
                    <button type="button" class="layui-btn layui-btn-normal" id="LAY-component-form-getval">取值</button>
                    <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
                </div>
            </div>
        </form>

    </div>



</body>
</html>
