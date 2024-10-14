package moveset;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    public String describe() {
        return "used Swagger";
    }

    public boolean checkAccuracy(Pokemon att, Pokemon def) {
        return 85 * att.getStat(Stat.ACCURACY) / def.getStat(Stat.EVASION) > Math.random();
    }

    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
}
