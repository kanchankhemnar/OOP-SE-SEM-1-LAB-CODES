// Car.java

 abstract class Car {
    protected String type;

    public void assemble() {
        System.out.println("Assembling " + type);
    }

    public void paint() {
        System.out.println("Painting " + type);
    }

    public void addAccessories() {
        System.out.println("Adding accessories to " + type);
    }

    public void makeUp() {
        System.out.println("Final makeup for " + type);
    }
}

// Hatchback.java
 class Hatchback extends Car {
    public Hatchback() {
        type = "Hatchback";
    }
}

// Sedan.java
class Sedan extends Car {
    public Sedan() {
        type = "Sedan";
    }
}

// SUV.java
 class SUV extends Car {
    public SUV() {
        type = "SUV";
    }
}

// CarFactory.java
 class CarFactory {
    public Car createCar(String type) {
        if (type.equalsIgnoreCase("Hatchback")) {
            return new Hatchback();
        } else if (type.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (type.equalsIgnoreCase("SUV")) {
            return new SUV();
        } else {
            throw new IllegalArgumentException("Invalid car type");
        }
    }
}

// TestFactoryPattern.java
public class Assignment11 {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car hatchback = carFactory.createCar("Hatchback");
        hatchback.assemble();
        hatchback.paint();
        hatchback.addAccessories();
        hatchback.makeUp();

        System.out.println();

        Car sedan = carFactory.createCar("Sedan");
        sedan.assemble();
        sedan.paint();
        sedan.addAccessories();
        sedan.makeUp();

        System.out.println();

        Car suv = carFactory.createCar("SUV");
        suv.assemble();
        suv.paint();
        suv.addAccessories();
        suv.makeUp();
    }
}
