public class PuzzleJavaTester {
    public static void main (String[] args){
        PuzzleJava tester = new PuzzleJava();
        tester.get10Rolls();
        tester.getNewPasswordSet(10);
        int[] testNums = {1,7,3,8,9};
        tester.arrayShuffle(testNums);
    }
}