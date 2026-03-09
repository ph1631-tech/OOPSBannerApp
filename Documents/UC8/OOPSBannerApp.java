import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
            " ***** ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " ***** "
        });

        patternMap.put('P', new String[]{
            " ***** ",
            " *   * ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        });

        patternMap.put('S', new String[]{
            " ***** ",
            " *     ",
            " *     ",
            " ***** ",
            "     * ",
            "     * ",
            " ***** "
        });
    }

    public static void renderBanner(String word) {
        int height = patternMap.get(word.charAt(0)).length;

        for (int line = 0; line < height; line++) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    sb.append(pattern[line]).append("   ");
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}