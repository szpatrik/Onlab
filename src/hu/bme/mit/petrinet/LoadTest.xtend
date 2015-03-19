package hu.bme.mit.petrinet;
//import hu.bme.mit.petrinet.*

public class LoadTest {
 def static void main(String[] args){
	var loader = new Loader()
	var petrinet = loader.load()
	
	System.out.println(petrinet.getPlaces())
	System.out.println(petrinet.getTransitions())
	
}
}