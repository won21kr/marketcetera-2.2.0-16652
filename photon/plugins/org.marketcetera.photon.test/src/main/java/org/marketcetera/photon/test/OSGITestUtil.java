package org.marketcetera.photon.test;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.Hashtable;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceRegistration;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Provider;

/* $License$ */

/**
 * OSGi related test utilities.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: OSGITestUtil.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
public class OSGITestUtil {

    /**
     * Register the provided service with maximum rank.
     * 
     * @param clazz
     *            the class name under which the service can be located
     * @param service
     *            the service object or a ServiceFactory object
     * @return the ServiceRegistration that can be used to unregister the
     *         service
     */
    public static ServiceRegistration registerMockService(Class<?> clazz,
            Object service) {
        return registerMockService(clazz, service, Integer.MAX_VALUE);
    }

    /**
     * Register the provided service with the specified rank.
     * 
     * @param clazz
     *            the class name under which the service can be located
     * @param service
     *            the service object or a ServiceFactory object
     * @param rank
     *            the rank for the service
     * @return the ServiceRegistration that can be used to unregister the
     *         service
     */
    public static ServiceRegistration registerMockService(Class<?> clazz,
            Object service, int rank) {
        return getTestBundleContext().registerService(
                clazz.getName(),
                service,
                new Hashtable<String, Integer>(ImmutableMap.of(
                        Constants.SERVICE_RANKING, rank)));
    }

    /**
     * Returns the bundle context for the test bundle.
     * 
     * @return the bundle context for the test bundle
     */
    public static BundleContext getTestBundleContext() {
        return Platform.getBundle("org.marketcetera.photon.test")
                .getBundleContext();
    }

    /**
     * Returns a static {@link Provider} that always provides the provided
     * object.
     * 
     * @param toProvide
     *            the object to provide
     * @return a {@link Provider}
     */
    public static <T> Provider<T> provide(final T toProvide) {
        return new Provider<T>() {
            @Override
            public T get() {
                return toProvide;
            }
        };
    }

    /**
     * Asserts that the bundle exists.
     * 
     * @param id
     *            the bundle id
     */
    public static void assertBundle(String id) {
        assertThat(Platform.getBundle(id), not(nullValue()));
    }

    private OSGITestUtil() {
        throw new AssertionError("non-instantiable"); //$NON-NLS-1$
    }
}
