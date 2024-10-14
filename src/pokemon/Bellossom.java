package pokemon;

import moveset.*;
import ru.ifmo.se.pokemon.*;

public class Bellossom extends Gloom {
    public Bellossom(String name, int level) {
        super(name, level);
        this.setType(new Type[]{Type.GRASS});
        this.setStats(75.0, 80.0, 95.0, 90.0, 100.0, 50.0);
        this.addMove(new MagicalLeaf());
    }
    public Bellossom() {
        this("Unnamed", 1);
    }
}