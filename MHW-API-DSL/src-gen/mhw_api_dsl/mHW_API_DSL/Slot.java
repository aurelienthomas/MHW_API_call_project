/**
 */
package mhw_api_dsl.mHW_API_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mhw-api-dsl.mHW_API_DSL.Slot#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends EObject
{
	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see mhw-api-dsl.mHW_API_DSL.MHW_API_DSLPackage#getSlot_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link mhw-api-dsl.mHW_API_DSL.Slot#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

} // Slot
