/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apieprz6
 * abstract class used to "host" all types of patterns
 */
public abstract class Pattern {
    public Pattern(){}
    public abstract void getNewPosition(Battleship battleship);
    public abstract int getLength();
    public abstract int getWidth();
    public abstract int getStartR();
    public abstract int getStartC();
    public abstract void updateOrientation(Battleship battleship);
    public abstract int[][] getPatternOnBoard();

}
