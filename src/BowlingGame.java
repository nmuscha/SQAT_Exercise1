import java.util.ArrayList;
import java.util.List;

//Finish time: 16.31
//ID: 130

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	int roll = new int [10];
	int turn = 1;
	int spare = 0;
	int strike = 0;
	
	public BowlingGame(){}
	for (int i = 0; i<10; i++)
		{
			roll [i]=1;
		}
		
	// adds a frame to the game
	public void addFrame(Frame frame){
		frame = 10;
			if (firstThrow>=1; frame++;)
				else if (secondThrow>4 frame ++)
		
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		if (firstThrow == 10)
			bonus = strike;
		else if (secondThrow = 10)
			bonus = spare;	
	}
	
	// Returns the game score
	public int score(){
	
		
		//to be implemented: should return game score 
		return 0;
	}
}
