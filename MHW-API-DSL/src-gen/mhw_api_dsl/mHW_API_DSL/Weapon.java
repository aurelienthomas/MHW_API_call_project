/**
 */
package mhw_api_dsl.mHW_API_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weapon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Weapon#getSlot <em>Slot</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Weapon#getSkill <em>Skill</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Weapon#getName <em>Name</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Weapon#getId <em>Id</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Weapon#getType <em>Type</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Weapon#getRarity <em>Rarity</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Weapon#getAttack <em>Attack</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Weapon#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getWeapon()
 * @model
 * @generated
 */
public interface Weapon extends EObject {
	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link mhw_api_dsl.mHW_API_DSL.Slot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getWeapon_Slot()
	 * @model containment="true"
	 * @generated
	 */
	EList<Slot> getSlot();

	/**
	 * Returns the value of the '<em><b>Skill</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mhw_api_dsl.mHW_API_DSL.Skill#getWeapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill</em>' reference.
	 * @see #setSkill(Skill)
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getWeapon_Skill()
	 * @see mhw_api_dsl.mHW_API_DSL.Skill#getWeapon
	 * @model opposite="weapon"
	 * @generated
	 */
	Skill getSkill();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Weapon#getSkill <em>Skill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' reference.
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(Skill value);

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
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getWeapon_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Weapon#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getWeapon_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Weapon#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getWeapon_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Weapon#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getWeapon_Rarity()
	 * @model
	 * @generated
	 */
	int getRarity();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Weapon#getRarity <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rarity</em>' attribute.
	 * @see #getRarity()
	 * @generated
	 */
	void setRarity(int value);

	/**
	 * Returns the value of the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack</em>' attribute.
	 * @see #setAttack(String)
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getWeapon_Attack()
	 * @model
	 * @generated
	 */
	String getAttack();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Weapon#getAttack <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack</em>' attribute.
	 * @see #getAttack()
	 * @generated
	 */
	void setAttack(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mhw_api_dsl.mHW_API_DSL.Element#getWeapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(Element)
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getWeapon_Element()
	 * @see mhw_api_dsl.mHW_API_DSL.Element#getWeapon
	 * @model opposite="weapon"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Weapon#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

} // Weapon
