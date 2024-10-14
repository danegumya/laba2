package moveset;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL,0,100);
    }

    public String describe() {
        return "used Confide";
    }

    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK,1);
    }

}
