public class Main {
    public static void main(String[] args) {

//Задача1
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Вы не достигли совершеннолетия, нужно немного подождать");
        }

//Задача2
        int temperature = 3;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

//Задача3
        int speed = 81;
        if (speed <= 60) {
            System.out.println("Если скороть " + speed + " можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        }

//Задача4
        int ages = 25;
        if (ages >= 2 && ages <= 6) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в детский сад");
        } else if (ages >= 7 && ages <= 17) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в школу");
        } else if (ages >= 18 && ages <= 24) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в университет");
        } else if (ages > 24) {
            System.out.println("Если возраст человека равен " + ages + ", то ему пора ходить на работу");
        }

//Задача5
        int childsAge = 14;
        if (childsAge < 5) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему нельзя кататься на аттракционе");
        } else if (childsAge >= 5 && childsAge < 14) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (childsAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

//Задача6
        int passengers = 102;
        if (passengers < 60) {
            System.out.println("Есть сидячие места");
        } else if (passengers >= 60 && passengers < 102) {
            System.out.println("Есть только стоячие места");
        } else if (passengers >= 102) {
            System.out.println("Мест в вагоне нет!");
        }

//Задача7
        int one = 1111;
        int two = 2222;
        int three = 333;
        boolean oneIsBigger = one > two && one > three;
        boolean twoIsBigger = two > one && two > three;
        if (oneIsBigger) {
            System.out.println("Число " + one + " большее");
        } else if (twoIsBigger) {
            System.out.println("Число " + two + " большее");
        } else {
            System.out.println("Число " + three + " большее");
        }


    }
}