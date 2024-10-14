import pokemon.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Battle meow = new Battle();
        meow.addAlly(new Cradily("Ally Cradily", 1));
        meow.addAlly(new Gloom("Ally Gloom",1));
        meow.addAlly(new Bellossom("Ally Belossom",1));
        meow.addFoe(new Oddish("Идиш",1));
        meow.addFoe(new Lileep("ИпиПланктон",1));
        meow.addFoe(new Guzzlord("Мистер Крабс",1));
        meow.go();
    }
}