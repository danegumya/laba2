package pokemon;

import moveset.*;
import ru.ifmo.se.pokemon.*;

public class Gloom extends Oddish {
    public Gloom(String name, int level) {
        super(name, level);
        this.setStats(60.0, 65.0, 70.0, 85.0, 75.0, 40.0);
        this.addMove(new PoisonPowder());
    }
    public Gloom() {
        this("Unnamed", 1);
    }
}