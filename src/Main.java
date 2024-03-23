public class Main {
    public static void main(String[] args) {


/// task 1
        int os = 1;
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
            if (clientDeviceYear == 1) {
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
        int distance = 120;
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1 день ");
        } else if (distance >= 20 && distance <= 60)
        {
            System.out.println( " Потребуется дней: 2 дня ");
        }
        else if ( distance >60 && distance <= 100 ){
            System.out.println( " Потребуется дней: 3 дня ");
        } else {
            System.out.println( " Доставки нет ");
        }

        /// task5

        int monthNumber = 5;
        switch (monthNumber) {
            case 1 :
                System.out.println( " January ");
                break;
            case 2 :
                System.out.println( " February ");
                break;
            case 3 :
                System.out.println( " March ");
                break;
            case 4:
                System.out.println( " April ");
                break;
            case 5 :
                System.out.println( " May ");
                break;
            case 6 :
                System.out.println( "June ");
                break;
            case 7 :
                System.out.println( " July ");
                break;
            case 8 :
                System.out.println( "August ");
                break;
            case 9 :
                System.out.println( "September ");
                break;
            case 10 :
                System.out.println( " October ");
                break;
            case 11 :
                System.out.println( " November ");
                break;
            case 12 :
                System.out.println( " December ");
                break;
            default:
                System.out.println( " Такого месяца не существует ");
        }


    }
}









