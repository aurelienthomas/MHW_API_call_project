/**
 */
package mhw_api_dsl.mHW_API_DSL.impl;

import mhw_api_dsl.mHW_API_DSL.Armor;
import mhw_api_dsl.mHW_API_DSL.Item;
import mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage;
import mhw_api_dsl.mHW_API_DSL.Material;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.MaterialImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.MaterialImpl#getArmor <em>Armor</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.MaterialImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialImpl extends MinimalEObjectImpl.Container implements Material
{
	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArmor() <em>Armor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmor()
	 * @generated
	 * @ordered
	 */
	protected Armor armor;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected Item item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialImpl()
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
		return MHW_API_DSLPackage.Literals.MATERIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantity()
	{
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(int newQuantity)
	{
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.MATERIAL__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Armor getArmor()
	{
		if (armor != null && armor.eIsProxy())
		{
			InternalEObject oldArmor = (InternalEObject)armor;
			armor = (Armor)eResolveProxy(oldArmor);
			if (armor != oldArmor)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MHW_API_DSLPackage.MATERIAL__ARMOR, oldArmor, armor));
			}
		}
		return armor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Armor basicGetArmor()
	{
		return armor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArmor(Armor newArmor)
	{
		Armor oldArmor = armor;
		armor = newArmor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.MATERIAL__ARMOR, oldArmor, armor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Item getItem()
	{
		if (item != null && item.eIsProxy())
		{
			InternalEObject oldItem = (InternalEObject)item;
			item = (Item)eResolveProxy(oldItem);
			if (item != oldItem)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MHW_API_DSLPackage.MATERIAL__ITEM, oldItem, item));
			}
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetItem()
	{
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItem(Item newItem)
	{
		Item oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.MATERIAL__ITEM, oldItem, item));
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
			case MHW_API_DSLPackage.MATERIAL__QUANTITY:
				return getQuantity();
			case MHW_API_DSLPackage.MATERIAL__ARMOR:
				if (resolve) return getArmor();
				return basicGetArmor();
			case MHW_API_DSLPackage.MATERIAL__ITEM:
				if (resolve) return getItem();
				return basicGetItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MHW_API_DSLPackage.MATERIAL__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case MHW_API_DSLPackage.MATERIAL__ARMOR:
				setArmor((Armor)newValue);
				return;
			case MHW_API_DSLPackage.MATERIAL__ITEM:
				setItem((Item)newValue);
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
			case MHW_API_DSLPackage.MATERIAL__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case MHW_API_DSLPackage.MATERIAL__ARMOR:
				setArmor((Armor)null);
				return;
			case MHW_API_DSLPackage.MATERIAL__ITEM:
				setItem((Item)null);
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
			case MHW_API_DSLPackage.MATERIAL__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case MHW_API_DSLPackage.MATERIAL__ARMOR:
				return armor != null;
			case MHW_API_DSLPackage.MATERIAL__ITEM:
				return item != null;
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
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //MaterialImpl
