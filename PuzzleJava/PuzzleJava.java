import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// public class PuzzleJava {
//     public static int[] sumAndGreaterThan10(int[] arr) {
//         ArrayList<Integer> newArray = new ArrayList<Integer>();
//         int total = 0;
//         for (int i = 0; i < arr.length; i++) {
//             total += arr[i];
//             if (arr[i] > 10) {
//                 newArray.add(arr[i]);
//             }
//         }
//         System.out.println(total);
//         int[] output= new int[newArray.size()];
//         for(int i = 0; i<output.length;i++){
//             output[i]=newArray.get(i).intValue();
//         }
//         return output;
        // System.out.println(newArray);
    // }

    // public void arrayWithNamesLongerThan5Chars(String[] arr1) {
    //     ArrayList<String> newShuffledStringArray = new ArrayList<String>();
    //     ArrayList<String> newStringArray = new ArrayList<String>();
    //     for (int i = 0; i < arr1.length; i++) {
    //         newShuffledStringArray.add(arr1[i]);
    //         if (arr1[i].length() > 5) {
    //             newStringArray.add(arr1[i]);
    //         }
    //     }
    //     Collections.shuffle(newShuffledStringArray);
    //     System.out.println(newShuffledStringArray);
    //     System.out.println(newStringArray);
    // }

    // public void alphabetShuffle() {
    //     ArrayList<String> alphabetArray = new ArrayList<String>();
    //     for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
    //         alphabetArray.add(Character.toString(alphabet));
    //     }
    //     Collections.shuffle(alphabetArray);
    //     System.out.println(alphabetArray);
    //     System.out.println("First letter of the shuffled array is: " + alphabetArray.get(0));
    //     System.out.println("Last letter of the shuffled array is: " + alphabetArray.get(25));

    //     String first = alphabetArray.get(0);
    //     if ("AEIOU".indexOf(first) > 0) {
    //         System.out.println("The first letter is a vowel!");
    //     }
    // }

    // public void randomNumArrayOf10NumsFrom55To100() {
    //     ArrayList<Integer> newArray = new ArrayList<Integer>();
    //     int max = 101;
    //     int min = 55;
    //     for (int i = 0; i < 10; i++) {
    //         int num = ThreadLocalRandom.current().nextInt(min, max);
    //         newArray.add(num);
    //     }
    //     System.out.println(newArray);
    // }

    // public void randomNumArrayOf10NumsFrom55To100Sorted() {
    //     ArrayList<Integer> newArray1 = new ArrayList<Integer>();
    //     int min = 101;
    //     int max = 55;
    //     for (int i = 0; i < 10; i++) {
    //         int num = ThreadLocalRandom.current().nextInt(55, 101);
    //         newArray1.add(num);
    //         if (num < min) {
    //             min = num;
    //         }
    //         if (num > max) {
    //             max = num;
    //         }
    //     }
    //     Collections.sort(newArray1);
    //     System.out.println(newArray1);
    //     System.out.println("Smallest random number in the new array is " + min);
    //     System.out.println("Largest random number in the new array is " + max);

    // }

    // public void randomString5CharsLong() {
    //     Random rand = new Random();
    //     StringBuilder randString = new StringBuilder();
    //     String alpha = "abcdefghijklmnopqrstuvwxyz";
    //     for (int i = 0; i < 5; i++) {
    //         randString.append(alpha.charAt(rand.nextInt(alpha.length())));
    //     }
    //     String finalString = randString.toString();
    //     System.out.println(finalString);
    // }

    // public void arrayWith10RandomStringsEach5CharsLong() {
    //     ArrayList<String> newStringArray = new ArrayList<String>();
    //     Random rand = new Random();
    //     StringBuilder randString = new StringBuilder();
    //     String alpha = "abcdefghijklmnopqrstuvwxyz";
    //     for (int i = 0; i < 10; i++) {
    //         for (int j = 0; j < 5; j++) {
    //             randString.append(alpha.charAt(rand.nextInt(alpha.length())));
    //         }
    //         String finalString = randString.toString();
    //         newStringArray.add(finalString);
    //         randString.setLength(0);
    //     }
    //     System.out.println(newStringArray);
    // }
// }



public class PuzzleJava {
    public void sumAndGreaterThan10(int[] arr) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (arr[i] > 10) {
                newArray.add(arr[i]);
            }
        }
        System.out.println(total);
        System.out.println(newArray);
    }

    public void arrayWithNamesLongerThan5Chars(String[] arr1) {
        ArrayList<String> newShuffledStringArray = new ArrayList<String>();
        ArrayList<String> newStringArray = new ArrayList<String>();
        for (int i = 0; i < arr1.length; i++) {
            newShuffledStringArray.add(arr1[i]);
            if (arr1[i].length() > 5) {
                newStringArray.add(arr1[i]);
            }
        }
        Collections.shuffle(newShuffledStringArray);
        System.out.println(newShuffledStringArray);
        System.out.println(newStringArray);
    }

    public void alphabetShuffle() {
        ArrayList<String> alphabetArray = new ArrayList<String>();
        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            alphabetArray.add(Character.toString(alphabet));
        }
        Collections.shuffle(alphabetArray);
        System.out.println(alphabetArray);
        System.out.println("First letter of the shuffled array is: " + alphabetArray.get(0));
        System.out.println("Last letter of the shuffled array is: " + alphabetArray.get(25));

        String first = alphabetArray.get(0);
        if ("AEIOU".indexOf(first) > 0) {
            System.out.println("The first letter is a vowel!");
        }
    }

    public void randomNumArrayOf10NumsFrom55To100() {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int max = 101;
        int min = 55;
        for (int i = 0; i < 10; i++) {
            int num = ThreadLocalRandom.current().nextInt(min, max);
            newArray.add(num);
        }
        System.out.println(newArray);
    }

    public void randomNumArrayOf10NumsFrom55To100Sorted() {
        ArrayList<Integer> newArray1 = new ArrayList<Integer>();
        int min = 101;
        int max = 55;
        for (int i = 0; i < 10; i++) {
            int num = ThreadLocalRandom.current().nextInt(55, 101);
            newArray1.add(num);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        Collections.sort(newArray1);
        System.out.println(newArray1);
        System.out.println("Smallest random number in the new array is " + min);
        System.out.println("Largest random number in the new array is " + max);

    }

    public void randomString5CharsLong() {
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 5; i++) {
            randString.append(alpha.charAt(rand.nextInt(alpha.length())));
        }
        String finalString = randString.toString();
        System.out.println(finalString);
    }

    public void arrayWith10RandomStringsEach5CharsLong() {
        ArrayList<String> newStringArray = new ArrayList<String>();
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                randString.append(alpha.charAt(rand.nextInt(alpha.length())));
            }
            String finalString = randString.toString();
            newStringArray.add(finalString);
            randString.setLength(0);
        }
        System.out.println(newStringArray);
    }
}
