<%--
  Created by IntelliJ IDEA.
  User: Ghan
  Date: 2021/11/15/0015
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--taglib导入标签库 prefix名称前缀  core标签库 uri="库的名字"--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <script>
      function validate() {
        if($('uname').value.length < 3){
          $('nameSpan').innerText = "用户名不可空"
          return false
        }else{
          $('nameSpan').innerText = ""
        }
        if($('pwd').value.length < 3){
          $('pwdSpan').innerText = "密码不可空"
          return false
        }else{
          $('pwdSpan').innerText = ""
        }
        return true
      }

      function $(id){
        return document.getElementById(id)
      }
    </script>
  </head>
  <body>
  <h2>登录注册</h2>
  <hr>
  <%--获得地址栏中的login,如果不为null 就显示提示信息
  test 判断条件
  param.xxx 获得地址栏请求参数
  param 内置对象
  --%>
  <c:if test="${param.login != null}">
    <div>用户名或密码错误</div>
  </c:if>
  <form action="login" method="post" onsubmit="return validate()">
    用户名：<input type="text"name="uname" id="uname"><span id="nameSpan"></span><br>
    密码：<input type="password" name="pwd" id="pwd"><span id="pwdSpan"></span><br>
    <input type="submit" value="登录">
  </form>

  </body>
</html>
