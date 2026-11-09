import java.util.Scanner;
public class QuizGame {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        //Java Quiz Game
        char guess = ' ';
        int score = 0;

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        for(int i = 0; i < Questions.length; i++){
            boolean isValid = false;
            System.out.println(Questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            while(!isValid){
                System.out.print("Enter your guess: ");
                if(scanner.hasNext()){
                    guess = scanner.next().toUpperCase().charAt(0);
                    if(guess == 'A' || guess == 'B' || guess == 'C' || guess == 'D'){
                        isValid = true;
                    }else{
                        System.out.println("Pls enter a valid answer!");
                    }
                }
            }
                if(guess == answers[i]){
                    System.out.println("**********");
                    System.out.println(" CORRECT! ");
                    System.out.println("**********");
                    score++;
                    }else{
                        System.out.println("********");
                        System.out.println(" WRONG! ");
                        System.out.println("********");
                    }
        }
        System.out.println("Your final score is: " + score + " out of " + Questions.length);
    }
    //Question arrays
    static String[] Questions = {
        "1. Which planet in our solar system is known as the \"Red Planet\"?",
        "2. What is the chemical symbol for the element Gold?",
        "3. Which of the following is the best-selling video game of all time?",
        "4. How many continents are there on Earth?",
        "5. Who is the author of the famous play \"Romeo and Juliet\"?"
    };
    //Options arrays
    static String[][] options = {
        {"A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"},
        {"A. Ag", "B. Gd", "C. Au", "D. Go"},
        {"A. Tetris", "B. Grand Theft Auto V", "C. Super Mario Bros", "D. Minecraft"},
        {"A. 5", "B. 6", "C. 7", "D. 8"},
        {"A. Charles Dickens", "B. William Shakespeare", "C. Mark Twain", "D. J.K. Rowling"}
    };
    // Answers sheat
    static char[] answers = {
        'B' , 'C' , 'D' , 'C' , 'B'
    };
}
