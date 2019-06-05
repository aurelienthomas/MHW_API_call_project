/**
 */
package mhw_api_dsl.mHW_API_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.Material#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.Material#getArmor <em>Armor</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.Material#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getMaterial()
 * @model
 * @generated
 */
public interface Material extends EObject
{
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getMaterial_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.Material#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Armor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armor</em>' reference.
	 * @see #setArmor(Armor)
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getMaterial_Armor()
	 * @model
	 * @generated
	 */
	Armor getArmor();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.Material#getArmor <em>Armor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armor</em>' reference.
	 * @see #getArmor()
	 * @generated
	 */
	void setArmor(Armor value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(Item)
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getMaterial_Item()
	 * @model
	 * @generated
	 */
	Item getItem();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.Material#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Item value);

} // Material
