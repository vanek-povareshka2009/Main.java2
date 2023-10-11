package org.example;

public interface Jump {
    default public boolean superJump(String name) {
        System.out.println("Человек " + name + " перепрыгнул с экстра");
        return true;
    }
}
