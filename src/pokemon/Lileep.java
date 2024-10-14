package pokemon;

import moveset.*;
import ru.ifmo.se.pokemon.*;

public class Lileep extends Pokemon {
    public Lileep(String name, int level) {
        super(name, level);
        this.setType(new Type[]{Type.ROCK, Type.GRASS});
        this.setStats(66.0, 41.0, 77.0, 61.0, 87.0, 23.0);
        this.setMove(new Move[]{new Constrict(), new Astonish(), new RockPolish()});
    }

    public Lileep() {
        this("Unnamed", 1);
    }
}