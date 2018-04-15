<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css" />
</head>
<body>
abc
</body>
<script src="<%=basePath%>/js/iepng.js" type="text/javascript"></script>
</html>
