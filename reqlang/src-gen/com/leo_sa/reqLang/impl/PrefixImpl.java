/**
 */
package com.leo_sa.reqLang.impl;

import com.leo_sa.reqLang.Action;
import com.leo_sa.reqLang.Function;
import com.leo_sa.reqLang.Modifier;
import com.leo_sa.reqLang.Prefix;
import com.leo_sa.reqLang.Property;
import com.leo_sa.reqLang.ReqLangPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.leo_sa.reqLang.impl.PrefixImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.impl.PrefixImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.impl.PrefixImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.impl.PrefixImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.impl.PrefixImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.impl.PrefixImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.impl.PrefixImpl#getAction <em>Action</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.impl.PrefixImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link com.leo_sa.reqLang.impl.PrefixImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrefixImpl extends ModuleImpl implements Prefix
{
  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<Function> functions;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<com.leo_sa.reqLang.Class> classes;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected com.leo_sa.reqLang.Class returnType;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<String> args;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected EList<String> description;

  /**
   * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected static final Action ACTION_EDEFAULT = Action.ADD;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action = ACTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers()
   * @generated
   * @ordered
   */
  protected Modifier modifiers;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrefixImpl()
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
    return ReqLangPackage.Literals.PREFIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<Function>(Function.class, this, ReqLangPackage.PREFIX__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<com.leo_sa.reqLang.Class> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<com.leo_sa.reqLang.Class>(com.leo_sa.reqLang.Class.class, this, ReqLangPackage.PREFIX__CLASSES);
    }
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.leo_sa.reqLang.Class getReturnType()
  {
    if (returnType != null && returnType.eIsProxy())
    {
      InternalEObject oldReturnType = (InternalEObject)returnType;
      returnType = (com.leo_sa.reqLang.Class)eResolveProxy(oldReturnType);
      if (returnType != oldReturnType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqLangPackage.PREFIX__RETURN_TYPE, oldReturnType, returnType));
      }
    }
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.leo_sa.reqLang.Class basicGetReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(com.leo_sa.reqLang.Class newReturnType)
  {
    com.leo_sa.reqLang.Class oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLangPackage.PREFIX__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, ReqLangPackage.PREFIX__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getArgs()
  {
    if (args == null)
    {
      args = new EDataTypeEList<String>(String.class, this, ReqLangPackage.PREFIX__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDescription()
  {
    if (description == null)
    {
      description = new EDataTypeEList<String>(String.class, this, ReqLangPackage.PREFIX__DESCRIPTION);
    }
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Action newAction)
  {
    Action oldAction = action;
    action = newAction == null ? ACTION_EDEFAULT : newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLangPackage.PREFIX__ACTION, oldAction, action));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modifier getModifiers()
  {
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModifiers(Modifier newModifiers, NotificationChain msgs)
  {
    Modifier oldModifiers = modifiers;
    modifiers = newModifiers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLangPackage.PREFIX__MODIFIERS, oldModifiers, newModifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifiers(Modifier newModifiers)
  {
    if (newModifiers != modifiers)
    {
      NotificationChain msgs = null;
      if (modifiers != null)
        msgs = ((InternalEObject)modifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLangPackage.PREFIX__MODIFIERS, null, msgs);
      if (newModifiers != null)
        msgs = ((InternalEObject)newModifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLangPackage.PREFIX__MODIFIERS, null, msgs);
      msgs = basicSetModifiers(newModifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLangPackage.PREFIX__MODIFIERS, newModifiers, newModifiers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLangPackage.PREFIX__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ReqLangPackage.PREFIX__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case ReqLangPackage.PREFIX__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
      case ReqLangPackage.PREFIX__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case ReqLangPackage.PREFIX__MODIFIERS:
        return basicSetModifiers(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ReqLangPackage.PREFIX__FUNCTIONS:
        return getFunctions();
      case ReqLangPackage.PREFIX__CLASSES:
        return getClasses();
      case ReqLangPackage.PREFIX__RETURN_TYPE:
        if (resolve) return getReturnType();
        return basicGetReturnType();
      case ReqLangPackage.PREFIX__PROPERTIES:
        return getProperties();
      case ReqLangPackage.PREFIX__ARGS:
        return getArgs();
      case ReqLangPackage.PREFIX__DESCRIPTION:
        return getDescription();
      case ReqLangPackage.PREFIX__ACTION:
        return getAction();
      case ReqLangPackage.PREFIX__MODIFIERS:
        return getModifiers();
      case ReqLangPackage.PREFIX__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReqLangPackage.PREFIX__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Function>)newValue);
        return;
      case ReqLangPackage.PREFIX__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends com.leo_sa.reqLang.Class>)newValue);
        return;
      case ReqLangPackage.PREFIX__RETURN_TYPE:
        setReturnType((com.leo_sa.reqLang.Class)newValue);
        return;
      case ReqLangPackage.PREFIX__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case ReqLangPackage.PREFIX__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends String>)newValue);
        return;
      case ReqLangPackage.PREFIX__DESCRIPTION:
        getDescription().clear();
        getDescription().addAll((Collection<? extends String>)newValue);
        return;
      case ReqLangPackage.PREFIX__ACTION:
        setAction((Action)newValue);
        return;
      case ReqLangPackage.PREFIX__MODIFIERS:
        setModifiers((Modifier)newValue);
        return;
      case ReqLangPackage.PREFIX__NAME:
        setName((String)newValue);
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
      case ReqLangPackage.PREFIX__FUNCTIONS:
        getFunctions().clear();
        return;
      case ReqLangPackage.PREFIX__CLASSES:
        getClasses().clear();
        return;
      case ReqLangPackage.PREFIX__RETURN_TYPE:
        setReturnType((com.leo_sa.reqLang.Class)null);
        return;
      case ReqLangPackage.PREFIX__PROPERTIES:
        getProperties().clear();
        return;
      case ReqLangPackage.PREFIX__ARGS:
        getArgs().clear();
        return;
      case ReqLangPackage.PREFIX__DESCRIPTION:
        getDescription().clear();
        return;
      case ReqLangPackage.PREFIX__ACTION:
        setAction(ACTION_EDEFAULT);
        return;
      case ReqLangPackage.PREFIX__MODIFIERS:
        setModifiers((Modifier)null);
        return;
      case ReqLangPackage.PREFIX__NAME:
        setName(NAME_EDEFAULT);
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
      case ReqLangPackage.PREFIX__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case ReqLangPackage.PREFIX__CLASSES:
        return classes != null && !classes.isEmpty();
      case ReqLangPackage.PREFIX__RETURN_TYPE:
        return returnType != null;
      case ReqLangPackage.PREFIX__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case ReqLangPackage.PREFIX__ARGS:
        return args != null && !args.isEmpty();
      case ReqLangPackage.PREFIX__DESCRIPTION:
        return description != null && !description.isEmpty();
      case ReqLangPackage.PREFIX__ACTION:
        return action != ACTION_EDEFAULT;
      case ReqLangPackage.PREFIX__MODIFIERS:
        return modifiers != null;
      case ReqLangPackage.PREFIX__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (args: ");
    result.append(args);
    result.append(", description: ");
    result.append(description);
    result.append(", action: ");
    result.append(action);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PrefixImpl
