/**
 * Write a description of class HelloWorld here.
 *
 * Mr Stansberry
 * 1/9/2019
 */
public class MediaLib
{
    public static void main()
    {
        System.out.println("Welcome to your Media Library");
        /*Song song1 = new Song();
        Movies movie1 = new Movies();
        Books book1 = new Books();
        System.out.println(song1);
        song1.setTitle("Johnny B. Goode");
        song1.setPrice(12.55);
        System.out.println(song1.getTitle());
        System.out.println(song1.getPrice());
        movie1.setTitle("Goodwill hunting");
        System.out.println(movie1.getTitle());
        book1.setTitle("Moby Dick");
        System.out.println(book1.getTitle());*/
        Song song1 = new Song("Respect", 1.99,7);
        Song song2 = new Song("no", 0.29,7);
        Song song3 = new Song("yes", 1.29,9);
        Song song4 = new Song("blue", 0.25,7);
        Song song5 = new Song("green", 1.00,2);
        System.out.println(song1.getTitle() + "  " + song1.getPrice());
        System.out.println(Song.getTotalCost());

    }
}