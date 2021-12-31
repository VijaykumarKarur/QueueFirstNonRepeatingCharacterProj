import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String firstNonRepeatingCharacter(String string){
        Queue<Character> queue = new LinkedList<>();
        boolean[] alphabet = new boolean[26];
        StringBuilder result = new StringBuilder();
        for(int index = 0; index < string.length(); index++){
            Character character = string.charAt(index);
            int alphabetIndex = character - 'a';
            if(alphabet[alphabetIndex]){
                queue.remove(character);
            }
            else{
                alphabet[alphabetIndex] = true;
                queue.add(character);
            }
            if(queue.isEmpty()){
                result.append('#');
            }
            else{
                result.append(queue.peek());
            }
        }
        return result.toString();
    }
}
