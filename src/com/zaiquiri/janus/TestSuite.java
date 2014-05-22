package com.zaiquiri.janus;


import java.util.Collection;
import java.util.Iterator;

public class TestSuite implements Iterable<TestCase> {

    private final Collection<TestCase> testCases;

    public TestSuite(Collection<TestCase> testCases) {

        this.testCases = testCases;
    }

    @Override
    public Iterator<TestCase> iterator() {
        return testCases.iterator();
    }
}
