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

package com.sun.messaging.jmq.jmsclient;

import jakarta.jms.*;
import java.util.Properties;

import com.sun.jms.spi.xa.*;

/**
 * An XATopicConnection is an active connection to a JMS Pub/Sub provider. A client uses an XATopicConnection to create
 * one or more XATopicSessions for producing and consuming messages.
 *
 * @see jakarta.jms.XAConnection
 * @see jakarta.jms.XATopicConnectionFactory
 */

public class XATopicConnectionImpl extends TopicConnectionImpl implements XATopicConnection, JMSXATopicConnection {

    public XATopicConnectionImpl(Properties configuration, String username, String password, String type) throws JMSException {
        super(configuration, username, password, type);
    }

    /**
     * Create an XATopicSession.
     *
     * @exception JMSException if JMS Connection fails to create a XA topic session due to some internal error.
     */
    @Override
    public XATopicSession createXATopicSession() throws JMSException {

        checkConnectionState();

        // disallow to set client ID after this action.
        setClientIDFlag();

        return new XATopicSessionImpl(this, false, 0);
    }

    /**
     * Create an XATopicSession
     *
     * @param transacted ignored.
     * @param acknowledgeMode ignored.
     *
     * @return a newly created XA topic session.
     *
     * @exception JMSException if JMS Connection fails to create a XA topic session due to some internal error.
     */
    @Override
    public TopicSession createTopicSession(boolean transacted, int acknowledgeMode) throws JMSException {
        return new XATopicSessionImpl(this, transacted, acknowledgeMode);
    }

    /**
     * Create an XATopicSession
     *
     * @param transacted ignored.
     * @param acknowledgeMode ignored.
     *
     * @return a newly created XA topic session.
     *
     * @exception JMSException if JMS Connection fails to create a XA topic session due to some internal error.
     */
    @Override
    public JMSXATopicSession createXATopicSession(boolean transacted, int acknowledgeMode) throws JMSException {
        return new JMSXATopicSessionImpl(this, transacted, acknowledgeMode);
    }

    /**
     * Return the TopicConnection
     *
     * @return the TopicConnection
     */
    @Override
    public TopicConnection getTopicConnection() {
        return (this);
    }
}
