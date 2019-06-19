<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<title>Clicker</title>
</head>
<body>
	<div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-6 mt-4 mb-4">
				<form action="/ButtonClicker/Counter" method="get">
					<input type="submit" value="Click Me!" class="btn btn-primary">
				</form>
            </div>
        </div>
        <div class="row justify-content-center">
            <div class="col col-lg-10">
                <h3>You have clicked this button <c:out value="${count}"/> times</h3>
            </div>
        </div>
    </div>
</body>
</html>