package hu.bme.mit.petrinet;

class Loader {
 PetriNet load() {
	 PetrinetPackage.eINSTANCE.eClass()
	 var reg = Resource.Factory.Registry.INSTANCE
	 var m = reg.getExtensionToFactoryMap()
	 m.put("petrinet", new XMIResourceFactoryImpl())
	 
	 var resSet = new ResourceSetImpl()
	 
	 var resource = resSet.getResource(
			 URI.createURI("petrinet/My.petrinet"), true)
	 var petrinet = (PetriNet) resource.getContents().get(0)
	 
 }
}