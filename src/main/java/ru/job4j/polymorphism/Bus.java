package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Автобус движется");
    }

    @Override
    public void passengers(int count) {
        System.out.println(String.format("В автобусе %s пассажиров", count));
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 90;
    }
}
