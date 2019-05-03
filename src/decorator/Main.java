package decorator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean canStarve = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello? Hey! Oh! You've woken up! You've been out for quite some time, adventeruer. Can you still talk? How about a name: ");
        String userName = sc.nextLine();
        Character basicCharacter = new BasicCharacter(userName);
        System.out.println("\n" + userName + ". Wow, such a beautiful name! Well, you're free to stay for a bit if you'd like, otherwise you can go back to your adventure!");
        
        System.out.println("\nWould you like to:");
        System.out.println("1. Stay for a little. The food smells good!");
        System.out.println("2. Get back on your journey!");
        try{
        int userChoice = sc.nextInt();
            if(userChoice == 1){
                System.out.println("\nYou stay for dinner and have a delicous stew. Just the thing you needed after your weeks of slumber! With your belly full you're ready to take on the outside world!");
                canStarve = false;
            }
            System.out.println("\nYou stumble out the door, trying to remeber how to use your legs again. After a quick strech you notice a small encampment on the right and a cave down the road. Which do you go to?");
            System.out.println("1. Small encampment");
            System.out.println("2. Cave");
            userChoice = sc.nextInt();
            if(userChoice == 1)
            {
                System.out.println("\nYou wonder over to the small emcampment with three huts sourrounding the ashes of a bonfire.");
                System.out.println("Embers still glow below blackened logs, but the huts are absent of their owners. You peer insie the largest hut to find a spear still leaning against a wall!");
                basicCharacter = new Spear(basicCharacter);
                System.out.println("You've now become " + basicCharacter.getName() + "!");
                System.out.println("Your Might: " + basicCharacter.getMight());
                System.out.println("You feel prepared with your new found spear friend, so you make your way to the cave.");
            }
            System.out.println("\nThe cave is damp and poorly lit. You feel a chill run down your spine as a sharp crack and some pitter patter of the unknown bounces off the stone walls.");
            System.out.println("Finally, after carefully making your way through the cave for a few minutes, you find a fork with two paths.");
            System.out.println("The path of the right is well lit with old wooden beams and seems to have miners equipment scattered about. A warmth radiates from the enterence but the smell of fresh blood strikes your nose as a warning.");
            System.out.println("The path to the left is pitch black and narrow. The sound of running water and a chilled air float up from below.");
            System.out.println("Which path do you take?");
            System.out.println("1. The Right Path");
            System.out.println("2. The Left Path");
            userChoice = sc.nextInt();
            if(userChoice == 1)
            {
                System.out.println("\nAs you make your way down the corridor you find a banged up iron shield and sword on a skeleton. You decide the skeleton shouldn't have too much of a use for those anymore.");
                basicCharacter = new Sword(new Shield(basicCharacter));
                System.out.println("Congrats! You've become " + basicCharacter.getName() + "!");
                System.out.println("Your Might: " + basicCharacter.getMight());
                if(canStarve == true){

                    System.out.println("\nA sharp pain of hunger suddenly hits you. You've lost some Might!");    
                    basicCharacter = new Starving(basicCharacter);
                    System.out.println("You've become " + basicCharacter.getName() + "!");
                    System.out.println("Your Might: " + basicCharacter.getMight());
                    System.out.println("\nThe end of the corridor expands into a vast chamber with a glowing gemstones and bright blue flames. The deafening sound of clanging pickaxes comes from the end of the expance.");
                    System.out.println("When you step inside the room and you get assulted by two undead Goblins. You strike the first one down with a quick jab but don't have enough energy to block the other goblin's axe.");
                    basicCharacter = new TheDeceased(basicCharacter);
                    System.out.println("You've now become " + basicCharacter.getName() + "!");
                    System.out.println("Your Might: " + basicCharacter.getMight());
                }
                else
                {
                    System.out.println("\nThe end of the corridor expands into a vast chamber with a glowing gemstones and bright blue flames. The deafening sound of clanging pickaxes comes from the end of the expance.");
                    System.out.println("When you step inside the room and you get assulted by two undead Goblins. You strike the first one down with a powerful jab block the other's axe with ease.");
                    System.out.println("With a swift lunge you push the axe back into the other Goblin's head, killing it instantly.");
                    System.out.println("You make your way to the middle of the room where a engraved wooden staff seems to be preserved as no soot clings to it.");
                    System.out.println("When you pick up the staff a surge of electricity flows through your body. Your mind feels enlightened to a once unknown power.");
                    System.out.println("Congratulations! You've won!");
                    basicCharacter = new God(basicCharacter);
                    System.out.println("You've become " + basicCharacter.getName() + "!");
                    System.out.println("Your Might: " + basicCharacter.getMight());

                }
            }
            else
            {
                System.out.println("\nYou crawl into the tight space and suddenly fall into a wild river flowing through the cavern.");
                System.out.println("A log sticks out of a opening downriver and you swing yourself into it, breaking your arm. You crawl up the log to find a beautiful mermaid swimming in a small pool of water.");
                System.out.println("The mermaid doesn't move her lips but you can hear her speak.");
                System.out.println("\"Hello young adventurer, I once fell down into this cavern the same as you. If you come into this body of water I can heal your arm.\"");
                System.out.println("Entranced by the young beauty you walk into her shallow pool. She smiles at you showing her jagged rows of teeth. The last thing you see is her unhinging her jaw.");
                System.out.println("Congratulations! You've become fish food!");
                basicCharacter = new TheDeceased(new TastySnack(basicCharacter));
                System.out.println("You've become " + basicCharacter.getName() + "!");
                System.out.println("Your Might: " + basicCharacter.getMight());
            }
        }catch(Exception e){
            System.out.println("Hey you scrub, you need to enter a number!");
        }
    }
}
