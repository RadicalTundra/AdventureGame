package decorator;

/**
 *
 * @author TGrady
 */
public class God extends CharacterDecorator {

    public God(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", The God";
    }

    @Override
    public double getMight() {
        return character.getMight() - character.getMight() + 9001;
    }
}
