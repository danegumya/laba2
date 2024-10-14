package moveset;

import ru.ifmo.se.pokemon.*;

public class Astonish extends PhysicalMove {
    public Astonish(){
        super(Type.GHOST,30,100);
    }

    public String describe() {
        return "used Astonish";
    }

    public void applyOppEffects(Pokemon p){
        if (Math.random()>=0.7) {
            Effect.flinch(p);
        }
    }

}