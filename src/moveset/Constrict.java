package moveset;

import ru.ifmo.se.pokemon.*;

public class Constrict extends PhysicalMove {
    public Constrict(){
        super(Type.NORMAL,10,100);
    }

    public String describe() {
        return "used Constrict";
    }

    public void applyOppEffects(Pokemon p){
        if (Math.random()>=0.9) {
            p.setMod(Stat.SPEED, -1);
        }
    }

}