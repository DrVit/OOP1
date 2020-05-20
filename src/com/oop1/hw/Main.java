package com.oop1.hw;

public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {new Robot("Robbi", 150, 0.5), new Cat("Barsik", 250, 2.0), new Men("Petr", 5000, 1.8)};
        Obstacle[] obstacles = {new Kross(150), new Wall(0.6), new Kross(100), new Wall(1.9), new Kross(300)};
        Team team = new Team(competitors);
        Course course = new Course(obstacles);

        System.out.println("============Results============");
        course.doIt(team);


         }
    }

