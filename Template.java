import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Template {

    public static <T extends Number> boolean isEven(T num) {
        if (num.longValue() % 2 == 0) {
            if (num.intValue()==2 || num.intValue()==0) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public static <T extends Number> boolean isPrime(T num) {
        for (int i = 2; i < num.longValue(); i++) {
            if (num.longValue() % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static <T extends Number> boolean isPalindrome(T num) {
        String str=num.toString();
        String reverse = "";
       for (int i = 0; i < str.length(); i++) {
            reverse=str.charAt(i)+reverse;
         }
       
        if (num.toString().equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public static <T extends Number> void counter(List<T> numbeArrayList) {
        int even = 0, odd = 0, prime = 0, palindrome = 0;
        for (T num : numbeArrayList) {

            if (isEven(num)) {
                even++;
            }
            if (!isEven(num)) {
                odd++;
            }
            if (isPrime(num)) {
                prime++;
            }
            if (isPalindrome(num)) {
                palindrome++;
            }
        }
        System.out.println("Total even nos: " + even);
        System.out.println("Total odd nos: " + odd);
        System.out.println("Total prime nos: " + prime);
        System.out.println("Total palindrome nos: " + palindrome);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        List<Double> double_array= new ArrayList<>();
        System.out.println("1-integer\n2-double");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < size; i++) {
                    System.out.println("Enter number:");
                    int num=sc.nextInt();
                    arr.add(num);

                }
                Template.counter(arr);
                break;
             case 2:
                for (int i = 0; i < size; i++) {
                    System.out.println("Enter number:");
                    double num1=sc.nextDouble();
                    double_array.add(num1);
                }
                Template.counter(double_array);
                break;

        }

    }

}
