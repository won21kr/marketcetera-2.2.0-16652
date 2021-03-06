package org.marketcetera.photon.views;

import org.marketcetera.trade.NewOrReplaceOrder;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Base order ticket controller.
 *
 * @version $Id: IOrderTicketController.java 16154 2012-07-14 16:34:05Z colin $
 * @since 0.5.0
 */
@ClassVersion("$Id: IOrderTicketController.java 16154 2012-07-14 16:34:05Z colin $")
public interface IOrderTicketController {
	void setOrderMessage(NewOrReplaceOrder order);

	NewOrReplaceOrder getOrder();
	
	void clear();
	
	void dispose();
	
	/**
     * Return the id of the perspective that is associated with this controller.
     * 
     * @return the perspective id
     */
    String getPerspectiveId();
    
    /**
     * Return the id of the view that is associated with this controller.
     * 
     * @return the view id
     */
    String getViewId();
}
