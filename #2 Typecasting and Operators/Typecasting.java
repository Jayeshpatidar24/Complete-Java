public class Typecasting{
  public static void main(String[] args) {
    //Type casting means changing or converting any value forcefully 
    // eg: if i store value 330 in double but i want to store this value in int so i will use type casting, search on internet more information
  
   //two types ki hoti hai (i) widening and (ii) narrowing 

//(i)

int num1 = 200;
double num2 = num1;
System.out.println(num2);

short num3 = 20;
long num4 = num3;
System.out.println(num4);


//(ii)

double num5 = 2000;
int num6 =(int)num5; //here we store double value in int but double is bigger than int and this typecasting is called narrowing we use dataType variableName = (dataType) value ;

  }
}