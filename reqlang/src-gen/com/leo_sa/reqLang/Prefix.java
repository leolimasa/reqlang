/**
 */
package com.leo_sa.reqLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.leo_sa.reqLang.Prefix#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.Prefix#getClasses <em>Classes</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.Prefix#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.Prefix#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.Prefix#getArgs <em>Args</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.Prefix#getDescription <em>Description</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.Prefix#getAction <em>Action</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.Prefix#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.Prefix#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.leo_sa.reqLang.ReqLangPackage#getPrefix()
 * @model
 * @generated
 */
public interface Prefix extends Module, com.leo_sa.reqLang.Class, Property, Function
{
  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link com.leo_sa.reqLang.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see com.leo_sa.reqLang.ReqLangPackage#getPrefix_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link com.leo_sa.reqLang.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see com.leo_sa.reqLang.ReqLangPackage#getPrefix_Classes()
   * @model containment="true"
   * @generated
   */
  EList<com.leo_sa.reqLang.Class> getClasses();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' reference.
   * @see #setReturnType(com.leo_sa.reqLang.Class)
   * @see com.leo_sa.reqLang.ReqLangPackage#getPrefix_ReturnType()
   * @model
   * @generated
   */
  com.leo_sa.reqLang.Class getReturnType();

  /**
   * Sets the value of the '{@link com.leo_sa.reqLang.Prefix#getReturnType <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(com.leo_sa.reqLang.Class value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.leo_sa.reqLang.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see com.leo_sa.reqLang.ReqLangPackage#getPrefix_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Args</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' attribute list.
   * @see com.leo_sa.reqLang.ReqLangPackage#getPrefix_Args()
   * @model unique="false"
   * @generated
   */
  EList<String> getArgs();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute list.
   * @see com.leo_sa.reqLang.ReqLangPackage#getPrefix_Description()
   * @model unique="false"
   * @generated
   */
  EList<String> getDescription();

  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * The literals are from the enumeration {@link com.leo_sa.reqLang.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see com.leo_sa.reqLang.Action
   * @see #setAction(Action)
   * @see com.leo_sa.reqLang.ReqLangPackage#getPrefix_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link com.leo_sa.reqLang.Prefix#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see com.leo_sa.reqLang.Action
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' containment reference.
   * @see #setModifiers(Modifier)
   * @see com.leo_sa.reqLang.ReqLangPackage#getPrefix_Modifiers()
   * @model containment="true"
   * @generated
   */
  Modifier getModifiers();

  /**
   * Sets the value of the '{@link com.leo_sa.reqLang.Prefix#getModifiers <em>Modifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifiers</em>' containment reference.
   * @see #getModifiers()
   * @generated
   */
  void setModifiers(Modifier value);

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
   * @see com.leo_sa.reqLang.ReqLangPackage#getPrefix_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.leo_sa.reqLang.Prefix#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Prefix
