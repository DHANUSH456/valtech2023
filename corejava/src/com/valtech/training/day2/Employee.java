package com.valtech.training.day2;

class Employee1 {
    private String name;
    private int age;
    private int experience;
    private String level;

    public Employee1(String name, int age, int experience, String level) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public String getLevel() {
        return level;
    }
}