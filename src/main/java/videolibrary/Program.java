package videolibrary;

public class Program {

    public static void main(String[] args){
        String imdbID = args[0];
        Rental rental = new Rental(imdbID);
        System.out.println(rental.getVideoImdbID() + ", " + rental.getVideoTitle() + ", " + rental.getVideoPrice());
    }

    /*
        Example movies:

        tt0096754 - high rated
        tt0060666 - low rated
        tt0317303 - medium rated

     */
}
