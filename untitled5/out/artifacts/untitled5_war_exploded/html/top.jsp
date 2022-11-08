<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>top</title>
  <link rel="stylesheet" href="../css/common.css">
  <link rel="stylesheet" href="../css/top.css">
</head>
<body class="justify-center">
<div>
  <!--头部导航栏-->
  <div class="top">
    <!--公司联系方式-->
    <div class="justify-center">
      <div class="contact align-center">
        <div>${applicationScope.school.sWel}</div>
        <div>
          <!--        电话-->
          <div class="phone align-center">
            <div></div>
            <div>${applicationScope.school.sTel}</div>
          </div>
          <!--        邮箱-->
          <div class="email align-center">
            <div><img src="../img/xwri.png"></div>
            <div>${applicationScope.school.sEmail}</div>
          </div>
        </div>
      </div>
    </div>
    <!--菜单栏-->
    <div class="justify-center">
      <div class="nav align-center">
        <div class="align-center">
          <div><img class="logo" src="${applicationScope.school.sLogo}"></div>
          <div class="wenzi">
            <div class="Chinese-name">${applicationScope.school.sCName}</div>
            <div class="English-name">${applicationScope.school.sEName}</div>
          </div>
        </div>
        <div class="caidan align-center">
            <div class="yuan "></div>
           <c:forEach items="${applicationScope.menu}" var="item">
             <div onclick="window.location.href='${item.mUrl}'"> ${item.mName}</div>
           </c:forEach>
          </div>
<%--          <div class="align-center">--%>
<%--            <div class="yuan"></div>--%>
<%--            <div onclick="window.location.href='/ContactUs'">联系我们</div>--%>
<%--          </div>--%>
      </div>
    </div>
  </div>

  <!--头部图片-->

  <div class="ad justify-center">
    <div class="align-center">
      <div>
        <div class="xiaoxun ">
          <div>勤奋&nbsp;·&nbsp;求实&nbsp;·&nbsp;进取&nbsp;·&nbsp;创造</div>
        </div>
        <div>${applicationScope.school.sInfo}
        </div>
        <div class="button">
          <div class="biaoyu">联系我们</div>
          <div class="biaoyu">给我们留言</div>
        </div>
      </div>

    </div>
  </div>


</div>
</body>
</html>
