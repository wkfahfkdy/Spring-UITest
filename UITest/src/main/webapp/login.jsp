<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="height:300px">
	</div>
	<div align="center">
		<form action="login.do" method="post">
			<table>
				<tr>
					<td>사용자 ID</td><td colspan="2"><input type="text" id="id" name="id"></td>
				</tr>
				<tr>
					<td>PASSWORD</td><td colspan="2"><input type="password" id="password" name="password"></td>
				</tr>
				<tr>
					<td></td><td><input type="submit" value="로그인"></td><td><input type="reset" value="취소"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>