package moveset;

import ru.ifmo.se.pokemon.*;

public class MagicalLeaf extends SpecialMove {
    public MagicalLeaf() {
        super(Type.GRASS, 60, 100);
    }

    public String describe() {
        return "used Magical Leaf";
    }

    public boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
}
