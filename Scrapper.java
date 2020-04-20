package help.corona;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author Mohamed Kramti
 */
public class Scrapper {
    
   public void globalStats(String country){

       String confirmedCases,totalDeath,totalRecovered,totalActiveCases;
        try{
        // Connecting to Corona.help
        Document doc;
        if (country == null){
             doc = Jsoup.connect("https://corona.help/").get();
        }else{
             doc = Jsoup.connect("https://corona.help/country/"+country).get();
        }
        
        // Get total Confirmed Cases,death ,Recovery, Active confirmed ( worldwide )
         Elements worldStats = doc.select(".match-height");
         
         confirmedCases = worldStats.select(".warning").first().text();
         totalDeath = worldStats.select(".danger").first().text();
         totalRecovered = worldStats.select(".success").first().text();
         totalActiveCases = worldStats.select(".info").first().text();
         
        System.out.println("Confirmed Cases : "+confirmedCases);
        System.out.println("Total Death : "+totalDeath);
        System.out.println("Total Recovered : "+totalRecovered);
        System.out.println("Total Active Cases : "+totalActiveCases);
        
        }catch(Exception e){
         // if exception caught -> use previous data stored in the datatbase
            confirmedCases="";
            totalDeath = "";
            totalRecovered = "";
            totalActiveCases = "";
        }
        
        // Store new data in the database
   
   }


   //public void infectionHistory()
}