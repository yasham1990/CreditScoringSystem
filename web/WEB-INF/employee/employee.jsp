
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<html >
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Employee</title>
<link rel="stylesheet" type="text/css" href="/WebApplication7/employeecss/employee.css"  />
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>
<body>
    <div id="main_container">
    <div class="center_content">
    <div id="header">
    <div id="logo"><img src="/WebApplication7/employeeimages/logo1.jpg" alt="" title="" border="0" />
    <h1>SAHARA BANK</h1>
    </div>
    <div id="logo1">
        <p><img src="/WebApplication7/employeeimages/manage.jpg" alt="" width="580" height="181" /></p>
    </div>    
    </div>
  
    <div class="main_content">
    <div id="boxes_content">
     <p class="welc">Welcome   <s:property value="namedis"/>.....</p>
    	<div class="box">
        	<div class="box_content">
        	<div class="boxtitle">Applications</div>
                <div class="box_icon">
                    <s:url action="applist" var="app"/>
                    <s:a href="%{app}"><img src="/WebApplication7/employeeimages/apprequest.gif" alt="" title="" border="0"/> </s:a> </div>
            <p class="text_content">
 "CHECK Applications for CREDIT CARD here..&quot;<br />
 <br/>
            </p> 
            </div>                  
        </div>

    	<div class="box">
        	<div class="box_content">
        	<div class="boxtitle">Manage Accounts</div>
            <div class="box_icon">
                <s:url action="manageclient" var="welcome"/><s:a href="%{welcome}"><img src="/WebApplication7/employeeimages/manage.png" alt="" title="" border="0"/></s:a></div>
            <p class="text_content">
 "MANAGE Accounts of Clients here..&quot;<br /> <br />
            </p> 
            </div>                  
        </div>
            
     	<div class="box">
        	<div class="box_content">
        	<div class="boxtitle">View Information</div>
            <div class="box_icon">
                <s:url action="view" var="hell"/><s:a href="%{hell}"><img src="/WebApplication7/employeeimages/mail.jpg" alt="" title="" border="0"/></s:a></div>
            <p class="text_content">
 "CHECK Your Information here..&quot;<br/>
 <br />
            </p> 
            </div>                  
        </div>       
           	
            <div class="box">
        	<div class="box_content">
        	<div class="boxtitle">Change Password</div>
            <div class="box_icon">
                <s:url action="passview" var="wel"/>
                <s:a href="%{wel}"><img src="/WebApplication7/employeeimages/password.jpg" alt="" title="" border="0"/></s:a></div>
            <p class="text_content">
 "Change Your Secret Password Here..&quot;<br /><br />
            </p> 
            </div>                  
        </div>
            
                       <div class="box">
        	<div class="box_content">
        	<div class="boxtitle">Deposit</div>
            <div class="box_icon">
                <s:url action="deposit" var="pass1"/>
                <s:a href="%{pass1}"><img src="/WebApplication7/employeeimages/deposit.jpg" alt="" title="" border="0"/></s:a></div>
            <p class="text_content">
 "Deposit money in client's account Here..&quot;<br /><br />
            </p> 
            </div>                  
        </div>
            
       	<div class="box" id="log">
        	<div class="box_content" >
        	<div class="boxtitle">Log Out</div>
                <div class="box_icon"><s:url action="logoutemp" var="welcome" />

                <s:a href="%{welcome}"><img src="/WebApplication7/images/logout.jpg" alt="" title="" border="0"/></s:a></div>
            <p class="text_content">
 "CLICK To LogOut from Your Account&quot;<br />
 <br />
            </p> 
            </div>                  
        </div>          
        
    </div><!--end of boxes content-->
  
  <div class="clear"></div>
  </div><!--end of main content-->
    
    
     <div id="footer">
	<div id="data"> 
        <center><h3>Copyright © 2012 |  SAHARA BANK </h3></center>
        <p>&nbsp;</p>
     </div>
       </div>
 
	</div>
</div>
</body>
</html>
