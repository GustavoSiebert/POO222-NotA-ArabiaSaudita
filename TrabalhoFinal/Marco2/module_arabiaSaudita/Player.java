package module_arabiaSaudita;

public class Player extends Person {
    private int number;
    private String nickname;
    private Double height;
    private Double weight;
    private String position;
    private String club;

    public int getPlayerAsked() {
        return playerAsked;
    }

    public void AddPlayerAsked() {
        this.playerAsked++;
    }

    private static int playerAsked = 0;

    public Player(String name,int age, int number, String nickname, Double height, Double weight, String position, String currentClub) {
        super(name, age);
        this.number = number;
        this.nickname = nickname;
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.club = currentClub;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
