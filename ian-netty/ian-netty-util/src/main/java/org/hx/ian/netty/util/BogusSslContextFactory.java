package org.hx.ian.netty.util;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import java.security.KeyStore;
import java.security.Security;

/**
 * @ClassName BogusSslContextFactory
 * @Author hx 2018/11/3
 * @Description TODO
 * @Date 2018/11/3 13:03
 * @Version 1.0
 */
public class BogusSslContextFactory {

    private static final String PROTOCOL = "TLS";

    private static final SSLContext SERVER_CONTEXT;

    static {
        String algorithm = Security.getProperty("ssl.KeyManagerFactory.algorithm");
        if (algorithm == null) {
            algorithm = "SunX509";
        }

        SSLContext serverContext = null;
        try {
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(BogusKeyStore.asInputStream(), BogusKeyStore.getKeyStorePassword());

            // Set up key manager factory to use our key store
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(algorithm);
            kmf.init(ks, BogusKeyStore.getCertificatePassword());

            // Initialize the SSLContext to work with our key managers.
            serverContext = SSLContext.getInstance(PROTOCOL);
            serverContext.init(kmf.getKeyManagers(), null, null);
        } catch (Exception e) {
            throw new Error("Failed to initialize the server-side SSLContext", e);
        }
        SERVER_CONTEXT = serverContext;
    }

    private BogusSslContextFactory() {
        // Unused
    }

    public static SSLContext getServerContext() {
        return SERVER_CONTEXT;
    }

}
