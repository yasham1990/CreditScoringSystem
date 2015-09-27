
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/managercss/forpass.css">

<title>Change Password</title>
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
        <form action="forpassword" method="post">
            <fieldset> 
        <legend>Change Password</legend>
         <p>Password (minimum length 6 characters)must contain one digit,one lowercase character,one uppercase character and special symbol(@#$%)</p>
        <table>
            <tr><td><s:textfield name="id" label="Id" readonly="true" value="%{id}"/></td></tr>
            <tr><td><s:password name="oldpassword" label="Old Password"/></td></tr>
            <tr><td> <s:password name="password" label="New Password"/></td></tr>
            <tr><td> <s:password name="confirmpassword" label="Confirm Password"/></td></tr>
           
        </table>
	 <s:submit cssClass="button" value="Submit" />
        <s:submit cssClass="button" action="passwordbackman" value="back" />
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

