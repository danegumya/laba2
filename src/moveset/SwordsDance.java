package moveset;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SwordsDance extends StatusMove {
    public SwordsDance(){
        super(Type.NORMAL,0,100);
    }

    public String describe() {
        return "used Swords Dance";
    }

    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK,2);
    }

}
