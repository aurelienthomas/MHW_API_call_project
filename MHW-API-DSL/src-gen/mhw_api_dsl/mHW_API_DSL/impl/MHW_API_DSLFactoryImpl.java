/**
 */
package mhw_api_dsl.mHW_API_DSL.impl;

import mhw_api_dsl.mHW_API_DSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MHW_API_DSLFactoryImpl extends EFactoryImpl implements MHW_API_DSLFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MHW_API_DSLFactory init()
	{
		try
		{
			MHW_API_DSLFactory theMHW_API_DSLFactory = (MHW_API_DSLFactory)EPackage.Registry.INSTANCE.getEFactory(MHW_API_DSLPackage.eNS_URI);
			if (theMHW_API_DSLFactory != null)
			{
				return theMHW_API_DSLFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MHW_API_DSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MHW_API_DSLFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case MHW_API_DSLPackage.ARMOR: return createArmor();
			case MHW_API_DSLPackage.ARMOR_SET: return createArmorSet();
			case MHW_API_DSLPackage.SLOT: return createSlot();
			case MHW_API_DSLPackage.RESISTANCE: return createResistance();
			case MHW_API_DSLPackage.SKILL: return createSkill();
			case MHW_API_DSLPackage.ITEM: return createItem();
			case MHW_API_DSLPackage.MATERIAL: return createMaterial();
			case MHW_API_DSLPackage.DEFENCE: return createDefence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Armor createArmor()
	{
		ArmorImpl armor = new ArmorImpl();
		return armor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArmorSet createArmorSet()
	{
		ArmorSetImpl armorSet = new ArmorSetImpl();
		return armorSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Slot createSlot()
	{
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resistance createResistance()
	{
		ResistanceImpl resistance = new ResistanceImpl();
		return resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Skill createSkill()
	{
		SkillImpl skill = new SkillImpl();
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Item createItem()
	{
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Material createMaterial()
	{
		MaterialImpl material = new MaterialImpl();
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Defence createDefence()
	{
		DefenceImpl defence = new DefenceImpl();
		return defence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MHW_API_DSLPackage getMHW_API_DSLPackage()
	{
		return (MHW_API_DSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MHW_API_DSLPackage getPackage()
	{
		return MHW_API_DSLPackage.eINSTANCE;
	}

} //MHW_API_DSLFactoryImpl
