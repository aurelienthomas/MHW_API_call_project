/**
 */
package m1ice.pdc.mhw.model.mhw.impl;

import m1ice.pdc.mhw.model.mhw.MhwPackage;
import m1ice.pdc.mhw.model.mhw.Weapon;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weapon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl#getName <em>Name</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl#getId <em>Id</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl#getType <em>Type</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl#getRarity <em>Rarity</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl#getAttack <em>Attack</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl#getThunder <em>Thunder</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl#getWater <em>Water</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl#getDragon <em>Dragon</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl#getIce <em>Ice</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.WeaponImpl#getFire <em>Fire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeaponImpl extends MinimalEObjectImpl.Container implements Weapon {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRarity() <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarity()
	 * @generated
	 * @ordered
	 */
	protected static final String RARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRarity() <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarity()
	 * @generated
	 * @ordered
	 */
	protected String rarity = RARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttack() <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttack()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttack() <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttack()
	 * @generated
	 * @ordered
	 */
	protected String attack = ATTACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getThunder() <em>Thunder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThunder()
	 * @generated
	 * @ordered
	 */
	protected static final int THUNDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThunder() <em>Thunder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThunder()
	 * @generated
	 * @ordered
	 */
	protected int thunder = THUNDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWater() <em>Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater()
	 * @generated
	 * @ordered
	 */
	protected static final int WATER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWater() <em>Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater()
	 * @generated
	 * @ordered
	 */
	protected int water = WATER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDragon() <em>Dragon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDragon()
	 * @generated
	 * @ordered
	 */
	protected static final int DRAGON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDragon() <em>Dragon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDragon()
	 * @generated
	 * @ordered
	 */
	protected int dragon = DRAGON_EDEFAULT;

	/**
	 * The default value of the '{@link #getIce() <em>Ice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIce()
	 * @generated
	 * @ordered
	 */
	protected static final int ICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIce() <em>Ice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIce()
	 * @generated
	 * @ordered
	 */
	protected int ice = ICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFire() <em>Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFire()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFire() <em>Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFire()
	 * @generated
	 * @ordered
	 */
	protected int fire = FIRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeaponImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MhwPackage.Literals.WEAPON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.WEAPON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.WEAPON__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.WEAPON__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRarity() {
		return rarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRarity(String newRarity) {
		String oldRarity = rarity;
		rarity = newRarity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.WEAPON__RARITY, oldRarity, rarity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttack() {
		return attack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttack(String newAttack) {
		String oldAttack = attack;
		attack = newAttack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.WEAPON__ATTACK, oldAttack, attack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getThunder() {
		return thunder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThunder(int newThunder) {
		int oldThunder = thunder;
		thunder = newThunder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.WEAPON__THUNDER, oldThunder, thunder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWater() {
		return water;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWater(int newWater) {
		int oldWater = water;
		water = newWater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.WEAPON__WATER, oldWater, water));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDragon() {
		return dragon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDragon(int newDragon) {
		int oldDragon = dragon;
		dragon = newDragon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.WEAPON__DRAGON, oldDragon, dragon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIce() {
		return ice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIce(int newIce) {
		int oldIce = ice;
		ice = newIce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.WEAPON__ICE, oldIce, ice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFire() {
		return fire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFire(int newFire) {
		int oldFire = fire;
		fire = newFire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.WEAPON__FIRE, oldFire, fire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MhwPackage.WEAPON__NAME:
			return getName();
		case MhwPackage.WEAPON__ID:
			return getId();
		case MhwPackage.WEAPON__TYPE:
			return getType();
		case MhwPackage.WEAPON__RARITY:
			return getRarity();
		case MhwPackage.WEAPON__ATTACK:
			return getAttack();
		case MhwPackage.WEAPON__THUNDER:
			return getThunder();
		case MhwPackage.WEAPON__WATER:
			return getWater();
		case MhwPackage.WEAPON__DRAGON:
			return getDragon();
		case MhwPackage.WEAPON__ICE:
			return getIce();
		case MhwPackage.WEAPON__FIRE:
			return getFire();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MhwPackage.WEAPON__NAME:
			setName((String) newValue);
			return;
		case MhwPackage.WEAPON__ID:
			setId((Integer) newValue);
			return;
		case MhwPackage.WEAPON__TYPE:
			setType((String) newValue);
			return;
		case MhwPackage.WEAPON__RARITY:
			setRarity((String) newValue);
			return;
		case MhwPackage.WEAPON__ATTACK:
			setAttack((String) newValue);
			return;
		case MhwPackage.WEAPON__THUNDER:
			setThunder((Integer) newValue);
			return;
		case MhwPackage.WEAPON__WATER:
			setWater((Integer) newValue);
			return;
		case MhwPackage.WEAPON__DRAGON:
			setDragon((Integer) newValue);
			return;
		case MhwPackage.WEAPON__ICE:
			setIce((Integer) newValue);
			return;
		case MhwPackage.WEAPON__FIRE:
			setFire((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MhwPackage.WEAPON__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MhwPackage.WEAPON__ID:
			setId(ID_EDEFAULT);
			return;
		case MhwPackage.WEAPON__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MhwPackage.WEAPON__RARITY:
			setRarity(RARITY_EDEFAULT);
			return;
		case MhwPackage.WEAPON__ATTACK:
			setAttack(ATTACK_EDEFAULT);
			return;
		case MhwPackage.WEAPON__THUNDER:
			setThunder(THUNDER_EDEFAULT);
			return;
		case MhwPackage.WEAPON__WATER:
			setWater(WATER_EDEFAULT);
			return;
		case MhwPackage.WEAPON__DRAGON:
			setDragon(DRAGON_EDEFAULT);
			return;
		case MhwPackage.WEAPON__ICE:
			setIce(ICE_EDEFAULT);
			return;
		case MhwPackage.WEAPON__FIRE:
			setFire(FIRE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MhwPackage.WEAPON__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MhwPackage.WEAPON__ID:
			return id != ID_EDEFAULT;
		case MhwPackage.WEAPON__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case MhwPackage.WEAPON__RARITY:
			return RARITY_EDEFAULT == null ? rarity != null : !RARITY_EDEFAULT.equals(rarity);
		case MhwPackage.WEAPON__ATTACK:
			return ATTACK_EDEFAULT == null ? attack != null : !ATTACK_EDEFAULT.equals(attack);
		case MhwPackage.WEAPON__THUNDER:
			return thunder != THUNDER_EDEFAULT;
		case MhwPackage.WEAPON__WATER:
			return water != WATER_EDEFAULT;
		case MhwPackage.WEAPON__DRAGON:
			return dragon != DRAGON_EDEFAULT;
		case MhwPackage.WEAPON__ICE:
			return ice != ICE_EDEFAULT;
		case MhwPackage.WEAPON__FIRE:
			return fire != FIRE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", rarity: ");
		result.append(rarity);
		result.append(", attack: ");
		result.append(attack);
		result.append(", thunder: ");
		result.append(thunder);
		result.append(", water: ");
		result.append(water);
		result.append(", dragon: ");
		result.append(dragon);
		result.append(", ice: ");
		result.append(ice);
		result.append(", fire: ");
		result.append(fire);
		result.append(')');
		return result.toString();
	}

} //WeaponImpl
