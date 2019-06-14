/**
 */
package mhw_api_dsl.mHW_API_DSL.impl;

import java.util.Collection;

import mhw_api_dsl.mHW_API_DSL.Charm;
import mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage;
import mhw_api_dsl.mHW_API_DSL.Skill;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.CharmImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.CharmImpl#getName <em>Name</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.CharmImpl#getId <em>Id</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.CharmImpl#getRarity <em>Rarity</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.CharmImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharmImpl extends MinimalEObjectImpl.Container implements Charm {
	/**
	 * The cached value of the '{@link #getSkill() <em>Skill</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected EList<Skill> skill;

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
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MHW_API_DSLPackage.Literals.CHARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Skill> getSkill() {
		if (skill == null) {
			skill = new EObjectWithInverseResolvingEList<Skill>(Skill.class, this, MHW_API_DSLPackage.CHARM__SKILL,
					MHW_API_DSLPackage.SKILL__CHARM);
		}
		return skill;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.CHARM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.CHARM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.CHARM__RARITY, oldRarity, rarity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.CHARM__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MHW_API_DSLPackage.CHARM__SKILL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSkill()).basicAdd(otherEnd, msgs);
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
		case MHW_API_DSLPackage.CHARM__SKILL:
			return ((InternalEList<?>) getSkill()).basicRemove(otherEnd, msgs);
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
		case MHW_API_DSLPackage.CHARM__SKILL:
			return getSkill();
		case MHW_API_DSLPackage.CHARM__NAME:
			return getName();
		case MHW_API_DSLPackage.CHARM__ID:
			return getId();
		case MHW_API_DSLPackage.CHARM__RARITY:
			return getRarity();
		case MHW_API_DSLPackage.CHARM__LEVEL:
			return getLevel();
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
		case MHW_API_DSLPackage.CHARM__SKILL:
			getSkill().clear();
			getSkill().addAll((Collection<? extends Skill>) newValue);
			return;
		case MHW_API_DSLPackage.CHARM__NAME:
			setName((String) newValue);
			return;
		case MHW_API_DSLPackage.CHARM__ID:
			setId((Integer) newValue);
			return;
		case MHW_API_DSLPackage.CHARM__RARITY:
			setRarity((Integer) newValue);
			return;
		case MHW_API_DSLPackage.CHARM__LEVEL:
			setLevel((Integer) newValue);
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
		case MHW_API_DSLPackage.CHARM__SKILL:
			getSkill().clear();
			return;
		case MHW_API_DSLPackage.CHARM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MHW_API_DSLPackage.CHARM__ID:
			setId(ID_EDEFAULT);
			return;
		case MHW_API_DSLPackage.CHARM__RARITY:
			setRarity(RARITY_EDEFAULT);
			return;
		case MHW_API_DSLPackage.CHARM__LEVEL:
			setLevel(LEVEL_EDEFAULT);
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
		case MHW_API_DSLPackage.CHARM__SKILL:
			return skill != null && !skill.isEmpty();
		case MHW_API_DSLPackage.CHARM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MHW_API_DSLPackage.CHARM__ID:
			return id != ID_EDEFAULT;
		case MHW_API_DSLPackage.CHARM__RARITY:
			return rarity != RARITY_EDEFAULT;
		case MHW_API_DSLPackage.CHARM__LEVEL:
			return level != LEVEL_EDEFAULT;
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
		result.append(", rarity: ");
		result.append(rarity);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //CharmImpl
