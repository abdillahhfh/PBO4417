import java.util.ArrayList;

public class GameEnvironment {
    private double width;
    private double height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();

    public GameEnvironment(){}
    public GameEnvironment(double width, double height){}
    
    public void addPlayer(GamePlayer name){
        arrPlayer.add(name);
    }

    public void removePlayer(GamePlayer name){
        arrPlayer.remove(name);
    }

    public void getAllPlayers(){
        System.out.println(arrPlayer);
    }

    public void addEnemy(GameEnemy name){
        arrEnemy.add(name);
    }

    public void removeEnemy(GameEnemy name){
        arrEnemy.remove(name);
    }

    public void getAllEnemies(){
        System.out.println(arrEnemy);
    }

    public void Interaction(){
        if(arrPlayer == null || arrEnemy == null){
            System.out.println("Player or enemy not sets");
        } 
        
        for(int i=0; i<arrPlayer.size(); i++){
            for(int j=0; i<arrEnemy.size(); i++){
                if(arrPlayer.get(i).getY() != arrEnemy.get(j).getY()){
                    System.out.println("Player: "+ arrPlayer.get(i) + " and Enemy: "+ arrEnemy.get(j) + " not in the same position");
                }

            }
        }
        
    }

    // public int EuclideanDistance(int x1, int x2, int y1, int y2){}

}

