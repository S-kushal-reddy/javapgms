//program to calculate the area and parameter of rectangle and circle
public class Rectangle{
int l,b;
void area(){
int area=l*b;
System.out.println("area="+area);
}
void parameter(){
int parameter=2*(l+b);
System.out.println("parameter="+parameter);
}
}
public class Circle{
int radius;
void area(){
double area=3.14*(radius*radius);
System.out.println("area="+area);
}
void parameter(){
double parameter=6.28*radius;
System.out.println("parameter="+parameter);
}
}
public class Shape{
public static void main(String args[]){
Rectangle rect=new Rectangle();
rect.l=10;
rect.b=5;
rect.area();
rect.parameter();
Circle cir=new Circle();
cir.radius=5;
cir.area();
cir.parameter();
}
}

