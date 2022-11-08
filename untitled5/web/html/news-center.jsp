<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>about-us</title>
  <link rel="stylesheet" href="../css/common.css">
  <script src="../js/jquery-3.6.1.min.js"></script>
  <script src="../js/common.js"></script>
  <link rel="stylesheet" href="../css/news-center.css">
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
        <div>新闻中心</div>

      </div>
      <div class=" about-us-fudao justify-end">
        <div class="align-center">
          <div class="yuan"></div>
          <div>通知公告</div>
        </div>
        <div class="align-center">
          <div class="yuan"></div>
          <div>学校新闻</div>
        </div>
        <div class="align-center">
          <div class="yuan"></div>
          <div>媒体报道</div>
        </div>
      </div>
      </div>
    </div>
<div class="justify-center">
  <div class="news-center">
    <div class="news-center-title">
        <div>新闻中心</div>
        <div>NEWS CENTER </div>
    </div>
    <div class="news-center-text">
            <c:forEach items="${news}" var="item">
              <div class="news-center-text1 justify-start align-center">
              <div class="news-center-date">
              <div>${item.nDaytime}</div>
              <div>${item.nDatetime}</div>
              </div>
              <div class="news-center-des">
                  <div>${item.nTitle}</div>
                  <div>${item.nDes}</div>
              </div>
              </div>
            </c:forEach>


    </div>
  </div>
</div>
    <div class="justify-center page" >
      <div>首页</div>
      <div>&lt;上一页</div>
      <div>1</div>
      <div> 2</div>
      <div> 3</div>
      <div>下一页&gt;</div>
      <div> 末页</div>
    </div>
  </div>
  <jsp:include page="foot.jsp"></jsp:include>
</div>
</body>
</html>
