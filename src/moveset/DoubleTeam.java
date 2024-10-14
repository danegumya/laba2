package moveset;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL,0,100);
    }

    public String describe() {
        return "used Double Team";
    }

    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION,1);
    }

}
