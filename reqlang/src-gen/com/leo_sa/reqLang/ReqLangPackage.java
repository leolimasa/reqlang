/**
 */
package com.leo_sa.reqLang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.leo_sa.reqLang.ReqLangFactory
 * @model kind="package"
 * @generated
 */
public interface ReqLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "reqLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.leo_sa.com/ReqLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "reqLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ReqLangPackage eINSTANCE = com.leo_sa.reqLang.impl.ReqLangPackageImpl.init();

  /**
   * The meta object id for the '{@link com.leo_sa.reqLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.leo_sa.reqLang.impl.ModelImpl
   * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODULES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.leo_sa.reqLang.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.leo_sa.reqLang.impl.ModuleImpl
   * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getModule()
   * @generated
   */
  int MODULE = 1;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.leo_sa.reqLang.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.leo_sa.reqLang.impl.ClassImpl
   * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 2;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.leo_sa.reqLang.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.leo_sa.reqLang.impl.PropertyImpl
   * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 3;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.leo_sa.reqLang.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.leo_sa.reqLang.impl.FunctionImpl
   * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 4;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.leo_sa.reqLang.impl.PrefixImpl <em>Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.leo_sa.reqLang.impl.PrefixImpl
   * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getPrefix()
   * @generated
   */
  int PREFIX = 5;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__FUNCTIONS = MODULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__CLASSES = MODULE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__RETURN_TYPE = MODULE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__PROPERTIES = MODULE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__ARGS = MODULE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__DESCRIPTION = MODULE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__ACTION = MODULE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__MODIFIERS = MODULE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__NAME = MODULE_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FEATURE_COUNT = MODULE_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link com.leo_sa.reqLang.impl.ModifierImpl <em>Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.leo_sa.reqLang.impl.ModifierImpl
   * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 6;

  /**
   * The feature id for the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__PRIVATE = 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__ABSTRACT = 1;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__STATIC = 2;

  /**
   * The number of structural features of the '<em>Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.leo_sa.reqLang.Action <em>Action</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.leo_sa.reqLang.Action
   * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getAction()
   * @generated
   */
  int ACTION = 7;


  /**
   * Returns the meta object for class '{@link com.leo_sa.reqLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.leo_sa.reqLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.leo_sa.reqLang.Model#getModules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modules</em>'.
   * @see com.leo_sa.reqLang.Model#getModules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Modules();

  /**
   * Returns the meta object for class '{@link com.leo_sa.reqLang.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see com.leo_sa.reqLang.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for class '{@link com.leo_sa.reqLang.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see com.leo_sa.reqLang.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for class '{@link com.leo_sa.reqLang.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see com.leo_sa.reqLang.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for class '{@link com.leo_sa.reqLang.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see com.leo_sa.reqLang.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for class '{@link com.leo_sa.reqLang.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix</em>'.
   * @see com.leo_sa.reqLang.Prefix
   * @generated
   */
  EClass getPrefix();

  /**
   * Returns the meta object for the containment reference list '{@link com.leo_sa.reqLang.Prefix#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see com.leo_sa.reqLang.Prefix#getFunctions()
   * @see #getPrefix()
   * @generated
   */
  EReference getPrefix_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link com.leo_sa.reqLang.Prefix#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see com.leo_sa.reqLang.Prefix#getClasses()
   * @see #getPrefix()
   * @generated
   */
  EReference getPrefix_Classes();

  /**
   * Returns the meta object for the reference '{@link com.leo_sa.reqLang.Prefix#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Return Type</em>'.
   * @see com.leo_sa.reqLang.Prefix#getReturnType()
   * @see #getPrefix()
   * @generated
   */
  EReference getPrefix_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link com.leo_sa.reqLang.Prefix#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see com.leo_sa.reqLang.Prefix#getProperties()
   * @see #getPrefix()
   * @generated
   */
  EReference getPrefix_Properties();

  /**
   * Returns the meta object for the attribute list '{@link com.leo_sa.reqLang.Prefix#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see com.leo_sa.reqLang.Prefix#getArgs()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Args();

  /**
   * Returns the meta object for the attribute list '{@link com.leo_sa.reqLang.Prefix#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Description</em>'.
   * @see com.leo_sa.reqLang.Prefix#getDescription()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Description();

  /**
   * Returns the meta object for the attribute '{@link com.leo_sa.reqLang.Prefix#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see com.leo_sa.reqLang.Prefix#getAction()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Action();

  /**
   * Returns the meta object for the containment reference '{@link com.leo_sa.reqLang.Prefix#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifiers</em>'.
   * @see com.leo_sa.reqLang.Prefix#getModifiers()
   * @see #getPrefix()
   * @generated
   */
  EReference getPrefix_Modifiers();

  /**
   * Returns the meta object for the attribute '{@link com.leo_sa.reqLang.Prefix#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leo_sa.reqLang.Prefix#getName()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Name();

  /**
   * Returns the meta object for class '{@link com.leo_sa.reqLang.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier</em>'.
   * @see com.leo_sa.reqLang.Modifier
   * @generated
   */
  EClass getModifier();

  /**
   * Returns the meta object for the attribute '{@link com.leo_sa.reqLang.Modifier#isPrivate <em>Private</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Private</em>'.
   * @see com.leo_sa.reqLang.Modifier#isPrivate()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Private();

  /**
   * Returns the meta object for the attribute '{@link com.leo_sa.reqLang.Modifier#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see com.leo_sa.reqLang.Modifier#isAbstract()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Abstract();

  /**
   * Returns the meta object for the attribute '{@link com.leo_sa.reqLang.Modifier#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see com.leo_sa.reqLang.Modifier#isStatic()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Static();

  /**
   * Returns the meta object for enum '{@link com.leo_sa.reqLang.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Action</em>'.
   * @see com.leo_sa.reqLang.Action
   * @generated
   */
  EEnum getAction();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ReqLangFactory getReqLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.leo_sa.reqLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.leo_sa.reqLang.impl.ModelImpl
     * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODULES = eINSTANCE.getModel_Modules();

    /**
     * The meta object literal for the '{@link com.leo_sa.reqLang.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.leo_sa.reqLang.impl.ModuleImpl
     * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '{@link com.leo_sa.reqLang.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.leo_sa.reqLang.impl.ClassImpl
     * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '{@link com.leo_sa.reqLang.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.leo_sa.reqLang.impl.PropertyImpl
     * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '{@link com.leo_sa.reqLang.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.leo_sa.reqLang.impl.FunctionImpl
     * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '{@link com.leo_sa.reqLang.impl.PrefixImpl <em>Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.leo_sa.reqLang.impl.PrefixImpl
     * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getPrefix()
     * @generated
     */
    EClass PREFIX = eINSTANCE.getPrefix();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX__FUNCTIONS = eINSTANCE.getPrefix_Functions();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX__CLASSES = eINSTANCE.getPrefix_Classes();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX__RETURN_TYPE = eINSTANCE.getPrefix_ReturnType();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX__PROPERTIES = eINSTANCE.getPrefix_Properties();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX__ARGS = eINSTANCE.getPrefix_Args();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX__DESCRIPTION = eINSTANCE.getPrefix_Description();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX__ACTION = eINSTANCE.getPrefix_Action();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX__MODIFIERS = eINSTANCE.getPrefix_Modifiers();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX__NAME = eINSTANCE.getPrefix_Name();

    /**
     * The meta object literal for the '{@link com.leo_sa.reqLang.impl.ModifierImpl <em>Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.leo_sa.reqLang.impl.ModifierImpl
     * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getModifier()
     * @generated
     */
    EClass MODIFIER = eINSTANCE.getModifier();

    /**
     * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__PRIVATE = eINSTANCE.getModifier_Private();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__ABSTRACT = eINSTANCE.getModifier_Abstract();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__STATIC = eINSTANCE.getModifier_Static();

    /**
     * The meta object literal for the '{@link com.leo_sa.reqLang.Action <em>Action</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.leo_sa.reqLang.Action
     * @see com.leo_sa.reqLang.impl.ReqLangPackageImpl#getAction()
     * @generated
     */
    EEnum ACTION = eINSTANCE.getAction();

  }

} //ReqLangPackage
