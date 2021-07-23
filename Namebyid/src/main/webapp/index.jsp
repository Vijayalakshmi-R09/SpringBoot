<html>
<body>
<div>
<h3><u>Current Date and Time  </u></h3>
<h2 style="color:blue;">
<% java.util.Date d = new java.util.Date();
			out.println(d.toString());%><br><br></h2>
<script type="text/javascript">  
function getName(){  
var name=document.getElementById("uname").value;  
alert("UserName: "+name);  
}  
</script>  
<form>  
Enter UserName:<input type="text" id="uname" name="name"/><br><br>  
<input type="button" value="Submit" onclick="getName()"/>  
</form>  
</div>
</body>
</html>
