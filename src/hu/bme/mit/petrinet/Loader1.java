package hu.bme.mit.petrinet;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Loader1 {
 public PetriNet load() {
	 PetrinetPackage.eINSTANCE.eClass();
	 Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	 Map<String, Object> m = reg.getExtensionToFactoryMap();
	 m.put("petrinet", new XMIResourceFactoryImpl());
	 
	 ResourceSet resSet = new ResourceSetImpl();
	 
	 Resource resource = resSet.getResource(
			 URI.createURI("petrinet/My.petrinet"), true);
	 PetriNet petrinet = (PetriNet) resource.getContents().get(0);
	 return petrinet;
 }
}
