public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задание 1");
        printLeapOrNotLeapYear (2000);
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
}