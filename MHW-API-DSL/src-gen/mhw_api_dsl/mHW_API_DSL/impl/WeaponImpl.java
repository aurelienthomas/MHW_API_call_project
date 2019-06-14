/**
 */
package mhw_api_dsl.mHW_API_DSL.impl;

import java.util.Collection;

import mhw_api_dsl.mHW_API_DSL.Element;
import mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage;
import mhw_api_dsl.mHW_API_DSL.Skill;
import mhw_api_dsl.mHW_API_DSL.Slot;
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
 * An implementation of the model object '<em><b>Weapon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.WeaponImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.WeaponImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.WeaponImpl#getName <em>Name</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.WeaponImpl#getId <em>Id</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.WeaponImpl#getType <em>Type</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.WeaponImpl#getRarity <em>Rarity</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.WeaponImpl#getAttack <em>Attack</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.impl.WeaponImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeaponImpl extends MinimalEObjectImpl.Container implements Weapon {
	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slot;

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
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

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
		return MHW_API_DSLPackage.Literals.WEAPON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Slot> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<Slot>(Slot.class, this, MHW_API_DSLPackage.WEAPON__SLOT);
		}
		return slot;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MHW_API_DSLPackage.WEAPON__SKILL,
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
					MHW_API_DSLPackage.WEAPON__SKILL, oldSkill, newSkill);
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
				msgs = ((InternalEObject) skill).eInverseRemove(this, MHW_API_DSLPackage.SKILL__WEAPON, Skill.class,
						msgs);
			if (newSkill != null)
				msgs = ((InternalEObject) newSkill).eInverseAdd(this, MHW_API_DSLPackage.SKILL__WEAPON, Skill.class,
						msgs);
			msgs = basicSetSkill(newSkill, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.WEAPON__SKILL, newSkill,
					newSkill));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.WEAPON__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.WEAPON__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.WEAPON__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.WEAPON__RARITY, oldRarity,
					rarity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.WEAPON__ATTACK, oldAttack,
					attack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject) element;
			element = (Element) eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MHW_API_DSLPackage.WEAPON__ELEMENT,
							oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MHW_API_DSLPackage.WEAPON__ELEMENT, oldElement, newElement);
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
	public void setElement(Element newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject) element).eInverseRemove(this, MHW_API_DSLPackage.ELEMENT__WEAPON,
						Element.class, msgs);
			if (newElement != null)
				msgs = ((InternalEObject) newElement).eInverseAdd(this, MHW_API_DSLPackage.ELEMENT__WEAPON,
						Element.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.WEAPON__ELEMENT, newElement,
					newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MHW_API_DSLPackage.WEAPON__SKILL:
			if (skill != null)
				msgs = ((InternalEObject) skill).eInverseRemove(this, MHW_API_DSLPackage.SKILL__WEAPON, Skill.class,
						msgs);
			return basicSetSkill((Skill) otherEnd, msgs);
		case MHW_API_DSLPackage.WEAPON__ELEMENT:
			if (element != null)
				msgs = ((InternalEObject) element).eInverseRemove(this, MHW_API_DSLPackage.ELEMENT__WEAPON,
						Element.class, msgs);
			return basicSetElement((Element) otherEnd, msgs);
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
		case MHW_API_DSLPackage.WEAPON__SLOT:
			return ((InternalEList<?>) getSlot()).basicRemove(otherEnd, msgs);
		case MHW_API_DSLPackage.WEAPON__SKILL:
			return basicSetSkill(null, msgs);
		case MHW_API_DSLPackage.WEAPON__ELEMENT:
			return basicSetElement(null, msgs);
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
		case MHW_API_DSLPackage.WEAPON__SLOT:
			return getSlot();
		case MHW_API_DSLPackage.WEAPON__SKILL:
			if (resolve)
				return getSkill();
			return basicGetSkill();
		case MHW_API_DSLPackage.WEAPON__NAME:
			return getName();
		case MHW_API_DSLPackage.WEAPON__ID:
			return getId();
		case MHW_API_DSLPackage.WEAPON__TYPE:
			return getType();
		case MHW_API_DSLPackage.WEAPON__RARITY:
			return getRarity();
		case MHW_API_DSLPackage.WEAPON__ATTACK:
			return getAttack();
		case MHW_API_DSLPackage.WEAPON__ELEMENT:
			if (resolve)
				return getElement();
			return basicGetElement();
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
		case MHW_API_DSLPackage.WEAPON__SLOT:
			getSlot().clear();
			getSlot().addAll((Collection<? extends Slot>) newValue);
			return;
		case MHW_API_DSLPackage.WEAPON__SKILL:
			setSkill((Skill) newValue);
			return;
		case MHW_API_DSLPackage.WEAPON__NAME:
			setName((String) newValue);
			return;
		case MHW_API_DSLPackage.WEAPON__ID:
			setId((Integer) newValue);
			return;
		case MHW_API_DSLPackage.WEAPON__TYPE:
			setType((String) newValue);
			return;
		case MHW_API_DSLPackage.WEAPON__RARITY:
			setRarity((Integer) newValue);
			return;
		case MHW_API_DSLPackage.WEAPON__ATTACK:
			setAttack((String) newValue);
			return;
		case MHW_API_DSLPackage.WEAPON__ELEMENT:
			setElement((Element) newValue);
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
		case MHW_API_DSLPackage.WEAPON__SLOT:
			getSlot().clear();
			return;
		case MHW_API_DSLPackage.WEAPON__SKILL:
			setSkill((Skill) null);
			return;
		case MHW_API_DSLPackage.WEAPON__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MHW_API_DSLPackage.WEAPON__ID:
			setId(ID_EDEFAULT);
			return;
		case MHW_API_DSLPackage.WEAPON__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MHW_API_DSLPackage.WEAPON__RARITY:
			setRarity(RARITY_EDEFAULT);
			return;
		case MHW_API_DSLPackage.WEAPON__ATTACK:
			setAttack(ATTACK_EDEFAULT);
			return;
		case MHW_API_DSLPackage.WEAPON__ELEMENT:
			setElement((Element) null);
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
		case MHW_API_DSLPackage.WEAPON__SLOT:
			return slot != null && !slot.isEmpty();
		case MHW_API_DSLPackage.WEAPON__SKILL:
			return skill != null;
		case MHW_API_DSLPackage.WEAPON__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MHW_API_DSLPackage.WEAPON__ID:
			return id != ID_EDEFAULT;
		case MHW_API_DSLPackage.WEAPON__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case MHW_API_DSLPackage.WEAPON__RARITY:
			return rarity != RARITY_EDEFAULT;
		case MHW_API_DSLPackage.WEAPON__ATTACK:
			return ATTACK_EDEFAULT == null ? attack != null : !ATTACK_EDEFAULT.equals(attack);
		case MHW_API_DSLPackage.WEAPON__ELEMENT:
			return element != null;
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
		result.append(')');
		return result.toString();
	}

} //WeaponImpl
