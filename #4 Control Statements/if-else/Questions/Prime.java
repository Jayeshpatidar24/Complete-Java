import java.util.Scanner;

public class Prime{
  public static void main(String[] args){

Scanner sc = new Scanner(System.in);

boolean con1 = false;
boolean con2 = false;
boolean con3 = true;
int num = sc.nextInt();
if(num%2==0){
   con1 = true;
}
if(num%3==0){
   con2 = true;
}

if(con3 && (con2 || con1)){
  System.out.println("Not Prime");
}
else{
  System.out.println("prime");
}
  }
}