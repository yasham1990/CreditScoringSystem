<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="/WebApplication7/clientcss/benefit.css" />
    <title>User Benefit</title>
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
          <form id="form1"  method="post" action="confirm" class="fund">
    <fieldset class="main">
    <legend>Rewards </legend>
    <table>
    
       <tr>
           <td> <s:textfield label="Enter Item Code"  name="code"/></td>
       </tr>
       
      <tr><td></td></tr>
    </table>
        <s:submit  value="Confirm" cssClass="button" />
              <s:submit  action="benefitback" value="Cancel" cssClass="button"/>
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

