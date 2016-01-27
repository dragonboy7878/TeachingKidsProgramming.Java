package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    //    Do the following 8 times --#9.1
    for (int i = 0; i < 8; i++)
    {
      //         Ask the user for a guess --#1
      MessageBox.askForNumericalInput("Make a guess.");
      //         If the guess is correct --#4
      int guess = NumberUtils.getRandomInt(1, 100);
      if (guess == i)
      {
        //               Play a bell --#2
        //               Tell the user that they won the game  --#3
        MessageBox.showMessage("You won the game!");
        //               and exit --#10
      }
      //         Otherwise, if the guess is too high --#6
      //               Tell the end user that it is too high --#5
      MessageBox.showMessage("Your guess is too high.");
      //         Otherwise, if the guess is too low --#8
      //               Tell the end user that it is too low --#7
      MessageBox.showMessage("Your guess is too low.");
      //    Repeat --#9.2
    }
    //    After 8 incorrect guesses tell the user they've lost --#11
  }
}
