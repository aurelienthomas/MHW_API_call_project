/**
 */
package mhw_api_dsl.mHW_API_DSL.impl;

import mhw_api_dsl.mHW_API_DSL.Decoration;
import mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage;
import mhw_api_dsl.mHW_API_DSL.Slot;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.SlotImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.SlotImpl#getDecoration <em>Decoration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl extends MinimalEObjectImpl.Container implements Slot {
	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecoration() <em>Decoration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoration()
	 * @generated
	 * @ordered
	 */
	protected Decoration decoration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MHW_API_DSLPackage.Literals.SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.SLOT__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decoration getDecoration() {
		if (decoration != null && decoration.eIsProxy()) {
			InternalEObject oldDecoration = (InternalEObject) decoration;
			decoration = (Decoration) eResolveProxy(oldDecoration);
			if (decoration != oldDecoration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MHW_API_DSLPackage.SLOT__DECORATION,
							oldDecoration, decoration));
			}
		}
		return decoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decoration basicGetDecoration() {
		return decoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecoration(Decoration newDecoration, NotificationChain msgs) {
		Decoration oldDecoration = decoration;
		decoration = newDecoration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MHW_API_DSLPackage.SLOT__DECORATION, oldDecoration, newDecoration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecoration(Decoration newDecoration) {
		if (newDecoration != decoration) {
			NotificationChain msgs = null;
			if (decoration != null)
				msgs = ((InternalEObject) decoration).eInverseRemove(this, MHW_API_DSLPackage.DECORATION__SLOT,
						Decoration.class, msgs);
			if (newDecoration != null)
				msgs = ((InternalEObject) newDecoration).eInverseAdd(this, MHW_API_DSLPackage.DECORATION__SLOT,
						Decoration.class, msgs);
			msgs = basicSetDecoration(newDecoration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.SLOT__DECORATION, newDecoration,
					newDecoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MHW_API_DSLPackage.SLOT__DECORATION:
			if (decoration != null)
				msgs = ((InternalEObject) decoration).eInverseRemove(this, MHW_API_DSLPackage.DECORATION__SLOT,
						Decoration.class, msgs);
			return basicSetDecoration((Decoration) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MHW_API_DSLPackage.SLOT__DECORATION:
			return basicSetDecoration(null, msgs);
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
		case MHW_API_DSLPackage.SLOT__RANK:
			return getRank();
		case MHW_API_DSLPackage.SLOT__DECORATION:
			if (resolve)
				return getDecoration();
			return basicGetDecoration();
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
		case MHW_API_DSLPackage.SLOT__RANK:
			setRank((Integer) newValue);
			return;
		case MHW_API_DSLPackage.SLOT__DECORATION:
			setDecoration((Decoration) newValue);
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
		case MHW_API_DSLPackage.SLOT__RANK:
			setRank(RANK_EDEFAULT);
			return;
		case MHW_API_DSLPackage.SLOT__DECORATION:
			setDecoration((Decoration) null);
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
		case MHW_API_DSLPackage.SLOT__RANK:
			return rank != RANK_EDEFAULT;
		case MHW_API_DSLPackage.SLOT__DECORATION:
			return decoration != null;
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
		result.append(" (rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //SlotImpl
