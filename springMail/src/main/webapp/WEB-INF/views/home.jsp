<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	
    <link href="resources/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
    <style type="text/css">
    	input{
    		maring-top: 150px;
   		}
    </style>
</head>
<body>
	<center>
		${ messge }
		<a href="email"><input type="button" value="Email" class="btn btn-primary"/></a>
	</center>
</body>
</html>
