<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>foot</title>
  <link rel="stylesheet" href="../css/common.css">
  <link rel="stylesheet" href="../css/foot.css">
</head>
<body>
<div class="foot justify-align-center">
  <div class="space-between align-center ">
    <div class="foot-msg">
      <div >${applicationScope.school.sCopyRight}</div>
<%--      <div > 版权所有◎您的网站名称未经许可严禁复制</div>--%>
    </div>
    <div  class="foot-msg1">
      <div class="justify-end">咨询热线：${applicationScope.school.sTel}</div>
      <div class="justify-end align-center">
        <div><img src="../img/03td.jpg" ></div>
        <div><img src="../img/v0hx.jpg" ></div>
        <div><img src="../img/s2y9.jpg" ></div>
        <div><img src="../img/u2ge.jpg" ></div>
      </div>
    </div>
  </div>
</div>
</body>
</html>
