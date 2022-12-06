import java.util.Arrays;
import java.util.Scanner;

public class WordCharacters {
    public String notUsed = "abcdefghijklmnopqrstuvxyz";

   public String [] words = new String[]{"dog","airplane","chance","systems"};

   public String randomWord =words[(int) (Math.random()* words.length)];

   public char [] letters = new char[randomWord.length()];

   GameLife newLife = new GameLife();

    Scanner scan = new Scanner(System.in);

   public WordCharacters(){

    }
    // storing calculated word
    public void calculateWords(){



           for (int i = 0; i < letters.length; i++) {
               letters[i] = '.';
           }
           System.out.println("This word contains " + randomWord.length() + " letters.");

           System.out.println("Words Not Used: " + notUsed);
       }



    public void wordCheck(){


       calculateWords();

       String userInput = scan.nextLine();

       char letter = userInput.charAt(0);

        System.out.println("input: ");
       boolean isGuessCorrect = false;

       for (int i = 0; i < randomWord.length(); i++) {
           char let = randomWord.charAt(i);
           if (let == letter) {
               letters[i] = let;
               isGuessCorrect = true;
           }
       }

       if (isGuessCorrect) {
           newLife.lives--;
       }

       System.out.print("Word: ");

       for (int i = 0; i < letters.length; i++) {
           System.out.print(letters[i]);
       }
       System.out.println();

       notUsed = notUsed.replace(letter, '.');

       System.out.println("------------");

        gameFinished();
    }

    public void gameFinished(){

        boolean isGamefinished = true;

        for(int i = 0 ; i < letters.length;i++){
            if(letters[i] =='.'){
                isGamefinished = false;
            }
            if(isGamefinished){
                System.out.println("You Won");
                break;
            }
        }



    }

}
