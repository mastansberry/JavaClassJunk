
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    private static double totalCost;
    private int numSongs;
    

    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title="";
        
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String t) 
    {
        title = t;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double p) 
    {
        price = p;
    }
    public void addToFavorites(){
        favorite = true;
    }
    public Song(String title, double price) {
    this.title = title;
    this.price = price;
    }
    public Song(String title, double price, int rating) {
    this.title = title;
    this.price = price;
    this.rating = rating;
    totalCost = totalCost + price;
    numSongs = numSongs + 1;
    }
    public static double getTotalCost(){
        return totalCost;
    } 
    
    /*public void totalCost(double tc){
        totalCost=0;
        totalCost = totalCost + price;
        
    
    }*/
}
