/**
 */
package mhw_api_dsl.mHW_API_DSL.impl;

import java.util.Collection;

import mhw_api_dsl.mHW_API_DSL.Armor;
import mhw_api_dsl.mHW_API_DSL.ArmorSet;
import mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage;

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
 * An implementation of the model object '<em><b>Armor Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.ArmorSetImpl#getId <em>Id</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.ArmorSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.ArmorSetImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.ArmorSetImpl#getPieces <em>Pieces</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.ArmorSetImpl#getArmor <em>Armor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArmorSetImpl extends MinimalEObjectImpl.Container implements ArmorSet
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
	 * The default value of the '{@link #getPieces() <em>Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieces()
	 * @generated
	 * @ordered
	 */
	protected static final int PIECES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPieces() <em>Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieces()
	 * @generated
	 * @ordered
	 */
	protected int pieces = PIECES_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArmorSetImpl()
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
		return MHW_API_DSLPackage.Literals.ARMOR_SET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.ARMOR_SET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.ARMOR_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRank()
	{
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRank(String newRank)
	{
		String oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.ARMOR_SET__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPieces()
	{
		return pieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPieces(int newPieces)
	{
		int oldPieces = pieces;
		pieces = newPieces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.ARMOR_SET__PIECES, oldPieces, pieces));
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
			armor = new EObjectContainmentEList<Armor>(Armor.class, this, MHW_API_DSLPackage.ARMOR_SET__ARMOR);
		}
		return armor;
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
			case MHW_API_DSLPackage.ARMOR_SET__ARMOR:
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
			case MHW_API_DSLPackage.ARMOR_SET__ID:
				return getId();
			case MHW_API_DSLPackage.ARMOR_SET__NAME:
				return getName();
			case MHW_API_DSLPackage.ARMOR_SET__RANK:
				return getRank();
			case MHW_API_DSLPackage.ARMOR_SET__PIECES:
				return getPieces();
			case MHW_API_DSLPackage.ARMOR_SET__ARMOR:
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
			case MHW_API_DSLPackage.ARMOR_SET__ID:
				setId((Integer)newValue);
				return;
			case MHW_API_DSLPackage.ARMOR_SET__NAME:
				setName((String)newValue);
				return;
			case MHW_API_DSLPackage.ARMOR_SET__RANK:
				setRank((String)newValue);
				return;
			case MHW_API_DSLPackage.ARMOR_SET__PIECES:
				setPieces((Integer)newValue);
				return;
			case MHW_API_DSLPackage.ARMOR_SET__ARMOR:
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
			case MHW_API_DSLPackage.ARMOR_SET__ID:
				setId(ID_EDEFAULT);
				return;
			case MHW_API_DSLPackage.ARMOR_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MHW_API_DSLPackage.ARMOR_SET__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case MHW_API_DSLPackage.ARMOR_SET__PIECES:
				setPieces(PIECES_EDEFAULT);
				return;
			case MHW_API_DSLPackage.ARMOR_SET__ARMOR:
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
			case MHW_API_DSLPackage.ARMOR_SET__ID:
				return id != ID_EDEFAULT;
			case MHW_API_DSLPackage.ARMOR_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MHW_API_DSLPackage.ARMOR_SET__RANK:
				return RANK_EDEFAULT == null ? rank != null : !RANK_EDEFAULT.equals(rank);
			case MHW_API_DSLPackage.ARMOR_SET__PIECES:
				return pieces != PIECES_EDEFAULT;
			case MHW_API_DSLPackage.ARMOR_SET__ARMOR:
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
		result.append(", name: ");
		result.append(name);
		result.append(", rank: ");
		result.append(rank);
		result.append(", pieces: ");
		result.append(pieces);
		result.append(')');
		return result.toString();
	}

} //ArmorSetImpl
