package hu.bme.mit.petrinet

import java.io.IOException
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class SaveTester {
	
	
	def static void main(String[] args) {
		var factory = PetrinetFactory.eINSTANCE

		var petriNet = factory.createPetriNet()
		var place1 = factory.createPlace()
		place1.setName("start")
		place1.setToken(1)
		var place2 = factory.createPlace()
		place2.setName("finish")
		var transition = factory.createTransition()
		transition.setName("transition")
		var fromStart = factory.createPTArc()
		var toFinish = factory.createTPArc()
		fromStart.setSource(place1)
		fromStart.setTarget(transition)
		toFinish.setSource(transition)
		toFinish.setTarget(place2)

		var reg = Resource.Factory.Registry.INSTANCE
		var m = reg.getExtensionToFactoryMap() // itt azt is tudja, hogy ez egy Map<String, Object>?
		m.put("petrinet", new XMIResourceFactoryImpl())

		var resSet = new ResourceSetImpl()
		var resource = resSet.createResource(URI
				.createURI("petrinet/My.petrinet"))

		resource.getContents().add(petriNet)

		try {
			resource.save(Collections.EMPTY_MAP)
		} catch (IOException e) {
			e.printStackTrace()
		}
	}
}