
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
<title>Home Page</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link href="/WebApplication7/homecss/default.css" rel="stylesheet" type="text/css" />
<link href="/WebApplication7/homecss/rewards.css" rel="stylesheet" type="text/css" />
<link href="/WebApplication7/homecss/cards.css" rel="stylesheet" type="text/css" />

<script type="text/javascript">
    {

        function home() {
            document.getElementById("home").style.display = 'block';
            document.getElementById("cards").style.display = 'none';
            document.getElementById("rewards").style.display = 'none';
            document.getElementById("offi").style.display = 'none';
        };
        
        function cards() {
            document.getElementById("home").style.display = 'none';
            document.getElementById("cards").style.display = 'block';
            document.getElementById("rewards").style.display = 'none';
            document.getElementById("offi").style.display = 'none';
        };
        
        function rewards() {
            document.getElementById("home").style.display = 'none';
            document.getElementById("cards").style.display = 'none';
            document.getElementById("rewards").style.display = 'block';
            document.getElementById("offi").style.display = 'none';
        };
        
        function offi() {
            document.getElementById("home").style.display = 'none';
            document.getElementById("cards").style.display = 'none';
            document.getElementById("rewards").style.display = 'none';
            document.getElementById("offi").style.display = 'block';
        };
        
        function appi() {
            document.getElementById("home").style.display = 'none';
            document.getElementById("cards").style.display = 'none';
            document.getElementById("rewards").style.display = 'none';
            document.getElementById("offi").style.display = 'none';
        }
    } 
window.history.forward(1);

</script>

</head>
<body>

<div id="header">
  <div id="logo">
    <img src="homeimages/logo.jpg" alt=""  />
     <h1>SAHARA BANK</h1> 
     <h2>Online Credit Card Offering Solution</h2>    
  </div>
  <div id="menu">
    <ul>
    
      <li><a href="#" onclick="home()" class="active">Home</a></li>
      <li><a href="#" onclick="cards()">Cards For You</a></li>
      <li><a href="#" onclick="rewards()">Rewards</a></li>
      <li><a href="#" onclick="offi()">Official Login</a></li>
  </ul></div>
  
</div>
<div id="content">
  <div id="sidebar">
    <div id="login" class="boxed">
      <div class="title">
        <h2>Client Account</h2>
      </div>
      <div class="content1">
        <form id="form1" method="post" action="loginclient">
          <fieldset>
          <legend>Sign-In</legend>
          <table>
          <tr>
            <td><s:textfield cssClass="mytextfield" name="userName" label="Username" value="" /></td>
            </tr>
            <tr>
                <td><s:password cssClass="mytextfield" name="password" label="Password" value="" /></td> 
            </tr>
          </table>
            <s:submit  value="Login" cssClass="buttonlog" />
          </fieldset></form></div>
    </div>
    <!-- end #login -->
    <div id="reachus"  class="boxed">
      <div class="title">
        <h2>Reach Us</h2>
      </div>
      <div class="content1">
       <form id="form2" method="post" action="Reach">
          <fieldset>
            <table>
              <tr>
                  <td><s:textfield cssClass="mytextfield" name="myname" label="Name"  /></td>
              </tr>
              <tr>
                  <td><s:textfield  cssClass="mytextfield" name="myemail" label="Email" /></td>
              </tr>
              <tr>
               <td><s:textfield  cssClass="mytextfield" name="mytelephone" label="Mobile" /></td>
              </tr>
              <tr>
               <td><s:textarea name="message" label="Comment" rows="6" cols="20" ></s:textarea></td>
              </tr>
                      
              </table>
               <s:submit  cssClass="button" value="Submit" />
               <s:submit cssClass="button" action="clear" value="Cancel" /> 
          </fieldset>
        </form>
      </div>
     
    </div>
          <div id="reachus"  class="boxed">
      <div class="title">
        <h2>Application Status</h2>
      </div>
      <div class="content1">
       <form id="form2" method="post" action="Appstatus">
          <fieldset>
            <table>
              <tr>
                  <td><s:textfield cssClass="mytextfield" name="appid" label="App Id" /></td>
              </tr>
              </table>
               <s:submit  cssClass="buttoncheck" value="check" />
               
          </fieldset>
        </form>
      </div>
     
    </div>
    <!-- end #updates -->
  </div>
  
  <!-- end #sidebar -->
  
  <div class="main" style="display:block" id="home">
    <div class="post">
      <h2 class="title"><marquee><span> ....WELCOME TO SAHARA BANK....WE ARE HAPPY TO SERVE YOU....</span></marquee></h2>
        
      <p><img src="homeimages/bank1.jpg" alt="" width="600" height="500"  /></p>
       <p> <textarea name="infobank" id="infobank"  rows="10" cols="72" readonly >
