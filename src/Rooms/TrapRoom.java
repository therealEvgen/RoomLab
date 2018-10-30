package Rooms;

import Game.Runner;
import People.Person;

public class TrapRoom extends Room
{

	public TrapRoom(int x, int y) {
        super(x, y);

    }

        /**
         * Triggers the game's losing conditions.
         * @param x the Person entering
         */
        @Override
        public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have taken the wrong step and ended up in the trap room. The floor underneath you turns into lava and you slowly start sinking.");
        Runner.gameOff();
    }

 }

