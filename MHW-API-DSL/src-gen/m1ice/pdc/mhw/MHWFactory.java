/**
 */
package m1ice.pdc.mhw;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see m1ice.pdc.mhw.MHWPackage
 * @generated
 */
public interface MHWFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MHWFactory eINSTANCE = m1ice.pdc.mhw.impl.MHWFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Armor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armor</em>'.
	 * @generated
	 */
	Armor createArmor();

	/**
	 * Returns a new object of class '<em>Armor Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armor Set</em>'.
	 * @generated
	 */
	ArmorSet createArmorSet();

	/**
	 * Returns a new object of class '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot</em>'.
	 * @generated
	 */
	Slot createSlot();

	/**
	 * Returns a new object of class '<em>Resistance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resistance</em>'.
	 * @generated
	 */
	Resistance createResistance();

	/**
	 * Returns a new object of class '<em>Skill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill</em>'.
	 * @generated
	 */
	Skill createSkill();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material</em>'.
	 * @generated
	 */
	Material createMaterial();

	/**
	 * Returns a new object of class '<em>Defence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defence</em>'.
	 * @generated
	 */
	Defence createDefence();

	/**
	 * Returns a new object of class '<em>Charm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charm</em>'.
	 * @generated
	 */
	Charm createCharm();

	/**
	 * Returns a new object of class '<em>Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decoration</em>'.
	 * @generated
	 */
	Decoration createDecoration();

	/**
	 * Returns a new object of class '<em>Weapon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weapon</em>'.
	 * @generated
	 */
	Weapon createWeapon();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MHWPackage getMHWPackage();

} //MHWFactory