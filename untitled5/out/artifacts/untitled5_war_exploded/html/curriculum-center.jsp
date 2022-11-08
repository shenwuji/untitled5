<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>about-us</title>
  <link rel="stylesheet" href="../css/common.css">
  <script src="../js/jquery-3.6.1.min.js"></script>
  <script src="../js/common.js"></script>
  <link rel="stylesheet" href="../css/curriculum-center.css">
</head>
<body class="justify-center">
<div>
  <jsp:include page="top.jsp"></jsp:include>
  <div class="middle ">
    <div class="justify-center">
      <div class="about-caidan space-between">
      <div class="align-center">
        <div><img src="../img/kbcw.jpg"></div>
        <div>首页</div>
        <div>&gt;&gt;</div>
        <div>课程中心</div>

      </div>
      <div class=" about-us-fudao space-between">
        <c:forEach items="${tutor}" var="item">
          <div class="align-center">
            <div class="yuan"></div>
            <div onclick="window.location.href='${item.tUrl}'">${item.tName}</div>
          </div>
        </c:forEach>
<%--        <div class="align-center">--%>
<%--          <div class="yuan"></div>--%>
<%--          <div onclick="window.location.href='techang.jsp'">特长辅导班</div>--%>
<%--        </div>--%>
      </div>
      </div>
    </div>
<div class="justify-center">
  <div class="curriculum-center">
    <div class="curriculum-center-title">
      <div>课程中心</div>
      <div>CURRICULUM-CENTER </div>
    </div>
    <div class="justify-center">
      <div class="curriculum-center-img flex-wrap">
       <c:forEach items="${curriculum}" var="item">
         <div >
           <div><img src="${item.kUrl}"></div>
           <div>${item.kName}</div>
           <div class="old-price align-center">
             <div>${item.kOldName}</div>
             <div>${item.kOldPrice}</div>
           </div>
           <div class="now-price align-center">
             <div>${item.kNewName}</div>
             <div>${item.kNewPrice}</div>
           </div>
         </div>
       </c:forEach>
      </div>
    </div>
    </div>
  </div>
</div>
  <jsp:include page="foot.jsp"></jsp:include>
  </div>
</body>
</html>
