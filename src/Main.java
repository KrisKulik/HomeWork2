public class Main {
    public static void main(String [] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println (cat);
        System.out.println(paper);
    }
        public static void task2 () {
        System.out.println("Задача 2");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 6");
        var frog = 3.5;
        frog = frog * 10;
        frog = frog / 3.5;
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 7");
        var weight1 = 78.2;
        var weight2 = 82.7;
        var totalWeight = weight1 + weight2;
        var weightDifference = weight2 - weight1;
        System.out.println("Общий вес " + totalWeight);
        System.out.println("Разница в весе " + weightDifference);
    }
    public static void task7 () {
        System.out.println("Задача 8");
        var weight1 = 78.2;
        var weight2 = 82.7;
        var weightDifference = weight2 - weight1;
        var weightRemainder = weight2 % weight1;
        System.out.println(weightDifference);
        System.out.println(weightRemainder);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hours = 640;
        var jobTime = 8;
        var people = hours / jobTime;
        System.out.println("Всего работников в компании - " + people + " человек" );
        var worker = people + 94;
        var time = worker * jobTime;
        System.out.println("Если в компании работает " + worker + " человека, то всего " + time + " часов работы может быть поделено между сотрудниками");

    }
}