import java.util.Scanner;

public class Assignment6 {
Scanner sc=new Scanner(System.in);
    int[] array;
    void CreateArray(int n){
        array=new int[n];
        System.out.println("Enter array elements\n");
    for (int i = 0; i < n; i++) {
        array[i]=sc.nextInt();
    }
}
void displayArray(int n){
        System.out.print("\nArray entered :");
         for (int i = 0; i < n; i++) {
             System.out.print(array[i]+" ");
            }
        }
    void findElement(int n){
        System.out.println("\nFind element of array using index\nEnter index: ");
       int index=sc.nextInt();
       try {
        System.out.println("Element at index "+index+" is :"+array[index]);
       } catch (ArrayIndexOutOfBoundsException e) {
        // TODO: handle exception
        System.out.println("Index entered is out of bound");
       }
    }
        
        void operation(){
            System.out.println("Enter first no. ");
            int a=sc.nextInt();
            System.out.println("Enter second no. ");
            int b=sc.nextInt();
                while (true) {
                System.out.println("Enter operation\n1-addition\n2-substraction\n3-multiplication\n4-division\n0-stop\n ");
                int choice=sc.nextInt();
                if (choice==1) {
                    int c=a+b;
                    System.out.println(a+" + "+b+" = "+c);
                    
                    
                }
                else if (choice==2) {
                    int d=a-b;
                    System.out.println(a+" - "+b+" = "+d);
                    
                }
                 else if (choice==3) {
                    int e=a*b;
                    System.out.println(a+" * "+b+" = "+e);

                    
                }
                 else if (choice==4) {
                    try {
                        int s=a/b;
                    System.out.println(a+" / "+b+" = "+s);
             } 
             catch (ArithmeticException e) {
                    // TODO: handle exception
                    System.out.println("Arithmetic Exception: can't divide by zero");
                 }
                    
                }
                if (choice==0) {
                    System.out.println("operation terminated");
                    break;
                }
                
            }

        }
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Assignment6 obj=new Assignment6();
        System.out.println("Enter size of your array: ");
        int size=sc1.nextInt();
        obj.CreateArray(size);
        obj.displayArray(size);
        obj.findElement(size);
        System.out.println("\nPerform arithmetic operations\n");
        obj.operation();
        sc1.close();
    }
}