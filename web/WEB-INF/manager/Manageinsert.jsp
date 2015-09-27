
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
   
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="/WebApplication7/managercss/Manageinsert.css"/>
    <title>Manager Insert</title>
    <script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>

<body>           
    <div id="main_container">
        <div id="header">
    	    <div id="logo"><img src="/WebApplication7/images/logo1.jpg" alt="" title="" border="0" />
                <h2> SAHARA BANK</h2>
            </div>
            <div id="logo1">
                <p><img src="/WebApplication7/images/manage.jpg" alt="" width="580" height="181" /></p>
            </div>
        </div>
           
        <div id="main_content">
        <div class="main" >
        <form action="empinsert" method="post">
        <fieldset> 
        <legend>Edit Employee Info</legend>
        <table>
        <tr><td><s:textfield  name="id" label="Application ID" value="%{id}" /></td></tr>
        <tr><td><s:textfield  name="name" label="Name"  /></td></tr>
        <tr><td><s:textfield  name="gen" label="Gender"  /></td></tr>
        <tr><td><s:textfield  name="address" label="Address"  /></td></tr>
        <tr><td><s:textfield  name="phone" label="Phone"  /></td></tr>
        <tr><td><s:textfield  name="email" label="Email"  /></td></tr>
        <tr><td><s:textfield  name="salary" label="Salary"  /></td></tr>
        <tr><td><s:textfield  name="dob" label="Date of Birth"  /></td></tr>
        <tr><td><s:textfield  name="doj" label="Date of Joining"  /></td></tr>
        </table>
       
        <p> <s:submit cssClass="button" value="insert" />
            <s:submit cssClass="button" value="back" action="manageinsertback" /></p>
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