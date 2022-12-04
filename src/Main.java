import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //lives: 000
    //input: x
    //word : .ell.
    //Not used: abcd...f...


    public static void main(String[] args) {

        System.out.println("Starting Game");


        String [] words = new String[]{"dog","airplane","chance","systems"};

        String randomWord =words[(int) (Math.random()* words.length)];
        System.out.println("This word contains " + randomWord.length() + " letters.");

        char [] letters = new char[randomWord.length()];

     /*
     equivilent
     for( int i = 0 ; i < letters.length;i++){
      letters[i] = '.';
      }
     * */
        Arrays.fill(letters, '.');



        int lives = 4;

        Scanner scan = new Scanner(System.in);

        while(lives > 0){
            System.out.println("Lives: ");

            for(int i = 0 ; i < lives;i++){
                System.out.println("o");

            }


            System.out.println("Input: " );
            String userInput = scan.nextLine();

            char letter = userInput.charAt(0);



            boolean isGuessCorrect = false;

            for(int i = 0 ; i < randomWord.length();i++){
                char l = randomWord.charAt(i);

                if(l == letter){
                   letters[i] = l;
                   isGuessCorrect = true;
                }
            }

            if(!isGuessCorrect){
                lives--;
            }

            System.out.println("------------------------");


            for (int i = 0 ; i < letters.length;i++){
                System.out.println(letters[i]);
            }

            System.out.println();
            System.out.print("Word: " + "\n");



        }
        System.out.println("Game over");
    }
}