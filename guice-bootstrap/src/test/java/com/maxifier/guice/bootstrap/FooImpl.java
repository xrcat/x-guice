/*
 * Copyright (c) 2008-2015 Maxifier Ltd. All Rights Reserved.
 */
package com.maxifier.guice.bootstrap;

/**
 * @author Konstantin Lyamshin (2015-11-05 20:45)
 */
public class FooImpl implements Foo {
    @Override
    public String name() {
        return toString();
    }

    @Override
    public String toString() {
        return "FooImpl{}";
    }
}
