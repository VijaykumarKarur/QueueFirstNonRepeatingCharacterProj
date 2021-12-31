public class Main {
    public static void main(String[] args) {
        String string = "abcbbbbbbbba";
        Solution solution = new Solution();
        System.out.println("Given String\n: " + string);
        System.out.println("First Non Repeating Character Sequence\n: " + solution.firstNonRepeatingCharacter(string));
    }
}
