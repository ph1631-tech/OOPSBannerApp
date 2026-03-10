public class OOPSBannerApp {

    /**
     * Static Inner Class to encapsulate
     * a character and its banner pattern.
     */
    public static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character the character
         * @param pattern   the 7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         *
         * @return 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to build O pattern
     */
    public static CharacterPattern createOPattern() {
        return new CharacterPattern('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });
    }

    /**
     * Utility method to build P pattern
     */
    public static CharacterPattern createPPattern() {
        return new CharacterPattern('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });
    }

    /**
     * Utility method to build S pattern
     */
    public static CharacterPattern createSPattern() {
        return new CharacterPattern('S', new String[]{
                " ******  ",
                "*        ",
                "*        ",
                " *****   ",
                "       * ",
                "       * ",
                " ******  "
        });
    }

    public static void main(String[] args) {

        // Create character objects
        CharacterPattern oPattern = createOPattern();
        CharacterPattern pPattern = createPPattern();
        CharacterPattern sPattern = createSPattern();

        // Array of objects (O, O, P, S)
        CharacterPattern[] word = {
                oPattern,
                oPattern,
                pPattern,
                sPattern
        };

        // Build and print banner
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[row]).append(" ");
            }

            System.out.println(line);
        }
    }
}