SAHARA BANK CREDIT CARD is the most convenient and secure way to carry currency overseas and make payments to merchant outlets in any currency, anywhere in the world.
        
Worldwide acceptance:
Your SAHARA BANK CREDIT CARD is accepted at over 28 million merchant establishments around the world that display the Visa signage. Your card can be used in department stores, hotels, hospitals, restaurants, airlines, petrol pumps, paying for customs duty and even when you travel from one place to another.

Cashless convenience:
Your SAHARA BANK CREDIT CARD can be used to withdraw cash in the local currency of the country you are in. No longer queues to purchasemoney in different currencies in India for your oversea trip. And again, you don't have to run around looking for Money changers to exchange your travelers cheques in unfamiliar lands.
Locked-in exchange rates

With the SAHARA BANK CREDIT CARD, you will never have to worry about fluctuating exchange rates or unexpected fees since you lock in your exchange rate when youTotal Protect* is the first -of-its-kind security program that covers you for unauthorised transactions on your card at merchant establishments. 'Total Protect' covers you for a sum up to the limit loaded on your card (with a maximum limit of Rs. 100,000 per card). </textarea></p>

        

      
      <div class="data"></div>
    </div>
    </div>
    <!-- end #welcome -->
<div class="main" style="display:none" id="cards">
    <div class="post">
    <h2 class="title"><marquee><span> ....WELCOME TO SAHARA BANK....WE ARE HAPPY TO SERVE YOU....</span></marquee></h2>
        
      <!-- -----------cards div----------->
<div id="main_content2">
<table width="600" border="0" align="center" cellpadding="0" cellspacing="0"  id="card">
  <tr>
    <td width="200"  valign="top">
     
    <div id="cd"><p><img src="cardimages/visa_electron.gif"  alt="silver" /></p></div>
   <div id="fortext"> <p><textarea name="caddress" id="caddress" cols="17" rows="20" readonly >Redeem your Reward Points for exciting gifts from our exclusive Rewards catalogue.

MyCity Benefit Program:
The My City benefit program comes with unmatched lifelong features like surcharge waiver across petrol pumps and cashback on utility bill payments.

Balance Transfer: 
You can transfer your outstanding balance on your existing Credit Card to Sahara Bank and start saving immediately.
Limit:A silver card comes with a limit of Rs.25000 per month and the interest rate on amount taken on this card is 8% .
</textarea></p></div>
   <div id="end"> <p><a href="register.jsp"><img src="cardimages/index_38.gif" alt="" width="170" height="107" border="0" /></a></p></div>
   
    </td>
    <td width="200" valign="top"  >
   
    <div id="cd"><p><img src="cardimages/visa_gold_chip.gif" alt="gold" /></p></div>
    <div id="fortext"><p> <textarea name="caddress1" id="caddress1" cols="17" rows="20" readonly >Earn 1 Reward Point for every Rs.150 for spends up to Rs. 20,000 per statement cycle. For incremental spends above Rs. 20,000 in a statement cycle, earn 50% more Reward Points i.e. 1.5 Reward Points per Rs. 150.
    
Redemption of Reward Points:
After earning all those reward points on your HDFC Bank Gold Credit Card, redeem them for exciting gifts and services! 

