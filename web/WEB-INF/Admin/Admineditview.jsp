
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Admin Edit View</title>

<link href="/WebApplication7/admincss/Admineditview.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>
<body>
<div id="templatemo_banner_wrapper">

	<div id="templatemo_banner">
    <p><img src="/WebApplication7/adminimages/banner.jpg"  alt="banner" height="100"/> </p>
    	<h2>SAHARA BANK</h2>
     
    </div> <!-- end of templatemo_banner -->
    
</div> 
    
<div id="templatemo_content_wrapper">

	<div id="templatemo_content">
    
         <form action="adminedit" method="post"  >
     <fieldset class="row11">
   <legend>Manager Detail :- </legend>
   <table>
       
   <s:iterator value="h2" >
         <tr>
        <td> <s:property /></td></tr>
      </s:iterator>
         </table>
   <table>
   <tr>
   <td><s:textfield name="id" label="Enter Manager id" /></td>
   </tr>
  </table>
       <s:submit  cssClass="button"  value="Submit" />
   <s:submit  action="admineditback" cssClass="button"  value="back" />
     </fieldset>
         </form>
    <form method="post" >
    <fieldset class="row11">
   <legend>New Manager Data Insertion :- </legend>
   
    
     <s:submit   action="admininsert" cssClass="button2" value="Click Here" />
   </fieldset>
   </form>
        <div class="cleaner"></div>
  </div> <!-- end of templatemo_content -->
 

</div> <!-- end of templatemo_content_wrapper -->

<div id="templatemo_footer_wrapper">
<div id="templatemo_footer">

    <center>
       <h4> Copyright © 2012 |  SAHARA BANK </h4>
   </center>
</div>
</div> <!-- end of footer -->
</body>
</html>
