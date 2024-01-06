package org.example;

public class Pet {
    private String name;
    private Integer age;
    private String location;
    private String type;

    public Pet(){}

    public Pet(String name, Integer age, String location, String type){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
