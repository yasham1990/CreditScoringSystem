<%-- 
    Document   : offLogin
    Created on : May 10, 2012, 2:39:59 PM
    Author     : yasham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="/WebApplication7/homecss/offLogin.css"/>
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
<title>OfficialLogin</title>
</head>

<body>
<div id="main_container">

	<div id="header">
    	<div id="logo"><img src="/WebApplication7/offlogin/logo.jpg" alt="" title="" border="0" />
        <h1> SAHARA BANK</h1>
        </div>
     
        
    </div>
  
  
  <div class="main_content">
      <form method="post" action="officiallog">
  <fieldset  class="row1">
  <legend>Official Login</legend>
  <table>
         <tr>
          <td> <s:radio label="Officials" name="official" list="{'Admin','Manager','Employee'}" key="Admin"  /></td>
    </tr>
       <tr>      
        <td><s:textfield cssClass="mytextfield" name="userName" label="Username" value=""/></td>    
    </tr>
       <tr>      
           <td><s:password label="Password" name="pass" cssClass="mytextfield" value=""/></td>    
      </tr>
     
  </table>
  <s:submit value="Login"  cssClass="button"/> 
  <s:submit value="Back"  action="offback" cssClass="button"/> 
  </fieldset>
  </form>
    </div>
    <div id="templatemo_footer_wrapper">
<div id="footer">
  <p>&nbsp;</p>
  <p><a href ="home.jsp"> HOME </a>|<a href = "bottompages/Aboutus.html"> ABOUT US </a>| <a href = "bottompages/privacypolicy.html"> PRIVACY POLICY </a>|<a href ="bottompages/terms&cond.html"> TERMS & CONDITIONS </a>|<a href = "bottompages/ouroffices.html"> CONTACT US </a>
  </p> 
  <p>Copyright 2012. All Rights Reserved</p>
  </div>
</div>
  <!--end of main content-->
  </div>
</body>
</html>
