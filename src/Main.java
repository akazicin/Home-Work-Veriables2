public class Main {
    public static void main(String[] args) {


/// task 1
        int os = 0;
        if ( os == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else if (os == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else {
            System.out.println(" Операционная система не подходит ");
        }


        /// task2
        int clientDeviceYear = 2016;
        if (os == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите версию приложения для iOS по ссылке ");
            } else {
                System.out.println(" Установите облегченную версию приложения для IOS по ссылке ");
            }
        } else if (os == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите версию приложения для Android по ссылке ");
            } else {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
            }
        }
        ///task3
        int year = 1583;
        if (year < 1584) {
            System.out.println(" Високосный год не введен в летоисчисление ");
        } else if (year >= 1584 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(+year + " год является високосным ");
        } else {
            System.out.println(+year + " год не является високосным");
        }
        /// task4
        int distance = 99;
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1 день ");
        } else if (distance > 20 && distance <= 60) {
            System.out.println( " Потребуется дней: 2 дня ");
        }
        else if ( distance > 60 && distance <= 100 ){
            System.out.println( " Потребуется дней: 3 дня ");
        } else {
            System.out.println( " Доставки нет ");
        }

        /// task5

        int monthNumber = 5;
        switch (monthNumber) {
            case 12, 1, 2 :
                System.out.println( " Зима ");
                break;
            case 3, 4, 5:
                System.out.println( " Весна ");
                break;
            case 6, 7, 8 :
                System.out.println( " Лето ");
                break;
            case 9, 10, 11 :
                System.out.println( "Осень ");
                break;
            default:
                System.out.println( " Такого месяца не существует ");
        }


    }
}









