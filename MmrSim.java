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
    public int iMMR_Loss; //growth per loss, + amount results in growth
    public int iPlayers_Per_Team; //Players per game's team
    public int iStarting_mmr; //starting mmr
    public int iMax_mmr; //max mmr
    public int iMin_mmr; //min mmr
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
    public static void main(String args[]){
                /* Set the Nimbus look and feel */
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        gui g = new gui();
        g.setVisible(true);
    }
    
    
}
