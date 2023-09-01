package atividade;

public class Gamer {
    
    public String name;
    public int score;
    
    
    public Gamer (String name, int score){
        this.name = name;
        this.score = score;
    }
    
    public void mostraGamer(){
        System.out.printf("%10s ", name + score);
    }
    
}
