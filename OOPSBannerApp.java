import java.util.HashMap;

public class OOPSBannerApp {

    // UC8 — Create map of character patterns
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        charMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        charMap.put('S', new String[]{
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ******"
        });

        return charMap;
    }

    // UC8 — Display banner using map
    public static void displayBanner(String message,
                                     HashMap<Character, String[]> charMap) {

        message = message.toUpperCase();

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    sb.append(pattern[line]).append("  ");
                }
            }

            System.out.println(sb.toString());
        }
    }

    // UC8 — Main Method
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}