package moveset;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock() {
        super(Type.POISON, 65, 100);
    }

    public String describe() {
        return "used Venoshock";
    }

    protected void applyOppDamage(Pokemon var1, double var2) {
         Status z=var1.getCondition();
         if (z==Status.POISON) {
             var1.setMod(Stat.HP, (int) Math.round(var2)*2);
         }
         else{
             var1.setMod(Stat.HP, (int) Math.round(var2));
         }
    }
}
