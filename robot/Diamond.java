package robot;
import kareltherobot.*;


public class Diamond implements Directions{

    public static void main(String[] args) {

        World.setVisible(true);// allows us to see the run output
        // the bigger the street, the farther north
        World.setSize(20,20);


        // The line below creates a Robot that we will refer to as rob
        // Find out what the numbers and direction do!
        // Put rob in a better location for your initials.
        Robot rob = new Robot(15,2,South,30);

        // Want a second robot?  No prob.  They are cheap :)
        //Robot dude = new Robot(7,5,West,9);
        // examples of commands you can invoke on a Robot
        // Draw the vertical line of R
    for (int i = 0; i < 5; i++) {
        rob.putBeeper();
        rob.move();
    }

    // Draw the top horizontal line of R
    rob.turnLeft(); // face East
    for (int i = 0; i < 3; i++) {
        rob.putBeeper();
        rob.move();
    }

    // Draw the vertical part of the curve
    rob.turnLeft(); // face North
    rob.move();
    rob.putBeeper();

    // Draw the diagonal leg of R using simple repeated moves
    rob.turnLeft(); // face West
    rob.move();
    rob.putBeeper();

    rob.turnLeft(); // face South
    rob.move();
    rob.putBeeper();

    rob.turnLeft(); // face East
    rob.move();
    rob.putBeeper();

    rob.turnLeft(); // face North
    rob.move();
    rob.putBeeper();

    // Optional: finish or move to next letter
    rob.turnLeft();
}
} 