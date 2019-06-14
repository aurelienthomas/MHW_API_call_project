/**
 */
package mhw_api_dsl.mHW_API_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Element#getName <em>Name</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Element#getValue <em>Value</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Element#getWeapon <em>Weapon</em>}</li>
 * </ul>
 *
 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
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
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getElement_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Element#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Weapon</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mhw_api_dsl.mHW_API_DSL.Weapon#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weapon</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weapon</em>' reference.
	 * @see #setWeapon(Weapon)
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getElement_Weapon()
	 * @see mhw_api_dsl.mHW_API_DSL.Weapon#getElement
	 * @model opposite="element"
	 * @generated
	 */
	Weapon getWeapon();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Element#getWeapon <em>Weapon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weapon</em>' reference.
	 * @see #getWeapon()
	 * @generated
	 */
	void setWeapon(Weapon value);

} // Element
