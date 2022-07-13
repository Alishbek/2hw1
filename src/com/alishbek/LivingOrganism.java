package com.alishbek;

public class LivingOrganism {
    private int age;
    private Color color;
    private String name;

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public LivingOrganism(int age, Color color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }
}
