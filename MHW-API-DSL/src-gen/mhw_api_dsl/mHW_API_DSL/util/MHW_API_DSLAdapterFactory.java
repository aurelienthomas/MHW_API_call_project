/**
 */
package mhw_api_dsl.mHW_API_DSL.util;

import mhw_api_dsl.mHW_API_DSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage
 * @generated
 */
public class MHW_API_DSLAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MHW_API_DSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MHW_API_DSLAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = MHW_API_DSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MHW_API_DSLSwitch<Adapter> modelSwitch =
		new MHW_API_DSLSwitch<Adapter>()
		{
			@Override
			public Adapter caseArmor(Armor object)
			{
				return createArmorAdapter();
			}
			@Override
			public Adapter caseArmorSet(ArmorSet object)
			{
				return createArmorSetAdapter();
			}
			@Override
			public Adapter caseSlot(Slot object)
			{
				return createSlotAdapter();
			}
			@Override
			public Adapter caseResistance(Resistance object)
			{
				return createResistanceAdapter();
			}
			@Override
			public Adapter caseSkill(Skill object)
			{
				return createSkillAdapter();
			}
			@Override
			public Adapter caseItem(Item object)
			{
				return createItemAdapter();
			}
			@Override
			public Adapter caseMaterial(Material object)
			{
				return createMaterialAdapter();
			}
			@Override
			public Adapter caseDefence(Defence object)
			{
				return createDefenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mhw-api-dsl.mHW_API_DSL.Armor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mhw-api-dsl.mHW_API_DSL.Armor
	 * @generated
	 */
	public Adapter createArmorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mhw-api-dsl.mHW_API_DSL.ArmorSet <em>Armor Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mhw-api-dsl.mHW_API_DSL.ArmorSet
	 * @generated
	 */
	public Adapter createArmorSetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mhw-api-dsl.mHW_API_DSL.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mhw-api-dsl.mHW_API_DSL.Slot
	 * @generated
	 */
	public Adapter createSlotAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mhw-api-dsl.mHW_API_DSL.Resistance <em>Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mhw-api-dsl.mHW_API_DSL.Resistance
	 * @generated
	 */
	public Adapter createResistanceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mhw-api-dsl.mHW_API_DSL.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mhw-api-dsl.mHW_API_DSL.Skill
	 * @generated
	 */
	public Adapter createSkillAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mhw-api-dsl.mHW_API_DSL.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mhw-api-dsl.mHW_API_DSL.Item
	 * @generated
	 */
	public Adapter createItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mhw-api-dsl.mHW_API_DSL.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mhw-api-dsl.mHW_API_DSL.Material
	 * @generated
	 */
	public Adapter createMaterialAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mhw-api-dsl.mHW_API_DSL.Defence <em>Defence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mhw-api-dsl.mHW_API_DSL.Defence
	 * @generated
	 */
	public Adapter createDefenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //MHW_API_DSLAdapterFactory
