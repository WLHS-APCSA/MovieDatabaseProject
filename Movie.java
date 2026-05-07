public class Movie {


    //constructor

    //getters

		//setters

    @Override
    public String toString() {
        return title+" ("+year+") | "+String.join("/",genres)+" | ★ "+avgRating+" ("+numRatings+" ratings)";
    }
}
