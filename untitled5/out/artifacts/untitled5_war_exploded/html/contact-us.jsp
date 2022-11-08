<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>about-us</title>
  <link rel="stylesheet" href="../css/common.css">
  <script src="../js/jquery-3.6.1.min.js"></script>
  <script src="../js/common.js"></script>
  <link rel="stylesheet" href="../css/contact-us.css">
  <style type="text/css">
    body, html{width: 100%;height: 100%;margin:0;font-family:"微软雅黑";}
    #allmap {height: 400px;width:100%;overflow: hidden;}
    #result {width:100%;font-size:12px;}
    dl,dt,dd,ul,li{
      margin:0;
      padding:0;
      list-style:none;
    }
    dt{
      font-size:14px;
      font-family:"微软雅黑";
      font-weight:bold;
      border-bottom:1px dotted #000;
      padding:5px 0 5px 5px;
      margin:5px 0;
    }
    dd{
      padding:5px 0 0 5px;
    }
    li{
      line-height:28px;
    }
  </style>
  <script type="text/javascript" src="//api.map.baidu.com/api?v=2.0&ak=4gqqhhSegBLN0gSbFaeacHx3YGZOUOch"></script>
  <script type="text/javascript" src="//api.map.baidu.com/library/SearchInfoWindow/1.5/src/SearchInfoWindow_min.js"></script>
  <link rel="stylesheet" href="//api.map.baidu.com/library/SearchInfoWindow/1.5/src/SearchInfoWindow_min.css" />
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
          <div>联系我们</div>
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
          <div>联系我们</div>
          <div>CONTACT US</div>
        </div>
        <div class="justify-center">
          <div class="contact-us-box space-between">
            <div class="contact-us-img">
              <div>
                <div>
                  <c:forEach items="${contact}" var="item" begin="0" end="0">
                    <img class="contact-us-img1" src="${item.cImg}">
                  </c:forEach>
                </div>
                <div class="contact-us-des">
                  <div>

                      <c:forEach items="${contact}" var="item" begin="1" end="4">
                        <div class="contact-us-des-1 justify-start">
                        <div class="justify-align-center"><img  src="${item.cLogo}"></div>
                        <div>${item.cName}</div>
                    </div>
                      </c:forEach>

<%--                    <div class="contact-us-des-1 justify-start">--%>
<%--                      <div class="justify-align-center"><img src="../img/xis6.jpg"></div>--%>
<%--                      <div>传真:9256-028-0018</div>--%>
<%--                    </div>--%>


                  </div>
                  <div class="justify-center">
                    <div>
                      <div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;乘车路线:</div>
                      <c:forEach items="${contact}" var="item" begin="5" end="6">
                        <div class="contact-us-des2 justify-start">
                          <div><img class="contact-us-des-img" src="${item.cLogo}"></div>
                          <div class="contact-us-des-text">${item.cName}</div>
                        </div>
                      </c:forEach>

<%--                      <div class="contact-us-des2 justify-start">--%>
<%--                        <div><img class="contact-us-des-img" src="../img/car.jpg"></div>--%>
<%--                        <div class="contact-us-des-text">路线2：打车到孵化园下车</div>--%>
<%--                      </div>--%>
                    </div>
                  </div>
                </div>
              </div>

            </div>
            <div class="contact-us-map">
              <div id="allmap">
              </div>
            </div>
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
  <jsp:include page="foot.jsp"></jsp:include>
</div>
<script type="text/javascript">
  // 百度地图API功能
  var map = new BMap.Map('allmap');
  var poi = new BMap.Point(104.066295,30.57912);
  map.centerAndZoom(poi, 19);
  map.enableScrollWheelZoom();

  var content = '<div style="margin:0;line-height:20px;padding:2px;">' +
    '<img src="../img/keji.jpg" alt="" style="float:right;zoom:1;overflow:hidden;width:100px;height:100px;margin-left:3px;"/>' +
    '地址：四川省成都市武侯区益州大道孵化园<br/>电话：(010)59928888<br/>简介：成都市万息科技有限公司是是西部地区规模大、技术实力强、化程度高的网络服务、网络营销与网站建设的机构之一 。' +
    '</div>';

  //创建检索信息窗口对象
  var searchInfoWindow = null;
  searchInfoWindow = new BMapLib.SearchInfoWindow(map, content, {
    title  : "万息科技",      //标题
    width  : 290,             //宽度
    height : 150,              //高度
    panel  : "panel",         //检索结果面板
    enableAutoPan : true,     //自动平移
    searchTypes   :[
      BMAPLIB_TAB_SEARCH,   //周边检索
      BMAPLIB_TAB_TO_HERE,  //到这里去
      BMAPLIB_TAB_FROM_HERE //从这里出发
    ]
  });
  var marker = new BMap.Marker(poi); //创建marker对象
  marker.enableDragging(); //marker可拖拽
  marker.addEventListener("click", function(e){
    searchInfoWindow.open(marker);
  })
  map.addOverlay(marker); //在地图中添加marker
  // //样式1
  // var searchInfoWindow1 = new BMapLib.SearchInfoWindow(map, "信息框1内容", {
  //   title: "信息框1", //标题
  //   panel : "panel", //检索结果面板
  //   enableAutoPan : true, //自动平移
  //   searchTypes :[
  //     BMAPLIB_TAB_FROM_HERE, //从这里出发
  //     BMAPLIB_TAB_SEARCH   //周边检索
  //   ]
  // });
  // function openInfoWindow1() {
  //   searchInfoWindow1.open(new BMap.Point(103.953733,30.786095));
  // }



</script>
</body>
</html>
