import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MovieList {
    private ArrayList<String> getAllMovieFormFile() throws Exception{
        ArrayList<String> movieNameList=new ArrayList<>();
        File file=new File("movies.txt");
        Scanner fileScan=new Scanner(file);
        while(fileScan.hasNextLine()) {
            String line=fileScan.nextLine();
            movieNameList.add(line);
        }

        return movieNameList;
    }

    public String getRandomMovieName() throws Exception{
        Random ran=new Random();
        int randomIndex=ran.nextInt(getAllMovieFormFile().size());
        String randomMovieName=getAllMovieFormFile().get(randomIndex).toString().trim();
        return randomMovieName;
    }
}