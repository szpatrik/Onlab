package hu.bme.mit.petrinet;

public class LoadTest1 {
 public static void main(String[] args) {
	Loader1 loader = new Loader1();
	PetriNet petrinet = loader.load();
	
	System.out.println(petrinet.getPlaces());
	System.out.println(petrinet.getTransitions());
	
	
}
}
