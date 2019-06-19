/**
 */
package m1ice.pdc.mhw.model.mhw;

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
 * @see m1ice.pdc.mhw.model.mhw.MhwFactory
 * @model kind="package"
 * @generated
 */
public interface MhwPackage extends EPackage {
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
	String eNS_URI = "http://www.m1ice.pdc.mhw.org/mhw";

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
	MhwPackage eINSTANCE = m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl.init();

	/**
	 * The meta object id for the '{@link m1ice.pdc.mhw.model.mhw.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.model.mhw.impl.RequestImpl
	 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Decoration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DECORATION = 1;

	/**
	 * The feature id for the '<em><b>Charm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__CHARM = 2;

	/**
	 * The feature id for the '<em><b>Armor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ARMOR = 3;

	/**
	 * The feature id for the '<em><b>Weapon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__WEAPON = 4;

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
	 * The meta object id for the '{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl <em>Armor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.model.mhw.impl.ArmorImpl
	 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getArmor()
	 * @generated
	 */
	int ARMOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__SLUG = 2;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__RANK = 3;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__RARITY = 4;

	/**
	 * The feature id for the '<em><b>Image Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__IMAGE_MALE = 5;

	/**
	 * The feature id for the '<em><b>Image Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__IMAGE_FEMALE = 6;

	/**
	 * The feature id for the '<em><b>Defense Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__DEFENSE_BASE = 7;

	/**
	 * The feature id for the '<em><b>Defense Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__DEFENSE_MAX = 8;

	/**
	 * The feature id for the '<em><b>Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__FIRE = 9;

	/**
	 * The feature id for the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__WATER = 10;

	/**
	 * The feature id for the '<em><b>Ice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__ICE = 11;

	/**
	 * The feature id for the '<em><b>Thunder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__THUNDER = 12;

	/**
	 * The feature id for the '<em><b>Dragon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__DRAGON = 13;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__SKILL = 14;

	/**
	 * The number of structural features of the '<em>Armor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Armor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl <em>Weapon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.model.mhw.impl.WeaponImpl
	 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getWeapon()
	 * @generated
	 */
	int WEAPON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__RARITY = 3;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__ATTACK = 4;

	/**
	 * The feature id for the '<em><b>Thunder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__THUNDER = 5;

	/**
	 * The feature id for the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__WATER = 6;

	/**
	 * The feature id for the '<em><b>Dragon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__DRAGON = 7;

	/**
	 * The feature id for the '<em><b>Ice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__ICE = 8;

	/**
	 * The feature id for the '<em><b>Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__FIRE = 9;

	/**
	 * The number of structural features of the '<em>Weapon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Weapon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m1ice.pdc.mhw.model.mhw.impl.CharmImpl <em>Charm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.model.mhw.impl.CharmImpl
	 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getCharm()
	 * @generated
	 */
	int CHARM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM__ID = 1;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM__RARITY = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARM__SKILL = 4;

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
	 * The meta object id for the '{@link m1ice.pdc.mhw.model.mhw.impl.DecorationImpl <em>Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.model.mhw.impl.DecorationImpl
	 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getDecoration()
	 * @generated
	 */
	int DECORATION = 4;

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
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__RANK = 3;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__SKILL = 4;

	/**
	 * The number of structural features of the '<em>Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m1ice.pdc.mhw.model.mhw.impl.SkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m1ice.pdc.mhw.model.mhw.impl.SkillImpl
	 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getSkill()
	 * @generated
	 */
	int SKILL = 5;

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
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.model.mhw.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Request#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Request#getName()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.model.mhw.Request#getDecoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decoration</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Request#getDecoration()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Decoration();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.model.mhw.Request#getCharm <em>Charm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Charm</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Request#getCharm()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Charm();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.model.mhw.Request#getArmor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Armor</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Request#getArmor()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Armor();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.model.mhw.Request#getWeapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weapon</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Request#getWeapon()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Weapon();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.model.mhw.Armor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armor</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor
	 * @generated
	 */
	EClass getArmor();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getId()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getName()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Name();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getSlug()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Slug();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getRank()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Rank();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getRarity()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Rarity();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getImageMale <em>Image Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Male</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getImageMale()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_ImageMale();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getImageFemale <em>Image Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Female</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getImageFemale()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_ImageFemale();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getDefenseBase <em>Defense Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defense Base</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getDefenseBase()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_DefenseBase();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getDefenseMax <em>Defense Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defense Max</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getDefenseMax()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_DefenseMax();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getFire <em>Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fire</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getFire()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Fire();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getWater()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Water();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getIce <em>Ice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ice</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getIce()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Ice();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getThunder <em>Thunder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thunder</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getThunder()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Thunder();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Armor#getDragon <em>Dragon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dragon</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getDragon()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Dragon();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.model.mhw.Armor#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skill</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Armor#getSkill()
	 * @see #getArmor()
	 * @generated
	 */
	EReference getArmor_Skill();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.model.mhw.Weapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weapon</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon
	 * @generated
	 */
	EClass getWeapon();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Weapon#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon#getName()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Name();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Weapon#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon#getId()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Weapon#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon#getType()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Type();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Weapon#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon#getRarity()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Rarity();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Weapon#getAttack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon#getAttack()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Attack();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Weapon#getThunder <em>Thunder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thunder</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon#getThunder()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Thunder();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Weapon#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon#getWater()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Water();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Weapon#getDragon <em>Dragon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dragon</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon#getDragon()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Dragon();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Weapon#getIce <em>Ice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ice</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon#getIce()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Ice();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Weapon#getFire <em>Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fire</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon#getFire()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Fire();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.model.mhw.Charm <em>Charm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charm</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Charm
	 * @generated
	 */
	EClass getCharm();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Charm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Charm#getName()
	 * @see #getCharm()
	 * @generated
	 */
	EAttribute getCharm_Name();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Charm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Charm#getId()
	 * @see #getCharm()
	 * @generated
	 */
	EAttribute getCharm_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Charm#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Charm#getRarity()
	 * @see #getCharm()
	 * @generated
	 */
	EAttribute getCharm_Rarity();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Charm#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Charm#getLevel()
	 * @see #getCharm()
	 * @generated
	 */
	EAttribute getCharm_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link m1ice.pdc.mhw.model.mhw.Charm#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skill</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Charm#getSkill()
	 * @see #getCharm()
	 * @generated
	 */
	EReference getCharm_Skill();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.model.mhw.Decoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decoration</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Decoration
	 * @generated
	 */
	EClass getDecoration();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Decoration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Decoration#getId()
	 * @see #getDecoration()
	 * @generated
	 */
	EAttribute getDecoration_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Decoration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Decoration#getName()
	 * @see #getDecoration()
	 * @generated
	 */
	EAttribute getDecoration_Name();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Decoration#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Decoration#getRarity()
	 * @see #getDecoration()
	 * @generated
	 */
	EAttribute getDecoration_Rarity();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Decoration#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Decoration#getRank()
	 * @see #getDecoration()
	 * @generated
	 */
	EAttribute getDecoration_Rank();

