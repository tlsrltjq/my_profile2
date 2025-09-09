package kr.sparta.practical2_starter;

/*
 model
 */

public class Person {
    private String name;
    private int age;
    private String mbti;
    private String food;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getMbti() {
        return mbti;
    }

    public void setMbti(String mbti) {
        this.mbti = mbti;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food){
        this.food = food;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
