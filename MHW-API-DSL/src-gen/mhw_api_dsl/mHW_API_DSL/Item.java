/**
 */
package mhw_api_dsl.mHW_API_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.Item#getId <em>Id</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.Item#getName <em>Name</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.Item#getDescription <em>Description</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.Item#getRarity <em>Rarity</em>}</li>
 * </ul>
 *
 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject
{
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getItem_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.Item#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getItem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.Item#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getItem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.Item#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rarity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rarity</em>' attribute.
	 * @see #setRarity(int)
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getItem_Rarity()
	 * @model
	 * @generated
	 */
	int getRarity();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.Item#getRarity <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rarity</em>' attribute.
	 * @see #getRarity()
	 * @generated
	 */
	void setRarity(int value);

} // Item
