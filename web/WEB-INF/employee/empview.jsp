
<%@page contentType="text/html" pageEncoding="UTF-8"%><html>
    <%@taglib uri="/struts-tags" prefix="s" %>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/employeecss/empview.css"/>
 
<title>Employee Info</title>
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
    <form  method="post">
      
 <fieldset>
     <legend> Employee Details</legend>
  <table>  
      <tr><td><s:textfield readonly="true" name="id1" value="%{id}" label="Employee Id"/></td></tr>
      
      <tr><td>Employee:</td>
          <td><s:property value="id"/></td>
      </tr>
            
      <tr>
          <td>  Name: </td>
          <td><s:property value="name"  /></td>
             </tr>
               <tr>
                   <td>Gender: </td>
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
                 <td>Email:</td>   <td><s:property value="email"/></td>
             </tr>
      <tr>
          <td>Salary:</td>
          <td><s:property value="salary"  /></td>
             </tr>
             <tr>
             <td>Date Of Birth:</td>
             <td><s:property value="dob"  /></td>
             </tr>
   <tr>
             <td>Date Of Joining:</td>
             <td><s:property value="doj"  /></td>
             </tr>
      <s:submit value="Back" action="empviewback" cssClass="button" />
      
 </table>
 </fieldset>        
 </form>
    </div>
  </div>
  
  <!--end of main content-->
 <div id="footer">
	<div id="data"> 
        <center><h3> Copyright © 2012 |  SAHARA BANK </h3></center>
        <p>&nbsp;</p>
     </div>
  </div>
 </div>
</body>
</html>
