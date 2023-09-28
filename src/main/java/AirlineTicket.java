import java.text.DecimalFormat;
import java.util.List;

public class AirlineTicket {


    public static void main(String[] args) {
//        String ticketType = args[0];
//        Integer distance = Integer.parseInt(args[1]);

        String result = getResult("C",10000);
        System.out.println(result);
    }

    public static String getResult(String ticketType, Integer distance) {
        double result = resolveTicketType(ticketType, distance);
        if (result == -1) {
            return "Invalid Ticket Type";
        }
        if (result == -2) {
            return "Invalid Distance";
        }
        if (result > Double.MAX_VALUE) {
            return "Invalid Distance";
        }
        return formatNumber(result);
    }

    public static double resolveTicketType(String ticketType, Integer distance) {
        List<String> validTicketType = List.of("A", "B", "C");
        if (!validTicketType.contains(ticketType)) {
            return -1;
        }
        if (distance <= 0) {
            return -2;
        }
        int ticketValue = 0;
        switch (ticketType) {
            case "A":
                ticketValue = 14000;
                return resolveDistancePrice(ticketValue, distance);
            case "B":
                ticketValue = 8000;
                return resolveDistancePrice(ticketValue, distance);
            case "C":
                ticketValue = 5000;
                return resolveDistancePrice(ticketValue, distance);
        }
        return 0;
    }

    public static double resolveDistancePrice(Integer defaultPrice, Integer distance) {
        if (distance <= 0) {
            return 0;
        }

        double price = defaultPrice;
        double sum;

        if (distance <= 100) {
            sum = distance * price;
        } else if (distance <= 200) {
            sum = 100 * price + (distance - 100) * price / 2;
        } else {
            sum = 100 * price + 100 * price / 2 + (distance - 200) * price / 4;
        }

        return sum;
    }

    public static String formatNumber(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("00000000");
        return decimalFormat.format(number).replaceFirst("^0+(?!$)", "");
    }
}
