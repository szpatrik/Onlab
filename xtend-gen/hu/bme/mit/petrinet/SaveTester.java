package hu.bme.mit.petrinet;

import hu.bme.mit.petrinet.PTArc;
import hu.bme.mit.petrinet.PetriNet;
import hu.bme.mit.petrinet.PetrinetFactory;
import hu.bme.mit.petrinet.Place;
import hu.bme.mit.petrinet.TPArc;
import hu.bme.mit.petrinet.Transition;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class SaveTester {
  public static void main(final String[] args) {
    PetrinetFactory factory = PetrinetFactory.eINSTANCE;
    PetriNet petriNet = factory.createPetriNet();
    Place place1 = factory.createPlace();
    place1.setName("start");
    place1.setToken(1);
    Place place2 = factory.createPlace();
    place2.setName("finish");
    Transition transition = factory.createTransition();
    transition.setName("transition");
    PTArc fromStart = factory.createPTArc();
    TPArc toFinish = factory.createTPArc();
    fromStart.setSource(place1);
    fromStart.setTarget(transition);
    toFinish.setSource(transition);
    toFinish.setTarget(place2);
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    m.put("petrinet", _xMIResourceFactoryImpl);
    ResourceSetImpl resSet = new ResourceSetImpl();
    URI _createURI = URI.createURI("petrinet/My.petrinet");
    Resource resource = resSet.createResource(_createURI);
    EList<EObject> _contents = resource.getContents();
    _contents.add(petriNet);
    try {
      resource.save(Collections.EMPTY_MAP);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
