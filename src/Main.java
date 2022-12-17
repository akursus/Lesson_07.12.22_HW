import java.time.LocalDate;

public class Main {
    private final static int currentYear = LocalDate.now().getYear();
    public static void main(String[] args) {
        printLeapOrNotLeapYear (2000);
        printVersionOS(2021, 2);
        printDeliveryTime (395);
    }

    public static boolean isLeapYear (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printLeapOrNotLeapYear(int year) {
        if (isLeapYear (year)) {
            System.out.println(year + " - год високосный");
            return;
        }
        System.out.println(year + " - год не високосный");
    }

    public static String getVersionOS(int versionOS) {
        if (versionOS == 0) {
            return "IOS";
        } else if (versionOS == 1) {
            return "Android";
        }
        return  "!";
    }

    public static void printVersionOS(int year, int versionOS){
        if (year == currentYear) {
            System.out.println("Установите полную версию для ОС " + getVersionOS(versionOS));
        } else if (year < currentYear && versionOS <=1){
            System.out.println("Установите lite-версию для ОС " + getVersionOS(versionOS));
        }
        else {
            System.out.println("Версия операционной системы не определена"+ getVersionOS(versionOS));
        }
    }

    public static void printDeliveryTime (int deliveryDistance) {
        if (deliveryDistance > 0 && deliveryDistance < 300) {
            System.out.println("Время доставки в сутках - " + ((deliveryDistance + 19)/40 + 1));
            return;
        }
        System.out.println("Срок не определен. Доставка по почте");
    }
}