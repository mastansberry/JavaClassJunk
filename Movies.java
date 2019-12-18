
/**
 * Write a description of class Movies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movies
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    

    /**
     * Constructor for objects of class Song
     */
    public Movies()
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
}
