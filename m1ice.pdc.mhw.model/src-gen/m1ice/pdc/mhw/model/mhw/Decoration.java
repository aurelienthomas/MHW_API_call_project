/**
 */
package m1ice.pdc.mhw.model.mhw;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.Decoration#getId <em>Id</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.Decoration#getName <em>Name</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.Decoration#getRarity <em>Rarity</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.Decoration#getRank <em>Rank</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.Decoration#getSkill <em>Skill</em>}</li>
 * </ul>
 *
 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getDecoration()
 * @model
 * @generated
 */
public interface Decoration extends EObject {
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
	 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getDecoration_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.model.mhw.Decoration#getId <em>Id</em>}' attribute.
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
	 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getDecoration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.model.mhw.Decoration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rarity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rarity</em>' attribute.
	 * @see #setRarity(String)
	 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getDecoration_Rarity()
	 * @model
	 * @generated
	 */
	String getRarity();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.model.mhw.Decoration#getRarity <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rarity</em>' attribute.
	 * @see #getRarity()
	 * @generated
	 */
	void setRarity(String value);

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
	 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getDecoration_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.model.mhw.Decoration#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>Skill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill</em>' containment reference.
	 * @see #setSkill(Skill)
	 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getDecoration_Skill()
	 * @model containment="true"
	 * @generated
	 */
	Skill getSkill();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.model.mhw.Decoration#getSkill <em>Skill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' containment reference.
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(Skill value);

} // Decoration
