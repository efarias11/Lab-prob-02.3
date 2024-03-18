import java.util.Scanner;
public class problem_2_1 {
    public static int converter(int num){
        int remainder;
        int quotient = num;
        if(num>=0){
            remainder = num%2;
            if(quotient>1){
                quotient=converter(num/2);
            }
            System.out.print(remainder);
        }else{
            return 0;
        }
        return quotient;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int num = kb.nextInt();
        converter(num);
    }
}
