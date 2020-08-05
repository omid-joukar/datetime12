import java.text.DateFormatSymbols;
import java.util.Locale;

/**
 * Created by KPS on 8/5/2020.
 */
public class Main {
    public static void main(String[] args) {


            // Localize in German

            DateFormatSymbols symbols = new DateFormatSymbols(new Locale("de"));
            // for the current Locale :
            //   DateFormatSymbols symbols = new DateFormatSymbols();
            String[] dayNames = symbols.getWeekdays();
            for (String s : dayNames) {
                System.out.print(s + "\n");
                System.out.println();
            }
        }
    }

