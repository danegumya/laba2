package pokemon;

import moveset.*;
import ru.ifmo.se.pokemon.*;

public class Guzzlord extends Pokemon {
    public Guzzlord(String name, int level) {
        super(name, level);
        this.setType(new Type[]{Type.NORMAL});
        this.setStats(223.0, 101.0, 53.0, 97.0, 53.0, 43.0);
        this.setMove(new Move[]{new SwordsDance(), new XScissor(), new Swagger(), new DoubleTeam()});
    }

    public Guzzlord() {
        this("Unnamed", 1);
    }
}
