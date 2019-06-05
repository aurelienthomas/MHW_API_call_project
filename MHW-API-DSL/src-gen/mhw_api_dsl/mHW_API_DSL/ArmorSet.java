/**
 */
package mhw_api_dsl.mHW_API_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Armor Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getId <em>Id</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getName <em>Name</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getRank <em>Rank</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getPieces <em>Pieces</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getArmor <em>Armor</em>}</li>
 * </ul>
 *
 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getArmorSet()
 * @model
 * @generated
 */
public interface ArmorSet extends EObject
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
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getArmorSet_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getId <em>Id</em>}' attribute.
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
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getArmorSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(String)
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getArmorSet_Rank()
	 * @model
	 * @generated
	 */
	String getRank();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(String value);

	/**
	 * Returns the value of the '<em><b>Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pieces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pieces</em>' attribute.
	 * @see #setPieces(int)
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getArmorSet_Pieces()
	 * @model
	 * @generated
	 */
	int getPieces();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getPieces <em>Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pieces</em>' attribute.
	 * @see #getPieces()
	 * @generated
	 */
	void setPieces(int value);

	/**
	 * Returns the value of the '<em><b>Armor</b></em>' containment reference list.
	 * The list contents are of type {@link mhw-api-dsl.mHW_API_DSL.Armor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armor</em>' containment reference list.
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getArmorSet_Armor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Armor> getArmor();

} // ArmorSet
