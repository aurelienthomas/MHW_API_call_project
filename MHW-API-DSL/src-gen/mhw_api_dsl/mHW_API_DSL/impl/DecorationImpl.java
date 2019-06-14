/**
 */
package mhw_api_dsl.mHW_API_DSL.impl;

import mhw_api_dsl.mHW_API_DSL.Decoration;
import mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage;
import mhw_api_dsl.mHW_API_DSL.Skill;
import mhw_api_dsl.mHW_API_DSL.Slot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.DecorationImpl#getId <em>Id</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.DecorationImpl#getName <em>Name</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.DecorationImpl#getRarity <em>Rarity</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.DecorationImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.DecorationImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.DecorationImpl#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecorationImpl extends MinimalEObjectImpl.Container implements Decoration {
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
	 * The default value of the '{@link #getRarity() <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarity()
	 * @generated
	 * @ordered
	 */
	protected static final int RARITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRarity() <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarity()
	 * @generated
	 * @ordered
	 */
	protected int rarity = RARITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSkill() <em>Skill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected Skill skill;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected Slot slot;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecorationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MHW_API_DSLPackage.Literals.DECORATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.DECORATION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.DECORATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRarity() {
		return rarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRarity(int newRarity) {
		int oldRarity = rarity;
		rarity = newRarity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.DECORATION__RARITY, oldRarity,
					rarity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Skill getSkill() {
		if (skill != null && skill.eIsProxy()) {
			InternalEObject oldSkill = (InternalEObject) skill;
			skill = (Skill) eResolveProxy(oldSkill);
			if (skill != oldSkill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MHW_API_DSLPackage.DECORATION__SKILL,
							oldSkill, skill));
			}
		}
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill basicGetSkill() {
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkill(Skill newSkill, NotificationChain msgs) {
		Skill oldSkill = skill;
		skill = newSkill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MHW_API_DSLPackage.DECORATION__SKILL, oldSkill, newSkill);
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
	public void setSkill(Skill newSkill) {
		if (newSkill != skill) {
			NotificationChain msgs = null;
			if (skill != null)
				msgs = ((InternalEObject) skill).eInverseRemove(this, MHW_API_DSLPackage.SKILL__DECORATION, Skill.class,
						msgs);
			if (newSkill != null)
				msgs = ((InternalEObject) newSkill).eInverseAdd(this, MHW_API_DSLPackage.SKILL__DECORATION, Skill.class,
						msgs);
			msgs = basicSetSkill(newSkill, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.DECORATION__SKILL, newSkill,
					newSkill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Slot getSlot() {
		if (slot != null && slot.eIsProxy()) {
			InternalEObject oldSlot = (InternalEObject) slot;
			slot = (Slot) eResolveProxy(oldSlot);
			if (slot != oldSlot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MHW_API_DSLPackage.DECORATION__SLOT,
							oldSlot, slot));
			}
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot basicGetSlot() {
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlot(Slot newSlot, NotificationChain msgs) {
		Slot oldSlot = slot;
		slot = newSlot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MHW_API_DSLPackage.DECORATION__SLOT, oldSlot, newSlot);
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
	public void setSlot(Slot newSlot) {
		if (newSlot != slot) {
			NotificationChain msgs = null;
			if (slot != null)
				msgs = ((InternalEObject) slot).eInverseRemove(this, MHW_API_DSLPackage.SLOT__DECORATION, Slot.class,
						msgs);
			if (newSlot != null)
				msgs = ((InternalEObject) newSlot).eInverseAdd(this, MHW_API_DSLPackage.SLOT__DECORATION, Slot.class,
						msgs);
			msgs = basicSetSlot(newSlot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.DECORATION__SLOT, newSlot,
					newSlot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.DECORATION__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MHW_API_DSLPackage.DECORATION__SKILL:
			if (skill != null)
				msgs = ((InternalEObject) skill).eInverseRemove(this, MHW_API_DSLPackage.SKILL__DECORATION, Skill.class,
						msgs);
			return basicSetSkill((Skill) otherEnd, msgs);
		case MHW_API_DSLPackage.DECORATION__SLOT:
			if (slot != null)
				msgs = ((InternalEObject) slot).eInverseRemove(this, MHW_API_DSLPackage.SLOT__DECORATION, Slot.class,
						msgs);
			return basicSetSlot((Slot) otherEnd, msgs);
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
		case MHW_API_DSLPackage.DECORATION__SKILL:
			return basicSetSkill(null, msgs);
		case MHW_API_DSLPackage.DECORATION__SLOT:
			return basicSetSlot(null, msgs);
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
		case MHW_API_DSLPackage.DECORATION__ID:
			return getId();
		case MHW_API_DSLPackage.DECORATION__NAME:
			return getName();
		case MHW_API_DSLPackage.DECORATION__RARITY:
			return getRarity();
		case MHW_API_DSLPackage.DECORATION__SKILL:
			if (resolve)
				return getSkill();
			return basicGetSkill();
		case MHW_API_DSLPackage.DECORATION__SLOT:
			if (resolve)
				return getSlot();
			return basicGetSlot();
		case MHW_API_DSLPackage.DECORATION__RANK:
			return getRank();
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
		case MHW_API_DSLPackage.DECORATION__ID:
			setId((Integer) newValue);
			return;
		case MHW_API_DSLPackage.DECORATION__NAME:
			setName((String) newValue);
			return;
		case MHW_API_DSLPackage.DECORATION__RARITY:
			setRarity((Integer) newValue);
			return;
		case MHW_API_DSLPackage.DECORATION__SKILL:
			setSkill((Skill) newValue);
			return;
		case MHW_API_DSLPackage.DECORATION__SLOT:
			setSlot((Slot) newValue);
			return;
		case MHW_API_DSLPackage.DECORATION__RANK:
			setRank((Integer) newValue);
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
		case MHW_API_DSLPackage.DECORATION__ID:
			setId(ID_EDEFAULT);
			return;
		case MHW_API_DSLPackage.DECORATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MHW_API_DSLPackage.DECORATION__RARITY:
			setRarity(RARITY_EDEFAULT);
			return;
		case MHW_API_DSLPackage.DECORATION__SKILL:
			setSkill((Skill) null);
			return;
		case MHW_API_DSLPackage.DECORATION__SLOT:
			setSlot((Slot) null);
			return;
		case MHW_API_DSLPackage.DECORATION__RANK:
			setRank(RANK_EDEFAULT);
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
		case MHW_API_DSLPackage.DECORATION__ID:
			return id != ID_EDEFAULT;
		case MHW_API_DSLPackage.DECORATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MHW_API_DSLPackage.DECORATION__RARITY:
			return rarity != RARITY_EDEFAULT;
		case MHW_API_DSLPackage.DECORATION__SKILL:
			return skill != null;
		case MHW_API_DSLPackage.DECORATION__SLOT:
			return slot != null;
		case MHW_API_DSLPackage.DECORATION__RANK:
			return rank != RANK_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", rarity: ");
		result.append(rarity);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //DecorationImpl
