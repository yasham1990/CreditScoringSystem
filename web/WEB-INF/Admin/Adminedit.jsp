<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Admin Edit</title>

<link href="/WebApplication7/admincss/Adminedit.css" rel="stylesheet" type="text/css" />
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
    
     <form action="manupdate" method="post">
          <fieldset> 
        <legend>Edit Manager Info</legend>
        <table>
            <tr><td><s:textfield  label="Application ID" name="id" value="%{id}" readonly="true" /></td></tr>
        <tr><td><s:textfield label="Name" name="name" value="%{name}" /></td></tr>
        <tr><td><s:textfield label="Gender" name="gen" value="%{gen}" /></td></tr>
        <tr><td><s:textfield label="Address" name="address" value="%{address}" /></td></tr>
        <tr><td><s:textfield label="Phone" name="phone" value="%{phone}" /></td></tr>
        <tr><td><s:textfield label="Email" name="email" value="%{email}" /></td></tr>
        <tr><td><s:textfield label="Salary" name="salary" value="%{salary}" /></td></tr>
        <tr><td><s:textfield label="Date of Birth" name="dob" value="%{dob}" /></td></tr>
        <tr><td><s:textfield label="Date of Joining" name="doj" value="%{doj}" readonly="true" /></td></tr>
        </table>
        <p> <s:submit value="update" cssClass="button" /></p>
       
        <p> <s:submit value="delete" cssClass="button" action="mandelete" /></p>
          <p> <s:submit value="back" cssClass="button" action="manback" /></p>          
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