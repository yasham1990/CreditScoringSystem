
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="/WebApplication7/homecss/offLogin.css"/>
<title>Application Status</title>
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>

<body>
<div id="main_container">

	<div id="header">
    	<div id="logo"><img src="/WebApplication7/offlogin/logo.jpg" alt="" title="" border="0" />
        <h1> SAHARA BANK</h1>
        </div>
     
        
    </div>
  
  
  <div class="main_content">
      <form method="post" action="appbackfail">
  <fieldset  class="row11">
  <legend>Application Status</legend>
  <table>
         <tr>
             <td> Your application is in process.We will contact you shortly.</td>
    </tr>
       
     
  </table>

  <s:submit value="Back"   cssClass="buttonapp"/> 
  </fieldset>
  </form>
    </div>
    <div id="templatemo_footer_wrapper">
<div id="footer">
  <p>&nbsp;</p>
  <p><a href ="../home.jsp"> HOME </a>|<a href = "../bottompages/Aboutus.html"> ABOUT US </a>| <a href = "../bottompages/privacypolicy.html"> PRIVACY POLICY </a>|<a href ="../bottompages/terms&cond.html"> TERMS & CONDITIONS </a>|<a href = "../bottompages/ouroffices.html"> CONTACT US </a>
  </p> 
  <p>Copyright 2012. All Rights Reserved</p>
  </div>
</div>
  <!--end of main content-->
  </div>
</body>
</html>
