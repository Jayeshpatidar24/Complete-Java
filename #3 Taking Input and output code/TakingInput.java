
import java.util.Scanner;



public class TakingInput{
  public static void main(String[] args) {
    //we need scanner class to take user output
    // we simply import scanner class using (import java.util.Scanner;)

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    sc.nextLine();
    String fullName = sc.nextLine();
    System.out.println(a);
   
    System.out.println(fullName);

  }
}