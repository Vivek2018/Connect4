package cs125project.connect4;

public class Player {
    private int score;
    private int trait;
    public Player() {
        score = 0;
    }
    public int getScore() {
        return this.score;
    }
    public void addScore() {
        this.score++;
    }
    public int getTrait() {return this.trait;}
    public void setTrait(int trait) {this.trait = trait;}
}
