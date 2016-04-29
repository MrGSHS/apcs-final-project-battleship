/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author apieprz6
 */
public class Battleship {
    private int size;
    private int speed;
    private Pattern pattern;
    private int row;
    private int col;
    private int[] conditionOfShip;
    /**
     * @param args the command line arguments
     */
    public Battleship(int size, int speed, Pattern pattern, int row, int col){
        this.size = size;
        this.speed = speed;
        this.pattern = pattern;
        this.row = row;
        this.col = col;
        conditionOfShip = new int[size];
    }
    
    int[][] move(int[][] gameBoard){
        
    }
    
}
