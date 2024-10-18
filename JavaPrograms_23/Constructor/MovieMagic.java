package Constructor;
import java.util.*;
class MovieMagic {
    int year;
    String title;
    float rating;
    MovieMagic() {
        year = 0;
        title = "";
        rating = 0.0f;
    }
    void input(int y, float r, String t) {
        year = y;
        rating = r;
        title = t;
    }
    void display() {
        String review = "";
        System.out.println("Title: "+title);
        System.out.println("Year: "+year);
        System.out.println("Rating: "+rating);
        if(rating<=2.0)
        review = "Flop";
        else if(rating>2.0 && rating<=3.4)
        review = "Semi-Hit";
        else if(rating>3.4 && rating<=4.5)
        review = "Hit";
        else
        review = "Super Hit";
        System.out.println("Review: "+review);
    }
    public static void main() {
        Scanner in = new Scanner(System.in);
        MovieMagic obj = new MovieMagic();
        System.out.println("Enter movie's title year and rating");
        String title = in.nextLine();
        int year = in.nextInt();
        float rating = in.nextFloat();
        obj.input(year, rating, title);
        obj.display();
    }
}