<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html >
<head>
     <script type="text/javascript">
function decision(){
<s:if test="%{out}">
                   alert("Successfull"); 
                   </s:if>
                      
}

window.history.forward(1);

</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/admincss/insupdeladmin.css"/>
<title>Successful</title>
</head>
<body onload="decision()">
    <div id="templatemo_banner_wrapper">
	<div id="templatemo_banner">
    <p><img src="/WebApplication7/adminimages/banner.jpg"  alt="banner" height="100"/> </p>
    	<h2>SAHARA BANK</h2>
     
    </div> <!-- end of templatemo_banner -->
    
</div> 
<div id="templatemo_content_wrapper">

	<div id="templatemo_content">
    
     <form action="Gobackadmin" method="post">
         <fieldset>
     <legend>Info Message</legend>
     <p>Click here to go back...</p>
      <s:submit value="Back"  cssClass="button" />
      
 
 </fieldset> 
        
     </form>
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