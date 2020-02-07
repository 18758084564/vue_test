<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://cdn.staticfile.org/vue/2.2.2/vue.min.js" charset="utf-8"></script>
</head>
<body>
	<div id="app">{{ message }}</div>
	<script type="text/javascript">
		var app=new Vue({
			el:'#app',
			data:{
				message:'Hello Vue!'
			}
		});
	</script>
</body>
</html>