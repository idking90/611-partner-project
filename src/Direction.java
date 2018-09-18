// This class must have the code in the run() method, sub-program/routain to slove the maze;
//   seraches for the Java logo based on the provided path/direction algorithm

public class Direction extends Thread{

	Maze maze;
	Position location;
	/*Boolean outcome;
	Boolean mazeDone;*/
	int maxRows;
	int maxColumns;
	int currRow;
	int currCol;
	
	
	Direction(Maze maze, Position location) {
		
		this.maze = maze;
		this.location = location;
	}
	
	// this is the code part that needs to be programmed by students to solve the maze 
	// using the provided path/direction algorithm
	public void run(){
				
		// this is a SAMPLE code of moving the student image in the maze,
		// and updates the information in Position.jav GUI class, append text into the JTextArea object
		// you should delete this code and start your solution, you may just keep the part of updating the information
		// in the Position.java class, appending information into the JTextArea object
		
		/*while(!maze.isDone()) {
		
			mazeDone = maze.isDone();
			location.textArea.append("Is the maze done?" + mazeDone + "\n");
		for (int i = 1; i <9; i ++) {
			outcome = this.maze.moveRight();
			if (outcome) {
			location.textArea.append("Sucess " + "\n");
			location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
			}
			else {location.textArea.append("Failure " + "\n");
				break;}
			}
		for (int i=1; i<4; i++) {
			outcome = this.maze.moveDown();
			if (outcome) {location.textArea.append("Sucess " + "\n");	
			location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
}
			else {location.textArea.append("Failure " + "\n");
				break;
			}
					}
		mazeDone = maze.isDone();
		location.textArea.append("Is the maze done?" + mazeDone + "\n");
		outcome = this.maze.moveLeft();
		if (outcome) {location.textArea.append("Sucess " + "\n");
		location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
		}
		else {location.textArea.append("Failure " + "\n");
			break;}
	
		mazeDone = maze.isDone();
		location.textArea.append("Is the maze done?" + mazeDone + "\n");
			
	}
		if (mazeDone) {
		location.textArea.append("Logo Found \n");}*/
		
		maxRows = maze.getHeight();
		maxColumns = maze.getWidth();
		
		
		
		
		
		
		
	}
}
	

