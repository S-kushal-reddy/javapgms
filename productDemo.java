//program using demonstraing instance variables:
class product {
int productId;
String productType;
String productName;
int productPrice;
static String brandName="Raymonds";
//instance method
void productDetails(){
System.out.println("product details:"+productId+","+productName+","+productType+","+productPrice+","+brandName);
}
static void getBrand(){
System.out.println(brandName);
}
}
public class productDemo{
public static void main(String args[]){
product product1=new product();
product1.productId=1203;
product1.productName="tata punch";
product1.productType="car";
product1.productPrice=1500000;
product.brandName="Tata";
product1.productDetails();
product.getBrand();
product product2=new product();
product2.productId=3626;
product2.productName="jeans";
product2.productType="cloth";
product2.productPrice=2999;
product.brandName="Levi";
product2.productDetails();
product.getBrand();
}
}