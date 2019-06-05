/**
 */
package mhw_api_dsl.mHW_API_DSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLFactory
 * @model kind="package"
 * @generated
 */
public interface MHW_API_DSLPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mHW_API_DSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mHW_API_DSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mHW_API_DSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MHW_API_DSLPackage eINSTANCE = mhw_api_dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link mhw-api-dsl.mHW_API_DSL.impl.ArmorImpl <em>Armor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mhw-api-dsl.mHW_API_DSL.impl.ArmorImpl
	 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getArmor()
	 * @generated
	 */
	int ARMOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__SLUG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__RANK = 4;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__RARITY = 5;

	/**
	 * The feature id for the '<em><b>Image Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__IMAGE_MALE = 6;

	/**
	 * The feature id for the '<em><b>Image Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__IMAGE_FEMALE = 7;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__SLOT = 8;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__SKILL = 9;

	/**
	 * The feature id for the '<em><b>Defence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__DEFENCE = 10;

	/**
	 * The feature id for the '<em><b>Resistance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__RESISTANCE = 11;

	/**
	 * The number of structural features of the '<em>Armor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Armor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mhw-api-dsl.mHW_API_DSL.impl.ArmorSetImpl <em>Armor Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mhw-api-dsl.mHW_API_DSL.impl.ArmorSetImpl
	 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getArmorSet()
	 * @generated
	 */
	int ARMOR_SET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_SET__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_SET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_SET__RANK = 2;

	/**
	 * The feature id for the '<em><b>Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_SET__PIECES = 3;

	/**
	 * The feature id for the '<em><b>Armor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_SET__ARMOR = 4;

	/**
	 * The number of structural features of the '<em>Armor Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_SET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Armor Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mhw-api-dsl.mHW_API_DSL.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mhw-api-dsl.mHW_API_DSL.impl.SlotImpl
	 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 2;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__RANK = 0;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mhw-api-dsl.mHW_API_DSL.impl.ResistanceImpl <em>Resistance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mhw-api-dsl.mHW_API_DSL.impl.ResistanceImpl
	 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getResistance()
	 * @generated
	 */
	int RESISTANCE = 3;

	/**
	 * The feature id for the '<em><b>Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE__FIRE = 0;

	/**
	 * The feature id for the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE__WATER = 1;

	/**
	 * The feature id for the '<em><b>Ice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE__ICE = 2;

	/**
	 * The feature id for the '<em><b>Thunder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE__THUNDER = 3;

	/**
	 * The feature id for the '<em><b>Dragon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE__DRAGON = 4;

	/**
	 * The number of structural features of the '<em>Resistance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resistance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mhw-api-dsl.mHW_API_DSL.impl.SkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mhw-api-dsl.mHW_API_DSL.impl.SkillImpl
	 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getSkill()
	 * @generated
	 */
	int SKILL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__ID = 0;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__SLUG = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__SKILL = 4;

	/**
	 * The feature id for the '<em><b>Skill Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__SKILL_NAME = 5;

	/**
	 * The feature id for the '<em><b>Armor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__ARMOR = 6;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mhw-api-dsl.mHW_API_DSL.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mhw-api-dsl.mHW_API_DSL.impl.ItemImpl
	 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__RARITY = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mhw-api-dsl.mHW_API_DSL.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mhw-api-dsl.mHW_API_DSL.impl.MaterialImpl
	 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 6;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Armor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__ARMOR = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__ITEM = 2;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mhw-api-dsl.mHW_API_DSL.impl.DefenceImpl <em>Defence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mhw-api-dsl.mHW_API_DSL.impl.DefenceImpl
	 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getDefence()
	 * @generated
	 */
	int DEFENCE = 7;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENCE__BASE = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENCE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Augmented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENCE__AUGMENTED = 2;

	/**
	 * The number of structural features of the '<em>Defence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Defence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mhw-api-dsl.mHW_API_DSL.Armor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armor</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor
	 * @generated
	 */
	EClass getArmor();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Armor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getId()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Id();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Armor#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getSlug()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Slug();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Armor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getName()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Name();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Armor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getType()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Type();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Armor#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getRank()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Rank();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Armor#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getRarity()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Rarity();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Armor#getImageMale <em>Image Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Male</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getImageMale()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_ImageMale();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Armor#getImageFemale <em>Image Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Female</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getImageFemale()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_ImageFemale();

	/**
	 * Returns the meta object for the containment reference list '{@link mhw-api-dsl.mHW_API_DSL.Armor#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getSlot()
	 * @see #getArmor()
	 * @generated
	 */
	EReference getArmor_Slot();

	/**
	 * Returns the meta object for the reference list '{@link mhw-api-dsl.mHW_API_DSL.Armor#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skill</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getSkill()
	 * @see #getArmor()
	 * @generated
	 */
	EReference getArmor_Skill();

	/**
	 * Returns the meta object for the reference '{@link mhw-api-dsl.mHW_API_DSL.Armor#getDefence <em>Defence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defence</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getDefence()
	 * @see #getArmor()
	 * @generated
	 */
	EReference getArmor_Defence();

	/**
	 * Returns the meta object for the reference '{@link mhw-api-dsl.mHW_API_DSL.Armor#getResistance <em>Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resistance</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor#getResistance()
	 * @see #getArmor()
	 * @generated
	 */
	EReference getArmor_Resistance();

	/**
	 * Returns the meta object for class '{@link mhw-api-dsl.mHW_API_DSL.ArmorSet <em>Armor Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armor Set</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.ArmorSet
	 * @generated
	 */
	EClass getArmorSet();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.ArmorSet#getId()
	 * @see #getArmorSet()
	 * @generated
	 */
	EAttribute getArmorSet_Id();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.ArmorSet#getName()
	 * @see #getArmorSet()
	 * @generated
	 */
	EAttribute getArmorSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.ArmorSet#getRank()
	 * @see #getArmorSet()
	 * @generated
	 */
	EAttribute getArmorSet_Rank();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getPieces <em>Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pieces</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.ArmorSet#getPieces()
	 * @see #getArmorSet()
	 * @generated
	 */
	EAttribute getArmorSet_Pieces();

	/**
	 * Returns the meta object for the containment reference list '{@link mhw-api-dsl.mHW_API_DSL.ArmorSet#getArmor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Armor</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.ArmorSet#getArmor()
	 * @see #getArmorSet()
	 * @generated
	 */
	EReference getArmorSet_Armor();

	/**
	 * Returns the meta object for class '{@link mhw-api-dsl.mHW_API_DSL.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Slot#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Slot#getRank()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Rank();

	/**
	 * Returns the meta object for class '{@link mhw-api-dsl.mHW_API_DSL.Resistance <em>Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resistance</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Resistance
	 * @generated
	 */
	EClass getResistance();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Resistance#getFire <em>Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fire</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Resistance#getFire()
	 * @see #getResistance()
	 * @generated
	 */
	EAttribute getResistance_Fire();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Resistance#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Resistance#getWater()
	 * @see #getResistance()
	 * @generated
	 */
	EAttribute getResistance_Water();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Resistance#getIce <em>Ice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ice</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Resistance#getIce()
	 * @see #getResistance()
	 * @generated
	 */
	EAttribute getResistance_Ice();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Resistance#getThunder <em>Thunder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thunder</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Resistance#getThunder()
	 * @see #getResistance()
	 * @generated
	 */
	EAttribute getResistance_Thunder();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Resistance#getDragon <em>Dragon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dragon</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Resistance#getDragon()
	 * @see #getResistance()
	 * @generated
	 */
	EAttribute getResistance_Dragon();

	/**
	 * Returns the meta object for class '{@link mhw-api-dsl.mHW_API_DSL.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Skill
	 * @generated
	 */
	EClass getSkill();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Skill#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Skill#getId()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Id();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Skill#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Skill#getSlug()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Slug();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Skill#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Skill#getLevel()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Level();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Skill#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Skill#getDescription()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Description();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Skill#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Skill#getSkill()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Skill();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Skill#getSkillName <em>Skill Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill Name</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Skill#getSkillName()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_SkillName();

	/**
	 * Returns the meta object for the reference list '{@link mhw-api-dsl.mHW_API_DSL.Skill#getArmor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Armor</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Skill#getArmor()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Armor();

	/**
	 * Returns the meta object for class '{@link mhw-api-dsl.mHW_API_DSL.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Item#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Item#getId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Item#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Item#getDescription()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Item#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Item#getRarity()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Rarity();

	/**
	 * Returns the meta object for class '{@link mhw-api-dsl.mHW_API_DSL.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Material#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Material#getQuantity()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Quantity();

	/**
	 * Returns the meta object for the reference '{@link mhw-api-dsl.mHW_API_DSL.Material#getArmor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Armor</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Material#getArmor()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_Armor();

	/**
	 * Returns the meta object for the reference '{@link mhw-api-dsl.mHW_API_DSL.Material#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Material#getItem()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_Item();

	/**
	 * Returns the meta object for class '{@link mhw-api-dsl.mHW_API_DSL.Defence <em>Defence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defence</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Defence
	 * @generated
	 */
	EClass getDefence();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Defence#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Defence#getBase()
	 * @see #getDefence()
	 * @generated
	 */
	EAttribute getDefence_Base();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Defence#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Defence#getMax()
	 * @see #getDefence()
	 * @generated
	 */
	EAttribute getDefence_Max();

	/**
	 * Returns the meta object for the attribute '{@link mhw-api-dsl.mHW_API_DSL.Defence#getAugmented <em>Augmented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Augmented</em>'.
	 * @see mhw-api-dsl.mHW_API_DSL.Defence#getAugmented()
	 * @see #getDefence()
	 * @generated
	 */
	EAttribute getDefence_Augmented();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MHW_API_DSLFactory getMHW_API_DSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link mhw-api-dsl.mHW_API_DSL.impl.ArmorImpl <em>Armor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mhw-api-dsl.mHW_API_DSL.impl.ArmorImpl
		 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getArmor()
		 * @generated
		 */
		EClass ARMOR = eINSTANCE.getArmor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__ID = eINSTANCE.getArmor_Id();

		/**
		 * The meta object literal for the '<em><b>Slug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__SLUG = eINSTANCE.getArmor_Slug();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__NAME = eINSTANCE.getArmor_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__TYPE = eINSTANCE.getArmor_Type();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__RANK = eINSTANCE.getArmor_Rank();

		/**
		 * The meta object literal for the '<em><b>Rarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__RARITY = eINSTANCE.getArmor_Rarity();

		/**
		 * The meta object literal for the '<em><b>Image Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__IMAGE_MALE = eINSTANCE.getArmor_ImageMale();

		/**
		 * The meta object literal for the '<em><b>Image Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__IMAGE_FEMALE = eINSTANCE.getArmor_ImageFemale();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMOR__SLOT = eINSTANCE.getArmor_Slot();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMOR__SKILL = eINSTANCE.getArmor_Skill();

		/**
		 * The meta object literal for the '<em><b>Defence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMOR__DEFENCE = eINSTANCE.getArmor_Defence();

		/**
		 * The meta object literal for the '<em><b>Resistance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMOR__RESISTANCE = eINSTANCE.getArmor_Resistance();

		/**
		 * The meta object literal for the '{@link mhw-api-dsl.mHW_API_DSL.impl.ArmorSetImpl <em>Armor Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mhw-api-dsl.mHW_API_DSL.impl.ArmorSetImpl
		 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getArmorSet()
		 * @generated
		 */
		EClass ARMOR_SET = eINSTANCE.getArmorSet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR_SET__ID = eINSTANCE.getArmorSet_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR_SET__NAME = eINSTANCE.getArmorSet_Name();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR_SET__RANK = eINSTANCE.getArmorSet_Rank();

		/**
		 * The meta object literal for the '<em><b>Pieces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR_SET__PIECES = eINSTANCE.getArmorSet_Pieces();

		/**
		 * The meta object literal for the '<em><b>Armor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMOR_SET__ARMOR = eINSTANCE.getArmorSet_Armor();

		/**
		 * The meta object literal for the '{@link mhw-api-dsl.mHW_API_DSL.impl.SlotImpl <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mhw-api-dsl.mHW_API_DSL.impl.SlotImpl
		 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__RANK = eINSTANCE.getSlot_Rank();

		/**
		 * The meta object literal for the '{@link mhw-api-dsl.mHW_API_DSL.impl.ResistanceImpl <em>Resistance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mhw-api-dsl.mHW_API_DSL.impl.ResistanceImpl
		 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getResistance()
		 * @generated
		 */
		EClass RESISTANCE = eINSTANCE.getResistance();

		/**
		 * The meta object literal for the '<em><b>Fire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESISTANCE__FIRE = eINSTANCE.getResistance_Fire();

		/**
		 * The meta object literal for the '<em><b>Water</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESISTANCE__WATER = eINSTANCE.getResistance_Water();

		/**
		 * The meta object literal for the '<em><b>Ice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESISTANCE__ICE = eINSTANCE.getResistance_Ice();

		/**
		 * The meta object literal for the '<em><b>Thunder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESISTANCE__THUNDER = eINSTANCE.getResistance_Thunder();

		/**
		 * The meta object literal for the '<em><b>Dragon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESISTANCE__DRAGON = eINSTANCE.getResistance_Dragon();

		/**
		 * The meta object literal for the '{@link mhw-api-dsl.mHW_API_DSL.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mhw-api-dsl.mHW_API_DSL.impl.SkillImpl
		 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getSkill()
		 * @generated
		 */
		EClass SKILL = eINSTANCE.getSkill();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__ID = eINSTANCE.getSkill_Id();

		/**
		 * The meta object literal for the '<em><b>Slug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__SLUG = eINSTANCE.getSkill_Slug();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__LEVEL = eINSTANCE.getSkill_Level();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__DESCRIPTION = eINSTANCE.getSkill_Description();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__SKILL = eINSTANCE.getSkill_Skill();

		/**
		 * The meta object literal for the '<em><b>Skill Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__SKILL_NAME = eINSTANCE.getSkill_SkillName();

		/**
		 * The meta object literal for the '<em><b>Armor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__ARMOR = eINSTANCE.getSkill_Armor();

		/**
		 * The meta object literal for the '{@link mhw-api-dsl.mHW_API_DSL.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mhw-api-dsl.mHW_API_DSL.impl.ItemImpl
		 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ID = eINSTANCE.getItem_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__DESCRIPTION = eINSTANCE.getItem_Description();

		/**
		 * The meta object literal for the '<em><b>Rarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__RARITY = eINSTANCE.getItem_Rarity();

		/**
		 * The meta object literal for the '{@link mhw-api-dsl.mHW_API_DSL.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mhw-api-dsl.mHW_API_DSL.impl.MaterialImpl
		 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getMaterial()
		 * @generated
		 */
		EClass MATERIAL = eINSTANCE.getMaterial();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__QUANTITY = eINSTANCE.getMaterial_Quantity();

		/**
		 * The meta object literal for the '<em><b>Armor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL__ARMOR = eINSTANCE.getMaterial_Armor();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL__ITEM = eINSTANCE.getMaterial_Item();

		/**
		 * The meta object literal for the '{@link mhw-api-dsl.mHW_API_DSL.impl.DefenceImpl <em>Defence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mhw-api-dsl.mHW_API_DSL.impl.DefenceImpl
		 * @see mhw-api-dsl.mHW_API_DSL.impl.MHW_API_DSLPackageImpl#getDefence()
		 * @generated
		 */
		EClass DEFENCE = eINSTANCE.getDefence();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFENCE__BASE = eINSTANCE.getDefence_Base();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFENCE__MAX = eINSTANCE.getDefence_Max();

		/**
		 * The meta object literal for the '<em><b>Augmented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFENCE__AUGMENTED = eINSTANCE.getDefence_Augmented();

	}

} //MHW_API_DSLPackage
