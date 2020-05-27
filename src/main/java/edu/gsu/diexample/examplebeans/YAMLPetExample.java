package edu.gsu.diexample.examplebeans;

import org.springframework.stereotype.Controller;

public class YAMLPetExample {
    private String petname;
    private String food;
    private String breed;

    public YAMLPetExample(String petname, String food, String breed) {
        this.petname = petname;
        this.food = food;
        this.breed = breed;
    }

    public String getName() {
        return petname;
    }

    public void setName(String name) {
        this.petname = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "YAMLPetExample{" +
                "name='" + petname + '\'' +
                ", food='" + food + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
