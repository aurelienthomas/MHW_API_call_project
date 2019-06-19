/**
 */
package m1ice.pdc.mhw;

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
 * @see m1ice.pdc.mhw.MHWFactory
 * @model kind="package"
 * @generated
 */
public interface MHWPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mhw";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mhw";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mhw";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MHWPackage eINSTANCE = m1ice.pdc.mhw.impl.MHWPackageImpl.init();

	/**
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.ArmorImpl <em>Armor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.ArmorImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getArmor()
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
	 * The feature id for the '<em><b>Defence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__DEFENCE = 9;

	/**
	 * The feature id for the '<em><b>Resistance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__RESISTANCE = 10;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__SKILL = 11;

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
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.ArmorSetImpl <em>Armor Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.ArmorSetImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getArmorSet()
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
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.SlotImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getSlot()
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
	 * The feature id for the '<em><b>Decoration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DECORATION = 1;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.ResistanceImpl <em>Resistance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.ResistanceImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getResistance()
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
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.SkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.SkillImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getSkill()
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
	 * The feature id for the '<em><b>Charm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__CHARM = 6;

	/**
	 * The feature id for the '<em><b>Decoration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DECORATION = 7;

	/**
	 * The feature id for the '<em><b>Weapon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__WEAPON = 8;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.ItemImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getItem()
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
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.MaterialImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getMaterial()
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
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.DefenceImpl <em>Defence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.DefenceImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getDefence()
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
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.CharmImpl <em>Charm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.CharmImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getCharm()
	 * @generated
	 */
	int CHARM = 8;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM__SKILL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM__ID = 2;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM__RARITY = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM__LEVEL = 4;

	/**
	 * The number of structural features of the '<em>Charm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Charm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.DecorationImpl <em>Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.DecorationImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getDecoration()
	 * @generated
	 */
	int DECORATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__RARITY = 2;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__SKILL = 3;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__SLOT = 4;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__RANK = 5;

	/**
	 * The number of structural features of the '<em>Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.WeaponImpl <em>Weapon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.WeaponImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getWeapon()
	 * @generated
	 */
	int WEAPON = 10;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__SLOT = 0;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__SKILL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__NAME = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__ID = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__RARITY = 5;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__ATTACK = 6;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>Weapon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Weapon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.ElementImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Weapon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__WEAPON = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m1ice.pdc.mhw.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.impl.RequestImpl
	 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 12;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Armor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ARMOR = 1;

	/**
	 * The feature id for the '<em><b>Weapon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__WEAPON = 2;

	/**
	 * The feature id for the '<em><b>Decoration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DECORATION = 3;

	/**
	 * The feature id for the '<em><b>Charm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__CHARM = 4;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Armor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armor</em>'.
	 * @see m1ice.pdc.mhw.Armor
	 * @generated
	 */
	EClass getArmor();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Armor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.Armor#getId()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Armor#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see m1ice.pdc.mhw.Armor#getSlug()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Slug();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Armor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.Armor#getName()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Name();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Armor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see m1ice.pdc.mhw.Armor#getType()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Type();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Armor#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see m1ice.pdc.mhw.Armor#getRank()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Rank();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Armor#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see m1ice.pdc.mhw.Armor#getRarity()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Rarity();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Armor#getImageMale <em>Image Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Male</em>'.
	 * @see m1ice.pdc.mhw.Armor#getImageMale()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_ImageMale();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Armor#getImageFemale <em>Image Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Female</em>'.
	 * @see m1ice.pdc.mhw.Armor#getImageFemale()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_ImageFemale();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.Armor#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see m1ice.pdc.mhw.Armor#getSlot()
	 * @see #getArmor()
	 * @generated
	 */
	EReference getArmor_Slot();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Armor#getDefence <em>Defence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defence</em>'.
	 * @see m1ice.pdc.mhw.Armor#getDefence()
	 * @see #getArmor()
	 * @generated
	 */
	EReference getArmor_Defence();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Armor#getResistance <em>Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resistance</em>'.
	 * @see m1ice.pdc.mhw.Armor#getResistance()
	 * @see #getArmor()
	 * @generated
	 */
	EReference getArmor_Resistance();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.Armor#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skill</em>'.
	 * @see m1ice.pdc.mhw.Armor#getSkill()
	 * @see #getArmor()
	 * @generated
	 */
	EReference getArmor_Skill();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.ArmorSet <em>Armor Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armor Set</em>'.
	 * @see m1ice.pdc.mhw.ArmorSet
	 * @generated
	 */
	EClass getArmorSet();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.ArmorSet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.ArmorSet#getId()
	 * @see #getArmorSet()
	 * @generated
	 */
	EAttribute getArmorSet_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.ArmorSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.ArmorSet#getName()
	 * @see #getArmorSet()
	 * @generated
	 */
	EAttribute getArmorSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.ArmorSet#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see m1ice.pdc.mhw.ArmorSet#getRank()
	 * @see #getArmorSet()
	 * @generated
	 */
	EAttribute getArmorSet_Rank();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.ArmorSet#getPieces <em>Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pieces</em>'.
	 * @see m1ice.pdc.mhw.ArmorSet#getPieces()
	 * @see #getArmorSet()
	 * @generated
	 */
	EAttribute getArmorSet_Pieces();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.ArmorSet#getArmor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Armor</em>'.
	 * @see m1ice.pdc.mhw.ArmorSet#getArmor()
	 * @see #getArmorSet()
	 * @generated
	 */
	EReference getArmorSet_Armor();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see m1ice.pdc.mhw.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Slot#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see m1ice.pdc.mhw.Slot#getRank()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Rank();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Slot#getDecoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decoration</em>'.
	 * @see m1ice.pdc.mhw.Slot#getDecoration()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Decoration();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Resistance <em>Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resistance</em>'.
	 * @see m1ice.pdc.mhw.Resistance
	 * @generated
	 */
	EClass getResistance();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Resistance#getFire <em>Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fire</em>'.
	 * @see m1ice.pdc.mhw.Resistance#getFire()
	 * @see #getResistance()
	 * @generated
	 */
	EAttribute getResistance_Fire();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Resistance#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water</em>'.
	 * @see m1ice.pdc.mhw.Resistance#getWater()
	 * @see #getResistance()
	 * @generated
	 */
	EAttribute getResistance_Water();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Resistance#getIce <em>Ice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ice</em>'.
	 * @see m1ice.pdc.mhw.Resistance#getIce()
	 * @see #getResistance()
	 * @generated
	 */
	EAttribute getResistance_Ice();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Resistance#getThunder <em>Thunder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thunder</em>'.
	 * @see m1ice.pdc.mhw.Resistance#getThunder()
	 * @see #getResistance()
	 * @generated
	 */
	EAttribute getResistance_Thunder();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Resistance#getDragon <em>Dragon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dragon</em>'.
	 * @see m1ice.pdc.mhw.Resistance#getDragon()
	 * @see #getResistance()
	 * @generated
	 */
	EAttribute getResistance_Dragon();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see m1ice.pdc.mhw.Skill
	 * @generated
	 */
	EClass getSkill();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Skill#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.Skill#getId()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Skill#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see m1ice.pdc.mhw.Skill#getSlug()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Slug();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Skill#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see m1ice.pdc.mhw.Skill#getLevel()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Level();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Skill#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see m1ice.pdc.mhw.Skill#getDescription()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Description();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Skill#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill</em>'.
	 * @see m1ice.pdc.mhw.Skill#getSkill()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Skill();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Skill#getSkillName <em>Skill Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill Name</em>'.
	 * @see m1ice.pdc.mhw.Skill#getSkillName()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_SkillName();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Skill#getCharm <em>Charm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Charm</em>'.
	 * @see m1ice.pdc.mhw.Skill#getCharm()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Charm();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Skill#getDecoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decoration</em>'.
	 * @see m1ice.pdc.mhw.Skill#getDecoration()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Decoration();

	/**
	 * Returns the meta object for the reference list '{@link m1ice.pdc.mhw.Skill#getWeapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Weapon</em>'.
	 * @see m1ice.pdc.mhw.Skill#getWeapon()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Weapon();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see m1ice.pdc.mhw.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Item#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.Item#getId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Item#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see m1ice.pdc.mhw.Item#getDescription()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Item#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see m1ice.pdc.mhw.Item#getRarity()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Rarity();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see m1ice.pdc.mhw.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Material#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see m1ice.pdc.mhw.Material#getQuantity()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Quantity();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Material#getArmor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Armor</em>'.
	 * @see m1ice.pdc.mhw.Material#getArmor()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_Armor();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Material#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see m1ice.pdc.mhw.Material#getItem()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_Item();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Defence <em>Defence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defence</em>'.
	 * @see m1ice.pdc.mhw.Defence
	 * @generated
	 */
	EClass getDefence();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Defence#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see m1ice.pdc.mhw.Defence#getBase()
	 * @see #getDefence()
	 * @generated
	 */
	EAttribute getDefence_Base();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Defence#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see m1ice.pdc.mhw.Defence#getMax()
	 * @see #getDefence()
	 * @generated
	 */
	EAttribute getDefence_Max();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Defence#getAugmented <em>Augmented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Augmented</em>'.
	 * @see m1ice.pdc.mhw.Defence#getAugmented()
	 * @see #getDefence()
	 * @generated
	 */
	EAttribute getDefence_Augmented();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Charm <em>Charm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charm</em>'.
	 * @see m1ice.pdc.mhw.Charm
	 * @generated
	 */
	EClass getCharm();

	/**
	 * Returns the meta object for the reference list '{@link m1ice.pdc.mhw.Charm#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skill</em>'.
	 * @see m1ice.pdc.mhw.Charm#getSkill()
	 * @see #getCharm()
	 * @generated
	 */
	EReference getCharm_Skill();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Charm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.Charm#getName()
	 * @see #getCharm()
	 * @generated
	 */
	EAttribute getCharm_Name();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Charm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.Charm#getId()
	 * @see #getCharm()
	 * @generated
	 */
	EAttribute getCharm_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Charm#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see m1ice.pdc.mhw.Charm#getRarity()
	 * @see #getCharm()
	 * @generated
	 */
	EAttribute getCharm_Rarity();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Charm#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see m1ice.pdc.mhw.Charm#getLevel()
	 * @see #getCharm()
	 * @generated
	 */
	EAttribute getCharm_Level();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Decoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decoration</em>'.
	 * @see m1ice.pdc.mhw.Decoration
	 * @generated
	 */
	EClass getDecoration();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Decoration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.Decoration#getId()
	 * @see #getDecoration()
	 * @generated
	 */
	EAttribute getDecoration_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Decoration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.Decoration#getName()
	 * @see #getDecoration()
	 * @generated
	 */
	EAttribute getDecoration_Name();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Decoration#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see m1ice.pdc.mhw.Decoration#getRarity()
	 * @see #getDecoration()
	 * @generated
	 */
	EAttribute getDecoration_Rarity();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Decoration#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill</em>'.
	 * @see m1ice.pdc.mhw.Decoration#getSkill()
	 * @see #getDecoration()
	 * @generated
	 */
	EReference getDecoration_Skill();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Decoration#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slot</em>'.
	 * @see m1ice.pdc.mhw.Decoration#getSlot()
	 * @see #getDecoration()
	 * @generated
	 */
	EReference getDecoration_Slot();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Decoration#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see m1ice.pdc.mhw.Decoration#getRank()
	 * @see #getDecoration()
	 * @generated
	 */
	EAttribute getDecoration_Rank();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Weapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weapon</em>'.
	 * @see m1ice.pdc.mhw.Weapon
	 * @generated
	 */
	EClass getWeapon();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.Weapon#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see m1ice.pdc.mhw.Weapon#getSlot()
	 * @see #getWeapon()
	 * @generated
	 */
	EReference getWeapon_Slot();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Weapon#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill</em>'.
	 * @see m1ice.pdc.mhw.Weapon#getSkill()
	 * @see #getWeapon()
	 * @generated
	 */
	EReference getWeapon_Skill();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Weapon#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.Weapon#getName()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Name();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Weapon#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.Weapon#getId()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Weapon#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see m1ice.pdc.mhw.Weapon#getType()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Type();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Weapon#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see m1ice.pdc.mhw.Weapon#getRarity()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Rarity();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Weapon#getAttack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack</em>'.
	 * @see m1ice.pdc.mhw.Weapon#getAttack()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Attack();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Weapon#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see m1ice.pdc.mhw.Weapon#getElement()
	 * @see #getWeapon()
	 * @generated
	 */
	EReference getWeapon_Element();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see m1ice.pdc.mhw.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Element#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see m1ice.pdc.mhw.Element#getValue()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Value();

	/**
	 * Returns the meta object for the reference '{@link m1ice.pdc.mhw.Element#getWeapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Weapon</em>'.
	 * @see m1ice.pdc.mhw.Element#getWeapon()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Weapon();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see m1ice.pdc.mhw.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.Request#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see m1ice.pdc.mhw.Request#getRequest()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Request();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.Request#getArmor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Armor</em>'.
	 * @see m1ice.pdc.mhw.Request#getArmor()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Armor();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.Request#getWeapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weapon</em>'.
	 * @see m1ice.pdc.mhw.Request#getWeapon()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Weapon();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.Request#getDecoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decoration</em>'.
	 * @see m1ice.pdc.mhw.Request#getDecoration()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Decoration();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.Request#getCharm <em>Charm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Charm</em>'.
	 * @see m1ice.pdc.mhw.Request#getCharm()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Charm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MHWFactory getMHWFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.ArmorImpl <em>Armor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.ArmorImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getArmor()
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
		 * The meta object literal for the '<em><b>Skill</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMOR__SKILL = eINSTANCE.getArmor_Skill();

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.ArmorSetImpl <em>Armor Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.ArmorSetImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getArmorSet()
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
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.SlotImpl <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.SlotImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getSlot()
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
		 * The meta object literal for the '<em><b>Decoration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__DECORATION = eINSTANCE.getSlot_Decoration();

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.ResistanceImpl <em>Resistance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.ResistanceImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getResistance()
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
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.SkillImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getSkill()
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
		 * The meta object literal for the '<em><b>Charm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__CHARM = eINSTANCE.getSkill_Charm();

		/**
		 * The meta object literal for the '<em><b>Decoration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__DECORATION = eINSTANCE.getSkill_Decoration();

		/**
		 * The meta object literal for the '<em><b>Weapon</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__WEAPON = eINSTANCE.getSkill_Weapon();

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.ItemImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getItem()
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
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.MaterialImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getMaterial()
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
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.DefenceImpl <em>Defence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.DefenceImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getDefence()
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

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.CharmImpl <em>Charm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.CharmImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getCharm()
		 * @generated
		 */
		EClass CHARM = eINSTANCE.getCharm();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARM__SKILL = eINSTANCE.getCharm_Skill();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARM__NAME = eINSTANCE.getCharm_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARM__ID = eINSTANCE.getCharm_Id();

		/**
		 * The meta object literal for the '<em><b>Rarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARM__RARITY = eINSTANCE.getCharm_Rarity();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARM__LEVEL = eINSTANCE.getCharm_Level();

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.DecorationImpl <em>Decoration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.DecorationImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getDecoration()
		 * @generated
		 */
		EClass DECORATION = eINSTANCE.getDecoration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATION__ID = eINSTANCE.getDecoration_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATION__NAME = eINSTANCE.getDecoration_Name();

		/**
		 * The meta object literal for the '<em><b>Rarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATION__RARITY = eINSTANCE.getDecoration_Rarity();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATION__SKILL = eINSTANCE.getDecoration_Skill();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATION__SLOT = eINSTANCE.getDecoration_Slot();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATION__RANK = eINSTANCE.getDecoration_Rank();

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.WeaponImpl <em>Weapon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.WeaponImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getWeapon()
		 * @generated
		 */
		EClass WEAPON = eINSTANCE.getWeapon();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAPON__SLOT = eINSTANCE.getWeapon_Slot();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAPON__SKILL = eINSTANCE.getWeapon_Skill();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__NAME = eINSTANCE.getWeapon_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__ID = eINSTANCE.getWeapon_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__TYPE = eINSTANCE.getWeapon_Type();

		/**
		 * The meta object literal for the '<em><b>Rarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__RARITY = eINSTANCE.getWeapon_Rarity();

		/**
		 * The meta object literal for the '<em><b>Attack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__ATTACK = eINSTANCE.getWeapon_Attack();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAPON__ELEMENT = eINSTANCE.getWeapon_Element();

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.ElementImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VALUE = eINSTANCE.getElement_Value();

		/**
		 * The meta object literal for the '<em><b>Weapon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__WEAPON = eINSTANCE.getElement_Weapon();

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.impl.RequestImpl
		 * @see m1ice.pdc.mhw.impl.MHWPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__REQUEST = eINSTANCE.getRequest_Request();

		/**
		 * The meta object literal for the '<em><b>Armor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__ARMOR = eINSTANCE.getRequest_Armor();

		/**
		 * The meta object literal for the '<em><b>Weapon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__WEAPON = eINSTANCE.getRequest_Weapon();

		/**
		 * The meta object literal for the '<em><b>Decoration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__DECORATION = eINSTANCE.getRequest_Decoration();

		/**
		 * The meta object literal for the '<em><b>Charm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__CHARM = eINSTANCE.getRequest_Charm();

	}

} //MHWPackage
