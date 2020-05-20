package com.oop1.hw;

public class Men implements Competitor {
    protected String name;
    protected int maxDistance;
    protected Double maxJump;
    boolean onDistance;

    public boolean isOnDistance(){return this.onDistance;}

    public Men(String name, int maxDistance, Double maxJump) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
        this.onDistance = true;
    }

    public void running(int distance) {
        if (distance <= maxDistance) {
            System.out.println(name + " " + " успешно справился с бегом на дистанцию " + distance);
        } else {
            System.out.println(name + " " + " не смог преодолеть дистанцию " + distance);
            onDistance = false;
        }
    }
        public void jumping(Double height) {
            if (height <= maxJump){
                System.out.println(name + " " + " успешно справился с прыжком через препятствие " + height);
            }else {
                System.out.println(name + " " + " не смог преодолеть препятствие " + height);
                onDistance = false;
            }
    }

}