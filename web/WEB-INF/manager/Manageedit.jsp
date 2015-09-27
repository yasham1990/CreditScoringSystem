<%@page contentType="text/html" pageEncoding="UTF-8"%><html>
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
   
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="/WebApplication7/managercss/Manageedit.css"/>
    <title>Manager Edit</title>
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
        <form action="empupdate" method="post">
        <fieldset> 
        <legend>Edit Employee Info</legend>
        <table>
        <tr><td><s:textfield  name="id" label="Application ID" value="%{id}" readonly="true"/></td></tr>
        <tr><td><s:textfield  name="name" label="Name" value="%{name}" /></td></tr>
        <tr><td><s:textfield  name="gen" label="Gender" value="%{gen}" /></td></tr>
        <tr><td><s:textfield  name="address" label="Address" value="%{address}" /></td></tr>
        <tr><td><s:textfield  name="phone" label="Phone" value="%{phone}" /></td></tr>
        <tr><td><s:textfield  name="email" label="Email" value="%{email}" /></td></tr>
        <tr><td><s:textfield  name="salary" label="Salary" value="%{salary}" /></td></tr>
        <tr><td><s:textfield  name="dob" label="Date of Birth" value="%{dob}" /></td></tr>
        <tr><td><s:textfield  name="doj" label="Date of Joining" value="%{doj}" readonly="true" /></td></tr>
        </table>
        <p> <s:submit cssClass="button" value="update" /></p>
       
        <p> <s:submit cssClass="button" value="delete" action="empdelete" /></p>
        <p> <s:submit cssClass="button" value="back" action="empupback" /></p>          
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
