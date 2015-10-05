import java.util.Arrays;

/**
 * Question 2 -- Complete the method haveSameChars
 */

public class Q2 {
    /**
     * This method checks if the two strings passed in as input arguments
     * have the same characters. Assume that a character occurs only once
     * in a string. In other words, every character in a string is
     * unique.
     *
     * @param s1 a String with no characters repeated
     * @param s2 a String with no characters repeated
     * @return
     * 		true if both s1 and s2 contain the same characters
     * 		false for all other cases
     *
     * Examples:
     * 		return true if s1 = "Riya" and s2 = "Rayi"
     * 		return true if s1 = "" and s2 = ""
     * 		return true if s1 = "123" and s2 = "312"
     *
     * 		return false if s1 = "Riya" and s2 = "riya"
     * 		return false if either s1 or s2 is null
     * 		return false if s1 = "Nash" and s2 = "Don"
     */
    public static boolean haveSameChars(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;
        if (s1.equals(s2))
            return true;
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1,char2);
    }

}
