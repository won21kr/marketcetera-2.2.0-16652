package org.marketcetera.quickfix;

import org.marketcetera.core.ClassVersion;
import quickfix.*;

/**
 * Dymmy quickfix app that does nothing
 * @author toli
 * @version $Id: DummyQuickFIXApp.java 16154 2012-07-14 16:34:05Z colin $
 */

@ClassVersion("$Id: DummyQuickFIXApp.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class DummyQuickFIXApp implements Application {
    public DummyQuickFIXApp() {
    }

    public void onCreate(SessionID sessionId) {

    }

    public void onLogon(SessionID sessionId) {

    }

    public void onLogout(SessionID sessionId) {

    }

    public void toAdmin(Message message, SessionID sessionId) {

    }

    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {

    }

    public void toApp(Message message, SessionID sessionId) throws DoNotSend {

    }

    public void fromApp(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {

    }
}
