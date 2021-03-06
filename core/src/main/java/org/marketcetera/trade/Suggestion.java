package org.marketcetera.trade;

import org.marketcetera.util.misc.ClassVersion;

import java.math.BigDecimal;
import java.io.Serializable;

/* $License$ */
/**
 * Identifies data needed for an order suggestion.
 *
 * @author anshul@marketcetera.com
 * @version $Id: Suggestion.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: Suggestion.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public interface Suggestion extends Serializable {
    /**
     * The identifier for this suggestion.
     *
     * @return the identifier for this suggestion.
     */
    public String getIdentifier();

    /**
     * Sets the identifier for this suggestion.
     *
     * @param inIdentifier the identifier value.
     */
    public void  setIdentifier(String inIdentifier);

    /**
     * The score for this suggestion. Higher the value, the stronger
     * is the recommendation for this order. 
     *
     * @return the score for this suggestion.
     */
    public BigDecimal getScore();

    /**
     * The score for this suggestion.
     *
     * @param inScore the score value.
     */
    public void setScore(BigDecimal inScore);
}
