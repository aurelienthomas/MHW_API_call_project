/**
 */
package m1ice.pdc.mhw.model.mhw.impl;

import m1ice.pdc.mhw.model.mhw.*;

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
public class MhwFactoryImpl extends EFactoryImpl implements MhwFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MhwFactory init() {
		try {
			MhwFactory theMhwFactory = (MhwFactory) EPackage.Registry.INSTANCE.getEFactory(MhwPackage.eNS_URI);
			if (theMhwFactory != null) {
				return theMhwFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MhwFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MhwFactoryImpl() {
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
		case MhwPackage.REQUEST:
			return createRequest();
		case MhwPackage.ARMOR:
			return createArmor();
		case MhwPackage.WEAPON:
			return createWeapon();
		case MhwPackage.CHARM:
			return createCharm();
		case MhwPackage.DECORATION:
			return createDecoration();
		case MhwPackage.SKILL:
			return createSkill();
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
	public MhwPackage getMhwPackage() {
		return (MhwPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MhwPackage getPackage() {
		return MhwPackage.eINSTANCE;
	}

} //MhwFactoryImpl
