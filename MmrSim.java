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
public class MmrSim {
/**
 * @MMRSimulator
 *  See the readme for introduction and how it works
 * 
 * 
 */
    public int iNumber_of_Rounds; //number of rounds played
    public int iNumber_of_Initial_Players; //number of initial players
    public int iNumber_of_added_Players_per_Round; //players injected per round
    public int iGrowth_Min; //growth minimum bound
    public int iGrowth_Max; //growth max bound
    public int iMMR_Gain; //growth per win
    public int iMMR_Loss; //growth per loss
    public int iPlayers_Per_Team; //Players per game's team
    public int iStarting_mmr;
    public int iMax_mmr;
    public int iMin_mmr;
    public ArrayList<Player> playerDatabase = new ArrayList<>();
    
    public MmrSim(){
        //init defaults
        iNumber_of_Rounds = 5;
        iNumber_of_Initial_Players = 10;
        iNumber_of_added_Players_per_Round=0;
        iGrowth_Min=0;
        iGrowth_Max=0;
        iMMR_Gain=5;
        iMMR_Loss=-5;
        iPlayers_Per_Team=1;
        iStarting_mmr=100;
        iMax_mmr=300;
        iMin_mmr=10;
        
    }
    
    public static void main(String[] args) {
        gui GUI = new gui();
        GUI.setVisible(true);
        
    }
    
}
