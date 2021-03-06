/**
 * $License$
 *
 * $Id: MDLatestTickImpl.java 16154 2012-07-14 16:34:05Z colin $
 */
package org.marketcetera.photon.model.marketdata.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.marketcetera.photon.model.marketdata.MDLatestTick;
import org.marketcetera.photon.model.marketdata.MDPackage;

import org.marketcetera.util.misc.ClassVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latest Tick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.marketcetera.photon.model.marketdata.impl.MDLatestTickImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.marketcetera.photon.model.marketdata.impl.MDLatestTickImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.marketcetera.photon.model.marketdata.impl.MDLatestTickImpl#getMultiplier <em>Multiplier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @since 2.0.0
 */
@ClassVersion("$Id: MDLatestTickImpl.java 16154 2012-07-14 16:34:05Z colin $")
public class MDLatestTickImpl extends MDItemImpl implements MDLatestTick {
    /**
     * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrice()
     * @generated
     * @ordered
     */
    protected static final BigDecimal PRICE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrice()
     * @generated
     * @ordered
     */
    protected volatile BigDecimal price = PRICE_EDEFAULT;

    /**
     * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected static final BigDecimal SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected volatile BigDecimal size = SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected static final BigDecimal MULTIPLIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected volatile BigDecimal multiplier = MULTIPLIER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MDLatestTickImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MDPackage.Literals.MD_LATEST_TICK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrice(BigDecimal newPrice) {
        BigDecimal oldPrice = price;
        price = newPrice;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MDPackage.MD_LATEST_TICK__PRICE, oldPrice, price));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal getSize() {
        return size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSize(BigDecimal newSize) {
        BigDecimal oldSize = size;
        size = newSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MDPackage.MD_LATEST_TICK__SIZE, oldSize, size));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMultiplier(BigDecimal newMultiplier) {
        BigDecimal oldMultiplier = multiplier;
        multiplier = newMultiplier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MDPackage.MD_LATEST_TICK__MULTIPLIER, oldMultiplier,
                    multiplier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MDPackage.MD_LATEST_TICK__PRICE:
            return getPrice();
        case MDPackage.MD_LATEST_TICK__SIZE:
            return getSize();
        case MDPackage.MD_LATEST_TICK__MULTIPLIER:
            return getMultiplier();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case MDPackage.MD_LATEST_TICK__PRICE:
            setPrice((BigDecimal) newValue);
            return;
        case MDPackage.MD_LATEST_TICK__SIZE:
            setSize((BigDecimal) newValue);
            return;
        case MDPackage.MD_LATEST_TICK__MULTIPLIER:
            setMultiplier((BigDecimal) newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
        case MDPackage.MD_LATEST_TICK__PRICE:
            setPrice(PRICE_EDEFAULT);
            return;
        case MDPackage.MD_LATEST_TICK__SIZE:
            setSize(SIZE_EDEFAULT);
            return;
        case MDPackage.MD_LATEST_TICK__MULTIPLIER:
            setMultiplier(MULTIPLIER_EDEFAULT);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case MDPackage.MD_LATEST_TICK__PRICE:
            return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT
                    .equals(price);
        case MDPackage.MD_LATEST_TICK__SIZE:
            return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT
                    .equals(size);
        case MDPackage.MD_LATEST_TICK__MULTIPLIER:
            return MULTIPLIER_EDEFAULT == null ? multiplier != null
                    : !MULTIPLIER_EDEFAULT.equals(multiplier);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (price: "); //$NON-NLS-1$
        result.append(price);
        result.append(", size: "); //$NON-NLS-1$
        result.append(size);
        result.append(", multiplier: "); //$NON-NLS-1$
        result.append(multiplier);
        result.append(')');
        return result.toString();
    }

} //MDLatestTickImpl
