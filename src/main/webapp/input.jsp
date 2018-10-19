<%--
  Created by IntelliJ IDEA.
  User: James.Liu
  Date: 10/19/2018
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>input</title>
</head>
<style>
  #canvas {
    border: 5px solid black;
    background-size: 100%;
  }
</style>

<%--<p>hello world!</p>--%>
<%--<img src='<c:url value = "src/resources/jztg0tk7xg901.jpg"/>'>--%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://raw.githubusercontent.com/jonobr1/two.js/master/build/two.min.js"></script>
<script type="text/javascript" language="JavaScript">

  const HEIGHT = 8;
  const WIDTH = 8;
  window.onload = function() {
    c = document.getElementById('canvas');
    window.ctx = c.getContext("2d");
    ctx.strokeStyle = '#000000';
    ctx.lineWidth = 4;

    for (let i = 0; i < 800; i+=100){
      ctx.moveTo(i, 0);
      ctx.lineTo(i, 600);
      ctx.stroke();
    }

    for (let i = 0; i < 800; i+=100){
      ctx.moveTo(0, i);
      ctx.lineTo(600, i);
      ctx.stroke();
    }

  };

  function draw() {
    for (let i = 0; i < HEIGHT; i++) {
      for (let j = 0; j < WIDTH; j++) {
        ctx.fillStyle = "#FFFFFF";
        ctx.fillRect(100*i, 100*j, 99, 99);
        ctx.stroke();
      }
    }
  }

</script>>
<body onload="draw()" bgcolor= "aqua">
<center>
  <canvas id = "canvas" width="800" height="800" >
    bonus text here
  </canvas>
</center>
</body>
</html>
