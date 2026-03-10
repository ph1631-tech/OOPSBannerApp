public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines in an array
        String[] banner = {

            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*", "        *"),
            String.join(" ", "*****", "*****", "*", "    *****")

        };

        // Loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}