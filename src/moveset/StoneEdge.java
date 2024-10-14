package moveset;

import ru.ifmo.se.pokemon.*;


public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK,100,80);
    }
    public String describe(){
        return "used Stone Edge";
    }

    public double calcCriticalHit(Pokemon att, Pokemon def) {
        if (att.getStat(Stat.SPEED) / 170.66 > Math.random()) {
            System.out.println("Критический удар!");
            return 2.0;
        } else {
            return 1.0;
        }
    }
}
