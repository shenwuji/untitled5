<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>学校教育首页</title>
  <link rel="stylesheet" href="../css/index.css">
  <script src="../js/jquery-3.6.1.min.js"></script>
  <script src="../js/common.js"></script>
</head>
<body class="justify-center">
<!--中间-->
<div>
  <jsp:include page="top.jsp"></jsp:include>
  <div class="middle">
    <div class="justify-center">
      <div class="box justify-center">
        <div class="course flex-wrap">
          <c:forEach items="${index}" var="item" begin="0" end="4">
            <div>
              <div><img src="${item.iImg}"></div>
              <div>${item.iTitle}</div>
            </div>
          </c:forEach>
          <div>
            <div>+</div>
          </div>
        </div>
        <div class="service ">
          <div class="align-center space-between service-box1">
            <div class="align-center">
              <div>
                <div class="rect">HOT</div>
                <div class="triangle"></div>
              </div>
              <div class="service-msg">我们的服务优势</div>
            </div>
            <div class="read-more">READ MORE</div>
          </div>
          <div class="space-between flex-wrap">
            <c:forEach items="${index}" var="item" begin="5" end="8">
              <div class="service-box2">
                <div class="justify-center"><img src="${item.iImg}"></div>
                <div class="service-msg1">${item.iTitle}</div>
                <div class="service-msg2 many-over-two">${item.iDes}</div>
              </div>
            </c:forEach>
          </div>
        </div>
        <div class="about-us">
          <div class="about-box1 align-center">
            <div class="about-text">
              <div>关于我们</div>
              <div>ABOUT US</div>
            </div>
          </div>
          <c:forEach items="${index}" var="item" begin="9" end="9">
            <div>
              <div class="about-des"><img class="about-img" src="${item.iImg}" align="left">
                  ${item.iDes}
              </div>
              <div class="about-text1">
                  ${item.iTitle}
              </div>
            </div>
          </c:forEach>
        </div>
      </div>
    </div>

  </div>
  <div class="bottom justify-center">
    <div class="space-between">
      <div class="ideas">
        <div class="ideas-text space-between align-center">
          <div>
            <div class="chinese-name">公司理念</div>
            <div class="english-name">ENTERPRISE IDEA</div>
          </div>
          <div class="ideas-more">READ MORE</div>
        </div>
        <div class="space-between">
          <c:forEach items="${index}" var="item" begin="10" end="12">
            <div class="ideas-des1">
              <div class="justify-center"><img class="enterprise-idea-img" src=" ${item.iImg}"></div>
              <div class="ideas-name">${item.iTitle}</div>
              <div class="enterprise-idea-des many-over-six">
                  ${item.iDes}
              </div>
            </div>
          </c:forEach>
        </div>
      </div>
    </div>
    <div class="space-between">
      <div class="news ">
        <div class="news-text space-between align-center">
          <div>
            <div class="chinese-name">新闻中心</div>
            <div class="english-name">NEWS CENTER</div>
          </div>
          <div class="ideas-more">READ MORE</div>
        </div>
        <div class="space-between">
          <div class="news-box">
            <div class="news-style align-center">
              <div>
                <div class="news-rect">通知公告</div>
                <div class="justify-center news-triangle">
                  <div class="news-triangle1"></div>
                </div>
              </div>
              <div>
                <div class="news-rect">学校新闻</div>
                <div class="justify-center news-triangle">
                  <div class="news-triangle1"></div>
                </div>
              </div>
              <div>
                <div class="news-rect">媒体报道</div>
                <div class="justify-center news-triangle">
                  <div class="news-triangle1"></div>
                </div>
              </div>
            </div>
            <div class="news-msg">
              <div class="space-between">
                <div>教育部:教师大交流遏止“择</div>
                <div>2022-2-22</div>
              </div>
              <div class="space-between">
                <div>教育部:教师大交流遏止“择</div>
                <div>2022-2-22</div>
              </div>
              <div class="space-between">
                <div>教育部:教师大交流遏止“择</div>
                <div>2022-2-22</div>
              </div>
              <div class="space-between">
                <div>教育部:教师大交流遏止“择</div>
                <div>2022-2-22</div>
              </div>
              <div class="space-between">
                <div>教育部:教师大交流遏止“择</div>
                <div>2022-2-22</div>
              </div>
              <div class="space-between">
                <div>教育部:教师大交流遏止“择</div>
                <div>2022-2-22</div>
              </div>
              <div class="space-between">
                <div>教育部:教师大交流遏止“择</div>
                <div>2022-2-22</div>
              </div>
            </div>
          </div>
          <div class="align-end space-between align-center">
            <div class="focus"></div>
          </div>
        </div>
      </div>
    </div>
    <div class="space-between">
      <div class="contact-us">
        <div class="ideas-text space-between align-center">
          <div>
            <div class="chinese-name">联系我们</div>
            <div class="english-name">CONTACT US</div>
          </div>
          <div class="ideas-more">READ MORE</div>
        </div>
        <div><img class="us-img" src="../img/ta34.jpg"></div>
        <div class="us-box">
          <div class="us-msg justify-start">
            <div class="align-center"><img src="../img/97vq.jpg"></div>
            <div class="us-text justify-align-center">
              <div>联系电话:</div>
              <div title="9256-028-10001/012345678">9256-028-10001</div>
            </div>
          </div>
          <div class="us-msg justify-start">
            <div class="align-center"><img src="../img/4ctq.jpg"></div>
            <div class="us-text justify-align-center">
              <div>企业邮箱：</div>
              <div title="wanxi@163.com">wanxi@163.com</div>
            </div>
          </div>
          <div class="us-msg justify-start">
            <div class="align-center">
              <img src="../img/xis6.jpg"></div>
            <div class="us-text justify-align-center">
              <div>企业传真：</div>
              <div title="028-9999999999">028-9999999</div>
            </div>
          </div>
          <div class="us-msg justify-start">
            <div class=" align-center"><img src="../img/tsnz.jpg"></div>
            <div class="us-text justify-align-center">
              <div>公司地址：</div>
              <div title="成都市武侯区孵化园">成都市武侯区孵化园</div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="foot justify-center">
    <div>
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
  </div>
</div>
</body>
</html>