	/**
	 * Returns the meta object for the containment reference '{@link m1ice.pdc.mhw.model.mhw.Decoration#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Skill</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Decoration#getSkill()
	 * @see #getDecoration()
	 * @generated
	 */
	EReference getDecoration_Skill();

	/**
	 * Returns the meta object for class '{@link m1ice.pdc.mhw.model.mhw.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Skill
	 * @generated
	 */
	EClass getSkill();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Skill#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Skill#getId()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Id();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Skill#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Skill#getSlug()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Slug();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Skill#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Skill#getLevel()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Level();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Skill#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Skill#getDescription()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Description();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Skill#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Skill#getSkill()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Skill();

	/**
	 * Returns the meta object for the attribute '{@link m1ice.pdc.mhw.model.mhw.Skill#getSkillName <em>Skill Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill Name</em>'.
	 * @see m1ice.pdc.mhw.model.mhw.Skill#getSkillName()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_SkillName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MhwFactory getMhwFactory();

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
		 * The meta object literal for the '{@link m1ice.pdc.mhw.model.mhw.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.model.mhw.impl.RequestImpl
		 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__NAME = eINSTANCE.getRequest_Name();

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
		 * The meta object literal for the '{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl <em>Armor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.model.mhw.impl.ArmorImpl
		 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getArmor()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__NAME = eINSTANCE.getArmor_Name();

		/**
		 * The meta object literal for the '<em><b>Slug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__SLUG = eINSTANCE.getArmor_Slug();

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
		 * The meta object literal for the '<em><b>Defense Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__DEFENSE_BASE = eINSTANCE.getArmor_DefenseBase();

		/**
		 * The meta object literal for the '<em><b>Defense Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__DEFENSE_MAX = eINSTANCE.getArmor_DefenseMax();

		/**
		 * The meta object literal for the '<em><b>Fire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__FIRE = eINSTANCE.getArmor_Fire();

		/**
		 * The meta object literal for the '<em><b>Water</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__WATER = eINSTANCE.getArmor_Water();

		/**
		 * The meta object literal for the '<em><b>Ice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__ICE = eINSTANCE.getArmor_Ice();

		/**
		 * The meta object literal for the '<em><b>Thunder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__THUNDER = eINSTANCE.getArmor_Thunder();

		/**
		 * The meta object literal for the '<em><b>Dragon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__DRAGON = eINSTANCE.getArmor_Dragon();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMOR__SKILL = eINSTANCE.getArmor_Skill();

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl <em>Weapon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.model.mhw.impl.WeaponImpl
		 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getWeapon()
		 * @generated
		 */
		EClass WEAPON = eINSTANCE.getWeapon();

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
		 * The meta object literal for the '<em><b>Thunder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__THUNDER = eINSTANCE.getWeapon_Thunder();

		/**
		 * The meta object literal for the '<em><b>Water</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__WATER = eINSTANCE.getWeapon_Water();

		/**
		 * The meta object literal for the '<em><b>Dragon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__DRAGON = eINSTANCE.getWeapon_Dragon();

		/**
		 * The meta object literal for the '<em><b>Ice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__ICE = eINSTANCE.getWeapon_Ice();

		/**
		 * The meta object literal for the '<em><b>Fire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__FIRE = eINSTANCE.getWeapon_Fire();

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.model.mhw.impl.CharmImpl <em>Charm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.model.mhw.impl.CharmImpl
		 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getCharm()
		 * @generated
		 */
		EClass CHARM = eINSTANCE.getCharm();

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
		 * The meta object literal for the '<em><b>Skill</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARM__SKILL = eINSTANCE.getCharm_Skill();

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.model.mhw.impl.DecorationImpl <em>Decoration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.model.mhw.impl.DecorationImpl
		 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getDecoration()
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
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATION__RANK = eINSTANCE.getDecoration_Rank();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATION__SKILL = eINSTANCE.getDecoration_Skill();

		/**
		 * The meta object literal for the '{@link m1ice.pdc.mhw.model.mhw.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m1ice.pdc.mhw.model.mhw.impl.SkillImpl
		 * @see m1ice.pdc.mhw.model.mhw.impl.MhwPackageImpl#getSkill()
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

	}

} //MhwPackage
