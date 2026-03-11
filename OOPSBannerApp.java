/**
 * OOPSBannerApp prints OOPS banner using inline array initialization.
 *
 * @author YourName
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = {
                String.join(" ",
                        " ******** ",
                        " ******** ",
                        " ******** ",
                        " ******** "
                ),
                String.join(" ",
                        "**      **",
                        "**      **",
                        "**      **",
                        "**       "
                ),
                String.join(" ",
                        "**      **",
                        "**      **",
                        "**      **",
                        "**       "
                ),
                String.join(" ",
                        "**      **",
                        "**      **",
                        "******** ",
                        " ********"
                ),
                String.join(" ",
                        "**      **",
                        "**      **",
                        "**       ",
                        "       **"
                ),
                String.join(" ",
                        "**      **",
                        "**      **",
                        "**       ",
                        "       **"
                ),
                String.join(" ",
                        " ******** ",
                        " ******** ",
                        "**       ",
                        " ********"
                )
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}