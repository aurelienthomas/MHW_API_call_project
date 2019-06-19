/**
 */
package m1ice.pdc.mhw;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m1ice.pdc.mhw.Slot#getRank <em>Rank</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.Slot#getDecoration <em>Decoration</em>}</li>
 * </ul>
 *
 * @see m1ice.pdc.mhw.MHWPackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends EObject {
	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see m1ice.pdc.mhw.MHWPackage#getSlot_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.Slot#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>Decoration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link m1ice.pdc.mhw.Decoration#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration</em>' reference.
	 * @see #setDecoration(Decoration)
	 * @see m1ice.pdc.mhw.MHWPackage#getSlot_Decoration()
	 * @see m1ice.pdc.mhw.Decoration#getSlot
	 * @model opposite="slot"
	 * @generated
	 */
	Decoration getDecoration();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.Slot#getDecoration <em>Decoration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoration</em>' reference.
	 * @see #getDecoration()
	 * @generated
	 */
	void setDecoration(Decoration value);

} // Slot
