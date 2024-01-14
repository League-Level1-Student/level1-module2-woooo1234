package _01_sea_creature;

public class Creatures1 {
public static void main(String[] args) {
	SeaCreature seaCreature2 = new SeaCreature("Spongebob");
	System.out.println(seaCreature2.getName());
	seaCreature2.laugh();
	seaCreature2.eat();
	SeaCreature seaCreature1 = new SeaCreature("Patrick");
	System.out.println(seaCreature1.getName());
	seaCreature1.laugh();
	seaCreature1.eat();
	SeaCreature seaCreature0 = new SeaCreature("Squidward");
	System.out.println(seaCreature0.getName());
	seaCreature0.laugh();
	seaCreature1.eat();
}
}
