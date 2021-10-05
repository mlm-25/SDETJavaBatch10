package com.company.syntax.class18;

public class Player {

    String name;
    String team;
    int age;
    int num;
    double height;
    double weight;
    String nation;
    int appearance;
    int goals;
    int trophies;

    Player(String playerName, String playerTeam, int playerAge, int playerNum, double playerHeight,
           double playerWeight, String playerNation, int playerAppearance, int playerGoals, int playerTrophies){
        name = playerName;
        team = playerTeam;
        age = playerAge;
        num = playerNum;
        height = playerHeight;
        weight = playerWeight;
        nation = playerNation;
        appearance = playerAppearance;
        goals = playerGoals;
        trophies = playerTrophies;
    }

    Player(){
        name = "N/A";
        team = "N/A";
        age = 0;
        num = 0;
        height = 0;
        weight = 0;
        nation = "N/A";
        appearance = 0;
        goals = 0;
        trophies = 0;
    }

    Player(String playerName){
        name = playerName;
        team = "N/A";
        age = 0;
        num = 0;
        height = 0;
        weight = 0;
        nation = "N/A";
        appearance = 0;
        goals = 0;
        trophies = 0;
    }

    Player(String playerName, String playerTeam){
        name = playerName;
        team = playerTeam;
        age = 0;
        num = 0;
        height = 0;
        weight = 0;
        nation = "N/A";
        appearance = 0;
        goals = 0;
        trophies = 0;
    }

    Player(String playerName, String playerTeam, int playerAge){
        name = playerName;
        team = playerTeam;
        age = playerAge;
        num = 0;
        height = 0;
        weight = 0;
        nation = "N/A";
        appearance = 0;
        goals = 0;
        trophies = 0;
    }

    Player(String playerName, String playerTeam, int playerAge, int playerNum){
        name = playerName;
        team = playerTeam;
        age = playerAge;
        num = playerNum;
        height = 0;
        weight = 0;
        nation = "N/A";
        appearance = 0;
        goals = 0;
        trophies = 0;
    }

    Player(String playerName, String playerTeam, int playerAge, int playerNum,  double playerHeight){
        name = playerName;
        team = playerTeam;
        age = playerAge;
        num = playerNum;
        height = playerHeight;
        weight = 0;
        nation = "N/A";
        appearance = 0;
        goals = 0;
        trophies = 0;
    }

    Player(String playerName, String playerTeam, int playerAge, int playerNum, double playerHeight,
           double playerWeight){
        name = "N/A";
        team = "N/A";
        age = 0;
        num = 0;
        height = 0;
        weight = 0;
        nation = "N/A";
        appearance = 0;
        goals = 0;
        trophies = 0;
    }

    Player(String playerName, String playerTeam, int playerAge, int playerNum, double playerHeight,
           double playerWeight, String playerNation){
        name = playerName;
        team = playerTeam;
        age = playerAge;
        num = playerNum;
        height = playerHeight;
        weight = playerWeight;
        nation = playerNation;
        appearance = 0;
        goals = 0;
        trophies = 0;
    }

    Player(String playerName, String playerTeam, int playerAge, int playerNum, double playerHeight,
           double playerWeight, String playerNation, int playerAppearance){
        name = playerName;
        team = playerTeam;
        age = playerAge;
        num = playerNum;
        height = playerHeight;
        weight = playerWeight;
        nation = playerNation;
        appearance = playerAppearance;
        goals = 0;
        trophies = 0;
    }

    Player(String playerName, String playerTeam, int playerAge, int playerNum, double playerHeight,
           double playerWeight, String playerNation, int playerAppearance, int playerGoals){
        name = playerName;
        team = playerTeam;
        age = playerAge;
        num = playerNum;
        height = playerHeight;
        weight = playerWeight;
        nation = playerNation;
        appearance = playerAppearance;
        goals = playerGoals;
        trophies = 0;
    }

    void printPlayerInfo(){
        System.out.println("Name:"+name+" Team:"+team+" Age:"+age+" Number:"+num+" Height:"+height
                +" Weight:"+weight +" Nation:"+nation+" Appearance:"+appearance+" Goals:"+goals+" Trophies:"+trophies);
    }

}
