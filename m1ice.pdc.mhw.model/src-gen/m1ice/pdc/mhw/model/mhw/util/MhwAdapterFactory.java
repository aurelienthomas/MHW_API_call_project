/**
 */
package m1ice.pdc.mhw.model.mhw.util;

import m1ice.pdc.mhw.model.mhw.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see m1ice.pdc.mhw.model.mhw.MhwPackage
 * @generated
 */
public class MhwAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MhwPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MhwAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MhwPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MhwSwitch<Adapter> modelSwitch = new MhwSwitch<Adapter>() {
		@Override
		public Adapter caseRequest(Request object) {
			return createRequestAdapter();
		}

		@Override
		public Adapter caseArmor(Armor object) {
			return createArmorAdapter();
		}

		@Override
		public Adapter caseWeapon(Weapon object) {
			return createWeaponAdapter();
		}

		@Override
		public Adapter caseCharm(Charm object) {
			return createCharmAdapter();
		}

		@Override
		public Adapter caseDecoration(Decoration object) {
			return createDecorationAdapter();
		}

		@Override
		public Adapter caseSkill(Skill object) {
			return createSkillAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link m1ice.pdc.mhw.model.mhw.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m1ice.pdc.mhw.model.mhw.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m1ice.pdc.mhw.model.mhw.Armor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m1ice.pdc.mhw.model.mhw.Armor
	 * @generated
	 */
	public Adapter createArmorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m1ice.pdc.mhw.model.mhw.Weapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m1ice.pdc.mhw.model.mhw.Weapon
	 * @generated
	 */
	public Adapter createWeaponAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m1ice.pdc.mhw.model.mhw.Charm <em>Charm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m1ice.pdc.mhw.model.mhw.Charm
	 * @generated
	 */
	public Adapter createCharmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m1ice.pdc.mhw.model.mhw.Decoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m1ice.pdc.mhw.model.mhw.Decoration
	 * @generated
	 */
	public Adapter createDecorationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m1ice.pdc.mhw.model.mhw.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m1ice.pdc.mhw.model.mhw.Skill
	 * @generated
	 */
	public Adapter createSkillAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MhwAdapterFactory
