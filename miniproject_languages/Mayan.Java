public class Mayan extends Language{

public Mayan(String languageName, int speakers){
 super(languageName, speakers, "Central American", "Verb-Object-Subject"); 
  
}
@Override
public void getInfo(){
  System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder);
}
}
