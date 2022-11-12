public class Main {
    public static void main(String[] args) {
        //task1 - 2
        System.out.println("Задание № 1 - 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }

        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        //task3
        System.out.println("Задание №3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //task4
        System.out.println("Задание №4");
        int deliveryDistance = 95;
        int day = 0;

        if (deliveryDistance <= 20) {
            day += 1;
            System.out.println("На доставку уйдет " + day + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day += 2;
            System.out.println("На доставку уйдет " + day + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day += 3;
            System.out.println("На доставку уйдет " + day + " дня");
        } else {
            System.out.println("Доставки на расстояние свыше 100 км. нет");
        }

        //task 5
        System.out.println("Задание №5");
        int monthNumber = 5;
        switch (monthNumber){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



    }

}
