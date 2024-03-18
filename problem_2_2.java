import java.util.Random;
import java.util.Scanner;
public class problem_2_2 {
    public static int checker(int rng, int num, int flag){
        if(num<rng){
            System.out.println("Guess is too small. Try again.\n");
            return 0;
        }
        else if(num>rng){
            System.out.println("Guess is too big. Try again.\n");
            return 0;
        }else{
            System.out.println("Correct!\n");
            return 1;
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner kb = new Scanner(System.in);

        int rng = rand.nextInt(10,90);
        //System.out.println(rng);

        int flag = 0;
        int guess = 0;
        do{
            System.out.print("Guess a number between 10-90: ");
            int num = kb.nextInt();
            guess++;
            System.out.println("Guess counter: "+guess);
            flag = checker(rng, num, flag);            
        }while(flag==0);
        System.out.println("It took you "+guess+" guesses!");
    }
}
