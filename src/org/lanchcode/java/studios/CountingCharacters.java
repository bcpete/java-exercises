package org.lanchcode.java.studios;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Brady on 3/2/17.
 */
public class CountingCharacters {

    public static void main(String[] args){
        HashMap<Character, Integer> charCount = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = in.nextLine();
        userInput = userInput.toLowerCase();

        for(Character letter : userInput.toCharArray()){
            if(Character.isLetter(letter)== true) {
                Integer newValue = charCount.get(letter);
                if (newValue == null) {
                    newValue = 0;
                }
                charCount.put(letter, newValue += 1);
            }
        }
        System.out.println("\nCharacter count: ");
        for(Map.Entry<Character, Integer> letter : charCount.entrySet()){
            System.out.println(letter.getKey() + " : " + letter.getValue());
        }
    }

}
