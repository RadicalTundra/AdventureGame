/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author TGrady
 */
public class TastySnack extends CharacterDecorator {

    public TastySnack(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", The tasty snack";
    }

    @Override
    public double getMight() {
        return character.getMight() - character.getMight() - 80;
    }
    
}
