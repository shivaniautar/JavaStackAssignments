import java.util.Arrays;

// public class PuzzleJavaTest{
//     public static void main(String[] args){
//         PuzzleJava testTrials=new PuzzleJava();

//         int[] testArr = {3,5,1,2,7,9,8,13,25,32};
//         int[] testResult= testTrials.sumAndGreaterThan10(testArr);
//         System.out.println(Arrays.toString(testResult));

//         // String[] testList = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
//         // testTrials.arrayWithNamesLongerThan5Chars(testList);

//         // testTrials.alphabetShuffle();

//         // testTrials.randomNumArrayOf10NumsFrom55To100();

//         // testTrials.randomNumArrayOf10NumsFrom55To100Sorted();

//         // testTrials.randomString5CharsLong();

//         // testTrials.arrayWith10RandomStringsEach5CharsLong();
//     }
// }

public class PuzzleJavaTest{
public static void main (String[] args){
    PuzzleJava testTrials= new PuzzleJava();

    int[] testArr = {3,5,1,2,7,9,8,13,25,32};
    testTrials.sumAndGreaterThan10(testArr);

    String[] testList = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    testTrials.arrayWithNamesLongerThan5Chars(testList);

    testTrials.alphabetShuffle();

    testTrials.randomNumArrayOf10NumsFrom55To100();

    testTrials.randomNumArrayOf10NumsFrom55To100Sorted();

    testTrials.randomString5CharsLong();

    testTrials.arrayWith10RandomStringsEach5CharsLong();
    }
}

