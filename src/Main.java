public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Используется другая ОС");
        }

        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        int clientOS1 = 0;
        if (clientDeviceYear < 2015 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию для Андроид");
        } else if (clientDeviceYear < 201 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию для iOS");
        } else {
            System.out.println("Установите приложение");
        }

        System.out.println("Задание 3");
        int year = 2024;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " Год является высокосным");
        }else
            System.out.println(year + " Не является высокосным");

        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance <20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance>=20 && deliveryDistance <60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance>=60 && deliveryDistance<100){
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Пока не доставляем");
        }

        System.out.println("Задание 5");
        int monthNumber =12;
        switch (monthNumber){
            case 1:
            case 2:
            case 13:
            System.out.println("Сезон зима");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон лето");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}