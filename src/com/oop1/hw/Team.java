package com.oop1.hw;

public class Team {
    String teamName;
    Competitor[] teamMembers = new Competitor[4];

    public Team(Competitor[] teamMembers){
        this.teamName = " Сборище мечты ";
        this.teamMembers =teamMembers;
    }
    public Competitor[] getMembers(){
        return teamMembers;
    }
}
