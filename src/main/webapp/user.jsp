<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="user.js"></script>
  </head>
  
  <body>
    <dir><b><a href="javascript:textMysql()">测试mysql数据库</a></b></dir>
    <br>
    <br>
    <br>
    <br>
    <dir><b><a href="javascript:textOracle()">测试Oracle数据库</a></b></dir>
  </body>
</html>
