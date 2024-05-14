interface A {
    void display();
    default void show(){
        System.out.println("main\n");
    }
}

interface B extends A {
    public void display();
    //  default void show(){
    //     System.out.println("main\n");
    // }
}

interface C extends A {
    public void display();
}

class D implements B, C {
    // No ambiguity in Java interfaces
    public void display(){
        System.out.println("in D");
    }
}
//Complex class
public class Assignment1 {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();  // No ambiguity in calling display()
        obj.show();
    }
}
