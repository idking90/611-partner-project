// This class must have the code in the run() method, sub-program/routain to slove the maze;
//   seraches for the Java logo based on the provided path/direction algorithm

public class Direction extends Thread{

	Maze maze;
	Position location;
	Boolean legalMove;
	Boolean mazeDone;
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
		
		
		
//************ this is where Part II code mostly begins (aside from a few variables)***************		
		maxRows = maze.getHeight();
		maxColumns = maze.getWidth();
		
		//master loop, when maze.isDone() returns true, should skip the loop
		while (!maze.isDone()) {
			currCol = maze.getCurrCol();
			currRow = maze.getCurrRow();
			if (currCol == 0 | (currCol % 2) == 0) { //even row
				while (currCol < (maxColumns - 1)) { //keep moving until hits far right column
					if(!maze.moveRight()) {//obstacle in way, must go down-right-right-up
						maze.moveDown();
						mazeDone = maze.isDone();
						if(mazeDone) {break;}
						maze.moveRight();
						mazeDone = maze.isDone();
						if(mazeDone) {break;}
						maze.moveRight();
						mazeDone = maze.isDone();
						if(mazeDone) {break;}
						maze.moveUp();
						mazeDone = maze.isDone();
						if(mazeDone) {break;}
				}
				else {
					legalMove = true;
					mazeDone = maze.isDone();
					location.textArea.append("Legal move? " + legalMove + "\n" + "Maze Done?" + mazeDone + "\n");
					currCol = maze.getCurrCol();
					if(mazeDone) {break;}
				}
			}
			
			if(maze.isDone()) {break;}
			}
			else { //odd row
				while (currCol > 0) { //keep moving until hits far left column
					if(!maze.moveLeft()) {//obstacle in way, must go up-left-left-down
							maze.moveUp();
							mazeDone = maze.isDone();
							if(mazeDone) {break;}
							maze.moveLeft();
							mazeDone = maze.isDone();
							if(mazeDone) {break;}
							maze.moveLeft();
							mazeDone = maze.isDone();
							if(mazeDone) {break;}
							maze.moveDown();
							mazeDone = maze.isDone();
							if(mazeDone) {break;}
					}
					else {
						legalMove = true;
						mazeDone = maze.isDone();
						location.textArea.append("Legal move? " + legalMove + "\n" + "Maze Done?" + mazeDone + "\n");
						currCol = maze.getCurrCol();
						if(mazeDone) {break;}
					}
				}
				if(maze.isDone()) {break;}	
			}
			
			if (currRow < (maxRows -1)) { //not at bottom of the maze
				legalMove = maze.moveDown();
				mazeDone = maze.isDone();
				location.textArea.append("Legal move? " + legalMove + "\n" + "Maze Done?" + mazeDone + "\n");
				currRow = maze.getCurrRow();
				mazeDone = maze.isDone();
				if(mazeDone) {break;}
				}
				else { location.textArea.append("Maze completion unsuccessful \n");
				//reached bottom of maze and didn't find logo
				}
		
		
		
		// this bracket ends the big While loop
		}
		
		
		if (maze.isDone()) {
			location.textArea.append("Logo Found! YOU DID IT!!!!!!!!! \n");
		}
		else {
			location.textArea.append("Maze completion unsuccessful \n");
		}
		
		
		
		
		
		
		
	}
}
	

