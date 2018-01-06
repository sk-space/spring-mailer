<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <link href="resources/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<style type="text/css">
	form{
		margin-top: 50px;
	}
	table tr th label{
		float: right;
		padding-right: 15px;
	}
	table tr{
		margin-top: 15px;
	}
</style>
</head>
<body>
	<center>
		${ error }
		<form:form method="post" modelAttribute="mailer" action="email">
			<table>
				<tr>
					<th><form:label path="to_email">To: </form:label></th>
					<td><form:input type="email" path="to_email" class="form-control" required="required"/></td>
				</tr>
				<tr>
					<th><form:label path="subject_email">Subject: </form:label></th>
					<td><form:input path="subject_email"  class="form-control" required="required"/></td>
				</tr>
				<tr>
					<th><form:label path="message_email">Message: </form:label></th>
					<td><form:textarea path="message_email" cols="50" rows="15"  class="form-control" required="required"/></td>
				</tr>
			</table>
			<input type="submit" value="Send" class="btn btn-success" style="margin-top: 30px;"/>
		</form:form>
	</center>
</body>
</html>