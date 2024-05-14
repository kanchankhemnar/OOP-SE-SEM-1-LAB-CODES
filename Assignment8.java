import java.util.ArrayList;
import java.util.Collection;

public class Assignment8 {

    public static void main(String[] args) {
        // Example usage with ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(5);
        numbers.add(10);
        numbers.add(11);

        System.out.println("Number of even numbers: " + countElementsWithProperty(numbers, ElementProperty.EVEN));
        System.out.println("Number of odd numbers: " + countElementsWithProperty(numbers, ElementProperty.ODD));
        System.out.println("Number of prime numbers: " + countElementsWithProperty(numbers, ElementProperty.PRIME));
        System.out.println("Number of palindromes: " + countElementsWithProperty(numbers, ElementProperty.PALINDROME));
    }

    public static <T> int countElementsWithProperty(Collection<T> collection, ElementProperty property) {
        int count = 0;

        for (T element : collection) {
            switch (property) {
                case EVEN:
                    if (isEven((Integer) element)) {
                        count++;
                    }
                    break;
                case ODD:
                    if (isOdd((Integer) element)) {
                        count++;
                    }
                    break;
                case PRIME:
                    if (isPrime((Integer) element)) {
                        count++;
                    }
                    break;
                case PALINDROME:
                    if (isPalindrome(String.valueOf(element))) {
                        count++;
                    }
                    break;
            }
        }

        return count;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    private enum ElementProperty {
        EVEN,
        ODD,
        PRIME,
        PALINDROME
        // String reversed=new StringBuilder(str).reverse().toSTring();
       
    }
}
