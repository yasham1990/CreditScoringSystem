<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>User Home Page</title>
        <link href="/WebApplication7/clientcss/client.css" rel="stylesheet" type="text/css" />
        <script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
    </head>
    <body>
<!-- end of templatemo_header_wrapper -->   

<div id="templatemo_banner_wrapper">

	<div id="templatemo_banner">
    <p><img src="/WebApplication7/userimages/banner.jpg"  alt="banner" height="120" width="130"/> </p>
    	<h2>SAHARA BANK</h2>
     
    </div> <!-- end of templatemo_banner -->
    
</div> <!-- end of templatemo_banner_wrapper -->

<div id="templatemo_menu_wrapper">

    <div id="templatemo_menu">
    
        <ul>
            <li><a href="#" class="current"><span class="home">Home</span></a></li>
          
            <li><s:url action="clientpass" var="welcome" />

                <s:a href="%{welcome}"><span class="password1">Change Password</span></s:a></li>
            
            <li><s:url action="logoutclient" var="welcome" />

                <s:a href="%{welcome}"><span class="logout">Log Out</span></s:a></li>
        </ul>    	
    
    </div> <!-- end of templatemo_menu -->
</div> <!-- end of templatemo_menu_wrapper -->    
    
    <div id="templatemo_content">
    
         <div class="content_section">
         
         	<p class="user">Welcome   <s:property value="namedis"/>.....</p>
        
     		<div class="service_box float_l">
            	 
                 <div class="service_image">
                 	<img src="/WebApplication7/userimages/deposit.jpg"  alt="deposit"/> </div>
					<div class="service_text">
                     <h3>Fund Transfer</h3>
                     <p>Send money funds to others  account here...</p>
                     <div class="button_01"><s:url action="ftrans" var="hii"/> <s:a  href="%{hii}">Click Here</s:a></div></div>
                 </div>
            
            <div class="service_box float_r">
            
            <div class="service_image">
           <img src="/WebApplication7/userimages/withdrawl.jpg" alt="withdrawl"/> </div>
<div class="service_text">
                     <h3>Client & Card Info</h3>
                     <p>Check your general infomation and card status like  credit ,limit here...</p>
<div class="button_01">
    <s:url action="clientinfo" var="hi"/> <s:a href="%{hi}">Click Here</s:a></div>
                 </div>
                 </div>
               	 <div class="cleaner"></div>
            </div>
         
          <div class="content_section">
        
     		<div class="section_410 float_l">
            	 <div class="service_image">
                 	<img src="/WebApplication7/userimages/transaction.gif" alt="transaction"/> </div>
					<div class="service_text">
                     <h3>List of Transaction</h3>
                     <p>Check list of your transactions done...</p>
           <div class="button_01">
           <s:url action="translist" var="welcome" />

                <s:a href="%{welcome}">Go</s:a></div>
                 </div>
                 </div>
               
            <div class="section_410 float_r">
          	<div class="service_image">
           	<img src="/WebApplication7/userimages/Rewards.jpg" alt="rewards" /></div>
			<div class="service_text">
              <h3> Get Rewards</h3>
              <p>Check and collect exciting prizes using your credit points...</p>
       <div class="button_01"><s:url action="reward" var="welcome" />

                <s:a href="%{welcome}">Go</s:a></div>
                     </div>
         	     </div>
                 	<div class="cleaner"></div>
         			</div>
       </div> <!-- end of templatemo_content -->
    
<div id="templatemo_footer_wrapper">
<div id="templatemo_footer">
    <p>&nbsp;</p>
   
    <center>
        Copyright © 2012 |  SAHARA BANK 
   </center>
</div> <!-- end of footer -->
</div>
</body>
</html>