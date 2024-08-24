//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        isYearLeap(2024);
        deviceClient(1,2013);
        int delyveryDistance = calculateDelyveryTime(60);
        System.out.println(delyveryDistance);
    }

    public static void isYearLeap (int year) {
        if (year < 1589) {
            System.out.println("Год не является високостным");
        } else {
            if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
                System.out.println("Год является високостным");
            } else {
                System.out.println("Год не является високостным");
            }
        }
    }

    //Task 2
    public static void deviceClient (int os, int clientDeviceYear ) {
        if (os == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");

        }
    }

    public static int calculateDelyveryTime (int distance) {
        int deliveryTime;
        if (distance <= 20) {
            deliveryTime = 1;

        } else if (distance > 20 && distance <= 60) {
            deliveryTime = 2;

        } else if (distance > 60 && distance <= 100) {
            deliveryTime = 3;

        } else {
            deliveryTime = -1;
        }
        return deliveryTime;

    }

}