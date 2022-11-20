import java.util.Scanner;

public class miniProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber;

        do{
            System.out.println("guss the number:");
            userNumber = sc.nextInt();

            if(userNumber==myNumber){
                System.out.println("great, you gussed it right");
                System.out.println("the number is: "+myNumber);
                break;
            }
            else if (userNumber>myNumber){
                System.out.println("your number is too large");
            }
            else {
                System.out.println("your number is too small");
            }

        }while (userNumber>=0);
    }
}
