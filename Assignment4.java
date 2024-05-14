import java.util.Scanner;
abstract class Shape1 
{
    double x;
    double y;

   abstract void compute_area();
    
}
 class Triangle extends Shape1{
    double height;
    double base;
   
    public void input(){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter height");
        double h=sc.nextDouble();
        System.out.println("enter base");
        double b=sc.nextDouble();

        this.height=h;
        this.base=b;
    }
    @Override void compute_area(){
        double k=height*base*0.5;
        System.out.println("area of triangle is : "+k);
    }


}
class Rectangle extends Shape1{
     double length;
    double breadth;
   
     public void input(){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter length");
        double l=sc.nextDouble();
        System.out.println("enter breadth");
        double b=sc.nextDouble();

        this.length=l;
        this.breadth=b;
    }
    @Override void compute_area(){
        double k=length*breadth;
        System.out.println("area of rectangle is : "+k);
    }



}
class Assignment4{
    public static void main(String[] args) {
    
        Triangle t=new Triangle();
        System.out.println("Operation for triangle");
        t.input();
        t.compute_area();
         System.out.println("\nOperation for rectangle");
        Rectangle r=new Rectangle();
        r.input();
        r.compute_area();

                
    }
}