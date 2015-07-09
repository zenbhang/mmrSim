/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 *
 * @author zenbhang
 */
public class Player {
    public int iGameMMR; //mmr according to the game
    public int iRealMMR;  //mmr in reality
    public int iRoundJoined; //round player joined in
    public int iGrowth; //growth overtime
    public String str_username; //username if one
    public ArrayList<Integer> match_history= new ArrayList<>(); //match history of player
    public ArrayList<Integer> gain_history = new ArrayList<>(); //history of gains of player
    
    
}
