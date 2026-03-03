/**
 * OOPSBannerApp
 *
 * UC4: Display "OOPS" banner using String array and loop
 * for better modularity and reusability.
 *
 * @author YourName
 * @version 1.3
 */
public class UC4Banner {

    public static void main(String[] args) {

        String[] bannerLines = {
            String.join(" ", "*****",  "*****",  "*****",  "*****"),
            String.join(" ", "*     *","*     *","*     *","*     *"),
            String.join(" ", "*     *","*     *","*     *","*      "),
            String.join(" ", "*     *","*     *","*     *"," ***** "),
            String.join(" ", "*     *","*     *","*     *","      *"),
            String.join(" ", "*     *","*     *","*     *","*     *"),
            String.join(" ", "*****",  "*****",  "*****",  "*****")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}