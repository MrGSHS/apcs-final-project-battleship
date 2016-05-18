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
        for(int r=0;r<length;r++){
            for(int c=0;c<width;c++){
                //HAVE IT DRAW RECTANGLES AT EVERY 1;
            }
        }
    }
    
    
    
}
