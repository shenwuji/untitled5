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
  <%--  <div id="top"></div>--%>
  <jsp:include page="top.jsp"></jsp:include>
  <div class="middle ">
    <div class="justify-center">
      <div class="about-caidan space-between">
        <div class="align-center">
          <div><img src="../img/kbcw.jpg"></div>
          <div>首页</div>
          <div>&gt;&gt;</div>
          <div>课程中心</div>
          <div>&gt;&gt;</div>
          <div>初中生辅导班</div>

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
      <div class="curriculum-center">
        <div class="curriculum-center-title">
          <div>初中生辅导班</div>
          <div>Remedial classes for junior high school students </div>
        </div>
        <div class="justify-center">
          <div class="curriculum-center-img flex-wrap">
            <div>
              <div><img src="../img/qmlx.jpg"></div>
              <div>初中生辅导班</div>
              <div class="old-price align-center">
                <div>市场价:</div>
                <div>￥ 1999</div>
              </div>
              <div class="now-price align-center">
                <div>现价:</div>
                <div>￥ 699</div>
              </div>
            </div>
            <div>
              <div><img src="../img/qmlx.jpg"></div>
              <div>初中生辅导班</div>
              <div class="old-price align-center">
                <div>市场价:</div>
                <div>￥ 1999</div>
              </div>
              <div class="now-price align-center">
                <div>现价:</div>
                <div>￥ 699</div>
              </div>
            </div>
            <div>
              <div><img src="../img/qmlx.jpg"></div>
              <div>初中生辅导班</div>
              <div class="old-price align-center">
                <div>市场价:</div>
                <div>￥ 1999</div>
              </div>
              <div class="now-price align-center">
                <div>现价:</div>
                <div>￥ 699</div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <jsp:include page="foot.jsp"></jsp:include>
</div>
</body>
</html>
