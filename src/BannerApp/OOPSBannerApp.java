package BannerApp;
/**
 *   OOPSBannerApp UC7- Store Character Pattern in a Class
 *
 */
public class OOPSBannerApp {
    static class  CharacterPatternMap{
        private char characters;
        private String[] patterns;

        CharacterPatternMap(char characters, String[] patterns){
            this.characters=characters;
            this.patterns=patterns;
        }

        public char getCharacters(){
            return characters;
        }

        public String[] getPatterns(){
            return patterns;
        }

    }



    public static void main(String args[]){
        String[] oPattern={
                "    ***    ",
                " **     ** ",
                "**       **",
                "**       **",
                "**       **",
                " **     ** ",
                "    ***    "

        };

        String[] pPattern={
                "*********",
                "*       *",
                "*       *",
                "*********",
                "*        ",
                "*        ",
                "*        "

        };


        String[] sPattern={
                "*********",
                "*        ",
                "*        ",
                "*********",
                "        *",
                "        *",
                "*********"
        };



        CharacterPatternMap O=new CharacterPatternMap('O', oPattern);
        CharacterPatternMap P=new CharacterPatternMap('P', pPattern);
        CharacterPatternMap S=new CharacterPatternMap('S', sPattern);

        CharacterPatternMap[] bannerChars={O,O,P,S};

        for(int i=0;i<7;i++){
            StringBuilder line=new StringBuilder();

            for(CharacterPatternMap ch:bannerChars){
                line.append(ch.getPatterns()[i]).append("   ");
            }

            System.out.println(line.toString());
        }

    }
}
