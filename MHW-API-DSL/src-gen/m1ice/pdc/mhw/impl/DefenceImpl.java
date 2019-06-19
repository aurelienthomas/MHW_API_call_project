/**
 */
package m1ice.pdc.mhw.impl;

import m1ice.pdc.mhw.Defence;
import m1ice.pdc.mhw.MHWPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m1ice.pdc.mhw.impl.DefenceImpl#getBase <em>Base</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.DefenceImpl#getMax <em>Max</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.DefenceImpl#getAugmented <em>Augmented</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefenceImpl extends MinimalEObjectImpl.Container implements Defence {
	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final int BASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected int base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAugmented() <em>Augmented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAugmented()
	 * @generated
	 * @ordered
	 */
	protected static final int AUGMENTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAugmented() <em>Augmented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAugmented()
	 * @generated
	 * @ordered
	 */
	protected int augmented = AUGMENTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MHWPackage.Literals.DEFENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(int newBase) {
		int oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.DEFENCE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.DEFENCE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAugmented() {
		return augmented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAugmented(int newAugmented) {
		int oldAugmented = augmented;
		augmented = newAugmented;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.DEFENCE__AUGMENTED, oldAugmented, augmented));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MHWPackage.DEFENCE__BASE:
				return getBase();
			case MHWPackage.DEFENCE__MAX:
				return getMax();
			case MHWPackage.DEFENCE__AUGMENTED:
				return getAugmented();
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
			case MHWPackage.DEFENCE__BASE:
				setBase((Integer)newValue);
				return;
			case MHWPackage.DEFENCE__MAX:
				setMax((Integer)newValue);
				return;
			case MHWPackage.DEFENCE__AUGMENTED:
				setAugmented((Integer)newValue);
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
			case MHWPackage.DEFENCE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case MHWPackage.DEFENCE__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case MHWPackage.DEFENCE__AUGMENTED:
				setAugmented(AUGMENTED_EDEFAULT);
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
			case MHWPackage.DEFENCE__BASE:
				return base != BASE_EDEFAULT;
			case MHWPackage.DEFENCE__MAX:
				return max != MAX_EDEFAULT;
			case MHWPackage.DEFENCE__AUGMENTED:
				return augmented != AUGMENTED_EDEFAULT;
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
		result.append(" (base: ");
		result.append(base);
		result.append(", max: ");
		result.append(max);
		result.append(", augmented: ");
		result.append(augmented);
		result.append(')');
		return result.toString();
	}

} //DefenceImpl
