package org.marketcetera.photon.preferences;

import java.util.TimeZone;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.marketcetera.photon.PhotonPlugin;
import org.marketcetera.photon.PhotonPreferences;
import org.marketcetera.photon.TimeOfDay;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Initializes Photon preferences.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: PreferenceInitializer.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: PreferenceInitializer.java 16154 2012-07-14 16:34:05Z colin $")
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		TimeOfDay time = TimeOfDay.create(0, 0, 0, TimeZone.getDefault());
		PhotonPlugin.getDefault().getPreferenceStore().setDefault(
				PhotonPreferences.TRADING_HISTORY_START_TIME,
				time.toFormattedString());
	}

}
