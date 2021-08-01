import java.util.Random;

import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {
    Random random = new Random();
    public void get10Rolls(){
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            results.add(random.nextInt(20)+1);
        }
        System.out.println(results);
    }
    public String getRandomLetter(){
        String[] alph = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        return alph[random.nextInt(26)];
    }

    public String generatePassword(){
        String result="";
        for(int i=0; i<8; i++){
            result+=getRandomLetter();
        }
        return result;
    }

    public void getNewPasswordSet(int val){
        String[] results;
        results = new String[val];
        for(int i=0; i<val; i++){
            results[i] = generatePassword();
        }
        System.out.println(Arrays.toString(results));
    }

    public void arrayShuffle(int[] arr){
        for(int i=0; i<arr.length; i++){
            int swapIndex = random.nextInt(arr.length);
            int temp = arr[swapIndex];
            arr[swapIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}