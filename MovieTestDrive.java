public class MovieTestDrive {
  public static void main(String[] args) {
    Movie one = new Movie();
    one.title = "Ender's Game";
    one.genre = "SciFi";
    one.rating = 10;
    Movie two = new Movie();
    two.title = "The Dark Knight";
    two.genre = "Action";
    two.rating = 10;
    one.playIt();
    two.playIt();
  }
}