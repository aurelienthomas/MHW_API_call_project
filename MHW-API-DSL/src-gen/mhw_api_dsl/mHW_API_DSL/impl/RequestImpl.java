/**
 */
package mhw_api_dsl.mHW_API_DSL.impl;

import java.util.Collection;

import mhw_api_dsl.mHW_API_DSL.Armor;
import mhw_api_dsl.mHW_API_DSL.Charm;
import mhw_api_dsl.mHW_API_DSL.Decoration;
import mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage;
import mhw_api_dsl.mHW_API_DSL.Request;
import mhw_api_dsl.mHW_API_DSL.Weapon;

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
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.RequestImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.RequestImpl#getArmor <em>Armor</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.RequestImpl#getWeapon <em>Weapon</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.RequestImpl#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.RequestImpl#getCharm <em>Charm</em>}</li>
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
		return MHW_API_DSLPackage.Literals.REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.REQUEST__REQUEST, oldRequest,
					request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Armor> getArmor() {
		if (armor == null) {
			armor = new EObjectContainmentEList<Armor>(Armor.class, this, MHW_API_DSLPackage.REQUEST__ARMOR);
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
			weapon = new EObjectContainmentEList<Weapon>(Weapon.class, this, MHW_API_DSLPackage.REQUEST__WEAPON);
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
			decoration = new EObjectContainmentEList<Decoration>(Decoration.class, this,
					MHW_API_DSLPackage.REQUEST__DECORATION);
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
			charm = new EObjectContainmentEList<Charm>(Charm.class, this, MHW_API_DSLPackage.REQUEST__CHARM);
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
		case MHW_API_DSLPackage.REQUEST__ARMOR:
			return ((InternalEList<?>) getArmor()).basicRemove(otherEnd, msgs);
		case MHW_API_DSLPackage.REQUEST__WEAPON:
			return ((InternalEList<?>) getWeapon()).basicRemove(otherEnd, msgs);
		case MHW_API_DSLPackage.REQUEST__DECORATION:
			return ((InternalEList<?>) getDecoration()).basicRemove(otherEnd, msgs);
		case MHW_API_DSLPackage.REQUEST__CHARM:
			return ((InternalEList<?>) getCharm()).basicRemove(otherEnd, msgs);
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
		case MHW_API_DSLPackage.REQUEST__REQUEST:
			return getRequest();
		case MHW_API_DSLPackage.REQUEST__ARMOR:
			return getArmor();
		case MHW_API_DSLPackage.REQUEST__WEAPON:
			return getWeapon();
		case MHW_API_DSLPackage.REQUEST__DECORATION:
			return getDecoration();
		case MHW_API_DSLPackage.REQUEST__CHARM:
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
		case MHW_API_DSLPackage.REQUEST__REQUEST:
			setRequest((String) newValue);
			return;
		case MHW_API_DSLPackage.REQUEST__ARMOR:
			getArmor().clear();
			getArmor().addAll((Collection<? extends Armor>) newValue);
			return;
		case MHW_API_DSLPackage.REQUEST__WEAPON:
			getWeapon().clear();
			getWeapon().addAll((Collection<? extends Weapon>) newValue);
			return;
		case MHW_API_DSLPackage.REQUEST__DECORATION:
			getDecoration().clear();
			getDecoration().addAll((Collection<? extends Decoration>) newValue);
			return;
		case MHW_API_DSLPackage.REQUEST__CHARM:
			getCharm().clear();
			getCharm().addAll((Collection<? extends Charm>) newValue);
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
		case MHW_API_DSLPackage.REQUEST__REQUEST:
			setRequest(REQUEST_EDEFAULT);
			return;
		case MHW_API_DSLPackage.REQUEST__ARMOR:
			getArmor().clear();
			return;
		case MHW_API_DSLPackage.REQUEST__WEAPON:
			getWeapon().clear();
			return;
		case MHW_API_DSLPackage.REQUEST__DECORATION:
			getDecoration().clear();
			return;
		case MHW_API_DSLPackage.REQUEST__CHARM:
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
		case MHW_API_DSLPackage.REQUEST__REQUEST:
			return REQUEST_EDEFAULT == null ? request != null : !REQUEST_EDEFAULT.equals(request);
		case MHW_API_DSLPackage.REQUEST__ARMOR:
			return armor != null && !armor.isEmpty();
		case MHW_API_DSLPackage.REQUEST__WEAPON:
			return weapon != null && !weapon.isEmpty();
		case MHW_API_DSLPackage.REQUEST__DECORATION:
			return decoration != null && !decoration.isEmpty();
		case MHW_API_DSLPackage.REQUEST__CHARM:
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (request: ");
		result.append(request);
		result.append(')');
		return result.toString();
	}

} //RequestImpl
