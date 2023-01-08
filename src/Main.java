import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

        task11();
        task12();
        task13();
        task14();
        task15();
    }

    public static void task1() {
        System.out.println("Условные операторы. Задача №1");
        int age1 = 15;
        int age2 = 28;
        checkAge(age1);
        checkAge(age2);
        System.out.println();
    }
    public static void checkAge(int age) {
        if(age >= 18) {
            System.out.println("Вы совершеннолетний. Вам " + age);
        }
        else System.out.println("Вы несовершеннолетний. Вам " + age);
    }

    public static void task2() {
        System.out.println("Условные операторы. Задача №2");
        int temp1 = -5;
        int temp2 = 28;
        checkTemp(temp1);
        checkTemp(temp2);
        System.out.println();
    }

    public static void checkTemp(int temp) {
        if(temp < 5) {
            System.out.println("На улице холодно, " + temp + " градусов, нужно надеть шапку");
        }
        else System.out.println("Сегодня тепло, " + temp + " градусов, можно идти без шапки");
    }

    public static void task3() {
        System.out.println("Условные операторы. Задача №3");
        int speed1 = 60;
        int speed2 = 100;
        checkSpeed(speed1);
        checkSpeed(speed2);
        System.out.println();
    }

    public static void checkSpeed(int speed) {
        if(speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        else System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
    }

    public static void task4() {
        System.out.println("Условные операторы. Задача №4");
        int age1 = 60;
        int age2 = 10;
        int age3 = 19;
        int age4 = 6;
        chooseInstitution(age1);
        chooseInstitution(age2);
        chooseInstitution(age3);
        chooseInstitution(age4);
        System.out.println();
    }

    public static void chooseInstitution(int age) {
        if(age >= 2 && age <= 6) {
            System.out.println("Eсли возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if(age >= 7 && age <= 18) {
            System.out.println("Eсли возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if(age > 18 && age <= 24) {
            System.out.println("Eсли возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if(age > 24) {
            System.out.println("Eсли возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Условные операторы. Задача №5");
        int age1 = 60;
        int age2 = 10;
        int age3 = 5;
        int age4 = 6;
        isAttractionAllowed(age1);
        isAttractionAllowed(age2);
        isAttractionAllowed(age3);
        isAttractionAllowed(age4);
        System.out.println();
    }

    public static void isAttractionAllowed(int age) {
        if(age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else if(age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
    }

    public static void task6() {
        System.out.println("Условные операторы. Задача №6");
        int passengers1 = 60;
        int passengers2 = 19;
        int passengers3 = 100;
        int passengers4 = 150;
        isTherePlace(passengers1);
        isTherePlace(passengers2);
        isTherePlace(passengers3);
        isTherePlace(passengers4);
        System.out.println();
    }

    public static void isTherePlace(int alreadyInTrain) {
        int allPlaces = 102;
        int sittingPlaces = 60;

        if(alreadyInTrain < sittingPlaces) {
            System.out.println("В вагоне ещё есть сидячие места. Всего: " + (sittingPlaces - alreadyInTrain));
        }
        else if(alreadyInTrain < allPlaces) {
            System.out.println("В вагоне ещё есть стоячие места. Всего: " + (allPlaces - alreadyInTrain));
        }
        else System.out.println("Вагон уже полностью забит");
    }

    public static void task7() {
        System.out.println("Условные операторы. Задача №7");
        System.out.println("Введите 3 числа или напишите \"пропустить\"");
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[3];
        for (int i = 0; i<numbers.length; i++) {
            String s = scanner.nextLine();
            if (s.equals("пропустить")||s.equals("Пропустить")) {
                break;
            } else numbers[i] = Integer.parseInt(s);
        }
        int one = numbers[0];
        int two = numbers[1];
        int three = numbers[2];
        int max = one;
        if (max < two) {
            max = two;
            if (max < three) {
                max = three;
            }
        }
        else if (max < three) {
            max = three;
        }
        System.out.println("Большее из трех чисел " + max);
        System.out.println();
    }

    public static void task11() {
        System.out.println("Условные операторы. Часть 2. Задача №1");
        byte clientOS = 1;
        switch (clientOS)
        {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Для вашей операционной системы пока нет приложения");
        }
        System.out.println();
    }

    public static void task12() {
        System.out.println("Условные операторы. Часть 2. Задача №2");
        byte clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else System.out.println("Для вашей операционной системы пока нет приложения");
        System.out.println();
    }

    public static void task13() {
        System.out.println("Условные операторы. Часть 2. Задача №3");
        int year1 = 2000;
        int year2 = 1800;
        int year3 = 1990;
        int year4 = 2024;
        isLeapYear(year1);
        isLeapYear(year2);
        isLeapYear(year3);
        isLeapYear(year4);

        System.out.println();
    }

    public static void isLeapYear(int year) {

        if(year % 400 == 0) {
            System.out.println("Год " + year + " високосный");
        }
        else if(year % 100 == 0) {
            System.out.println("Год " + year + " невисокосный");
        }
        else if(year % 4 == 0) {
            System.out.println("Год " + year + " високосный");
        }
        else System.out.println("Год " + year + " невисокосный");
    }

    public static void task14() {
        System.out.println("Условные операторы. Часть 2. Задача №4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Для доставки потребуется 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Для доставки потребуется 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.println("Для доставки потребуется 3 дня");
        } else System.out.println("Извините, в ваш район доставка не предусмотрена");
        System.out.println();
    }

    public static void task15() {
        System.out.println("Условные операторы. Часть 2. Задача №5");
        byte monthNumber = 12;
        switch (monthNumber)
        {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц - это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц - это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц - это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц - это осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
        System.out.println();
    }
}