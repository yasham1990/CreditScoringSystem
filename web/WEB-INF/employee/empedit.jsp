
<%@page contentType="text/html" pageEncoding="UTF-8"%><html>
<%@taglib uri="/struts-tags" prefix="s" %>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="/WebApplication7/employeecss/empedit.css"/>
    <title>Edit Accounts</title>
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
    <form action="update" method="post">
        <fieldset>
            <center> <h2> Edit Client Info</h2></center>
        <table>            
        <tr><td><s:textfield label="Client ID" name="id" value="%{id}" readonly="true"/></td></tr>
        <tr><td><s:textfield label="Name" name="name" value="%{name}" /></td></tr>
        <tr><td><s:textfield label="Gender" name="gen" value="%{gen}" /></td></tr>
        <tr><td><s:textfield label="Address" name="address" value="%{address}" /></td></tr>
        <tr><td><s:textfield label="Phone" name="phone" value="%{phone}" /></td></tr>
        <tr><td><s:textfield label="Email" name="email" value="%{email}" /></td></tr>
        <tr><td><s:textfield label="Date of Birth" name="dob" value="%{dob}" readonly="true"/></td></tr>
        <tr><td><s:textfield label="Date of Registration" name="dor" value="%{dor}" readonly="true"/></td></tr>
      
          
        
    </table>
        <s:submit cssClass="button" value="Update" />
        <s:submit value="Delete" cssClass="button" action="delete" />
        <s:submit value=" Back " action="empeditback" cssClass="button" />
        </fieldset>
    </form>
    </div>
  </div>
  
  <!--end of main content-->
 <div id="footer">
	<div id="data"> 
        <center><h3>  Copyright © 2012 |  SAHARA BANK </h3></center>
        <p>&nbsp;</p>
     </div>
  </div>
 </div>
</body>
</html>
