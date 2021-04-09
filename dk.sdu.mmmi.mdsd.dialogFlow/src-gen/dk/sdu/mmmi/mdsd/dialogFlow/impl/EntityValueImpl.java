/**
 * generated by Xtext 2.24.0
 */
package dk.sdu.mmmi.mdsd.dialogFlow.impl;

import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage;
import dk.sdu.mmmi.mdsd.dialogFlow.EntitySynonyms;
import dk.sdu.mmmi.mdsd.dialogFlow.EntityValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityValueImpl#getValues <em>Values</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityValueImpl#getSynonyms <em>Synonyms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityValueImpl extends MinimalEObjectImpl.Container implements EntityValue
{
  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<String> values;

  /**
   * The cached value of the '{@link #getSynonyms() <em>Synonyms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSynonyms()
   * @generated
   * @ordered
   */
  protected EList<EntitySynonyms> synonyms;

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
  public EList<String> getValues()
  {
    if (values == null)
    {
      values = new EDataTypeEList<String>(String.class, this, DialogFlowPackage.ENTITY_VALUE__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EntitySynonyms> getSynonyms()
  {
    if (synonyms == null)
    {
      synonyms = new EObjectContainmentEList<EntitySynonyms>(EntitySynonyms.class, this, DialogFlowPackage.ENTITY_VALUE__SYNONYMS);
    }
    return synonyms;
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
        return ((InternalEList<?>)getSynonyms()).basicRemove(otherEnd, msgs);
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
      case DialogFlowPackage.ENTITY_VALUE__VALUES:
        return getValues();
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DialogFlowPackage.ENTITY_VALUE__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends String>)newValue);
        return;
      case DialogFlowPackage.ENTITY_VALUE__SYNONYMS:
        getSynonyms().clear();
        getSynonyms().addAll((Collection<? extends EntitySynonyms>)newValue);
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
      case DialogFlowPackage.ENTITY_VALUE__VALUES:
        getValues().clear();
        return;
      case DialogFlowPackage.ENTITY_VALUE__SYNONYMS:
        getSynonyms().clear();
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
      case DialogFlowPackage.ENTITY_VALUE__VALUES:
        return values != null && !values.isEmpty();
      case DialogFlowPackage.ENTITY_VALUE__SYNONYMS:
        return synonyms != null && !synonyms.isEmpty();
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
    result.append(" (values: ");
    result.append(values);
    result.append(')');
    return result.toString();
  }

} //EntityValueImpl
