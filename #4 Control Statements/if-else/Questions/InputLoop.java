
import java.util.Scanner;

public class InputLoop{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    while(num>0){
      num = num*num;
      System.out.println(num);
      num = sc.nextInt();
    }

  }
}