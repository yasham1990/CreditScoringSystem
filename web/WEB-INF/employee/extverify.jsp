<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="/WebApplication7/employeecss/extverify.css"/>
<title>External Verification</title>
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>
<body>
<form id="verify" name="verify" method="post" action="forward"  class="verify">
 <fieldset class="main" >
     <legend>EXTERNAL VERIFICATON</legend>
 <table>
   <tr> 
       <td><s:textfield label="Application No." name="id" value= "%{id}" readonly="true"/></td>
   </tr>
   <tr> 
       <td><s:textfield label="First Name" name="fname" value=""/></td></tr>
    <tr>
        <td><s:textfield label="Last Name" name="lname" value=""/></td>
    </tr>
 
   <tr>
       <td><s:radio name="address" label="Address Verified" list="{'Yes','No'}" value="%{address}" /></td>
   </tr>
   
   <tr>
       <td><s:textfield name="email" label="Email" value=""/></td>
   </tr>
   
   <tr>
       <td><s:textfield label="Mobile No." name="mob" value=""/></td>
   </tr>
  
   <tr>
       <td><s:textfield name="members" label="Family Members" value=""/></td>
  </tr>
     <tr>
         <td><s:textfield  name="harea" label="House Area" value=""/></td>
     </tr>
     <tr><td> <s:radio name="hloan" label="House Loan" list="{'Yes','No'}"  value="%{hloan}" /></td>
     </tr>
   <tr> <td> <s:radio name="hinstal" label="Installments Paid" list="{'Regular','Irregular','NotAvailable'}" value="%{hinstal}" /></td>
   </tr>
    <tr> 
   <td> <s:radio name="bill" label="Bill Payments" list="{'OnTime','Late'}" value="%{bill}" /></td>
   </tr>
   <tr>
       <td><s:textfield name="cars" label="Cars Own" value=""/></td>
   </tr>
<tr> 
 <td> <s:radio name="carloan" label="Car Loan" list="{'Yes','No'}" value="%{carloan}" /></td>
</tr>

     <tr><td> <s:radio name="cinstal" label="Installments Paid" list="{'Regular','Irregular','NotAvailable'}" value="%{cinstal}" /></td> </tr>
  



<tr><td><s:textfield name="inc" label="Monthly Income" value=""/></td></tr>

<tr><td><s:textfield name="fd" label="Fixed Deposit" value=""/></td></tr> 

<tr><td><s:textfield name="netfd" label="Net FD Amount" value=""/></td></tr>

<tr><td><s:textfield name="agland" label="Agricultural Land" value=""/></td></tr>

<tr><td><s:textfield name="lic" label="Life Insurance Policy" value=""/></td></tr>

<tr><td><s:textfield name="bdflt" label="Bank Default" value=""/></td></tr>

<tr><td><s:textfield name="tax"  label="Tax Default" value=""/></td></tr>

<tr><td> <s:radio name="crime" label="Criminal Record" list="{'Yes','No'}" value="%{crime}" /></td></tr>
<tr><td><s:radio name="othinc" label="Other Income Source" list="{'Yes','No'}" value="%{othinc}" /></td></tr>
<tr><td> <s:radio name="othcard" label="Other Bank Card" list="{'Yes','No'}" value="%{othcard}" /></td></tr>

</table>
<s:submit cssClass="button"  value="Forward" />
<s:submit cssClass="button"  action="extverifyback"  value=" Back "  />
</fieldset>
 

     

   
   

</form>
</body>
</html>
