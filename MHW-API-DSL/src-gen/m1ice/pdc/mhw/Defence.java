/**
 */
package m1ice.pdc.mhw;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m1ice.pdc.mhw.Defence#getBase <em>Base</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.Defence#getMax <em>Max</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.Defence#getAugmented <em>Augmented</em>}</li>
 * </ul>
 *
 * @see m1ice.pdc.mhw.MHWPackage#getDefence()
 * @model
 * @generated
 */
public interface Defence extends EObject {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(int)
	 * @see m1ice.pdc.mhw.MHWPackage#getDefence_Base()
	 * @model
	 * @generated
	 */
	int getBase();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.Defence#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see m1ice.pdc.mhw.MHWPackage#getDefence_Max()
	 * @model
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.Defence#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Augmented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Augmented</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Augmented</em>' attribute.
	 * @see #setAugmented(int)
	 * @see m1ice.pdc.mhw.MHWPackage#getDefence_Augmented()
	 * @model
	 * @generated
	 */
	int getAugmented();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.Defence#getAugmented <em>Augmented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Augmented</em>' attribute.
	 * @see #getAugmented()
	 * @generated
	 */
	void setAugmented(int value);

} // Defence
