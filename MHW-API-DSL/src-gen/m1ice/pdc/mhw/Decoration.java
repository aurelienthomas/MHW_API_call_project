/**
 */
package m1ice.pdc.mhw;

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
 *   <li>{@link m1ice.pdc.mhw.Decoration#getId <em>Id</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.Decoration#getName <em>Name</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.Decoration#getRarity <em>Rarity</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.Decoration#getSkill <em>Skill</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.Decoration#getSlot <em>Slot</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.Decoration#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @see m1ice.pdc.mhw.MHWPackage#getDecoration()
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
	 * @see m1ice.pdc.mhw.MHWPackage#getDecoration_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.Decoration#getId <em>Id</em>}' attribute.
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
	 * @see m1ice.pdc.mhw.MHWPackage#getDecoration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.Decoration#getName <em>Name</em>}' attribute.
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
	 * @see #setRarity(int)
	 * @see m1ice.pdc.mhw.MHWPackage#getDecoration_Rarity()
	 * @model
	 * @generated
	 */
	int getRarity();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.Decoration#getRarity <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rarity</em>' attribute.
	 * @see #getRarity()
	 * @generated
	 */
	void setRarity(int value);

	/**
	 * Returns the value of the '<em><b>Skill</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link m1ice.pdc.mhw.Skill#getDecoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill</em>' reference.
	 * @see #setSkill(Skill)
	 * @see m1ice.pdc.mhw.MHWPackage#getDecoration_Skill()
	 * @see m1ice.pdc.mhw.Skill#getDecoration
	 * @model opposite="decoration" required="true"
	 * @generated
	 */
	Skill getSkill();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.Decoration#getSkill <em>Skill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' reference.
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(Skill value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link m1ice.pdc.mhw.Slot#getDecoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' reference.
	 * @see #setSlot(Slot)
	 * @see m1ice.pdc.mhw.MHWPackage#getDecoration_Slot()
	 * @see m1ice.pdc.mhw.Slot#getDecoration
	 * @model opposite="decoration"
	 * @generated
	 */
	Slot getSlot();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.Decoration#getSlot <em>Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(Slot value);

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
	 * @see m1ice.pdc.mhw.MHWPackage#getDecoration_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.Decoration#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

} // Decoration
