
<%@page contentType="text/html" pageEncoding="UTF-8"%><html>
    <%@taglib uri="/struts-tags" prefix="s" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/employeecss/deposit.css"/>
 <title>Deposit</title>
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
        <div id="logo1">
          <p><img src="/WebApplication7/employeeimages/manage.jpg" alt="" width="580" height="181" /></p>
        </div>
        </div>
  <div id="main_content">
    <div class="main" >
   <form class="signup" method="post" action="depositconfirm" />
   <fieldset class="list">
   <legend>Deposit </legend>
   <table>  
    
   
   <tr><td><s:textfield name="clntId"  label="Enter Client Id" /></td></tr>
   <tr><td><s:textfield name="acNo"  label="Enter A/C No." /></td></tr>
   <tr><td><s:textfield name="depAmt"  label="Deposit Amount" /></td></tr>
   </table>
     <s:submit  cssClass="button" value="DEPOSIT" />
     <s:submit  align="center" action="depositback" cssClass="button" value="BACK" />
   </fieldset>
   
   </form>
    </div>
    </div>
  <!--end of main content-->
 
  <div id="footer">
	<div id="data"> 
            <center><h3>Copyright © 2012 |  SAHARA BANK </h3></center>
        <p>&nbsp;</p>
        </div>
  </div>
 </div>
</body>
</html>
