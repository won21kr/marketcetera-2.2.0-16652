package org.marketcetera.util.l10n;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.marketcetera.util.test.EqualityAssert.*;

/**
 * @author tlerios@marketcetera.com
 * @since 0.6.0
 * @version $Id: I18NMessageInfoTest.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class I18NMessageInfoTest
    extends MessageInfoTestBase
{
    @Test
    public void all()
    {
        retention(TEST_I18N_INFO);
        assertEquals(TEST_MESSAGE,TEST_I18N_INFO.getMessage());

        assertEquality(TEST_I18N_INFO,
                       TEST_I18N_INFO_SAME,
                       TEST_I18N_INFO_KD,
                       TEST_I18N_INFO_PCD,
                       TEST_I18N_INFO_MD);
    }
}
