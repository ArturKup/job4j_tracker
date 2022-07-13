package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    @Override
    public void drive() {
        System.out.println("Автобус поехал");
    }

    @Override
    public void numberOfPassengers(int number) {
        System.out.println("Вместимость автобуса " + number);
    }

    @Override
    public double refuel(double fuel) {
        return 0;
    }

    @Override
    public void move() {
        System.out.println("Автобус передвигается по трассе");
    }
}
