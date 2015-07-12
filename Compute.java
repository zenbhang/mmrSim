/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zenbhang
 */
import java.util.ArrayList;
import java.util.Random;

public class Compute {
    //init other classes
    public MmrSim m = new MmrSim();
    public gui g = new gui();
    public Random r = new Random();
    
    public void runCompute(){
        //run actual sim
        
        //if no players
        if(m.playerDatabase==null){
            m.playerDatabase=generateInitialPlayers();
        }
        
        //number of rounds
        for(int i=0; i<m.iNumber_of_Rounds;i++){
            runRounds();//run the matchmaking
            m.playerDatabase.addAll(generateWave(i));//geerates the next wave
        }
        
    }
    
    private void runRounds(){
        
    }
    
    public ArrayList<Player> generateInitialPlayers(){
        ArrayList<Player> a = new ArrayList<>();
        for (int i = 0; i<m.iNumber_of_Initial_Players;i++){
            a.add(generatePlayer(i,0));
        }
        return a;
        
    }
    public ArrayList<Player> generateWave(int wave){
        ArrayList<Player> a = new ArrayList<>();
        for (int i = 0; i<m.iNumber_of_added_Players_per_Round;i++){ //for loop
            a.add(generatePlayer(i,wave)); //adds a player
        }        
        return a;
    }
    public Player generatePlayer(int i, int wave){
        Player p = new Player();
        p.iGameMMR=m.iStarting_mmr; //starting mmr
        p.iRealMMR=r.nextInt(m.iMax_mmr-m.iMin_mmr)+m.iMin_mmr; //formula for real is randomize (max-min) + min
        p.str_username="Player "+i;
        p.iGrowth=r.nextInt(m.iGrowth_Max-m.iGrowth_Min)+m.iGrowth_Min; //same formula as above, but with growth
        p.iRoundJoined=wave; //wave player joined
        return p;
    }
}
