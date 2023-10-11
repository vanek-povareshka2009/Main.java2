package org.example;

public class Human implements Participant, Jump {
    private int maxHeight;
    private int maxLenght;
    public static int superJumpCount = 2;

    String name;

    public Human(String name, int maxHeight, int maxLenght) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxLenght) {
            System.out.println("Человек " + this.name + " пробежал " + distance + " метров");
            return true;
        }
        else {
            System.out.println("Человек " + this.name + " не смог пробежать " + distance + " метров - выбывает");
            return false;
        }
    }
    @Override
    public boolean jump(int height) {
        if (height <= maxHeight) {
            System.out.println("Человек " + this.name + " перепрыгнул " + height + " метров");
            return true;
        }
        else if (superJumpCount != 0) {
            superJumpCount--;
            return superJump(name);
        }
        else {
            System.out.println("Человек " + this.name + " не смог перепрыгнуть " + height + " метров - выбывает");
            return false;
        }
    }

}
