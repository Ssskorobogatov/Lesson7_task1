package com.epam.Sergei_Skorobogatov.java.Quadrocopters;

import com.epam.Sergei_Skorobogatov.java.Fleet;
import com.epam.Sergei_Skorobogatov.java.Info;

public class Xplorer1 extends Fleet implements Info {
    public Xplorer1(int year, int capacity, int seats, int distance, String mark) {
        super(year, capacity, seats, distance, mark);
    }

    @Override
    public void showInfo() {
        System.out.println("Характеристики квадрокоптера " + this.mark + ": " + "Год производства " + this.year + "; " + "грузоподъемность " + this.capacity + " кг; " + "дальность полета " + this.distance + " км.");
    }
}
