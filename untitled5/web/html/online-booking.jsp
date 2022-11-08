<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>about-us</title>
  <link rel="stylesheet" href="../css/common.css">
  <script src="../js/jquery-3.6.1.min.js"></script>
  <script src="../js/common.js"></script>
  <link rel="stylesheet" href="../css/online-booking.css">
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
        <div>在线预约</div>
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
  <div class="online-booking">
    <div class="curriculum-center-title">
      <div>在线预约</div>
      <div>ONLINE BOOKING </div>
    </div>
<div class="justify-center">
  <div class="online-booking-box space-between">
    <div class="online-booking-img align-center">
      <div>
        <div>${online.bName}</div>
        <div>${online.bThanks}</div>
        <div><img src="${online.bLogo}"></div>
      </div>

    </div>
    <div class="online-booking-form justify-align-center">
      <form>
        <div>
          <div class="form-text">您的姓名:</div>
          <div><input type="name"></div>
        </div>
        <div>
          <div class="form-text">联系电话:</div>
          <div><input type="telphone"></div>
        </div>
        <div>
          <div class="form-text">邮箱:</div>
          <div><input type="email"></div>
        </div>
        <div>
          <div class="form-text">学校名称:</div>
          <div><input type="school-name"></div>
        </div>
        <div>
          <div class="form-text">学校地址:</div>
          <div><input type="school-address"></div>
        </div>
        <div>
          <div class="form-text">内容:</div>
          <div><textarea></textarea></div>
        </div>
        <div><input type="submit" value="提交"></div>
      </form>
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
