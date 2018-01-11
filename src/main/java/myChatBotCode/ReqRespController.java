package myChatBotCode;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bitoflife.chatterbean.AliceBot;
import bitoflife.chatterbean.AliceBotMother;

@RestController
public class ReqRespController {

	@RequestMapping("/send/{reqString}")
	public String respond(@PathVariable String reqString) {
		
		System.out.println("majha method");
		String str2="";
		try{
			AliceBotMother mother = new AliceBotMother();
			AliceBot mybot = mother.newInstance();
			String ask = reqString; //Here You can ask Dynamic question.
			str2 = "<p>"+mybot.respond(ask)+"</p>";
			System.out.println(str2);
			}
			catch(Exception ex)
			{
			System.err.println(ex.toString());
			}
		
		return str2;
	}
}
