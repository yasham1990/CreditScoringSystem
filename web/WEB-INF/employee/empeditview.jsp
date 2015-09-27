
<%@page contentType="text/html" pageEncoding="UTF-8"%><html>
    <%@taglib uri="/struts-tags" prefix="s" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/employeecss/empeditview.css"/>
<title>Employee Edit View</title>
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
       <form class="signup" method="post" action="empedit" >
 <fieldset>
   <legend>Client Details:-</legend>
  <table>  
      <s:iterator value="h2" >
         <tr>
      <td><s:property/></td>
         </tr>
      </s:iterator>
  </table>
   <table>
   <tr>
   <td><s:textfield name="id" label="Enter id" /></td>
   </tr>
    
   
   
   </table>
   <s:submit   cssClass="button" value="SUBMIT" />
   <s:submit  action="empeditviewback" cssClass="button" value="BACK" />
   </fieldset>

   </form>
    </div>
  </div>
  
  <!--end of main content-->
 <div id="footer">
	<div id="data"> 
        <h3> <center> Copyright © 2012 |  SAHARA BANK </center></h3>
        <p>&nbsp;</p>
        </div>
  </div>
 </div>
</body>
</html>
