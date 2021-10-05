package com.company.syntax.reviewclass09;

public class TesterClass {

    public static void main(String[] args) {
        Player p = new Player();
        p.run();
        p.athlete();
        Manager m = new Manager();
        m.name = "ronaldo";
        m.managingSkills();
        m.athlete();
        Physio ph = new Physio();
        ph.athlete();
        ph.duty();
    }
}
