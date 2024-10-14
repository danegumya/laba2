package moveset;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class RockPolish extends StatusMove {
    public RockPolish(){
        super(Type.ROCK,0,100);
    }

    public String describe() {
        return "used Rock Polish";
    }

    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED,2);
    }

}
