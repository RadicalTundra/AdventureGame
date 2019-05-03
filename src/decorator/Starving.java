package decorator;

/**
 *
 * @author bitstudent
 */
public class Starving extends CharacterDecorator {

    public Starving(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Hunger-Master";
    }

    @Override
    public double getMight() {
        return character.getMight() - 20;
    }
}
