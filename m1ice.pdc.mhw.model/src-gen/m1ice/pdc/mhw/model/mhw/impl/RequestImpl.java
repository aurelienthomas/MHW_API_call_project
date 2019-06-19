/**
 */
package m1ice.pdc.mhw.model.mhw.impl;

import java.util.Collection;

import m1ice.pdc.mhw.model.mhw.Armor;
import m1ice.pdc.mhw.model.mhw.Charm;
import m1ice.pdc.mhw.model.mhw.Decoration;
import m1ice.pdc.mhw.model.mhw.MhwPackage;
import m1ice.pdc.mhw.model.mhw.Request;
import m1ice.pdc.mhw.model.mhw.Weapon;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.RequestImpl#getName <em>Name</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.RequestImpl#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.RequestImpl#getCharm <em>Charm</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.RequestImpl#getArmor <em>Armor</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.RequestImpl#getWeapon <em>Weapon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestImpl extends MinimalEObjectImpl.Container implements Request {
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
	 * The cached value of the '{@link #getDecoration() <em>Decoration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoration()
	 * @generated
	 * @ordered
	 */
	protected EList<Decoration> decoration;

	/**
	 * The cached value of the '{@link #getCharm() <em>Charm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharm()
	 * @generated
	 * @ordered
	 */
	protected EList<Charm> charm;

	/**
	 * The cached value of the '{@link #getArmor() <em>Armor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmor()
	 * @generated
	 * @ordered
	 */
	protected EList<Armor> armor;

	/**
	 * The cached value of the '{@link #getWeapon() <em>Weapon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeapon()
	 * @generated
	 * @ordered
	 */
	protected EList<Weapon> weapon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MhwPackage.Literals.REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.REQUEST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Decoration> getDecoration() {
		if (decoration == null) {
			decoration = new EObjectContainmentEList<Decoration>(Decoration.class, this,
					MhwPackage.REQUEST__DECORATION);
		}
		return decoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Charm> getCharm() {
		if (charm == null) {
			charm = new EObjectContainmentEList<Charm>(Charm.class, this, MhwPackage.REQUEST__CHARM);
		}
		return charm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Armor> getArmor() {
		if (armor == null) {
			armor = new EObjectContainmentEList<Armor>(Armor.class, this, MhwPackage.REQUEST__ARMOR);
		}
		return armor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Weapon> getWeapon() {
		if (weapon == null) {
			weapon = new EObjectContainmentEList<Weapon>(Weapon.class, this, MhwPackage.REQUEST__WEAPON);
		}
		return weapon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MhwPackage.REQUEST__DECORATION:
			return ((InternalEList<?>) getDecoration()).basicRemove(otherEnd, msgs);
		case MhwPackage.REQUEST__CHARM:
			return ((InternalEList<?>) getCharm()).basicRemove(otherEnd, msgs);
		case MhwPackage.REQUEST__ARMOR:
			return ((InternalEList<?>) getArmor()).basicRemove(otherEnd, msgs);
		case MhwPackage.REQUEST__WEAPON:
			return ((InternalEList<?>) getWeapon()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MhwPackage.REQUEST__NAME:
			return getName();
		case MhwPackage.REQUEST__DECORATION:
			return getDecoration();
		case MhwPackage.REQUEST__CHARM:
			return getCharm();
		case MhwPackage.REQUEST__ARMOR:
			return getArmor();
		case MhwPackage.REQUEST__WEAPON:
			return getWeapon();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MhwPackage.REQUEST__NAME:
			setName((String) newValue);
			return;
		case MhwPackage.REQUEST__DECORATION:
			getDecoration().clear();
			getDecoration().addAll((Collection<? extends Decoration>) newValue);
			return;
		case MhwPackage.REQUEST__CHARM:
			getCharm().clear();
			getCharm().addAll((Collection<? extends Charm>) newValue);
			return;
		case MhwPackage.REQUEST__ARMOR:
			getArmor().clear();
			getArmor().addAll((Collection<? extends Armor>) newValue);
			return;
		case MhwPackage.REQUEST__WEAPON:
			getWeapon().clear();
			getWeapon().addAll((Collection<? extends Weapon>) newValue);
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
		case MhwPackage.REQUEST__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MhwPackage.REQUEST__DECORATION:
			getDecoration().clear();
			return;
		case MhwPackage.REQUEST__CHARM:
			getCharm().clear();
			return;
		case MhwPackage.REQUEST__ARMOR:
			getArmor().clear();
			return;
		case MhwPackage.REQUEST__WEAPON:
			getWeapon().clear();
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
		case MhwPackage.REQUEST__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MhwPackage.REQUEST__DECORATION:
			return decoration != null && !decoration.isEmpty();
		case MhwPackage.REQUEST__CHARM:
			return charm != null && !charm.isEmpty();
		case MhwPackage.REQUEST__ARMOR:
			return armor != null && !armor.isEmpty();
		case MhwPackage.REQUEST__WEAPON:
			return weapon != null && !weapon.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //RequestImpl
