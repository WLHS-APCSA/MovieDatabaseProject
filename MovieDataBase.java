import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class MovieDatabase {
    static ArrayList<Movie> movies = new ArrayList<Movie>();
    static ArrayList<Movie> sortedByTitle;
    static ArrayList<Movie> sortedByAvgRating;
    static ArrayList<Movie> sortedByNumRatings;
    static String[] allGenres = {"Action", "Comedy", "Drama", "Horror", "Romance",
            "Sci-Fi", "Thriller", "Animation", "Crime", "Documentary"};
    static String[] tiers = {"Poor", "Below Avg", "Average", "Good", "Excellent"};

    public static void main(String[] args) throws IOException {

        try {
            // TODO: Add your CSV reading code here
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.printf("Loaded %d movies%n",movies.size());
        sortedByTitle = new ArrayList<Movie>(movies);
        sortedByTitle.sort((a, b) -> a.getTitle().compareTo(b.getTitle()));
        sortedByAvgRating = new ArrayList<Movie>(movies);
        sortByAvgRating(sortedByAvgRating);
        sortedByNumRatings = new ArrayList<Movie>(movies);
        sortedByNumRatings.sort((a, b) -> b.getNumRatings() - a.getNumRatings());

        //some test code here
        //System.out.println(getMostPopular(5));
        //System.out.println(getTopRated(5,"Action"));
        //System.out.println(getAverageRating("Crime"));
        //System.out.println(searchByTitle("Lord").getTitle());
        //int[][] matrix = buildGenreMatrix();
        //printGenreMatrix(matrix);

    }

    /**
     * Sort the given list in descending order by avgRating using selection sort or insertion sort.
     * @param movies movies the list of movies to sort
     */
    public static void sortByAvgRating(ArrayList<Movie> movies){
       
    }

    /**
     * Returns an ArrayList<Movie> containing the top n movies of the given genre by average rating.
     * @param n number of movies to return
     * @param genre the genre to filter by
     * @return ArrayList of the top n movies in the given genre sorted by average rating descending
     */
    public static ArrayList<Movie> getTopRated(int n, String genre){
        ArrayList<Movie> topMovies = new ArrayList<Movie>();
        
        return topMovies;
    }

    /**
     * Returns an ArrayList<Movie> containing all movies that belong to the given genre.
     * @param genre the genre to filter by
     * @return ArrayList<Movie> containing all movies that belong to the given genre
     */
    public static ArrayList<Movie> filterByGenre(String genre){
        ArrayList<Movie> filtered = new ArrayList<Movie>();
        
        return filtered;
    }

    /**
     * Returns the average avgRating of all movies belonging to the given genre.
     * @param genre the genre to filter by
     * @return the average avgRating of all movies belonging to the given genre
     */
    public static double getAverageRating(String genre) {

        
        return 0.0;
    }

    /**
     * Returns an ArrayList containing the n movies with the highest number of ratings
     * @param n number of movies to return
     * @return ArrayList<Movie> containing the n movies with the highest numRatings
     */

    public static ArrayList<Movie> getMostPopular(int n){
        ArrayList<Movie> mostPopular = new ArrayList<Movie>();

        return mostPopular;
    }

    /**
     * Returns the first movie whose title contains the query string (case-insensitive) using a linear search.
     * Return null if no match is found.
     * @param query movie name, can be partial
     * @return first movie that contains query or null if not found
     */
    public static Movie searchByTitle(String query){
        
        return null;
    }


    /**
     * A binary search that returns the index of the movie with the matching title
     * in the given list, or -1 if not found
     * @param movieList list of movies to search
     * @param title title of the movie
     * @param low lower index
     * @param high upper index
     * @return index of title or -1 if not found
     */
    public static int binarySearchByTitle(ArrayList<Movie> movieList,String title,int low,int high){
       

        return -1;
    }

    /**
     * Helper function for buildGenreMatrix that returns an integer that corresponds to the
     * column of a specific rating as show in the README
     * 0 is Poor, 1 is Below Average, 2 is Average, 3 is Good, 4 is Excellent
     * @param rating average rating of a movie
     * @return column number of the rating category
     */
    private static int getRatingTier(double rating) {
        if (rating < 2.5) return 0;
        else if (rating < 3.0) return 1;
        else if (rating < 3.5) return 2;
        else if (rating < 4.0) return 3;
        else return 4;
    }

    /**
     * Creates a matrix of the counts of each rating for a movie in every genre.
     * Poor is below 2.5, below average is between 2.5 (inclusive) and 3, average is
     * between 3(inclusive) and 3.5, good is between 3.5 (inclusive) and 4, and excellent
     * is greater than or equal to 4.
     *
     * @return a matrix of integer counts for ratings in each category
     */
    public static int[][] buildGenreMatrix(){
        int numRows = allGenres.length;
        int numCols = tiers.length;
        int ratings[][] = new int[numRows][numCols];

        return ratings;
    }

    /**
     * Prints a formatted table for the provided matrix of tiers by genre
     * @param matrix 2D array of genre tier counts
     */
    public static void printGenreMatrix(int[][] matrix) {
        // print header
        System.out.printf("%-15s", "Genre");
        for (String tier : tiers) {
            System.out.printf("%-12s", tier);
        }
        System.out.println();
        System.out.println("-".repeat(75));

        // print each row
        for (int i = 0; i < allGenres.length; i++) {
            System.out.printf("%-15s", allGenres[i]);
            for (int j = 0; j < tiers.length; j++) {
                System.out.printf("%-12d", matrix[i][j]);
            }
            System.out.println();
        }

    }
}
