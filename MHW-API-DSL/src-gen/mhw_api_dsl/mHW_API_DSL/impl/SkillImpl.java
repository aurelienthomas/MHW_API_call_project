/**
 */
package mhw_api_dsl.mHW_API_DSL.impl;

import java.util.Collection;

import mhw_api_dsl.mHW_API_DSL.Armor;
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
 * An implementation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.SkillImpl#getId <em>Id</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.SkillImpl#getSlug <em>Slug</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.SkillImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.SkillImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.SkillImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.SkillImpl#getSkillName <em>Skill Name</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.SkillImpl#getArmor <em>Armor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillImpl extends MinimalEObjectImpl.Container implements Skill
{
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkill() <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected static final int SKILL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSkill() <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected int skill = SKILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkillName() <em>Skill Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillName()
	 * @generated
	 * @ordered
	 */
	protected static final String SKILL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkillName() <em>Skill Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillName()
	 * @generated
	 * @ordered
	 */
	protected String skillName = SKILL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArmor() <em>Armor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmor()
	 * @generated
	 * @ordered
	 */
	protected EList<Armor> armor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return MHW_API_DSLPackage.Literals.SKILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.SKILL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSlug()
	{
		return slug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlug(String newSlug)
	{
		String oldSlug = slug;
		slug = newSlug;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.SKILL__SLUG, oldSlug, slug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLevel()
	{
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(int newLevel)
	{
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.SKILL__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.SKILL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSkill()
	{
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkill(int newSkill)
	{
		int oldSkill = skill;
		skill = newSkill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.SKILL__SKILL, oldSkill, skill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSkillName()
	{
		return skillName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillName(String newSkillName)
	{
		String oldSkillName = skillName;
		skillName = newSkillName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.SKILL__SKILL_NAME, oldSkillName, skillName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Armor> getArmor()
	{
		if (armor == null)
		{
			armor = new EObjectWithInverseResolvingEList.ManyInverse<Armor>(Armor.class, this, MHW_API_DSLPackage.SKILL__ARMOR, MHW_API_DSLPackage.ARMOR__SKILL);
		}
		return armor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case MHW_API_DSLPackage.SKILL__ARMOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArmor()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case MHW_API_DSLPackage.SKILL__ARMOR:
				return ((InternalEList<?>)getArmor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case MHW_API_DSLPackage.SKILL__ID:
				return getId();
			case MHW_API_DSLPackage.SKILL__SLUG:
				return getSlug();
			case MHW_API_DSLPackage.SKILL__LEVEL:
				return getLevel();
			case MHW_API_DSLPackage.SKILL__DESCRIPTION:
				return getDescription();
			case MHW_API_DSLPackage.SKILL__SKILL:
				return getSkill();
			case MHW_API_DSLPackage.SKILL__SKILL_NAME:
				return getSkillName();
			case MHW_API_DSLPackage.SKILL__ARMOR:
				return getArmor();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MHW_API_DSLPackage.SKILL__ID:
				setId((Integer)newValue);
				return;
			case MHW_API_DSLPackage.SKILL__SLUG:
				setSlug((String)newValue);
				return;
			case MHW_API_DSLPackage.SKILL__LEVEL:
				setLevel((Integer)newValue);
				return;
			case MHW_API_DSLPackage.SKILL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MHW_API_DSLPackage.SKILL__SKILL:
				setSkill((Integer)newValue);
				return;
			case MHW_API_DSLPackage.SKILL__SKILL_NAME:
				setSkillName((String)newValue);
				return;
			case MHW_API_DSLPackage.SKILL__ARMOR:
				getArmor().clear();
				getArmor().addAll((Collection<? extends Armor>)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case MHW_API_DSLPackage.SKILL__ID:
				setId(ID_EDEFAULT);
				return;
			case MHW_API_DSLPackage.SKILL__SLUG:
				setSlug(SLUG_EDEFAULT);
				return;
			case MHW_API_DSLPackage.SKILL__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case MHW_API_DSLPackage.SKILL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MHW_API_DSLPackage.SKILL__SKILL:
				setSkill(SKILL_EDEFAULT);
				return;
			case MHW_API_DSLPackage.SKILL__SKILL_NAME:
				setSkillName(SKILL_NAME_EDEFAULT);
				return;
			case MHW_API_DSLPackage.SKILL__ARMOR:
				getArmor().clear();
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case MHW_API_DSLPackage.SKILL__ID:
				return id != ID_EDEFAULT;
			case MHW_API_DSLPackage.SKILL__SLUG:
				return SLUG_EDEFAULT == null ? slug != null : !SLUG_EDEFAULT.equals(slug);
			case MHW_API_DSLPackage.SKILL__LEVEL:
				return level != LEVEL_EDEFAULT;
			case MHW_API_DSLPackage.SKILL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MHW_API_DSLPackage.SKILL__SKILL:
				return skill != SKILL_EDEFAULT;
			case MHW_API_DSLPackage.SKILL__SKILL_NAME:
				return SKILL_NAME_EDEFAULT == null ? skillName != null : !SKILL_NAME_EDEFAULT.equals(skillName);
			case MHW_API_DSLPackage.SKILL__ARMOR:
				return armor != null && !armor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", slug: ");
		result.append(slug);
		result.append(", level: ");
		result.append(level);
		result.append(", description: ");
		result.append(description);
		result.append(", skill: ");
		result.append(skill);
		result.append(", skillName: ");
		result.append(skillName);
		result.append(')');
		return result.toString();
	}

} //SkillImpl
