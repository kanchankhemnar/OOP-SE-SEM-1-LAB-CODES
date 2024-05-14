import java.util.*;

class Template{
    public static<T extends Number> void countnumbers(List <T> numbers){
        int even = 0, odd=0, pal = 0, pri= 0;
        for(T num:numbers){
            if(isEven(num)){
                even++;
            }
            if(isOdd(num)){
                odd++;
            }
            if(isprime(num)){
                pri++;
            }
            if(ispal(num)){
                pal++;
            }
        }
        System.out.println("Total even nos: " + even);
        System.out.println("Total odd nos: " + odd);
        System.out.println("Total prime nos: " + pri);
        System.out.println("Total palindrome nos: " + pal);
    }

    private static <T extends Number> boolean isEven(T num){
        return (num.longValue()%2==0);
    }

    private static <T extends Number> boolean isOdd(T num){
        return (num.longValue()%2!=0);
    }

    private static <T extends Number> boolean isprime(T num){
        for(int i=2; i<num.longValue()-1; i++){
            if(num.longValue()%i==0){
                return false;
            }
        }
        return true;
    }

    private static <T extends Number> boolean ispal(T num){
        String str = num.toString();
        String revstr= "";
        for(int i=0; i<str.length(); i++){
            revstr = str.charAt(i) + revstr;
        }
        if(str.equals(revstr)){
            return true;
        }
        return false;
    }   



}

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integerlist = new ArrayList<>();
        List<Double> doublelist = new ArrayList<>();
        int size;

        System.out.println("Enter choice:\n1. Integer values\n2. Double values\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter no of elements you want to enter: ");
                size = sc.nextInt();
                for(int i=0; i<size; i++){
                    System.out.println("Enter number: ");
                    int num = sc.nextInt();
                    integerlist.add(num);
                }
                Template.countnumbers(integerlist);
                break;
            
            case 2:
                System.out.println("Enter number of elements to enter: ");
                int size2 = sc.nextInt();
                for(int i =0; i<size2; i++){
                    System.out.println("Enter number: ");
                    double num = sc.nextDouble();
                    doublelist.add(num);
                }
                Template.countnumbers(doublelist);
                break;

            default:
                break;
        }

        sc.close();
    }
}

