<%@ page import="java.util.*" %>
<html>
	<body>
		<h1 align="center">Your product successfully added</h1>
		<p>
		<%
			List styles = (List)request.getAttribute("styles");
			Iterator it = styles.iterator();
			out.print("<br>name: " + it.next());
			out.print("<br>barcode: " + it.next());
			out.print("<br>color: " + it.next());
			out.print("<br>desc: " + it.next());
		%> 
	</body> 
</html>