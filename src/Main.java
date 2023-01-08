public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}