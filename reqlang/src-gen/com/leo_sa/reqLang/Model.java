/**
 */
package com.leo_sa.reqLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.leo_sa.reqLang.Model#getModules <em>Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.leo_sa.reqLang.ReqLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
   * The list contents are of type {@link com.leo_sa.reqLang.Module}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modules</em>' containment reference list.
   * @see com.leo_sa.reqLang.ReqLangPackage#getModel_Modules()
   * @model containment="true"
   * @generated
   */
  EList<Module> getModules();

} // Model
