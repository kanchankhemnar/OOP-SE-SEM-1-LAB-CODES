import java.util.Scanner;

abstract class Car{
    public abstract void addPaint(String color);
}
class SUV extends Car{
    @Override
    public void addPaint(String color){
        System.out.println("SUV color is: "+color);
    }
}
class Hatchback extends Car{
    @Override
    public void addPaint(String color){
        System.out.println("Hatchbackcolor is: "+color);
    }
}
class Sedan extends Car{
    @Override
    public void addPaint(String color){
        System.out.println("Sedan color is: "+color);
    }
}
class CarFactory{
    // String Sedan,SUV,Hatchback;
    public Car input(String carName){
        // int choice=sc.nextInt();
       if (carName=="SUV") {
       
        return    new SUV();
       }
          if (carName=="Sedan") {
        return new Sedan();
       }
          if (carName=="Hatchback") {
        return new Hatchback();
       }
       else{
            throw new IllegalArgumentException("incorrect car type");
       }
    }
}
public class Assignment10 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

        System.out.println("Enter cartype\n1.SUV\n2.Sedan\n3.Hatchback");
        CarFactory c=new CarFactory();
        String carName=sc.next();
        Car car=c.input(carName);
        if (car==new SUV()) {
         
            car.addPaint("pink");
        }
         else if (car==new Sedan()) {
            
            car.addPaint("purple");
        }
         else if (car==new Hatchback()) {
          
            car.addPaint("pink");
        }
        sc.close();

    }



}
