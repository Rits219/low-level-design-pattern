package DesignPattern.CompositeDesignPattern.Solution1WithCompositeDesign;

public class Main {
    public static void main(String[] args) {
        Directory movies = new Directory("movies");
        File border = new File("border");
        movies.add(border);
        Directory comedyMovies = new Directory("comedy movies");
        File hulchul = new File("hulchul");
        comedyMovies.add(hulchul);
        movies.add(comedyMovies);

        movies.ls();
    }
}
