import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        int count = 0;
        while (count<=5){
            System.out.println("While iteration "+ count);
            ++count;

        }
/*Use while loop you dont know the number of iteration
    * For eg: Use while to ask user for specific number until
    * thhe condition is satisfied
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number : ");
        int a = sc.nextInt();
        while (a<0 || a>100){
            System.out.println("please enter number between 0-100");
            a = sc.nextInt();
            
        }
        System.out.println("contion 0-100 number"+ a);
    
        }
    
}
