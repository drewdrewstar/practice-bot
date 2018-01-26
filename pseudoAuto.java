//pseudo code for planning autonomous
//insert basic robotDrive junk
//start

String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
int startingPos

//Switch Determination
//Manually input the startingPos somehow??? idk if thats even possible

//Send an option for the starting position to the smart dashboard, in practice, this should be done in disabledPeriodic(), the value will start off as one
SmartDashboard.putNumber("Starting Pos", 1);

// Get the selection from the smart dashboard, if no selection is found, return 1
startingPos = (int)SmartDashboard.getNumber("Starting Pos", 1);


// Make sure that the starting position is valid to avoid errors
// This is not a very good way of doing it, i am just trying to demonstrate how you would get user input
if(startingPos > 3){
	startingPos = 3;
}else if(startingPos < 0){
	startingPos = 0;
}



if (gameData.getAt(0) == 'L'){
  switch (startingPos){
    case 1:
      //code to drive to switch from this position
      break;
    
    case 2:
      //code to drive to switch from this position
      break;
    
    case 3:
      //code to drive to switch from this position
      break;
    }
}
  else {                                            //If the switch position is not L, the else gives the directions for position R  
    switch startingPos() {                          //switch to determine distance needed to drive to the switch
      case 1:
        //code to drive to switch from this position
        break;
      
      case 2:
        //code to drive to switch from this position
      break;
      
      case 3:
        //code to drive to switch from this position
      break;
      }
  }
