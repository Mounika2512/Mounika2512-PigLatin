public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in) {
        // Check if the input string is null or empty
        if (in == null || in.isEmpty()) {
            return in;
        }
        
        // Convert to lower case to handle both upper and lower case words
        in = in.toLowerCase();
        
        // Extract the first character
        char firstChar = in.charAt(0);
        
        // Move the first character to the end and add "ay"
        String pigLatin = in.substring(1) + firstChar + "ay";
        
        return pigLatin;
    }
}
