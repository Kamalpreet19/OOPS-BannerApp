package BannerApp;

import java.util.HashMap;

/**
 *   OOPSBannerApp UC8- Use Map for Character Patterns and Render via Function
 *
 */
public class OOPSBannerApp {
    static HashMap<Character, String[]> patternMap = new HashMap<>();
    public static void buildPatterns() {
        String[] oPattern = {
                "    ***    ",
                " **     ** ",
                "**       **",
                "**       **",
                "**       **",
                " **     ** ",
                "    ***    "

        };

        String[] pPattern = {
                "*********",
                "*       *",
                "*       *",
                "*********",
                "*        ",
                "*        ",
                "*        "

        };


        String[] sPattern = {
                "*********",
                "*        ",
                "*        ",
                "*********",
                "        *",
                "        *",
                "*********"
        };


        patternMap.put('O', oPattern);
        patternMap.put('P', pPattern);
        patternMap.put('S', sPattern);
    }


    public static void printBanner(String message) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = patternMap.get(ch);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        buildPatterns();
        printBanner("OOPS");




    }

}
