package pokemon;

import moveset.*;
import ru.ifmo.se.pokemon.*;

public class Cradily extends Lileep {
    public Cradily(String name, int level) {
        super(name, level);
        this.setStats(86.0, 81.0, 97.0, 81.0, 107.0, 43.0);
        this.addMove(new StoneEdge());
    }

    public Cradily() {
        this("Unnamed", 1);
    }
}