package moveset;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class XScissor extends PhysicalMove {
    public XScissor(){
        super(Type.BUG,80,100);
    }
    public String describe(){
        return "used X-Scissor";
    }

    public boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }


}
