
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html >
<head>
     <script type="text/javascript">

   function decision(){
<s:if test="%{out}">
                   alert("Successfull"); 
                   </s:if>
}

window.history.forward(1);

</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Successful</title>
 <link rel="stylesheet" type="text/css" href="/WebApplication7/employeecss/updel.css"/>

</head>

<body onload="decision()">
  <div id="main_container">
<div id="header">
    	<div id="logo"><img src="/WebApplication7/employeeimages/logo1.jpg" alt="" title="" border="0" />
        <h2> SAHARA BANK</h2>
        </div>
        <div id="logo1">
          <p><img src="/WebApplication7/employeeimages/manage.jpg" alt="" width="580" height="181" /></p>
        </div>
        </div>
  <div id="main_content">
    <div class="main" >
    <form action="Gobackemp" method="post">
      
 <fieldset>
     <legend>Info Message</legend>
     <p>Click here to go back...</p>
      <s:submit value="Back"  cssClass="button" />
      
 
 </fieldset>        
 </form>
    </div>
  </div>
  
  <!--end of main content-->
 <div id="footer">
	<div id="data"> 
        <center><h3> Copyright © 2012 |  SAHARA BANK </h3></center>
        <p>&nbsp;</p>
     </div>
  </div>
 </div>
</body>
</html>
