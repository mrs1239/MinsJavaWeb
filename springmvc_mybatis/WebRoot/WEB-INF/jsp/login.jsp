<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统登录</title>
</head>
<body>
<pre>
<form action="${pageContext.request.contextPath}/login.action" method="post">
	用户:<input type="text" name="username" /><br />
	密码:<input type="password" name="password" /><br />
		<input type="submit" value="登录" />
	</form>
</pre>
</body>
</html>