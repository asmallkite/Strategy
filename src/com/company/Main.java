package com.company;

public class Main {

    public static void main(String[] args) {
        AddStrategy addStrategy = new AddStrategy();
        Environment environment = new Environment(addStrategy);
        int res = environment.calculate(6,5);
        System.out.println(res);
        SubtractStrategy subtractStrategy = new SubtractStrategy();
        environment.setStrategy(subtractStrategy);
        System.out.println(environment.calculate(6,5));
        MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
        environment.setStrategy(multiplyStrategy);
        System.out.println(environment.calculate(6,5));
        DivideStrategy divideStrategy = new DivideStrategy();
        environment.setStrategy(divideStrategy);
        System.out.println(environment.calculate(6,5));


    }
}
