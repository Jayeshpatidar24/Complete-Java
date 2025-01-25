
import java.util.Scanner;

public class PrimeUsingLoop {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 0;

    for(int i =2; i<num; i++){
      if(num%i==0){
        count += i;

      }
    }
    if(count+num > num){
      System.out.println("its not prime");
    }
    else{
      System.out.println("its prime");
    }
  }
}
