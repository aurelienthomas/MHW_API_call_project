/**
 */
package m1ice.pdc.mhw.impl;

import m1ice.pdc.mhw.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MHWFactoryImpl extends EFactoryImpl implements MHWFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MHWFactory init() {
		try {
			MHWFactory theMHWFactory = (MHWFactory)EPackage.Registry.INSTANCE.getEFactory(MHWPackage.eNS_URI);
			if (theMHWFactory != null) {
				return theMHWFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MHWFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MHWFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MHWPackage.ARMOR: return createArmor();
			case MHWPackage.ARMOR_SET: return createArmorSet();
			case MHWPackage.SLOT: return createSlot();
			case MHWPackage.RESISTANCE: return createResistance();
			case MHWPackage.SKILL: return createSkill();
			case MHWPackage.ITEM: return createItem();
			case MHWPackage.MATERIAL: return createMaterial();
			case MHWPackage.DEFENCE: return createDefence();
			case MHWPackage.CHARM: return createCharm();
			case MHWPackage.DECORATION: return createDecoration();
			case MHWPackage.WEAPON: return createWeapon();
			case MHWPackage.ELEMENT: return createElement();
			case MHWPackage.REQUEST: return createRequest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Armor createArmor() {
		ArmorImpl armor = new ArmorImpl();
		return armor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArmorSet createArmorSet() {
		ArmorSetImpl armorSet = new ArmorSetImpl();
		return armorSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resistance createResistance() {
		ResistanceImpl resistance = new ResistanceImpl();
		return resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Skill createSkill() {
		SkillImpl skill = new SkillImpl();
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Material createMaterial() {
		MaterialImpl material = new MaterialImpl();
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Defence createDefence() {
		DefenceImpl defence = new DefenceImpl();
		return defence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Charm createCharm() {
		CharmImpl charm = new CharmImpl();
		return charm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decoration createDecoration() {
		DecorationImpl decoration = new DecorationImpl();
		return decoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weapon createWeapon() {
		WeaponImpl weapon = new WeaponImpl();
		return weapon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MHWPackage getMHWPackage() {
		return (MHWPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MHWPackage getPackage() {
		return MHWPackage.eINSTANCE;
	}

} //MHWFactoryImpl
