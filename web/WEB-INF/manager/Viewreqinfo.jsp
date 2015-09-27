

<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/managercss/Viewreqinfo.css"/>

<title>View request info</title>
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>

<body> 
          
<div id="main_container">
<div id="header">
    	<div id="logo"><img src="/WebApplication7/managerimages/logo1.jpg" alt="" title="" border="0" />
        <h2> SAHARA BANK</h2>
        </div>
        <div id="logo1">
          <p><img src="/WebApplication7/managerimages/manage.jpg" alt="" width="580" height="181" /></p>
        </div>
        </div>
  <div id="main_content">
    <div class="main" >
       
        <fieldset>
            <legend>Information</legend>
        <table>
           
        <tr><td><s:url action="manager/internalinfo" var="welc"/><s:a href="%{welc}">Internal info</s:a></td></tr>
        <tr><td><s:url action="manager/externalinfo" var="welc"/><s:a href="%{welc}">External info</s:a></td></tr>
        <tr><td><s:url action="manager/Generate" var="welc"/><s:a href="%{welc}">Generate Score</s:a></td></tr>
    </table>
        <form method="post"><s:submit action="Clickmeback" cssClass="button" value="back"/></form>
        </fieldset>
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