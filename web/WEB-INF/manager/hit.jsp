
<%@page contentType="text/html" pageEncoding="UTF-8"%><html>
    <%@taglib uri="/struts-tags" prefix="s" %>
<head>
 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/managercss/hit.css"/>
 
<title>Score</title>
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
    <form action="Datatoadmin" method="post">
        <p>Application ID:<s:textfield readonly="true" name="id" value="%{id}" />
      
 <fieldset class="row11">
   <legend>Score Calculated</legend>
  <table>  
      
      
         <tr>
             <td>Income:</td><td><s:property value="income1"  /></td>
             </tr>
             <tr>
             <td>Address:</td><td><s:property value="address"  /></td>
             </tr>
             
             <tr>
             <td>Tax Default:</td><td><s:property value="taxpay"  /></td>
             </tr>
             
         <tr>
             <td>Bill Pay:</td><td><s:property value="billpay"  /></td>
             </tr>
             <tr>
             <td>Other Bank Cards:</td><td><s:property value="otherbank"  /></td>
             </tr>
             
            <tr>
             <td>No. Of Fds:</td><td><s:property value="nfd"  /></td>
             </tr>
      <tr>
             <td>Bank Default:</td><td><s:property value="bankdefault"  /></td>
             </tr>
             <tr>
             <td>Home Loan:</td><td><s:property value="loanpaidhome"  /></td>
             </tr>
              <tr>
             <td>Car Loan:</td><td><s:property value="loanpaidcar"  /></td>
             </tr>
             <tr>
             <td>Criminal Record:</td><td><s:property value="criminalrecord"  /></td>
             </tr>
             <tr>
             <td>No.of Lic:</td><td><s:property value="lic"  /></td>
             </tr>
              <tr>
             <td>Agricultural Land:</td><td><s:property value="aggland"  /></td>
             </tr>
              <tr>
                  <td>OtherIncome:</td><td><s:property value="otherinc"  /></td>
             </tr>
              
                 
             
              <tr>
             <td>Min Score:60</td><td>Gold:80</td><td>Platinum:92</td>
             </tr>
             <tr><td><s:textfield label="Total Score" name="score" value="%{totscore}" readonly="true"  /></td></tr>
      </table>
             <s:submit cssClass="button" value="forward" />
             <s:submit cssClass="button" action="reject" value="reject"/> 
              <s:submit cssClass="button" action="generateback" value="back"/>
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