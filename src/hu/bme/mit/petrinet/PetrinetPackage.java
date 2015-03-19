/**
 */
package hu.bme.mit.petrinet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.petrinet.PetrinetFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petrinet/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetPackage eINSTANCE = hu.bme.mit.petrinet.impl.PetrinetPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.impl.PetriNetImpl
	 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 0;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TRANSITIONS = 1;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.impl.TransitionImpl
	 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTGOING = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.impl.PlaceImpl
	 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUTGOING = 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.impl.ArcImpl
	 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__WEIGHT = 0;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.impl.PTArcImpl <em>PT Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.impl.PTArcImpl
	 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getPTArc()
	 * @generated
	 */
	int PT_ARC = 3;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC__WEIGHT = ARC__WEIGHT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC__TARGET = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC__SOURCE = ARC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PT Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PT Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.impl.TPArcImpl <em>TP Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.impl.TPArcImpl
	 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getTPArc()
	 * @generated
	 */
	int TP_ARC = 4;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_ARC__WEIGHT = ARC__WEIGHT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_ARC__TARGET = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_ARC__SOURCE = ARC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TP Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TP Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_ARC_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see hu.bme.mit.petrinet.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.petrinet.PetriNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see hu.bme.mit.petrinet.PetriNet#getPlaces()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.petrinet.PetriNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see hu.bme.mit.petrinet.PetriNet#getTransitions()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Transitions();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see hu.bme.mit.petrinet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.petrinet.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.petrinet.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.petrinet.Transition#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing</em>'.
	 * @see hu.bme.mit.petrinet.Transition#getOutgoing()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Outgoing();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see hu.bme.mit.petrinet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.petrinet.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.petrinet.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.petrinet.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see hu.bme.mit.petrinet.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.petrinet.Place#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing</em>'.
	 * @see hu.bme.mit.petrinet.Place#getOutgoing()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Outgoing();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.PTArc <em>PT Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PT Arc</em>'.
	 * @see hu.bme.mit.petrinet.PTArc
	 * @generated
	 */
	EClass getPTArc();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.petrinet.PTArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.petrinet.PTArc#getTarget()
	 * @see #getPTArc()
	 * @generated
	 */
	EReference getPTArc_Target();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.petrinet.PTArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see hu.bme.mit.petrinet.PTArc#getSource()
	 * @see #getPTArc()
	 * @generated
	 */
	EReference getPTArc_Source();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.TPArc <em>TP Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TP Arc</em>'.
	 * @see hu.bme.mit.petrinet.TPArc
	 * @generated
	 */
	EClass getTPArc();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.petrinet.TPArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.petrinet.TPArc#getTarget()
	 * @see #getTPArc()
	 * @generated
	 */
	EReference getTPArc_Target();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.petrinet.TPArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see hu.bme.mit.petrinet.TPArc#getSource()
	 * @see #getTPArc()
	 * @generated
	 */
	EReference getTPArc_Source();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see hu.bme.mit.petrinet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.petrinet.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see hu.bme.mit.petrinet.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Weight();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetFactory getPetrinetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.impl.PetriNetImpl
		 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__PLACES = eINSTANCE.getPetriNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__TRANSITIONS = eINSTANCE.getPetriNet_Transitions();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.impl.TransitionImpl
		 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTGOING = eINSTANCE.getTransition_Outgoing();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.impl.PlaceImpl
		 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__OUTGOING = eINSTANCE.getPlace_Outgoing();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.impl.PTArcImpl <em>PT Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.impl.PTArcImpl
		 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getPTArc()
		 * @generated
		 */
		EClass PT_ARC = eINSTANCE.getPTArc();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PT_ARC__TARGET = eINSTANCE.getPTArc_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PT_ARC__SOURCE = eINSTANCE.getPTArc_Source();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.impl.TPArcImpl <em>TP Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.impl.TPArcImpl
		 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getTPArc()
		 * @generated
		 */
		EClass TP_ARC = eINSTANCE.getTPArc();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TP_ARC__TARGET = eINSTANCE.getTPArc_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TP_ARC__SOURCE = eINSTANCE.getTPArc_Source();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.impl.ArcImpl
		 * @see hu.bme.mit.petrinet.impl.PetrinetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

	}

} //PetrinetPackage
