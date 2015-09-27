
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Change Password</title>
    <link rel="stylesheet" type="text/css" href="/WebApplication7/clientcss/clientpass.css" />
    <script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>


    <body>
<!-- end of templatemo_header_wrapper -->   

<div id="templatemo_banner_wrapper">

	<div id="templatemo_banner">
    <p><img src="/WebApplication7/userimages/banner.jpg"  alt="banner" height="120" width="130"/> </p>
    	<h2>SAHARA BANK</h2>
     
    </div> <!-- end of templatemo_banner -->
    
</div> <!-- end of templatemo_banner_wrapper -->

  
    
    <div id="templatemo_content">
    
         <div class="content_section">
          <form id="form1"  method="post" action="clientpasschange" class="fund">
    <fieldset class="main">
    <legend>Change Password</legend>
     <p class="pass">Password(minimum length 6 characters) must contain one digit,one lowercase character,one uppercase character and special symbol(@#$%)</p>
   <table>
       
       <tr><td><s:textfield name="id" label="Client Id" readonly="true" value="%{id}"/></td></tr>
       <tr><td><s:password name="oldpassword" label="Old Password"/></td></tr>
       <tr><td><s:password name="password" label="New Password"/></td></tr>
       <tr><td><s:password name="confirmpassword" label="Confirm Password"/></td></tr>
       
     </table>
      <s:submit value=" Reset " cssClass="button"  />
      <s:submit cssClass="button" action="clientpassback" value=" Back  " />
 </fieldset>
  
    </form>
       </div>
       </div> <!-- end of templatemo_content -->
    
<div id="templatemo_footer_wrapper">
<div id="templatemo_footer">
   
    <center>Copyright © 2012 |  SAHARA BANK</center>
   
</div> <!-- end of footer -->
</div>
</body>
</html>