var outputArea = $("#chat-output");

var xmlhttp;

if(window.XMLHttpRequest){

	xmlhttp = new XMLHttpRequest();

}

else{

	

	xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");

}

var i=0;
$("#user-input-form").on("submit", function (e) {
	 e.preventDefault();

	  var message = $("#user-input").val();
	
	

	xmlhttp.open("POST", "send/"+message, true);

	xmlhttp.onreadystatechange=function(){
		//alert(xmlhttp.responseText);
		

		if(xmlhttp.readyState==4){
			//alert(xmlhttp.responseText);
			if(xmlhttp.status==200){
				 setTimeout(function () {
					 
					    outputArea.append("\n      <div class='user-message'>\n        <div class='message'>\n      "+xmlhttp.responseText+"     </div>\n      </div>\n    ");
						  
						  }, 250);
			}

			else{

				

				alert("Something is wrong");

			}

			}

		

		

	};

	xmlhttp.send(null)
	

 

  outputArea.append("\n    <div class='bot-message'>\n      <div class='message'>\n        " + message + "\n      </div>\n    </div>\n  ");

	
 

  $("#user-input").val("");
});