package baitap4;

public class Human {
    private String name;
    private boolean gender;
    private int age;

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Human() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setGender(boolean gender) {
        if (gender) {
            return "Nam";
        }
        return "Nữ";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    //hành động
    public void stay(String say) {
        System.out.println("Con người nói: " + say);
    }

    public void eat(Apple apple) {
        if (apple.isEmpty()) {
            apple.weight--;
            System.out.println(this.name + " ăn 1 miếng táo");
            System.out.println("Còn " + apple.getWeight() + " miếng táo");
        } else {
            System.out.println(this.name+" Đã hết táo để ăn");
        }
    }

    public void sleep() {
        System.out.println("zzZZ");
    }
}