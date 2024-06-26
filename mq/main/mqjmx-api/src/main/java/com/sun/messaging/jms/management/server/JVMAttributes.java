/*
 * Copyright (c) 2000, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.messaging.jms.management.server;

/**
 * Class containing information on JVM attributes.
 */
public class JVMAttributes {
    /**
     * FreeMemory
     */
    public static final String FREE_MEMORY = "FreeMemory";

    /**
     * InitMemory
     */
    public static final String INIT_MEMORY = "InitMemory";

    /**
     * MaxMemory
     */
    public static final String MAX_MEMORY = "MaxMemory";

    /**
     * TotalMemory
     */
    public static final String TOTAL_MEMORY = "TotalMemory";

    /*
     * Class cannot be instantiated
     */
    private JVMAttributes() {
    }

}
