package videolibrary;

public class Program {

    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            String imdbID = args[i];
            Rental rental = new Rental(imdbID);
            System.out.println(rental.getVideoImdbID() + ", " + rental.getVideoTitle() + ", " + rental.getVideoPrice());
        }
    }

    /*
        Example movies:

        tt0096754 - high rated
        tt0060666 - low rated
        tt0317303 - medium rated

     */
}
