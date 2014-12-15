<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/index.css" />
<title>Wsy's blog</title>
</head>
<body>
	<div>
		<div>
			<h id="MyTitle">Welcome to my blog!!!</h>
		</div>

		<div class="menu">
			<ul>
				<li class="column">
					<div>我的课程</div>
					<div class="hiding">
						<div>
							<ul>
								<li><a href="llll">hide1</a></li>
								<li>hide2</li>
							</ul>
						</div>
					</div>
				</li>
				<li class="column"><div>我的随笔</div></li>
				<li class="column"><div>我的兴趣</div></li>
			</ul>
		</div>
		<br />
		<div class="static-pos">
			<p>.....</p>
		</div>
		<div class="static-pos">
			<p>--------------------------------------</p>
		</div>
	</div>
	</br></br>
	<div>
		<form action="tS" method="get">
			<p>
				First name: <input type="text" name="fname" />
			</p>
			<p>
				Last name: <input type="text" name="lname" />
			</p>
			<center>
				<input type="submit" value="Submit" />
			</center>
		</form>
	</div>
</body>
</html>