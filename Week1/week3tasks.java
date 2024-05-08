import java.util.Scanner;

public class week3tasks {
    public static void main(String[] args){
    

    /*1. Write a JAVA program to find the maximum between three numbers. */

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter 1st number: ");
        // int a = sc.nextInt();
        
        // System.out.println("Enter 2nd number: ");
        // int b = sc.nextInt();

        // System.out.println("Enter 3rd number: ");
        // int c = sc.nextInt();

        // if (a>b && a>c){
        //     System.out.printf("%d is the greatest.",a); 
        // }
        // else if (b>c){
        //     System.out.printf("%d is the greatest",b);
        // }
        // else{
        //     System.out.printf("%d is the greatest.",c);
        // }


    /*2. Write a JAVA program to check whether a number is negative, positive, or zero.*/
            
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter an integer: ");
        // int a = sc.nextInt();

        // if (a>0){
        //     System.out.printf("%d is a positive number.",a);
        // }
        // else if (a<0){
        //     System.out.printf("%d is a negative number.",a);
        // }
        // else{
        //     System.out.printf("%d is ZERO.",a);
        // }
    

    /*3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number: ");
        // int a = sc.nextInt();

        // if (a%5==0 && a%11==0){
        //     System.out.printf("%d is divisible by both 5 and 11.",a);
        // }
        // else{
        //     System.out.printf("%d is NOT divisible by 5 and 11.",a);
        // }
    

    /*4. Write a JAVA program to check whether a number is even or odd. */
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number: ");
        // int a = sc.nextInt();

        // if (a%2==0){
        //     System.out.printf("%d is an EVEN NUMBER.",a);
        // }
        // else{
        //     System.out.printf("%d is an ODD NUMBER.",a);
        // }


    /*5. Write a JAVA program to check whether a year is a leap year or not.  */

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a year: ");
        // int a = sc.nextInt();

        // if ((a%4==0) && (a%100!=0) || (a%400==0)){
        //     System.out.printf("%d is a leap year",a);
        // }
        // else{
        //     System.out.printf("%d is NOT a leap year.",a);
        // }


    /*6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
        
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter an alphabet: ");
        // char alpha = sc.next().charAt(0);

        // if (alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o'|| alpha=='u'){
        //     System.out.printf("%c is a vowel",alpha);
        // }
        // else{
        //     System.out.printf("%c is a consonant.",alpha);
        // }


    /*SWITCH CASE PRACTICE QUESTIONS==================================================================== */

    /* 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) 
        and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.*/

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter student's grade (A, B, C, D, or F): ");
        // char grade = sc.next().toUpperCase().charAt(0); 
        // double gpa;
        // switch (grade) {
        //     case 'A':
        //         gpa = 4.0;
        //         break;
        //     case 'B':
        //         gpa = 3.0;
        //         break;
        //     case 'C':
        //         gpa = 2.0;
        //         break;
        //     case 'D':
        //         gpa = 1.0;
        //         break;
        //     case 'F':
        //         gpa = 0.0;
        //         break;
        //     default:
        //         System.out.println("Invalid grade entered.");
        //         return; 
        // }
        // System.out.printf("The corresponding GPA value for grade %c is : %.2f",grade,gpa);
    
    
    /*2. Create a Java program that takes two numbers and an operator (+, -, *, /) 
        as inputs and performs the corresponding arithmetic operation using a switch case statement. */

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter 1st number: ");
        // float a = sc.nextFloat();

        // System.out.println("Enter 2nd number: ");
        // float b = sc.nextFloat();
        
        // System.out.print("Enter an operator from the following\n +\n -\n *\n /\n");
        // char choice = sc.next().charAt(0);
        // switch (choice) {
        //     case '+':
        //         System.out.printf("%f + %f = %f",a,b,a+b);
        //         break;
        //     case '-':
        //         System.out.printf("%f - %f = %f",a,b,a-b);
        //         break;
        //     case '*':
        //         System.out.printf("%f * %f = %f",a,b,a*b);
        //         break;
        //     case '/':
        //         System.out.printf("%f / %f = %f",a,b,a/b);
        //         break;
        //     default:
        //     System.out.println("INVALID INPUT");
        //         break;
        // }



    /*3. Write a Java program that takes an integer input (1 to 12) 
        representing a month and prints the corresponding season 
        (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number from 1 to 12");
        // int choice = sc.nextInt();

        // String season="";

        // switch (choice) {
        //     case 1,2,3:
        //         season = "Winter";
        //         break;

        //     case 4,5,6:
        //         season = "Spring";
        //         break;

        //     case 7,8,9:
        //         season = "Summer";
        //         break;

        //     case 10,11,12:
        //         season = "Fall";
        //         break;
        
        //     default:
        //         System.out.println("INVALID INPUT");
        //         break;
        // }
        // System.out.printf("The season for the month number %d is %s",choice,season);



    /*4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle)
         based on the user's choice using a switch case. */

        //  Scanner sc = new Scanner(System.in);

        //  System.out.print("Enter the shape you want to find the area of:\n1. cirlce\n2. rectangle\n3. square\n4. traingle\n");
        //  int choice = sc.nextInt();

        //  switch (choice) {
        //     case 1:
        //         System.out.println("Enter the radius:");
        //         float r = sc.nextFloat();
        //         float area_circle = 3.14f*r*r;
        //         System.out.printf("Area of circle for radius %f is: %f sq. units",r,area_circle);
        //         break;
        //     case 2:
        //         System.out.println("Enter the length:");
        //         float l = sc.nextFloat();
        //         System.out.println("Enter the breadth:");
        //         float b = sc.nextFloat();
        //         float area_rectangle = l*b;
        //         System.out.printf("Area of rectangle for length %f and breadth %f is: %f sq. units",l,b,area_rectangle);
        //         break;
        //     case 3:
        //         System.out.println("Enter the side:");
        //         float side = sc.nextFloat();
        //         float area_square = side*side;
        //         System.out.printf("Area of square for side length %f is: %f sq. units",side,area_square);
        //         break;
        //     case 4:
        //         System.out.println("Enter the base:");
        //         float base = sc.nextFloat();
        //         System.out.println("Enter the height:");
        //         float height = sc.nextFloat();
        //         float area_triangle = (base*height)/2;
        //         System.out.printf("Area of triangle for base %f and height %f is: %f sq. units",base,height,area_triangle);
        //         break;
        //     default:
        //         System.out.println("INVALID INPUT!!!");
        //         break;
        //  }





}
    
}
