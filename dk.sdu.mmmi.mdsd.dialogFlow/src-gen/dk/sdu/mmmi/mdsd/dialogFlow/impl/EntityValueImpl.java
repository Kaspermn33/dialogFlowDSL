/**
 * generated by Xtext 2.24.0
 */
package dk.sdu.mmmi.mdsd.dialogFlow.impl;

import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage;
import dk.sdu.mmmi.mdsd.dialogFlow.EntitySynonyms;
import dk.sdu.mmmi.mdsd.dialogFlow.EntityValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityValueImpl#getSynonyms <em>Synonyms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityValueImpl extends MinimalEObjectImpl.Container implements EntityValue
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSynonyms() <em>Synonyms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSynonyms()
   * @generated
   * @ordered
   */
  protected EntitySynonyms synonyms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityValueImpl()
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
    return DialogFlowPackage.Literals.ENTITY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogFlowPackage.ENTITY_VALUE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntitySynonyms getSynonyms()
  {
    return synonyms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSynonyms(EntitySynonyms newSynonyms, NotificationChain msgs)
  {
    EntitySynonyms oldSynonyms = synonyms;
    synonyms = newSynonyms;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogFlowPackage.ENTITY_VALUE__SYNONYMS, oldSynonyms, newSynonyms);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSynonyms(EntitySynonyms newSynonyms)
  {
    if (newSynonyms != synonyms)
    {
      NotificationChain msgs = null;
      if (synonyms != null)
        msgs = ((InternalEObject)synonyms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogFlowPackage.ENTITY_VALUE__SYNONYMS, null, msgs);
      if (newSynonyms != null)
        msgs = ((InternalEObject)newSynonyms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogFlowPackage.ENTITY_VALUE__SYNONYMS, null, msgs);
      msgs = basicSetSynonyms(newSynonyms, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogFlowPackage.ENTITY_VALUE__SYNONYMS, newSynonyms, newSynonyms));
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
      case DialogFlowPackage.ENTITY_VALUE__SYNONYMS:
        return basicSetSynonyms(null, msgs);
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
      case DialogFlowPackage.ENTITY_VALUE__VALUE:
        return getValue();
      case DialogFlowPackage.ENTITY_VALUE__SYNONYMS:
        return getSynonyms();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DialogFlowPackage.ENTITY_VALUE__VALUE:
        setValue((String)newValue);
        return;
      case DialogFlowPackage.ENTITY_VALUE__SYNONYMS:
        setSynonyms((EntitySynonyms)newValue);
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
      case DialogFlowPackage.ENTITY_VALUE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DialogFlowPackage.ENTITY_VALUE__SYNONYMS:
        setSynonyms((EntitySynonyms)null);
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
      case DialogFlowPackage.ENTITY_VALUE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case DialogFlowPackage.ENTITY_VALUE__SYNONYMS:
        return synonyms != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //EntityValueImpl
