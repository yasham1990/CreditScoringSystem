<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Client Details</title>
    <link rel="stylesheet" type="text/css" href="/WebApplication7/clientcss/clientview.css" />
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
          <form id="form1"  method="post" action="clientviewback" class="fund">
    <fieldset>
    <legend>Client Details </legend>
    <table>
          <tr>
          <td>Name:</td>
          <td><s:property value="name"/></td>
          </tr>
          <tr>
          <td>Gender:</td>
          <td><s:property value="gen"/></td>
          </tr>
          <tr>
          <td>Address:</td>
          <td><s:property value="address"  /></td>
          </tr>
          <tr>
          <td>Mobile No.:</td>
          <td><s:property value="phone"/></td>
          </tr>
          <tr>
          <td>Email:</td>   
          <td><s:property value="email"/></td>
          </tr>
             <tr>
             <td>Date Of Birth:</td>
             <td><s:property value="dob"  /></td>
             </tr>
             <tr>
             <td>Date Of Joining:</td>
             <td><s:property value="doj"  /></td>
             </tr>
             <tr>
             <td>Card Type:</td>
             <td><s:property value="cardtype"  /></td>
             </tr>
             <tr>
             <td>Card Number:</td>
             <td><s:property value="cardno"  /></td>
             </tr>
             <tr>
             <td>Card Limit:</td>
             <td><s:property value="cardlimit"  /></td>
             </tr>
             <tr>
             <td>Cvv No:</td>
             <td><s:property value="cvvno"  /></td>
             </tr>
             <tr>
             <td>Reward Point:</td>
             <td><s:property value="reward"  /></td>
             </tr>
             <tr>
             <td>Balance Left:</td>
             <td><s:property value="totamount"  /></td>
             </tr>
             <tr><td>(monthly)</td></tr>
  </table>
              <s:submit  value="Back" cssClass="button"/>
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