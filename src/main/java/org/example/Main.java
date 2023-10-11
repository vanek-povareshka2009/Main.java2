package org.example;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Шахбоз", 10, 600),
                new Human("Едвига", 10, 1000),
                new Human("Ядаган", 10, 3000),
                new Cat("Каша", 4, 100),
                new Robot("Санёк навигатор", 13, 1800),
        };
        Challenge[] challenges = {
                /*new RunningRoad(RoadLenght.LOW),
                new RunningRoad(RoadLenght.HIGH),

                new Wall(WallHeight.LOW),
                new RunningRoad(RoadLenght.LOW),
                new RunningRoad(RoadLenght.HIGH),
                new Wall(WallHeight.HIGH),
                new RunningRoad(RoadLenght.HIGH),
                new Wall(WallHeight.MEDIUM)

                 */
                new Wall(WallHeight.HIGH),
//                new Wall(WallHeight.HIGH),
//                new Wall(WallHeight.LOW),
                new Wall(WallHeight.MEDIUM),
                new Wall(WallHeight.HIGH),
                new Wall(WallHeight.HIGH),
        };

        for (Participant p : participants) {
            for (Challenge c : challenges) {
                if (!c.contest(p)){
                    break;
                }
            }

        }
    }
}