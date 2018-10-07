package baitap4;

public class Word {
    public static void main(String[] args) {
        Human Adam = new Human("Adam", true,1);
        Human Eva = new Human("Eva",false,1);
        Apple apple = new Apple(4);
        Snake snake = new Snake();
        int countApple = apple.getWeight();
        God.say("Không được ăn táo, ăn vào sẽ đau khổ");
        snake.stay("Ăn táo đi ngon lắm, không chết đâu");
        Adam.eat(apple);
        Eva.eat(apple);
        Adam.sleep();
        Eva.sleep();
        if (countApple != apple.getWeight()){
            God.say("Eva! cô phải vâng lời chồng và chịu đau đớn khi sinh con");
            God.say("Adam! Ngươi phải cuốc đất trồng cây mà ăn");
        }
    }
}
