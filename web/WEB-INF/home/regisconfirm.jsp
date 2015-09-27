<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html >
<head>
     <script type="text/javascript">

   function decision(){
<s:if test="%{out}">
                   alert("Successfully Registered ,You will be confirmed through email,THANK YOU"); 
                    window.location="/WebApplication7/home.jsp";
                   </s:if>
}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Registration Confirm</title>

</head>

<body onload="decision()">
  
</body>
</html>