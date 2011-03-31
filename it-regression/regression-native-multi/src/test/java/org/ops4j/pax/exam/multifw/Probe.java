package org.ops4j.pax.exam.multifw;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: tonit
 * Date: 3/11/11
 * Time: 9:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Probe {
 private static Logger LOG = LoggerFactory.getLogger( Probe.class );

    public void withoutBCTest()
    {
        LOG.info( "INSIDE OSGI " + Probe.class.getName() + " Method withoutBCTest" );
    }

    public void withBCTest( BundleContext ctx )
    {
        LOG.info( "INSIDE OSGI " + Probe.class.getName() + " Method withBCTest Context: " + ctx );
    }

    private void neverCall()
    {
        fail( "Don't parseForTests me !" );
    }
}