import java.util.Scanner;

interface Vehicle {

    abstract public void GearChange(int newGear);

    abstract public void SpeedUp(int newSpeed);

    abstract public void ApplyBrakes();
    // bicycle car bike

}

class Bicycle implements Vehicle {
    int gear;
    int speed;

    Bicycle() {
        gear = 1;
        speed = 0;
    }

    @Override
    public void GearChange(int newGear) {
        gear = newGear;
        System.out.println("\nBicycle is on gear: "+gear);
    }

    @Override
    public void SpeedUp(int newSpeed) {

        speed = speed + newSpeed;
        System.out.println("\nBicycle is on speed: "+speed+" km/hr\n");
    }

    @Override
    public void ApplyBrakes() {
        speed = 0;
        System.out.println("\nBrakes applied. Bicycle is on speed: "+speed+"km/hr\n");
    }
}

class Bike implements Vehicle {
    int gear;
    int speed;

    Bike() {
        gear = 1;
        speed = 0;
    }

    @Override
    public void GearChange(int newGear) {
        gear = newGear;
        System.out.println("\nBike is on gear: "+gear);
    }

    @Override
    public void SpeedUp(int newSpeed) {

        speed = speed + newSpeed;
        System.out.println("\nBike is on speed: "+speed+" km/hr\n");
    }

    @Override
    public void ApplyBrakes() {
        speed = 0;
        System.out.println("\nBrakes applied. Bike is on speed: "+speed+" km/hr\n");
    }
}

class Car implements Vehicle {
    int gear;
    int speed;

    Car() {
        gear = 1;
        speed = 0;
    }

    @Override
    public void GearChange(int newGear) {
        gear = newGear;
        System.out.println("\nCar is on gear: "+gear);
    }

    @Override
    public void SpeedUp(int newSpeed) {

        speed = speed + newSpeed;
        System.out.println("\nCar is on speed: "+speed+" km/hr\n");
    }

    @Override
    public void ApplyBrakes() {
        speed = 0;
        System.out.println("\nBrakes applied. Car is on speed: "+speed+"km/hr\n");
    }
}



public class Assignment5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        while(true){
        System.out.println("\nEnter choice\n1-Bicycle\n2-Bike\n3-Car\n4-stop");
        choice=sc.nextInt();
            switch (choice) {
                case 1:
                    Bicycle b=new Bicycle();
                    while(true){
                        System.out.println("\nWhat task do you want to perform for bicycle\n1-Change gear\n2-Speed Up\n3-Apply brakes\n0-Go to menu");
                        int task=sc.nextInt();
                        switch (task) {
                            case 1:
                                System.out.println("Enter next gear\n");
                                int newGear=sc.nextInt();
                                b.GearChange(newGear);
                                break;

                            case 2:
                                System.out.println("Enter speed\n");
                                int newSpeed=sc.nextInt();
                                b.SpeedUp(newSpeed);

                                break;
                            case 3:
                                b.ApplyBrakes();
                                break;
                        }
                        if (task==0) {

                            break;
                        }
                    }
                    break;

                case 2:
                    Bike B=new Bike();
                    while(true){
                        System.out.println("\nWhat task do you want to perform for bike\n1-Change gear\n2-Speed Up\n3-Apply brakes\nGo to menu");
                        int task1=sc.nextInt();
                        switch (task1) {
                            case 1:
                                System.out.println("Enter next gear\n");
                                int newGear=sc.nextInt();
                                B.GearChange(newGear);
                                break;

                            case 2:
                                System.out.println("Enter speed\n");
                                int newSpeed=sc.nextInt();
                                B.SpeedUp(newSpeed);

                                break;
                            case 3:
                                B.ApplyBrakes();
                                break;
                        }
                        if (task1==0) {

                            break;
                        }
                    }
                    break;
                case 3:
                    Car c=new Car();
                    while(true){
                        System.out.println("\nWhat task do you want to perform for car\n1-Change gear\n2-Speed Up\n3-Apply brakes\nGo to menu");
                        int task3=sc.nextInt();
                        switch (task3) {
                            case 1:
                                System.out.println("Enter next gear\n");
                                int newGear=sc.nextInt();
                                c.GearChange(newGear);
                                break;

                            case 2:
                                System.out.println("Enter speed\n");
                                int newSpeed=sc.nextInt();
                                c.SpeedUp(newSpeed);

                                break;
                            case 3:
                                c.ApplyBrakes();
                                break;
                        }
                        if (task3==0) {

                            break;
                        }
                    }
                    break;
            }
            if (choice==4) {
                System.out.println("\nThankyou");
                break;
            }

        }
    }
}