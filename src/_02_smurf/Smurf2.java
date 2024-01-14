package _02_smurf;

public class Smurf2 {
public static void main(String[] args) {
	Smurf Smurf3 = new Smurf("handySmurf");
	Smurf3.eat();
	System.out.println(Smurf3.getName());
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Smurfette.getName());
	Smurfette.isGirlOrBoy();
	Smurfette.getHatColor();
	Smurf papaSmurf = new Smurf("papaSmurf");
	System.out.println(papaSmurf.getName());
	papaSmurf.isGirlOrBoy();
	papaSmurf.getHatColor();
			
}
}
