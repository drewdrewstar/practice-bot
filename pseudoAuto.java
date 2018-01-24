//pseudo code for planning autonomous
//insert basic robotDrive junk
//start

String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
int startingPos

//Switch Determination
//Manually input the startingPos somehow??? idk if thats even possible

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
