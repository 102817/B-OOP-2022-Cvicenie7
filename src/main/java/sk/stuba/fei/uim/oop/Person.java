package sk.stuba.fei.uim.oop;

import java.util.List;

public class Person {
    private String name;
    private String adress;
    private double height;
    private double weight;
    private int age;
    private List<Person> friends;

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public List<Person> getFriends() {
        return friends;
    }
}
