public class Game extends Player {

    public static void main(String[] args) {
        Game game = new Game();
        game.name = "John";
        System.out.println(game.name);
    }

    public void speak() {
        System.out.println("Hello");
    }

    public void attack() {
        System.out.println("Attack");
    }

    public void run() {
        System.out.println("Run");
    }

    public Game() {
        speak();
        attack();
        walk();
        run();
        Abilities.jump();
    }
}

abstract class Player implements Abilities {
    String name;

    public abstract void speak();
}

interface Abilities {
    void attack();

    void run();

    default void walk() {
        System.out.println("Walk");
    }

    public static void jump() {
        System.out.println("Jump");
    }
}