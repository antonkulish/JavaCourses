package Lesson4;

public class Bee extends Insect implements Attack{
    private Attack attack;

    public Bee(int size, String color, Attack attack) {
        super(size, color);
        this.attack=attack;
    }

    public void move(){
        attack.move();
    }

    public void attack(){
        attack.attack();
    }

    public static void main(String[] args) {
        Bee bee1 = new Bee(22,"yellow-black", new AttackImpl("fly","sting"));
        bee1.attack();
    }

}
