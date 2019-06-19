/**
 */
package m1ice.pdc.mhw.impl;

import java.util.Collection;

import m1ice.pdc.mhw.Armor;
import m1ice.pdc.mhw.Defence;
import m1ice.pdc.mhw.MHWPackage;
import m1ice.pdc.mhw.Resistance;
import m1ice.pdc.mhw.Skill;
import m1ice.pdc.mhw.Slot;

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
 * An implementation of the model object '<em><b>Armor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getId <em>Id</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getSlug <em>Slug</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getName <em>Name</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getType <em>Type</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getRarity <em>Rarity</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getImageMale <em>Image Male</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getImageFemale <em>Image Female</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getDefence <em>Defence</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getResistance <em>Resistance</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.impl.ArmorImpl#getSkill <em>Skill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArmorImpl extends MinimalEObjectImpl.Container implements Armor {
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
	 * The default value of the '{@link #getSlug() <em>Slug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlug()
	 * @generated
	 * @ordered
	 */
	protected static final String SLUG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlug() <em>Slug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlug()
	 * @generated
	 * @ordered
	 */
	protected String slug = SLUG_EDEFAULT;

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
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final String RANK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected String rank = RANK_EDEFAULT;

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
	 * The default value of the '{@link #getImageMale() <em>Image Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageMale()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_MALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageMale() <em>Image Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageMale()
	 * @generated
	 * @ordered
	 */
	protected String imageMale = IMAGE_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageFemale() <em>Image Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageFemale()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_FEMALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageFemale() <em>Image Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageFemale()
	 * @generated
	 * @ordered
	 */
	protected String imageFemale = IMAGE_FEMALE_EDEFAULT;

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
	 * The cached value of the '{@link #getDefence() <em>Defence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefence()
	 * @generated
	 * @ordered
	 */
	protected Defence defence;

	/**
	 * The cached value of the '{@link #getResistance() <em>Resistance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance()
	 * @generated
	 * @ordered
	 */
	protected Resistance resistance;

	/**
	 * The cached value of the '{@link #getSkill() <em>Skill</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected EList<Skill> skill;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MHWPackage.Literals.ARMOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.ARMOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSlug() {
		return slug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlug(String newSlug) {
		String oldSlug = slug;
		slug = newSlug;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.ARMOR__SLUG, oldSlug, slug));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.ARMOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.ARMOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRank(String newRank) {
		String oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.ARMOR__RANK, oldRank, rank));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.ARMOR__RARITY, oldRarity, rarity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageMale() {
		return imageMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageMale(String newImageMale) {
		String oldImageMale = imageMale;
		imageMale = newImageMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.ARMOR__IMAGE_MALE, oldImageMale, imageMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageFemale() {
		return imageFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageFemale(String newImageFemale) {
		String oldImageFemale = imageFemale;
		imageFemale = newImageFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.ARMOR__IMAGE_FEMALE, oldImageFemale, imageFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Slot> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<Slot>(Slot.class, this, MHWPackage.ARMOR__SLOT);
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Defence getDefence() {
		if (defence != null && defence.eIsProxy()) {
			InternalEObject oldDefence = (InternalEObject)defence;
			defence = (Defence)eResolveProxy(oldDefence);
			if (defence != oldDefence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MHWPackage.ARMOR__DEFENCE, oldDefence, defence));
			}
		}
		return defence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Defence basicGetDefence() {
		return defence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefence(Defence newDefence) {
		Defence oldDefence = defence;
		defence = newDefence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.ARMOR__DEFENCE, oldDefence, defence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resistance getResistance() {
		if (resistance != null && resistance.eIsProxy()) {
			InternalEObject oldResistance = (InternalEObject)resistance;
			resistance = (Resistance)eResolveProxy(oldResistance);
			if (resistance != oldResistance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MHWPackage.ARMOR__RESISTANCE, oldResistance, resistance));
			}
		}
		return resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resistance basicGetResistance() {
		return resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResistance(Resistance newResistance) {
		Resistance oldResistance = resistance;
		resistance = newResistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHWPackage.ARMOR__RESISTANCE, oldResistance, resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Skill> getSkill() {
		if (skill == null) {
			skill = new EObjectContainmentEList<Skill>(Skill.class, this, MHWPackage.ARMOR__SKILL);
		}
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MHWPackage.ARMOR__SLOT:
				return ((InternalEList<?>)getSlot()).basicRemove(otherEnd, msgs);
			case MHWPackage.ARMOR__SKILL:
				return ((InternalEList<?>)getSkill()).basicRemove(otherEnd, msgs);
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
			case MHWPackage.ARMOR__ID:
				return getId();
			case MHWPackage.ARMOR__SLUG:
				return getSlug();
			case MHWPackage.ARMOR__NAME:
				return getName();
			case MHWPackage.ARMOR__TYPE:
				return getType();
			case MHWPackage.ARMOR__RANK:
				return getRank();
			case MHWPackage.ARMOR__RARITY:
				return getRarity();
			case MHWPackage.ARMOR__IMAGE_MALE:
				return getImageMale();
			case MHWPackage.ARMOR__IMAGE_FEMALE:
				return getImageFemale();
			case MHWPackage.ARMOR__SLOT:
				return getSlot();
			case MHWPackage.ARMOR__DEFENCE:
				if (resolve) return getDefence();
				return basicGetDefence();
			case MHWPackage.ARMOR__RESISTANCE:
				if (resolve) return getResistance();
				return basicGetResistance();
			case MHWPackage.ARMOR__SKILL:
				return getSkill();
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
			case MHWPackage.ARMOR__ID:
				setId((Integer)newValue);
				return;
			case MHWPackage.ARMOR__SLUG:
				setSlug((String)newValue);
				return;
			case MHWPackage.ARMOR__NAME:
				setName((String)newValue);
				return;
			case MHWPackage.ARMOR__TYPE:
				setType((String)newValue);
				return;
			case MHWPackage.ARMOR__RANK:
				setRank((String)newValue);
				return;
			case MHWPackage.ARMOR__RARITY:
				setRarity((Integer)newValue);
				return;
			case MHWPackage.ARMOR__IMAGE_MALE:
				setImageMale((String)newValue);
				return;
			case MHWPackage.ARMOR__IMAGE_FEMALE:
				setImageFemale((String)newValue);
				return;
			case MHWPackage.ARMOR__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection<? extends Slot>)newValue);
				return;
			case MHWPackage.ARMOR__DEFENCE:
				setDefence((Defence)newValue);
				return;
			case MHWPackage.ARMOR__RESISTANCE:
				setResistance((Resistance)newValue);
				return;
			case MHWPackage.ARMOR__SKILL:
				getSkill().clear();
				getSkill().addAll((Collection<? extends Skill>)newValue);
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
			case MHWPackage.ARMOR__ID:
				setId(ID_EDEFAULT);
				return;
			case MHWPackage.ARMOR__SLUG:
				setSlug(SLUG_EDEFAULT);
				return;
			case MHWPackage.ARMOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MHWPackage.ARMOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MHWPackage.ARMOR__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case MHWPackage.ARMOR__RARITY:
				setRarity(RARITY_EDEFAULT);
				return;
			case MHWPackage.ARMOR__IMAGE_MALE:
				setImageMale(IMAGE_MALE_EDEFAULT);
				return;
			case MHWPackage.ARMOR__IMAGE_FEMALE:
				setImageFemale(IMAGE_FEMALE_EDEFAULT);
				return;
			case MHWPackage.ARMOR__SLOT:
				getSlot().clear();
				return;
			case MHWPackage.ARMOR__DEFENCE:
				setDefence((Defence)null);
				return;
			case MHWPackage.ARMOR__RESISTANCE:
				setResistance((Resistance)null);
				return;
			case MHWPackage.ARMOR__SKILL:
				getSkill().clear();
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
			case MHWPackage.ARMOR__ID:
				return id != ID_EDEFAULT;
			case MHWPackage.ARMOR__SLUG:
				return SLUG_EDEFAULT == null ? slug != null : !SLUG_EDEFAULT.equals(slug);
			case MHWPackage.ARMOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MHWPackage.ARMOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MHWPackage.ARMOR__RANK:
				return RANK_EDEFAULT == null ? rank != null : !RANK_EDEFAULT.equals(rank);
			case MHWPackage.ARMOR__RARITY:
				return rarity != RARITY_EDEFAULT;
			case MHWPackage.ARMOR__IMAGE_MALE:
				return IMAGE_MALE_EDEFAULT == null ? imageMale != null : !IMAGE_MALE_EDEFAULT.equals(imageMale);
			case MHWPackage.ARMOR__IMAGE_FEMALE:
				return IMAGE_FEMALE_EDEFAULT == null ? imageFemale != null : !IMAGE_FEMALE_EDEFAULT.equals(imageFemale);
			case MHWPackage.ARMOR__SLOT:
				return slot != null && !slot.isEmpty();
			case MHWPackage.ARMOR__DEFENCE:
				return defence != null;
			case MHWPackage.ARMOR__RESISTANCE:
				return resistance != null;
			case MHWPackage.ARMOR__SKILL:
				return skill != null && !skill.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", slug: ");
		result.append(slug);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", rank: ");
		result.append(rank);
		result.append(", rarity: ");
		result.append(rarity);
		result.append(", imageMale: ");
		result.append(imageMale);
		result.append(", imageFemale: ");
		result.append(imageFemale);
		result.append(')');
		return result.toString();
	}

} //ArmorImpl
