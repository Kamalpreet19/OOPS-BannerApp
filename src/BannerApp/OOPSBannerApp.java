package BannerApp;
/**
 *    OOPSBannerApp UC5- Prints OOPS banner using inline array and loop.
 *
 */
public class OOPSBannerApp {
    public static void main(String args[]) {
        String[] banner2 = {
                String.join("   ", "*********", "*********", "*********", "*********"),
                String.join("   ", "*       *", "*       *", "*       *", "*        "),
                String.join("   ", "*       *", "*       *", "*       *", "*        "),
                String.join("   ", "*       *", "*       *", "*********", "*********"),
                String.join("   ", "*       *", "*       *", "*        ", "        *"),
                String.join("   ", "*       *", "*       *", "*        ", "        *"),
                String.join("   ", "*********", "*********", "*        ", "*********")
        };


        for (String line : banner2) {
            System.out.println(line);
        }
        System.out.println();


    }
}
