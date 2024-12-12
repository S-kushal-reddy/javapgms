//program to calculate the area and parameter of rectangle and circle
public class Shapes{
void rectangle(int l,int b){
int area=l*b;
System.out.println("area="+area);
int parameter=2*(l+b);
System.out.println("parameter="+parameter);
}
void circle(int radius){
double area=3.14*(radius*radius);
System.out.println("area="+area);
double parameter=6.28*radius;
System.out.println("parameter="+parameter);
}
public static void main(String args[]){
Shapes shape=new Shapes();
shape.rectangle(10,6);
shape.circle(7);
}
}