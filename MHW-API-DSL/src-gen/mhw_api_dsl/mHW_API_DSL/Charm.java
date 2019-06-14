/**
 */
package mhw_api_dsl.mHW_API_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Charm#getSkill <em>Skill</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Charm#getName <em>Name</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Charm#getId <em>Id</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Charm#getRarity <em>Rarity</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Charm#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getCharm()
 * @model
 * @generated
 */
public interface Charm extends EObject {
	/**
	 * Returns the value of the '<em><b>Skill</b></em>' reference list.
	 * The list contents are of type {@link mhw_api_dsl.mHW_API_DSL.Skill}.
	 * It is bidirectional and its opposite is '{@link mhw_api_dsl.mHW_API_DSL.Skill#getCharm <em>Charm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill</em>' reference list.
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getCharm_Skill()
	 * @see mhw_api_dsl.mHW_API_DSL.Skill#getCharm
	 * @model opposite="charm" required="true"
	 * @generated
	 */
	EList<Skill> getSkill();

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
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getCharm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Charm#getName <em>Name</em>}' attribute.
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
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getCharm_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Charm#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getCharm_Rarity()
	 * @model
	 * @generated
	 */
	int getRarity();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Charm#getRarity <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rarity</em>' attribute.
	 * @see #getRarity()
	 * @generated
	 */
	void setRarity(int value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getCharm_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Charm#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

} // Charm
