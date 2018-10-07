package baitap4;

public class Word {
    public static void main(String[] args) {
        Human Adam = new Human("Adam", true,1);
        Human Eva = new Human("Eva",false,1);
        Apple apple = new Apple(10);
        Snake snake = new Snake();
        God.say("Không được ăn táo, ăn vào sẽ đau khổ");
        Adam.eat(apple);
        Eva.eat(apple);
        Adam.sleep();
        Eva.sleep();
    }
}
