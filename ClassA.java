package com.company.syntax.class20;

public class ClassA {
    static String batman = "Christian Bale";
    static String alfred = "Micheal Caine";
    static String jamesGordan = "Gary Oldman";
    String villain;
    static String productionCompany = "Warner Brothers Pictures";
    static String director = "Christopher Nolan";
    boolean batMobile;
    int yearMade;
    String title;

    static void cast(){
        System.out.println("Batman is played by "+batman+" Alfred is played by "+alfred+
                " James Gordon is played by "+jamesGordan+" the movie is directed by "+director+
                " and the production company is "+productionCompany);
    }
    void getTitle(){
        System.out.println(title+" was made in the year "+yearMade);
    }
    static void bruceWayne(){
        System.out.println("Bruce Wayne is Batman");
    }
    void drivingBatMobile(){
        System.out.println("Batman drives the bat mobile");
    }
    static void glide(){
        System.out.println("Batman can glide");
    }
    void fightVillain(){
        System.out.println("Batman fights "+villain);
    }

    public static void main(String[] args) {
        ClassA batman = new ClassA();
        batman.title="Batman Begins";
        batman.yearMade=2005;
        batman.villain="Ra's al Ghul";
        batman.batMobile=true;
        ClassA.cast();
        batman.getTitle();
        ClassA.bruceWayne();
        ClassA.glide();
        batman.drivingBatMobile();
        batman.fightVillain();

    }

}
