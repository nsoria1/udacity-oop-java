import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub

        MovieList list=new MovieList();
        com.guess.movie.Game game=new com.guess.movie.Game();
        game.guessingTheMovieGame(list.getRandomMovieName());

    }

}