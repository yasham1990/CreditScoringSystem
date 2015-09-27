
<%@page contentType="text/html" pageEncoding="UTF-8"%><html>
    <%@taglib uri="/struts-tags" prefix="s" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/managercss/Manageeditview.css"/>
<title>Manager Edit View</title>
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
   <form class="signup" method="post" action="manageedit" >  
   <fieldset class="list">
   <legend>Employee Detail :- </legend>
   <table>  
      <s:iterator value="h2" >
         <tr>
      <td><s:property  /></td>
         </tr>
      </s:iterator>
   <tr>
   <td><s:textfield name="id"  label="Enter Employee Id" /></td>
   </tr>
   </table>
     <s:submit  align="center" cssClass="button" value="SUBMIT" />
     <s:submit  align="center" action="editviewback" cssClass="button" value="BACK" />
   </fieldset>
   </form>
   <form method="post" >
    <fieldset class="list">
   <legend>New Employee Data Insertion :- </legend>
   
    
     <s:submit   action="manageinsert" cssClass="button2" value="Click Here" />
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
