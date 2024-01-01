package DesignPattern.CompositeDesignPattern.ProblemStatement;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("movie");
        File border = new File("border");
        movieDirectory.add(border);
        Directory comedyMovies = new Directory("comedy movies");
        File hulchul = new File("hulchul");
        comedyMovies.add(hulchul);
        movieDirectory.add(comedyMovies);

        movieDirectory.ls();
    }
}
