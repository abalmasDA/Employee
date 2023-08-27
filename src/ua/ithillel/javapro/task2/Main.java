package ua.ithillel.javapro.task2;

import ua.ithillel.javapro.task2.subtask1.Employee;
import ua.ithillel.javapro.task2.subtask3.Car;


public class Main {
    public static void main(String[] args) {

        System.out.println(new Employee("Dmytro Henderson", 25, "Software engineer", "henderson@gmail.com", "+380696589657"));

        Car car = new Car();
        car.start();


    }
}