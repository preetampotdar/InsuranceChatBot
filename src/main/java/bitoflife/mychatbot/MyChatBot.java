package bitoflife.mychatbot;

import bitoflife.chatterbean.AliceBotMother;
import bitoflife.chatterbean.AliceBot;
 
public class MyChatBot{
public static void main(String[] str)
{
try{
AliceBotMother mother = new AliceBotMother();
AliceBot mybot = mother.newInstance();
String ask = "hello alice"; //Here You can ask Dynamic question.
String str2 = mybot.respond(ask);
System.out.println(str2);
}
catch(Exception ex)
{
System.err.println(ex.toString());
}
}
}