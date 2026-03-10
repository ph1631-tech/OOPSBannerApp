public class OOPSBannerApp {

    public static void main(String[] args) {

        // Array declaration + initialization in one step
        String[] banner = {
            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*   *", "*"),
            String.join(" ", "*   *", "*   *", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*", "        *"),
            String.join(" ", "*****", "*****", "*", "    *****")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}