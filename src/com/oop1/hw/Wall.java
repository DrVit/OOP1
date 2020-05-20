package com.oop1.hw;

public class  Wall extends Obstacle {
    private Double height;
    public Wall(Double height){
        this.height = height;
    }
    @Override
    public void doIt (Competitor competitor) {competitor.jumping(height);}
}

