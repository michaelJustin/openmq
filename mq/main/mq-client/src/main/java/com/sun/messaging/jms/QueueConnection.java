/*
 * Copyright (c) 2000, 2020 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.messaging.jms;

import jakarta.jms.JMSException;
import jakarta.jms.QueueSession;

/**
 * Provide interface to create a MQ NO_ACKNOWLEDGE queue session.
 */
public interface QueueConnection extends jakarta.jms.QueueConnection {

    /**
     * Creates a <CODE>QueueSession</CODE> object.
     *
     * @param acknowledgeMode indicates whether the consumer or the client will acknowledge any messages it receives; Legal
     * values are <code>Session.AUTO_ACKNOWLEDGE</code>, <code>Session.CLIENT_ACKNOWLEDGE</code>,
     * <code>Session.DUPS_OK_ACKNOWLEDGE</code>, and <code>com.sun.messaging.jms.Session.NO_ACKNOWLEDGE</code>
     *
     * @return a newly created session
     *
     * @exception JMSException if the <CODE>QueueConnection</CODE> object fails to create a session due to some internal
     * error or lack of support for the specific transaction and acknowledgement mode.
     *
     * @see Session#AUTO_ACKNOWLEDGE
     * @see Session#CLIENT_ACKNOWLEDGE
     * @see Session#DUPS_OK_ACKNOWLEDGE
     * @see com.sun.messaging.jms.Session#NO_ACKNOWLEDGE
     */

    QueueSession createQueueSession(int acknowledgeMode) throws JMSException;

}
