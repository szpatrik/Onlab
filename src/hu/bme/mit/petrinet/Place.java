/**
 */
package hu.bme.mit.petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.petrinet.Place#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.Place#getToken <em>Token</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.Place#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.petrinet.PetrinetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.bme.mit.petrinet.PetrinetPackage#getPlace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.petrinet.Place#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @see hu.bme.mit.petrinet.PetrinetPackage#getPlace_Token()
	 * @model
	 * @generated
	 */
	int getToken();

	/**
	 * Sets the value of the '{@link hu.bme.mit.petrinet.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(int value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.petrinet.PTArc}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.petrinet.PTArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' containment reference list.
	 * @see hu.bme.mit.petrinet.PetrinetPackage#getPlace_Outgoing()
	 * @see hu.bme.mit.petrinet.PTArc#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<PTArc> getOutgoing();

} // Place
