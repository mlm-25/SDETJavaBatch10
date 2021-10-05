package com.company.syntax.class18;

public class PlayerFinder {

    public static void main(String[] args) {

        Player player = new Player();
        player.printPlayerInfo();

        Player player1 = new Player("Neymar Jr","PSG",29,10,
                5.9,150,"Brazil",547,330,31);
        player1.printPlayerInfo();

        Player player2 = new Player("Cristiano Ronaldo", "Manchester United",36, 7,
                6.2,183,"Portugal",1073,781);
        player2.printPlayerInfo();

        Player player3 = new Player("Lionel Messi", "PSG", 34, 30,
                5.7,159, "Argentina",929);
        player3.printPlayerInfo();

        Player player4 = new Player("Karim Benzema", "Real Madrid", 33, 9,
                6.1, 179, "France");
        player4.printPlayerInfo();

        Player player5 = new Player("Kylian Mbappe", "PSG", 22, 7,
                5.10, 161);
        player5.printPlayerInfo();

        Player player6 = new Player("Joshua Kimmich", "Bayern Munich", 26, 6,
                5.10);
        player6.printPlayerInfo();

        Player player7 = new Player("Marcus Rashford", "Manchester United", 23,
                11);
        player7.printPlayerInfo();

        Player player8 = new Player("Kevin De Bruyne", "Manchester City", 30);
        player8.printPlayerInfo();

        Player player9 = new Player("Robert Lewandoski", "Bayern Munich");
        player9.printPlayerInfo();

        Player player10 = new Player("Gianluigi Donnarumma");
        player10.printPlayerInfo();

    }
}
