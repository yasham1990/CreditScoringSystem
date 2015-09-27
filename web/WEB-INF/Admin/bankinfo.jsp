<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Bank Info</title>

<link href="/WebApplication7/admincss/bankinfo.css" rel="stylesheet" type="text/css" />
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
    
<form action="bankinfoback" method="post">
     
        	 <fieldset class="row11">
   <legend>Score Calculated</legend>
<table>  
      
  <tr><td>LIQUIDIFICATION:</td>
      <td><s:property value="liquid"/></td></tr>
  <tr><td>TOTAL CARDS:</td>
      <td><s:property value="totalcards"/></td></tr>
  <tr><td>SILVER CARDS:</td>
      <td><s:property value="silver"/></td></tr>
  <tr><td>GOLD CARDS:</td>
      <td><s:property value="gold"/></td></tr>
  <tr><td>PLATINUM CARDS:</td>
      <td><s:property value="platinum"/></td></tr>
  <tr><td>NO. OF EMPLOYEES:</td>
      <td><s:property value="employee"/></td></tr>
  <tr><td>NO. OF MANAGERS:</td>
      <td><s:property value="manager"/></td></tr>
  <tr><td>MAINTAINANCE COST:</td>
      <td><s:property value="maincost"/></td></tr>
  <tr><td>DATE OF START:</td>
      <td> <s:property value="dos"  /></td></tr>
</table>
      <s:submit value="back" cssClass="button" onclick="show_confirm()"/>
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
