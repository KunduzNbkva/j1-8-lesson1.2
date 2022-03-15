package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Утро");
        makeTea();

        System.out.println("Обед");
        makeTea();

        System.out.println("Полдник");
        makeTea();

        System.out.println("Ужин");
        makeTea();

        int result = multiply();
        System.out.println(result +1);

        int secondResult = plus(2,5,8);
        System.out.println(secondResult);

        makeTea("черный чай");


        System.out.println("Hello");
    }
    public static void makeTea(){   // метод невозвращаемый без входящих параметров
        System.out.println("Принести кружку");
        int a = 10;
        int b = 12;

        System.out.println("Вскипятить воду");
        System.out.println("Насыпать в кружку заварку");
        System.out.println("Залить кипятком");
        System.out.println("Добавить сахар, молоко по своему вкусу");
        System.out.println("Перемешать");
        System.out.println("Начать пить и насладиться чаем");

        System.out.println(a*b);

    }

    public static void makeTea(String tea){   // метод невозвращаемый без входящих параметров
        System.out.println("Принести кружку для " + tea);
    }

    public static int multiply(){ // метод возвращаемый без входящих параметров
        return 2*3;
    }

    public static int plus(int a, int b, int c){ // метод возвращаемый c входящими параметрами
        return a+b+c;
    }







}
