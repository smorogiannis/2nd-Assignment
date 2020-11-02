<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <!-- eimai apla ena sxolio -->
        <meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="style.css">
        <title>eshop</title>
    </head>

<html>
	<body>
		<h1 align="center">Your product successfully added</h1>
		<h2>Details:</h2>
		<p>
		<%
			List styles = (List)request.getAttribute("styles");
			Iterator it = styles.iterator();
			out.print("<br>name: " + it.next());
			out.print("<br>barcode: " + it.next());
			out.print("<br>color: " + it.next());
			out.print("<br>desc: " + it.next());
		%>
		<center><button><a href="http://83.212.78.241:8080/eshop">Click here to add another product</a></button></center> 
	</body> 
</html>