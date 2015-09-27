<%-- 
    Document   : reachsuccess
    Created on : May 30, 2012, 1:35:37 AM
    Author     : yasham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s" %>
<html >
<head>
<script type="text/javascript">
function decision(){
<s:if test="%{out}">
                   alert("Your message has been sent successfully"); 
                    window.location="/WebApplication7/home.jsp";
                   </s:if>
                        <s:else> 
        alert("Sorry,There is some problem please try again."); 
        </s:else>
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Client Logout</title>
</head>
<body onload="decision()">
</body>
</html>

