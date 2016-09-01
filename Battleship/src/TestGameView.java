import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maorgozalzani
 */




public class TestGameView extends JPanel{
    
    private static JFrame frame;
    

    public static void main(String[] args) {
       Pattern rect = new Rectangle(1, 1, 6, 6);
       Pattern rect2 = new Rectangle(1,15, 6, 6);
       Pattern rect3 = new Rectangle(10,10,15,15);
//        //System.out.println(rect.toString());
        Battleship battle1 = new Battleship(6, 2, rect, 1, 1);
        Battleship battle2 = new Battleship(3,3,rect2,1,15);
        Battleship battle3 = new Battleship(11,1,rect3,10,10);
        
        int[] conditionBattle3 = new int[11];
        for(int i=0; i<conditionBattle3.length; i++){
            if(i==4){
                conditionBattle3[i] = 1;
            }
            else{
                conditionBattle3[i] = 0;
            }
            System.out.print(conditionBattle3[i] + " ");
        }
        System.out.println();
        
        battle3.setConditionOfShip(conditionBattle3);
//        //System.out.println(battle.getOrientation() + "\n" + "move");
//        int[][] gameBoard = new int[30][30];
        ArrayList<Battleship> array = new ArrayList<Battleship>();
        array.add(battle1);
        array.add(battle2);
        array.add(battle3);
//        array[0] = battle;
//        GameBoard game1 = new GameBoard(array);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.getContentPane().add(new GameView(array));
        frame.pack();
        frame.setVisible(true);
//        game1.drawBoard(g);
//        battle.move(gameBoard);
//        // System.out.print(gameBoard);
//        for (int r = 0; r < 30; r++) {
//            for (int c = 0; c < 30; c++) {
//                System.out.print(gameBoard[r][c] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        System.out.println();
//
//        battle.move(gameBoard);
//        // System.out.print(gameBoard);
//        for (int m = 0; m < 30; m++) {
//            for (int n = 0; n < 30; n++) {
//                System.out.print(gameBoard[m][n] + " ");
//            }
//            System.out.println();
//        }
//
   }
}
