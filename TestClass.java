package help.corona;
/**
 *
 * @author Mohamed Kramti
 */

public class TestClass {
    public static void main(String args[]){
      Scrapper scrapper = new Scrapper();
     
      scrapper.globalStats(null); //  world
      
      scrapper.globalStats("tunisia"); // change this to the country

    }
}