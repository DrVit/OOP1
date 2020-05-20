package com.oop1.hw;

public class Kross extends Obstacle {
    private int distance;
    public Kross(int distance){ this.distance = distance;}
    @Override
    public void doIt(Competitor competitor){competitor.running(distance);}
}
