
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

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
    private ArrayList<Battleship> ships = new ArrayList<>();
    private int[][] gameBoard = new int[length][width];
    
    public GameBoard(ArrayList<Battleship> ships){
        this.ships = ships;
        for(int i=0; i<ships.size();i++){
            int tempSpeed = ships.get(i).getSpeed();
            ships.get(i).setSpeed(0);
            System.out.println("Speed: " + ships.get(i).getSpeed() + " Row: " + ships.get(i).getRow() + " Col: " + ships.get(i).getCol());
            gameBoard = ships.get(i).move(gameBoard);
            ships.get(i).setSpeed(tempSpeed);
        }
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getLength(){
        return length;
    }
    
    public int[][] getBoard(){
        return gameBoard;
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
