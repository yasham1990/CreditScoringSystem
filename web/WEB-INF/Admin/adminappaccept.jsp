
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Admin Application Request</title>

<link href="/WebApplication7/admincss/adminappaccept.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>
<body>


<div id="templatemo_banner_wrapper">

	<div id="templatemo_banner">
    <p><img src="/WebApplication7/adminimages/banner.jpg"  alt="banner" height="100"/> </p>
    	<h2>SAHARA BANK</h2>
     
    </div> <!-- end of templatemo_banner -->
    
</div> 
<div id="templatemo_content_wrapper">

	<div id="templatemo_content">
    
     <form action="accept" method="post">
         <fieldset class="row11"> 
             <table>
                 <tr><td><s:textfield name="appno" value="%{id}" label="APPLICATION ID"/></td></tr>
                 <tr><td>NAME OF CLIENT:</td><td><s:property value="name"/></td></tr>
                 <tr><td>CARD TYPE:</td><td><s:property value="card"/></td></tr>
  <tr><td>SCORE GENERATED:</td><td><s:property value="score"/></td></tr>
             </table>
             <table>
  <tr><td>MIN SCORE:</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Silver:60</td><td>Gold:80</td><td>Platinum:92</td></tr>     
          </table>
  <p> <s:submit value="accept" cssClass="button" /></p>
        <p> <s:submit value="reject" cssClass="button" action="reject" /></p>
         </fieldset>
             </form>
        
        <div class="cleaner"></div>
  </div> <!-- end of templatemo_content -->
 

</div> <!-- end of templatemo_content_wrapper -->

<div id="templatemo_footer_wrapper">
<div id="templatemo_footer">

    <center>
       <h4> Copyright © 2012 |  SAHARA BANK </h4>
   </center>
</div>
</div> <!-- end of footer -->
</body>
</html>

