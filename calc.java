//program demonstraing different types of methods
public class Calc{
int num1,num2;
void sum(){
int sum=num1+num2;
System.out.println("sum="+sum);
}
//method with return type
int difference(){
int difference=num1-num2;
return difference;
}
//method with parameters
void product(int a,int b){
int product=a*b;
System.out.println("product="+product);
}
//method with return type and parameters
int division(int a,int b){
int quotient=a/b;
return quotient;
}
public static void main(String args[]){
Calc calc=new Calc();
calc.num1=10;
calc.num2=20;
calc.sum();
calc.difference();
calc.product(10,20);
calc.division(25,5);
}
}
