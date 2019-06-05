/**
 */
package mhw_api_dsl.mHW_API_DSL.impl;

import mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage;
import mhw_api_dsl.mHW_API_DSL.Resistance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resistance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.ResistanceImpl#getFire <em>Fire</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.ResistanceImpl#getWater <em>Water</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.ResistanceImpl#getIce <em>Ice</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.ResistanceImpl#getThunder <em>Thunder</em>}</li>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.impl.ResistanceImpl#getDragon <em>Dragon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResistanceImpl extends MinimalEObjectImpl.Container implements Resistance
{
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResistanceImpl()
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
		return MHW_API_DSLPackage.Literals.RESISTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFire()
	{
		return fire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFire(int newFire)
	{
		int oldFire = fire;
		fire = newFire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.RESISTANCE__FIRE, oldFire, fire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWater()
	{
		return water;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWater(int newWater)
	{
		int oldWater = water;
		water = newWater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.RESISTANCE__WATER, oldWater, water));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIce()
	{
		return ice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIce(int newIce)
	{
		int oldIce = ice;
		ice = newIce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.RESISTANCE__ICE, oldIce, ice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getThunder()
	{
		return thunder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThunder(int newThunder)
	{
		int oldThunder = thunder;
		thunder = newThunder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.RESISTANCE__THUNDER, oldThunder, thunder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDragon()
	{
		return dragon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDragon(int newDragon)
	{
		int oldDragon = dragon;
		dragon = newDragon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MHW_API_DSLPackage.RESISTANCE__DRAGON, oldDragon, dragon));
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
			case MHW_API_DSLPackage.RESISTANCE__FIRE:
				return getFire();
			case MHW_API_DSLPackage.RESISTANCE__WATER:
				return getWater();
			case MHW_API_DSLPackage.RESISTANCE__ICE:
				return getIce();
			case MHW_API_DSLPackage.RESISTANCE__THUNDER:
				return getThunder();
			case MHW_API_DSLPackage.RESISTANCE__DRAGON:
				return getDragon();
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
			case MHW_API_DSLPackage.RESISTANCE__FIRE:
				setFire((Integer)newValue);
				return;
			case MHW_API_DSLPackage.RESISTANCE__WATER:
				setWater((Integer)newValue);
				return;
			case MHW_API_DSLPackage.RESISTANCE__ICE:
				setIce((Integer)newValue);
				return;
			case MHW_API_DSLPackage.RESISTANCE__THUNDER:
				setThunder((Integer)newValue);
				return;
			case MHW_API_DSLPackage.RESISTANCE__DRAGON:
				setDragon((Integer)newValue);
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
			case MHW_API_DSLPackage.RESISTANCE__FIRE:
				setFire(FIRE_EDEFAULT);
				return;
			case MHW_API_DSLPackage.RESISTANCE__WATER:
				setWater(WATER_EDEFAULT);
				return;
			case MHW_API_DSLPackage.RESISTANCE__ICE:
				setIce(ICE_EDEFAULT);
				return;
			case MHW_API_DSLPackage.RESISTANCE__THUNDER:
				setThunder(THUNDER_EDEFAULT);
				return;
			case MHW_API_DSLPackage.RESISTANCE__DRAGON:
				setDragon(DRAGON_EDEFAULT);
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
			case MHW_API_DSLPackage.RESISTANCE__FIRE:
				return fire != FIRE_EDEFAULT;
			case MHW_API_DSLPackage.RESISTANCE__WATER:
				return water != WATER_EDEFAULT;
			case MHW_API_DSLPackage.RESISTANCE__ICE:
				return ice != ICE_EDEFAULT;
			case MHW_API_DSLPackage.RESISTANCE__THUNDER:
				return thunder != THUNDER_EDEFAULT;
			case MHW_API_DSLPackage.RESISTANCE__DRAGON:
				return dragon != DRAGON_EDEFAULT;
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
		result.append(" (fire: ");
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

} //ResistanceImpl
