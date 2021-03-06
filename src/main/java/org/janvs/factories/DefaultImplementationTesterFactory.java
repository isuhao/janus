package org.janvs.factories;

import org.janvs.testers.ImplementationTester;

public class DefaultImplementationTesterFactory implements ImplementationTesterFactory {

    private final InstanceTesterFactory instanceTesterFactory;

    public DefaultImplementationTesterFactory(final InstanceTesterFactory instanceTesterFactory) {
        this.instanceTesterFactory = instanceTesterFactory;
    }

    @Override
    public ImplementationTester createFor(final Iterable<Object> instances) {
        return new ImplementationTester(instances, instanceTesterFactory);
    }
}
