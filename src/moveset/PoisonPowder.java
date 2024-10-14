package moveset;

import ru.ifmo.se.pokemon.*;

public class PoisonPowder extends StatusMove {
    public PoisonPowder(){
        super(Type.POISON,0,75);
    }

    public String describe() {
        return "used Poison Powder";
    }

    public void applyOppEffects(Pokemon p){
        Effect.poison(p);
    }

}