Accepted Worldwide:
Your Gold Credit Card is accepted at over 23 million Merchant Establishments around the world, including 110,000 in India.
Limit:A gold card comes with a limit of Rs.50000 per month and the interest rate on amount taken on this card is 5% .
    </textarea></p></div>
   <div id="end"> <p><a href="register.jsp"><img src="cardimages/index_38.gif" alt="" width="170" height="107" border="0" /></a></p></div>
    
    </td>
    <td width="200"  valign="top">
   
    <div id="cd"><p><img src="cardimages/visa_platinum.gif"  alt="platinum" /></p></div>
    <div id="fortext"><p>  
      <textarea name="caddress3" id="caddress3" cols="17" rows="20" readonly >Earn 2 Reward Points for every Rs.150 when you spend up to Rs. 35,000 per statement cycle. For incremental spends above Rs. 35,000 in a statement cycle, earn 50% more Reward Points (i.e. 3 Reward Points per Rs. 150).
    
Zero petrol surcharge:
Enjoy the benefit of zero fuel surcharge when you purchase fuel between Rs. 400 and Rs. 5,000 with your Titanium Credit Card.

Zero liability on lost card:
If you lose your Card, report it immediately to our 24-hour call centre. After reporting the loss, you carry zero liability on any fraudulent transactions made with your card.

Interest-free credit facility
Avail of up to 50 interest free days from the date of purchase (subject to the submission of the charge by the Merchant).
Revolving credit facility.
Limit:A platinum card comes with a limit of Rs.100000 per month and the interest rate on amount taken on this card is 6% .
    
 </textarea></p></div>
   <div id="end"> <p><a href="register.jsp"><img src="cardimages/index_38.gif" alt="" width="170" height="107" border="0" /></a></p></div>
    
    
	
        </td>
  </tr>
  
</table>
</div>
     
    
    <!--  --------- -->
      
        <div class="data"></div>
