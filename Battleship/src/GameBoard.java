
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexpieprzycki
 */



public class GameBoard {
    private final int width = 30;
    private final int length = 30;
    private Battleship[] ships = new Battleship[6];
    private int[][] gameBoard = new int[length][width];
    
    public GameBoard(Battleship[] ships){
        this.ships = ships;
        for(int i=0; i<ships.length;i++){
            int tempSpeed = ships[i].getSpeed();
            ships[i].setSpeed(0);
            gameBoard = ships[i].move(gameBoard);
            ships[i].setSpeed(tempSpeed);
        }
    }
    
    public void drawBoard(Graphics g){
        g.setColor(Color.BLACK);
        for(int r=0;r<length;r++){
            g.drawLine(r*30,0,1,900);
            for(int c=0;c<width;c++){
                g.drawLine(0,c*30,900,1);
                //HAVE IT DRAW RECTANGLES AT EVERY 1;
                if(gameBoard[r][c] ==1){
                    g.drawRect(r*30,c*30,30,30);
                }
            }
        }
    }
    
    
    
}
