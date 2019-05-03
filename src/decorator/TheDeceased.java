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
public class TheDeceased extends CharacterDecorator {

    public TheDeceased(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", The Deceased";
    }

    @Override
    public double getMight() {
        return character.getMight() - character.getMight() - 50;
    }
}
