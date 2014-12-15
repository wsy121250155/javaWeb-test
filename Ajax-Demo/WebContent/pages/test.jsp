<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<title>Insert title here</title>
<script type="text/javascript">
	function getData() {
		var xmlHttp;
		if (window.XMLHttpRequest) {
			xmlHttp = new XMLHttpRequest();
		} else {
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlHttp.onreadystatechange = function() {
			if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
				var data = eval("(" + xmlHttp.responseText + ")");
				var dataObj = data[0];
				var close = dataObj.close;
				var volume = dataObj.volume;
				document.getElementById("data").innerHTML = "<p>收盘价：" + close
						+ "——成交量:" + volume + "</p>";
			}
		};
		xmlHttp.open("get", "data/sse_index", true);
		xmlHttp.send();
	}
</script>
</head>
<body>
	<div id="ajax_data">
		<input type="button" name="get_data" value="get data"
			onClick="getData()">获取ajax测试数据</input>
	</div>
	<div>
		<p>通过ajax获取的数据</p>
		<div id="data"></div>
	</div>
	<div>
		<p><a href="./pages/database.jsp">jump to database</a></p>
	</div>
</body>
</html>