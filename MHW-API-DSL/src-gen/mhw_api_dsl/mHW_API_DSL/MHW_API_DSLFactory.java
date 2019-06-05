/**
 */
package mhw_api_dsl.mHW_API_DSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage
 * @generated
 */
public interface MHW_API_DSLFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MHW_API_DSLFactory eINSTANCE = mhw_api_dsl.mHW_API_DSL.impl.MHW_API_DSLFactoryImpl.init();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MHW_API_DSLPackage getMHW_API_DSLPackage();

} //MHW_API_DSLFactory
