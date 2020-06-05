public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz check = new FizzBuzz();
        String result = check.fizzBuzz(2);
        String result2 = check.fizzBuzz(3);
        String result3 = check.fizzBuzz(5);
        String result4 = check.fizzBuzz(15);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}