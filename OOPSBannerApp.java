/**
 * OOPSBannerApp prints OOPS banner using helper methods.
 *
 * @author Mehar
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join(" ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]
            );
        }

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    public static String[] getOPattern() {
        return new String[]{
                " ******** ",
                "**      **",
                "**      **",
                "**      **",
                "**      **",
                "**      **",
                " ******** "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                " ******** ",
                "**      **",
                "**      **",
                "******** ",
                "**       ",
                "**       ",
                "**       "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                " ******** ",
                "**       ",
                "**       ",
                " ********",
                "       **",
                "       **",
                " ********"
        };
    }
}