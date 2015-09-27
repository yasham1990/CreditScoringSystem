

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Admin Insert</title>

<link href="/WebApplication7/admincss/Admininsert.css" rel="stylesheet" type="text/css" />
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
    
       <form action="maninsert" method="post">
        <fieldset> 
        <legend>Manager Info</legend>
        <table>
        <tr><td><s:textfield  name="id" label="Application ID" value="%{id}" /></td></tr>
        <tr><td><s:textfield  name="name" label="Name"  /></td></tr>
        <tr><td><s:textfield  name="gen" label="Gender"  /></td></tr>
        <tr><td><s:textfield  name="address" label="Address"  /></td></tr>
        <tr><td><s:textfield  name="phone" label="Phone"  /></td></tr>
        <tr><td><s:textfield  name="email" label="Email"  /></td></tr>
        <tr><td><s:textfield  name="salary" label="Salary"  /></td></tr>
        <tr><td><s:textfield  name="dob" label="Date of Birth"  /></td></tr>
        <tr><td><s:textfield  name="doj" label="Date of Joining"  /></td></tr>
        </table>
       
        <p> <s:submit cssClass="button" value="insert"/>
            <s:submit cssClass="button" value="back" action="admininsertback" /></p>
       </fieldset>    
        </form>
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