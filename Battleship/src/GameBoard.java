
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
    private final int boardSpacing = 20;
    private Battleship[] ships = new Battleship[6];
    private int[][] gameBoard = new int[length][width];
    
    public GameBoard(Battleship[] ships){
        this.ships = ships;
        for(int i=0; i<ships.length;i++){
            int tempSpeed = ships[i].getSpeed();
            ships[i].setSpeed(0);
            System.out.println("Speed " + ships[i].getSpeed() + " Row: " + ships[i].getRow() + " Col: " + ships[i].getCol());
            gameBoard = ships[i].move(gameBoard);
            ships[i].setSpeed(tempSpeed);
        }
    }
    
    public void drawBoard(Graphics g){
        g.setColor(Color.BLACK);
        for(int r=0;r<length;r++){
            g.drawLine(r*boardSpacing,0,r*boardSpacing,600);
            for(int c=0;c<width;c++){
                g.drawLine(0,c*boardSpacing,600,c*boardSpacing);
                //HAVE IT DRAW RECTANGLES AT EVERY 1;
                System.out.print(gameBoard[r][c] + " ");
                if(gameBoard[r][c] ==1){
                    g.fillRect(c*boardSpacing, r*boardSpacing,boardSpacing,boardSpacing);
                }
            }                
            System.out.println();
        }
    }
    
    
    
}
