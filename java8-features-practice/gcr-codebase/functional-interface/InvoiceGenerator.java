import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


interface DateFormatUtil {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        String format1 = DateFormatUtil.formatDate(invoiceDate, "dd-MM-yyyy");
        String format2 = DateFormatUtil.formatDate(invoiceDate, "yyyy/MM/dd");
        String format3 = DateFormatUtil.formatDate(invoiceDate, "dd MMM yyyy");

        System.out.println("Invoice Date (dd-MM-yyyy): " + format1);
        System.out.println("Invoice Date (yyyy/MM/dd): " + format2);
        System.out.println("Invoice Date (dd MMM yyyy): " + format3);
    }
}
