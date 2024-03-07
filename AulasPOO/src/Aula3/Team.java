package Aula3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Team {
    private String name;
    private String baseLocation;
    private String coachName;
    private final Player[] players = new Player[18];
    private int numberOfPlayers = 0;
    private Player captain;

    public Optional<Player> getCaptain() {
        return Optional.ofNullable(captain);
    }
    public void addPlayer(Player player){
        players[numberOfPlayers] = player;
        numberOfPlayers++;
    }
    public void removePlayer(Player player){
        int i;
        for (i = 0;i<numberOfPlayers;i++){
            if(players[i] == player){
                players[i] = null;
                break;
            }
        }
        for (;i<numberOfPlayers-1;i++){
            players[i] = players[i+1];
        }
        numberOfPlayers--;
    }
    public void substitute(Player substitute , Player starter){
        for (int i = 0; i<numberOfPlayers; i++){
            if (players[i] == starter) {
                players[i] = substitute;
                break;
            }
        }
    }
    public void setCaptain(Player captain){
        this.captain = captain;
    }
    public List<Player> getFieldPlayers(){
        List<Player> presentPlayers = getPresentPlayers();
        return presentPlayers.stream()
                .filter(Player::getIsFielded)
                .collect(Collectors.toList());
    }

    public List<Player> getOutFieldedPlayers(){
        List<Player> presentPlayers = getPresentPlayers();
        return presentPlayers.stream()
                .filter(player -> !player.getIsFielded())
                .collect(Collectors.toList());
    }

    public void printPlayers(List<Player> players){
        if(players.isEmpty()){
            System.out.println("nao há jogadores nesta lista");
        }
        else{
            players.forEach(player -> System.out.println(player.getStateAsString()));
        }
    }

    private List<Player> getPresentPlayers(){
        List<Player> presentPlayers = new ArrayList<>();
        for (int i = 0; i<numberOfPlayers;i++){
            Optional<Player> playerOpt = Optional.ofNullable(players[i]);
            playerOpt.ifPresent(presentPlayers::add);
        }
        return presentPlayers;
    }

}
