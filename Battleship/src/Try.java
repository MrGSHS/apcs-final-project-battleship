import java.awt.Color;
import java.awt.Graphics;
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
public class Try extends JPanel{
    
    private static JFrame frame;
    
    public static void main(String[] args) {
        Pattern rect = new Rectangle(1, 1, 6, 6);
        
        //System.out.println(rect.toString());
        Battleship battle = new Battleship(6, 7, rect, 3, 6);
        //Battleship battle2 = new Battleship()
        //System.out.println(battle.getOrientation() + "\n" + "move");
        int[][] gameBoard = new int[30][30];
        Battleship[] array = new Battleship[1];
        array[0] = battle;
        GameBoard game1 = new GameBoard(array);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.getContentPane().add(new GameView());
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
