/**
 */
package m1ice.pdc.mhw.model.mhw;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see m1ice.pdc.mhw.model.mhw.MhwPackage
 * @generated
 */
public interface MhwFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MhwFactory eINSTANCE = m1ice.pdc.mhw.model.mhw.impl.MhwFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>Armor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armor</em>'.
	 * @generated
	 */
	Armor createArmor();

	/**
	 * Returns a new object of class '<em>Weapon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weapon</em>'.
	 * @generated
	 */
	Weapon createWeapon();

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
	 * Returns a new object of class '<em>Skill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill</em>'.
	 * @generated
	 */
	Skill createSkill();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MhwPackage getMhwPackage();

} //MhwFactory
