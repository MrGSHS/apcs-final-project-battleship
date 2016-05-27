
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author maorgozalzani
 * Used to make the AI randomized selection
 */
public class ComputerPlayer {

    private ArrayList<Battleship> comList = new ArrayList<>();
    private GameBoard userBoard, comBoard;
    private final int NUMBER_OF_SHIPS = 6;
    private final int MAX_SIZE = 7;
    private final int MAX_SPEED = 4;
    

    public ComputerPlayer(GameBoard userBoard) {
        comBoard = makeRandom();
        //comBoard = new GameBoard(comList);
        userBoard = this.userBoard;
    }
    
    public ArrayList<Battleship> getList(){
        return comList;
    }

    public void findRandom() {
        int [][] uBoard=userBoard.getBoard();
        int row = (int) (Math.random() * userBoard.getLength() + 1);
        int col = (int) (Math.random() * userBoard.getWidth() + 1);
        if(uBoard[row][col]==1){
            uBoard[row][col]=2;
            //ADD AI FOCUS AFTER HIT?   
        }
        else if(uBoard[row][col]==2){
            findRandom();
        }
        

    }

    public GameBoard makeRandom() {
        for (int i = 0; i < NUMBER_OF_SHIPS; i++) {
            int size = (int) (Math.random() * MAX_SIZE + 2);
            int speed = (int) (Math.random() * MAX_SPEED + 1);
            int row = (int) (Math.random() * comBoard.getLength() + 1);
            int col = (int) (Math.random() * comBoard.getWidth() + 1);

        }

        return comBoard;
    }

}
