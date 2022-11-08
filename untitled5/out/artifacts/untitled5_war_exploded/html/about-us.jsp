<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>about-us</title>
  <link rel="stylesheet" href="../css/common.css">
  <script src="../js/jquery-3.6.1.min.js"></script>
<%--  <script src="../js/common.js"></script>--%>
  <link rel="stylesheet" href="../css/about-us.css">
</head>
<body class="justify-center">
<div>
<%--  <div id="top"></div>--%>
  <jsp:include page="top.jsp"></jsp:include>
  <div class="middle ">
    <div class="justify-center">
      <div class="about-caidan space-between">
      <div class="align-center">
        <div><img src="../img/kbcw.jpg"></div>
        <div>首页</div>
        <div>&gt;&gt;</div>
        <div>关于我们</div>
      </div>
        <div class=" about-us-fudao space-between">
          <div class="align-center">
            <div class="yuan"></div>
            <div onclick="window.location.href='xiaoxue.jsp'">小学生辅导班</div>
          </div>
          <div class="align-center">
            <div class="yuan"></div>
            <div onclick="window.location.href='chuzhong.jsp'" >初中生辅导班</div>
          </div>
          <div class="align-center">
            <div class="yuan"></div>
            <div onclick="window.location.href='gaozhong.jsp'">高中生辅导班</div>
          </div>
          <div class="align-center">
            <div class="yuan"></div>
            <div onclick="window.location.href='yiduiyi.jsp'">一对一辅导班</div>
          </div>
          <div class="align-center">
            <div class="yuan"></div>
            <div onclick="window.location.href='techang.jsp'">特长辅导班</div>
          </div>
        </div>
      </div>
    </div>
<div class="justify-center">
  <div class="about-us-des">
    <div > <img class="about-us-img" src="${about.aImgUrl}" width="400" height="300" alt="" align="left"></div>
    <div class="about-us-text">
      <div>${about.aCName}</div>
      <div>${about.aEName}</div>
      <div class="about-us-text1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${about.aDes1}
        <div class="about-us-text1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${about.aDes2}</div>
        <div class="about-us-text1"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${about.aDes3}</div>
      </div>
    </div>
  </div>
</div>
<div class="justify-center">
  <div class="about-us-bottom">
    <div class="align-center">
      <c:forEach items="${applicationScope.img}" var="item">
        <div>
          <div><img class="about-us-img1" src="${item.imgUrl}"></div>
          <div>${item.imgName}</div>
        </div>
      </c:forEach>
    </div>
  </div>
</div>
  </div>
<%--  <div id="foot"></div>--%>
  <jsp:include page="foot.jsp"></jsp:include>
</div>
</body>
</html>
