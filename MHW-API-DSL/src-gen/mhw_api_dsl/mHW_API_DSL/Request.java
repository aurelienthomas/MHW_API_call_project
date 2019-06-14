/**
 */
package mhw_api_dsl.mHW_API_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Request#getRequest <em>Request</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Request#getArmor <em>Armor</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Request#getWeapon <em>Weapon</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Request#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link mhw_api_dsl.mHW_API_DSL.Request#getCharm <em>Charm</em>}</li>
 * </ul>
 *
 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' attribute.
	 * @see #setRequest(String)
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getRequest_Request()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRequest();

	/**
	 * Sets the value of the '{@link mhw_api_dsl.mHW_API_DSL.Request#getRequest <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' attribute.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(String value);

	/**
	 * Returns the value of the '<em><b>Armor</b></em>' containment reference list.
	 * The list contents are of type {@link mhw_api_dsl.mHW_API_DSL.Armor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armor</em>' containment reference list.
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getRequest_Armor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Armor> getArmor();

	/**
	 * Returns the value of the '<em><b>Weapon</b></em>' containment reference list.
	 * The list contents are of type {@link mhw_api_dsl.mHW_API_DSL.Weapon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weapon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weapon</em>' containment reference list.
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getRequest_Weapon()
	 * @model containment="true"
	 * @generated
	 */
	EList<Weapon> getWeapon();

	/**
	 * Returns the value of the '<em><b>Decoration</b></em>' containment reference list.
	 * The list contents are of type {@link mhw_api_dsl.mHW_API_DSL.Decoration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration</em>' containment reference list.
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getRequest_Decoration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decoration> getDecoration();

	/**
	 * Returns the value of the '<em><b>Charm</b></em>' containment reference list.
	 * The list contents are of type {@link mhw_api_dsl.mHW_API_DSL.Charm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charm</em>' containment reference list.
	 * @see mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage#getRequest_Charm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Charm> getCharm();

} // Request