</div>

  </div>

   <!-- --------cards div end------------>

    <!-- -----------reward div----------->
     <div class="main" style="display:none" id="rewards" >
    <div  class="post">
      <h1 class="title"><marquee><span> ....WELCOME TO SAHARA BANK....WE ARE HAPPY TO SERVE YOU....</span></marquee></h1>
    
     <!-- ----------------- -->
      <div id="main_content" style="overflow:scroll"> 
   <div class="center_content">
	<div class="center_title_bar">0 -- 2000 Points</div>
   	<div class="prod_box">
	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Parker Pens</div>
                 <div class="product_img"><img src="rewardimages/parker.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK001</span></div>                        
            </div>            
            <div class="prod_details_tab"> 500 Points</div>                     
        </div>
 
     	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Tupperware Gift Hamper</div>
                 <div class="product_img"><img src="rewardimages/tupperware.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK002</span></div>                        
            </div>
                         
            <div class="prod_details_tab">1000 Points</div>                     
        </div> 
 
     	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Titan Voucher Rs1000</div>
                 <div class="product_img"><img src="rewardimages/titan.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK003</span></div>                        
            </div>             
            <div class="prod_details_tab">2000 Points</div>                     
        </div>
    
    
	<div class="center_title_bar">2001---3000 Points</div>
     	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">John Player Voucher Rs1199</div>
                 <div class="product_img"><img src="rewardimages/john.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK004</span></div>                        
            </div>             
            <div class="prod_details_tab">2300 Points</div>
		  </div> 
     	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Mobile Store Gift Hamper Rs1000</div>
                 <div class="product_img"><img src="rewardimages/mobile.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK005</span></div>                        
            </div>             
            <div class="prod_details_tab">2500 Points </div> 
		  </div>
			<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Nokia Bluetooth Headset Rs1000</div>
                 <div class="product_img"><img src="rewardimages/bluetooth.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK006</span></div>                        
            </div>             
            <div class="prod_details_tab">3000 Points </div> 
            </div>
	
    <div class="center_title_bar">3001---4000 Points</div>
			
            <div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Hidesign Voucher Rs1500</div>
                 <div class="product_img"><img src="rewardimages/hidesign.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK007</span></div>                        
            </div>             
            <div class="prod_details_tab">3200 Points </div> 
            </div>
            
            <div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Sony Battery Charger</div>
                 <div class="product_img"><img src="rewardimages/charger.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK008</span></div>                        
            </div>             
            <div class="prod_details_tab">3500 Points </div> 
            </div>
            
            <div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Ipod 4GB</div>
                 <div class="product_img"><img src="rewardimages/ipod.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK009</span></div>                        
            </div>             
            <div class="prod_details_tab">4000 Points </div> 
            </div>
            
	<div class="center_title_bar">4001---5000 Points</div>

			<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">HCL Kids Learning Laptop</div>
                 <div class="product_img"><img src="rewardimages/kid.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK010</span></div>                        
            </div>             
            <div class="prod_details_tab">4200 Points </div>             
			</div>

			<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Philips DVD Player</div>
                 <div class="product_img"><img src="rewardimages/dvd.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK011</span></div>                        
            </div>             
            <div class="prod_details_tab">4500 Points </div> 
            </div>
            
            
            <div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Sony Play Station</div>
                 <div class="product_img"><img src="rewardimages/sonyplay.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK012</span></div>                        
            </div>
            <div class="prod_details_tab">5000 Points </div> 
            </div>
            
	<div class="center_title_bar">5001---10000 Points</div>
            
            <div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Panasonic Camera DMC-L5</div>
                 <div class="product_img"><img src="rewardimages/panasonic.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK013</span></div>                        
            </div>
            <div class="prod_details_tab">6500 Points </div>
            </div>
            
            <div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Canon Power-Shot Camera A32</div>
                 <div class="product_img"><img src="rewardimages/canon.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK014</span></div>                        
            </div>             
            <div class="prod_details_tab">8000 Points </div>
            </div>
            
            
            <div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Sony Handy Cam Super SX-21</div>
                 <div class="product_img"><img src="rewardimages/handycam.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK015</span></div>                        
            </div>            
            <div class="prod_details_tab">10000 Points </div>
            </div>
            
            
	<div class="center_title_bar">More than 10000 Points</div>
            <div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Nano I-Pod 8GB</div>
                 <div class="product_img"><img src="rewardimages/nano.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK016</span></div>                        
            </div>    
            <div class="prod_details_tab">12000 Points </div>
            </div>
            
            <div class= "prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Apple I-Pod 10GB</div>
                 <div class="product_img"><img src="rewardimages/apple.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK017</span></div>                        
            </div>             
            <div class="prod_details_tab">15000 Points </div>
            </div>
            
            <div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title">Mac Book Air</div>
                 <div class="product_img"><img src="rewardimages/mac.jpg" alt="" title="" border="0" /></div>
                 <div class="prod_price"><span class="price">Item Code:AK018</span></div>                        
            </div>             
            <div class="prod_details_tab">20000 Points </div>
            </div>
   </div><!-- end of center content -->
   </div>


</div>
  </div>

   <!-- --------reward div end------------>

   
    <!-- -----------official div----------->
     <div class="main" style="display:none" id="offi">
    <div  class="post">
      <h1 class="title"><marquee><span> ....WELCOME TO SAHARA BANK....WE ARE HAPPY TO SERVE YOU...</span></marquee></h1>
      <div id="main_content3">
    
   <div id="offpic">
   <img src="homeimages/offlog.png" />
   </div>
       <p> This section is for official login only.Officials like MANAGER,EMPLOYEE,ADMIN can login here. </p>
  <a href="offLogin.jsp">Click here</a>
  
  </div>
</div>
  </div>

   <!-- --------offi div end------------>
 <!-- end #main -->

  <div style="clear: both;">&nbsp;</div>
</div>

<!-- end #content -->
<div id="templatemo_footer_wrapper">
<div id="footer">
   <p id="legal">&nbsp; </p>
  <p><a href ="home.jsp"> HOME </a>|<a href = "bottompages/Aboutus.html"> ABOUT US </a>| <a href = "bottompages/privacypolicy.html"> PRIVACY POLICY </a>|<a href ="bottompages/terms&cond.html"> TERMS & CONDITIONS </a>|<a href = "bottompages/ouroffices.html"> CONTACT US </a>
  </p> 
  <p>Copyright 2012. All Rights Reserved</p></div>
</div>

</body>
</html>