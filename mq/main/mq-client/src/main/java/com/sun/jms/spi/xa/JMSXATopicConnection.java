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

package com.sun.jms.spi.xa;

import jakarta.jms.*;

/**
 * An JMSXATopicConnection creates JMSXATopicSession and provides the associated TopicConnection.
 *
 * @see com.sun.jms.xa.XAConnection
 */

public interface JMSXATopicConnection extends JMSXAConnection {

    /**
     * Create an XATopicSession.
     *
     * @exception JMSException if JMS Connection fails to create a XA topic session due to some internal error.
     */

    JMSXATopicSession createXATopicSession(boolean transacted, int acknowledgeMode) throws JMSException;

    /**
     * get a TopicConnection associated with this XATopicConnection object.
     *
     * @return a TopicConnection.
     */

    TopicConnection getTopicConnection();
}
