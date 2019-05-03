package decorator;

/**
 *
 * @author bitstudent
 */
public class Shield extends CharacterDecorator {

    public Shield(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Shield-Wearer";
    }

    @Override
    public double getMight() {
        return character.getMight() + 25;
    }
}
