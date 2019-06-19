/**
 */
package m1ice.pdc.mhw.impl;

import java.util.Collection;

import m1ice.pdc.mhw.Armor;
import m1ice.pdc.mhw.Charm;
import m1ice.pdc.mhw.Decoration;
import m1ice.pdc.mhw.MHWPackage;
import m1ice.pdc.mhw.Request;
import m1ice.pdc.mhw.Weapon;

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
 *   <li>{@link m1ice.pdc.mhw.impl.RequestImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.RequestImpl#getArmor <em>Armor</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.RequestImpl#getWeapon <em>Weapon</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.RequestImpl#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.RequestImpl#getCharm <em>Charm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestImpl extends MinimalEObjectImpl.Container implements Request {
	/**
	 * The default value of the '{@link #getRequest() <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected String request = REQUEST_EDEFAULT;

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
		return MHWPackage.Literals.REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequest(String newRequest) {
		String oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.REQUEST__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Armor> getArmor() {
		if (armor == null) {
			armor = new EObjectContainmentEList<Armor>(Armor.class, this, MHWPackage.REQUEST__ARMOR);
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
			weapon = new EObjectContainmentEList<Weapon>(Weapon.class, this, MHWPackage.REQUEST__WEAPON);
		}
		return weapon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Decoration> getDecoration() {
		if (decoration == null) {
			decoration = new EObjectContainmentEList<Decoration>(Decoration.class, this, MHWPackage.REQUEST__DECORATION);
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
			charm = new EObjectContainmentEList<Charm>(Charm.class, this, MHWPackage.REQUEST__CHARM);
		}
		return charm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MHWPackage.REQUEST__ARMOR:
				return ((InternalEList<?>)getArmor()).basicRemove(otherEnd, msgs);
			case MHWPackage.REQUEST__WEAPON:
				return ((InternalEList<?>)getWeapon()).basicRemove(otherEnd, msgs);
			case MHWPackage.REQUEST__DECORATION:
				return ((InternalEList<?>)getDecoration()).basicRemove(otherEnd, msgs);
			case MHWPackage.REQUEST__CHARM:
				return ((InternalEList<?>)getCharm()).basicRemove(otherEnd, msgs);
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
			case MHWPackage.REQUEST__REQUEST:
				return getRequest();
			case MHWPackage.REQUEST__ARMOR:
				return getArmor();
			case MHWPackage.REQUEST__WEAPON:
				return getWeapon();
			case MHWPackage.REQUEST__DECORATION:
				return getDecoration();
			case MHWPackage.REQUEST__CHARM:
				return getCharm();
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
			case MHWPackage.REQUEST__REQUEST:
				setRequest((String)newValue);
				return;
			case MHWPackage.REQUEST__ARMOR:
				getArmor().clear();
				getArmor().addAll((Collection<? extends Armor>)newValue);
				return;
			case MHWPackage.REQUEST__WEAPON:
				getWeapon().clear();
				getWeapon().addAll((Collection<? extends Weapon>)newValue);
				return;
			case MHWPackage.REQUEST__DECORATION:
				getDecoration().clear();
				getDecoration().addAll((Collection<? extends Decoration>)newValue);
				return;
			case MHWPackage.REQUEST__CHARM:
				getCharm().clear();
				getCharm().addAll((Collection<? extends Charm>)newValue);
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
			case MHWPackage.REQUEST__REQUEST:
				setRequest(REQUEST_EDEFAULT);
				return;
			case MHWPackage.REQUEST__ARMOR:
				getArmor().clear();
				return;
			case MHWPackage.REQUEST__WEAPON:
				getWeapon().clear();
				return;
			case MHWPackage.REQUEST__DECORATION:
				getDecoration().clear();
				return;
			case MHWPackage.REQUEST__CHARM:
				getCharm().clear();
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
			case MHWPackage.REQUEST__REQUEST:
				return REQUEST_EDEFAULT == null ? request != null : !REQUEST_EDEFAULT.equals(request);
			case MHWPackage.REQUEST__ARMOR:
				return armor != null && !armor.isEmpty();
			case MHWPackage.REQUEST__WEAPON:
				return weapon != null && !weapon.isEmpty();
			case MHWPackage.REQUEST__DECORATION:
				return decoration != null && !decoration.isEmpty();
			case MHWPackage.REQUEST__CHARM:
				return charm != null && !charm.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (request: ");
		result.append(request);
		result.append(')');
		return result.toString();
	}

} //RequestImpl
