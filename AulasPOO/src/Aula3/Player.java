package Aula3;

public class Player {
    private final String name;
    private final int number;
    private String position;
    private boolean isFielded = false;

    public void setPosition(String position) {
        this.position = position;
    }
    public void setIsFielded(boolean isFielded) {
        this.isFielded = isFielded;
    }

    public Player(String name, int number, String position) {
        this.name = name;
        this.number = number;
        this.position = position;
    }

    public Player(String name, int number, String position,boolean isFielded) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.isFielded = isFielded;
    }

    public boolean getIsFielded(){
        return isFielded;
    }

    public String getStateAsString(){
        return "{" + isFielded + ", "
                + name + ", "
                + number + ", "
                + position + "}";
    }
}
