
public class StringManipulate {
    /**
     * Finds all the positions of a character in a string and
     * returns the result as a string in the specified format.
     * The method is case sensitive.
     *
     * @param inp a valid string i.e., neither null nor empty
     * @param c a valid character, i.e., the character is present at least
     *          once in the string
     * @return
     *      return "1,2," when inp is "Effective" and c is 'f'
     *      return "0," when inp is "Effective" and c is 'E'
     *      return "3,8," when inp is "Effective" and c is 'e'
     *
     */
    public String findPositions(String inp, char c) {
        char[] chars = inp.toCharArray();
        String indices = "";
        for (int i=0; i<chars.length;i++)
        {
            if (chars[i]==c)
                indices += i+",";
        }
        return indices;
    }

    public static void main(String[] args) {
        StringManipulate sm = new StringManipulate();
        String input = "Effective";
        char c = 'e';
        System.out.println(sm.findPositions(input, c));
    }
}
