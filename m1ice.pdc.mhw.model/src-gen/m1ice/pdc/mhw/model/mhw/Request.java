/**
 */
package m1ice.pdc.mhw.model.mhw;

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
 *   <li>{@link m1ice.pdc.mhw.model.mhw.Request#getName <em>Name</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.Request#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.Request#getCharm <em>Charm</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.Request#getArmor <em>Armor</em>}</li>
 *   <li>{@link m1ice.pdc.mhw.model.mhw.Request#getWeapon <em>Weapon</em>}</li>
 * </ul>
 *
 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getRequest_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link m1ice.pdc.mhw.model.mhw.Request#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Decoration</b></em>' containment reference list.
	 * The list contents are of type {@link m1ice.pdc.mhw.model.mhw.Decoration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration</em>' containment reference list.
	 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getRequest_Decoration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decoration> getDecoration();

	/**
	 * Returns the value of the '<em><b>Charm</b></em>' containment reference list.
	 * The list contents are of type {@link m1ice.pdc.mhw.model.mhw.Charm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charm</em>' containment reference list.
	 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getRequest_Charm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Charm> getCharm();

	/**
	 * Returns the value of the '<em><b>Armor</b></em>' containment reference list.
	 * The list contents are of type {@link m1ice.pdc.mhw.model.mhw.Armor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armor</em>' containment reference list.
	 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getRequest_Armor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Armor> getArmor();

	/**
	 * Returns the value of the '<em><b>Weapon</b></em>' containment reference list.
	 * The list contents are of type {@link m1ice.pdc.mhw.model.mhw.Weapon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weapon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weapon</em>' containment reference list.
	 * @see m1ice.pdc.mhw.model.mhw.MhwPackage#getRequest_Weapon()
	 * @model containment="true"
	 * @generated
	 */
	EList<Weapon> getWeapon();

} // Request
