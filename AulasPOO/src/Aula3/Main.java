package Aula3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        Player p1 = new Player("Gustavo",11,"Volante",true);
        Player p2 = new Player("Player2",30,"Zagueiro");

        team.addPlayer(p1);
        team.addPlayer(p2);
        team.setCaptain(p1);

        System.out.println("Field players: ");
        team.printPlayers(team.getFieldPlayers());

        System.out.println("OutFielded players: ");
        team.printPlayers(team.getOutFieldedPlayers());

        System.out.println("Captain: ");
        team.getCaptain()
                .ifPresentOrElse(
                        captain -> System.out.println(captain.getStateAsString()),
                        () -> System.out.println("Este time ainda não possui capitão!")
                );

        Player p3 = new Player("Player3",9,"Centroavante");

        team.substitute(p3,p2);

        System.out.println("OutFielded players: ");
        team.printPlayers(team.getOutFieldedPlayers());

        team.removePlayer(p3);

        System.out.println("OutFielded players: ");
        team.printPlayers(team.getOutFieldedPlayers());
    }
}
