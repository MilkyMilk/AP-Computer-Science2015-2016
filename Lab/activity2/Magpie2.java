/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *       Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
 /**
  * Get a default greeting  
  * @return a greeting
  */
 public String getGreeting()
 {
  return "Hello, let's talk.";
 }
 
 /**
  * Gives a response to a user statement
  * 
  * @param statement
  *            the user statement
  * @return a response based on the rules given
  */
 public String getResponse(String statement)
 {
   String response = "";
   if (statement.indexOf("no") >= 0) {
     response = "Why so negative?";
   } 
   else if (statement.indexOf("lazy") >= 0 
                        || statement.indexOf("lethargic") >= 0) {
     response = "Kind of like that song from Bruno Mars?";
   } 
   else if (statement.indexOf("sport") >= 0
              || statement.indexOf("baseball") >= 0
              || statement.indexOf("soccer") >= 0
              || statement.indexOf("swimming") >= 0
              || statement.indexOf("volleyball") >= 0) {
     response = "Do you like sports?";
   }
   else if (statement.indexOf("award") >=0
              || statement.indexOf("trophy") >= 0) {
     response = "Did you win something?";
   }         
   else if (statement.indexOf("mother") >= 0
              || statement.indexOf("father") >= 0
              || statement.indexOf("sister") >= 0
              || statement.indexOf("brother") >= 0) {
     response = "Tell me more about your family.";
   }
   else if (statement.indexOf("cat") >= 0 
              || statement.indexOf("dog") >= 0) {
     response = "Telll me more about your pets.";
   }
   else if (statement.indexOf("Joe") >= 0
              || statement.indexOf("teacher") >= 0
              || statement.indexOf("bad grade") >= 0) {
     response = "Joe is a great teacher, he gave Akshay a F";
   }
   
   else if(statement.trim().length() <= 0) {
     response = "Say something please.";
   }
   else
   {
     response = getRandomResponse();
   }
   return response;
 }

 /**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
 private String getRandomResponse()
 {
   final int NUMBER_OF_RESPONSES = 7;
   double r = Math.random();
   int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
   String response = "";
   
   if (whichResponse == 0)
     response = "Interesting, tell me more.";
   else if (whichResponse == 1)
     response = "Hmmm.";
   else if (whichResponse == 2)
     response = "Do you really think so?";
   else if (whichResponse == 3)
     response = "You don't say.";
   else if (whichResponse == 4)
     response = "Okay.";
   else if (whichResponse == 5)
     response = "You're making be bored. Could you try being more intresting?";
   else if (whichResponse == 6)
     response = "Glad I'm not a human like you...";
  
     
   return response;
 }
}
