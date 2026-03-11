public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array for banner lines
        String[] lines = new String[7];

        // Populate array using String.join()
        lines[0] = String.join(" ", " *** ", " *** ", " ***** ", " ***** ");
        lines[1] = String.join(" ", "*   *", "*   *", "*    *", "*     ");
        lines[2] = String.join(" ", "*   *", "*   *", "*    *", "*     ");
        lines[3] = String.join(" ", "*   *", "*   *", "***** ", " *****");
        lines[4] = String.join(" ", "*   *", "*   *", "*     ", "     *");
        lines[5] = String.join(" ", "*   *", "*   *", "*     ", "*    *");
        lines[6] = String.join(" ", " *** ", " *** ", "*     ", " **** ");

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
