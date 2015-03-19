/**
 */
package hu.bme.mit.petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.petrinet.PTArc#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.PTArc#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.petrinet.PetrinetPackage#getPTArc()
 * @model
 * @generated
 */
public interface PTArc extends Arc {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Transition)
	 * @see hu.bme.mit.petrinet.PetrinetPackage#getPTArc_Target()
	 * @model required="true"
	 * @generated
	 */
	Transition getTarget();

	/**
	 * Sets the value of the '{@link hu.bme.mit.petrinet.PTArc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Transition value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.petrinet.Place#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Place)
	 * @see hu.bme.mit.petrinet.PetrinetPackage#getPTArc_Source()
	 * @see hu.bme.mit.petrinet.Place#getOutgoing
	 * @model opposite="outgoing" required="true" transient="false"
	 * @generated
	 */
	Place getSource();

	/**
	 * Sets the value of the '{@link hu.bme.mit.petrinet.PTArc#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Place value);

} // PTArc
