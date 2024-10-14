package pokemon;

import moveset.*;
import ru.ifmo.se.pokemon.*;

public class Oddish extends Pokemon {
    public Oddish(String name, int level) {
        super(name, level);
        this.setType(new Type[]{Type.POISON, Type.GRASS});
        this.setStats(45.0, 50.0, 55.0, 75.0, 65.0, 30.0);
        this.setMove(new Move[]{new Venoshock(), new Confide()});
    }

   public Oddish() {
        this("Unnamed", 1);
    }
}
