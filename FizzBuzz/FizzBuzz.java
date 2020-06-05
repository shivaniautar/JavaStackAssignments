public class FizzBuzz{
    public String fizzBuzz(int number) {
        if((number % 5 == 0) && (number % 3 == 0)) {
            return "FizzBuzz";
        }
        else if(number % 5 == 0){
            return "Buzz";
        }
        else if(number % 3 == 0){
            return "Fizz";
        }
        else{
            return String.valueOf(number);
        }
    }
}


// Write a program that will take an integer and print Fizz
// if the number is divisible by 3, Buzz if the number is divisible by 5,
// FizzBuzz if the number is divisible by 3 and 5, and the number itself for all
// other cases.


// public class FizzBuzz {
//     public String fizzBuzz(int number) {
//         String answerIs= " ";
//         if (number % 3 == 0) {
//             answerIs.concat("Fizz");
//         } else if (number % 5 == 0) {
//             answerIs.concat("Buzz");
//         } else if (number % 5 == 0 && number % 3 == 0) {
//             answerIs.concat("FizzBuzz");
//         } else {
//             answerIs.concat(String.format("%.2f", number));
//         }
//         return answerIs;
//     }
// }