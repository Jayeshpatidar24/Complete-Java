public class Operators {
  public static void main(String[] args) {
     //operator is used to perform operation like + - * / 
    // there are many types of operator 
   // (i) Arithmatic Operator 

   int a = 2 + 4;
   int b = 4 - a;
System.out.println(b*a);
 
//(ii) Assignment Operator
 
  int num1 = 20; // here '=' is assignment operator  20 value is assigned into a variable
   
//(iii) Comperative operator

 int num2 = 200;
 int num3 = 250;

 if(num2 > num3 ) System.out.println("Bigger");
 if(num2 < num3) System.out.println("Smaller");
 if(num2 == num3) System.out.println("Equal");

 //(iv) Logical Operator

 if((num2 & num3) > 0) System.out.println("Natural");
 if((num2 | num3) < 100) System.out.println("Problem");
  


     
  }
}
