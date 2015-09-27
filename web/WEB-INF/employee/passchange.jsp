
<%@page contentType="text/html" pageEncoding="UTF-8"%><html>
    <%@taglib uri="/struts-tags" prefix="s" %>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/employeecss/passchange.css"/>

<title>Change Password</title>
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>

<body> 
          
<div id="main_container">
<div id="header">
    	<div id="logo"><img src="/WebApplication7/employeeimages/logo1.jpg" alt="" title="" border="0" />
        <h2> SAHARA BANK</h2>
        </div>
        <div id="logo1"><img src="/WebApplication7/employeeimages/manage.jpg" alt="" width="500" height="181" /></div>
        </div>
 <div id="main_content">
 <div class="main" >
 <form action="emppassword" method="post">
 <fieldset> 
     <legend>Change Password</legend>
     <p>Password(minimum length 6 characters) must contain one digit,one lowercase character,one uppercase character and special symbol(@#$%)</p>
   <table>
       
       <tr><td><s:textfield name="id" label="Employee Id" readonly="true" value="%{id}"/></td></tr>
       <tr><td><s:password name="oldpassword" label="Old Password"/></td></tr>
       <tr><td><s:password name="password" label="New Password"/></td></tr>
       <tr><td><s:password name="confirmpassword" label="Confirm Password"/></td></tr>
       
     </table>
      <s:submit value=" Reset " cssClass="button"  />
      <s:submit cssClass="button" action="passback" value=" Back  " />
 </fieldset>
 </form>
 </div>
 </div>
 <!--end of main content-->
 <div id="footer">
 <div id="data"> 
 <h3> <center> Copyright © 2012 |  SAHARA BANK </center></h3>
 <p>&nbsp;</p>
 </div>
 </div>
 </div>
 </body>
 </html>
