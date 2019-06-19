/**
 */
package m1ice.pdc.mhw.model.mhw.impl;

import java.util.Collection;

import m1ice.pdc.mhw.model.mhw.Armor;
import m1ice.pdc.mhw.model.mhw.MhwPackage;
import m1ice.pdc.mhw.model.mhw.Skill;

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
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getId <em>Id</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getName <em>Name</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getSlug <em>Slug</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getRarity <em>Rarity</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getImageMale <em>Image Male</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getImageFemale <em>Image Female</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getDefenseBase <em>Defense Base</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getDefenseMax <em>Defense Max</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getFire <em>Fire</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getWater <em>Water</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getIce <em>Ice</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getThunder <em>Thunder</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getDragon <em>Dragon</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.impl.ArmorImpl#getSkill <em>Skill</em>}</li>
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
	 * The default value of the '{@link #getDefenseBase() <em>Defense Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefenseBase()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFENSE_BASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefenseBase() <em>Defense Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefenseBase()
	 * @generated
	 * @ordered
	 */
	protected int defenseBase = DEFENSE_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefenseMax() <em>Defense Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefenseMax()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFENSE_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefenseMax() <em>Defense Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefenseMax()
	 * @generated
	 * @ordered
	 */
	protected int defenseMax = DEFENSE_MAX_EDEFAULT;

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
	protected ArmorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MhwPackage.Literals.ARMOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__SLUG, oldSlug, slug));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__RANK, oldRank, rank));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__RARITY, oldRarity, rarity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__IMAGE_MALE, oldImageMale,
					imageMale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__IMAGE_FEMALE, oldImageFemale,
					imageFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDefenseBase() {
		return defenseBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefenseBase(int newDefenseBase) {
		int oldDefenseBase = defenseBase;
		defenseBase = newDefenseBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__DEFENSE_BASE, oldDefenseBase,
					defenseBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDefenseMax() {
		return defenseMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefenseMax(int newDefenseMax) {
		int oldDefenseMax = defenseMax;
		defenseMax = newDefenseMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__DEFENSE_MAX, oldDefenseMax,
					defenseMax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__FIRE, oldFire, fire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__WATER, oldWater, water));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__ICE, oldIce, ice));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__THUNDER, oldThunder, thunder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MhwPackage.ARMOR__DRAGON, oldDragon, dragon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Skill> getSkill() {
		if (skill == null) {
			skill = new EObjectContainmentEList<Skill>(Skill.class, this, MhwPackage.ARMOR__SKILL);
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
		case MhwPackage.ARMOR__SKILL:
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
		case MhwPackage.ARMOR__ID:
			return getId();
		case MhwPackage.ARMOR__NAME:
			return getName();
		case MhwPackage.ARMOR__SLUG:
			return getSlug();
		case MhwPackage.ARMOR__RANK:
			return getRank();
		case MhwPackage.ARMOR__RARITY:
			return getRarity();
		case MhwPackage.ARMOR__IMAGE_MALE:
			return getImageMale();
		case MhwPackage.ARMOR__IMAGE_FEMALE:
			return getImageFemale();
		case MhwPackage.ARMOR__DEFENSE_BASE:
			return getDefenseBase();
		case MhwPackage.ARMOR__DEFENSE_MAX:
			return getDefenseMax();
		case MhwPackage.ARMOR__FIRE:
			return getFire();
		case MhwPackage.ARMOR__WATER:
			return getWater();
		case MhwPackage.ARMOR__ICE:
			return getIce();
		case MhwPackage.ARMOR__THUNDER:
			return getThunder();
		case MhwPackage.ARMOR__DRAGON:
			return getDragon();
		case MhwPackage.ARMOR__SKILL:
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
		case MhwPackage.ARMOR__ID:
			setId((Integer) newValue);
			return;
		case MhwPackage.ARMOR__NAME:
			setName((String) newValue);
			return;
		case MhwPackage.ARMOR__SLUG:
			setSlug((String) newValue);
			return;
		case MhwPackage.ARMOR__RANK:
			setRank((String) newValue);
			return;
		case MhwPackage.ARMOR__RARITY:
			setRarity((Integer) newValue);
			return;
		case MhwPackage.ARMOR__IMAGE_MALE:
			setImageMale((String) newValue);
			return;
		case MhwPackage.ARMOR__IMAGE_FEMALE:
			setImageFemale((String) newValue);
			return;
		case MhwPackage.ARMOR__DEFENSE_BASE:
			setDefenseBase((Integer) newValue);
			return;
		case MhwPackage.ARMOR__DEFENSE_MAX:
			setDefenseMax((Integer) newValue);
			return;
		case MhwPackage.ARMOR__FIRE:
			setFire((Integer) newValue);
			return;
		case MhwPackage.ARMOR__WATER:
			setWater((Integer) newValue);
			return;
		case MhwPackage.ARMOR__ICE:
			setIce((Integer) newValue);
			return;
		case MhwPackage.ARMOR__THUNDER:
			setThunder((Integer) newValue);
			return;
		case MhwPackage.ARMOR__DRAGON:
			setDragon((Integer) newValue);
			return;
		case MhwPackage.ARMOR__SKILL:
			getSkill().clear();
			getSkill().addAll((Collection<? extends Skill>) newValue);
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
		case MhwPackage.ARMOR__ID:
			setId(ID_EDEFAULT);
			return;
		case MhwPackage.ARMOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MhwPackage.ARMOR__SLUG:
			setSlug(SLUG_EDEFAULT);
			return;
		case MhwPackage.ARMOR__RANK:
			setRank(RANK_EDEFAULT);
			return;
		case MhwPackage.ARMOR__RARITY:
			setRarity(RARITY_EDEFAULT);
			return;
		case MhwPackage.ARMOR__IMAGE_MALE:
			setImageMale(IMAGE_MALE_EDEFAULT);
			return;
		case MhwPackage.ARMOR__IMAGE_FEMALE:
			setImageFemale(IMAGE_FEMALE_EDEFAULT);
			return;
		case MhwPackage.ARMOR__DEFENSE_BASE:
			setDefenseBase(DEFENSE_BASE_EDEFAULT);
			return;
		case MhwPackage.ARMOR__DEFENSE_MAX:
			setDefenseMax(DEFENSE_MAX_EDEFAULT);
			return;
		case MhwPackage.ARMOR__FIRE:
			setFire(FIRE_EDEFAULT);
			return;
		case MhwPackage.ARMOR__WATER:
			setWater(WATER_EDEFAULT);
			return;
		case MhwPackage.ARMOR__ICE:
			setIce(ICE_EDEFAULT);
			return;
		case MhwPackage.ARMOR__THUNDER:
			setThunder(THUNDER_EDEFAULT);
			return;
		case MhwPackage.ARMOR__DRAGON:
			setDragon(DRAGON_EDEFAULT);
			return;
		case MhwPackage.ARMOR__SKILL:
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
		case MhwPackage.ARMOR__ID:
			return id != ID_EDEFAULT;
		case MhwPackage.ARMOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MhwPackage.ARMOR__SLUG:
			return SLUG_EDEFAULT == null ? slug != null : !SLUG_EDEFAULT.equals(slug);
		case MhwPackage.ARMOR__RANK:
			return RANK_EDEFAULT == null ? rank != null : !RANK_EDEFAULT.equals(rank);
		case MhwPackage.ARMOR__RARITY:
			return rarity != RARITY_EDEFAULT;
		case MhwPackage.ARMOR__IMAGE_MALE:
			return IMAGE_MALE_EDEFAULT == null ? imageMale != null : !IMAGE_MALE_EDEFAULT.equals(imageMale);
		case MhwPackage.ARMOR__IMAGE_FEMALE:
			return IMAGE_FEMALE_EDEFAULT == null ? imageFemale != null : !IMAGE_FEMALE_EDEFAULT.equals(imageFemale);
		case MhwPackage.ARMOR__DEFENSE_BASE:
			return defenseBase != DEFENSE_BASE_EDEFAULT;
		case MhwPackage.ARMOR__DEFENSE_MAX:
			return defenseMax != DEFENSE_MAX_EDEFAULT;
		case MhwPackage.ARMOR__FIRE:
			return fire != FIRE_EDEFAULT;
		case MhwPackage.ARMOR__WATER:
			return water != WATER_EDEFAULT;
		case MhwPackage.ARMOR__ICE:
			return ice != ICE_EDEFAULT;
		case MhwPackage.ARMOR__THUNDER:
			return thunder != THUNDER_EDEFAULT;
		case MhwPackage.ARMOR__DRAGON:
			return dragon != DRAGON_EDEFAULT;
		case MhwPackage.ARMOR__SKILL:
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", slug: ");
		result.append(slug);
		result.append(", rank: ");
		result.append(rank);
		result.append(", rarity: ");
		result.append(rarity);
		result.append(", imageMale: ");
		result.append(imageMale);
		result.append(", imageFemale: ");
		result.append(imageFemale);
		result.append(", defenseBase: ");
		result.append(defenseBase);
		result.append(", defenseMax: ");
		result.append(defenseMax);
		result.append(", fire: ");
		result.append(fire);
		result.append(", water: ");
		result.append(water);
		result.append(", ice: ");
		result.append(ice);
		result.append(", thunder: ");
		result.append(thunder);
		result.append(", dragon: ");
		result.append(dragon);
		result.append(')');
		return result.toString();
	}

} //ArmorImpl
