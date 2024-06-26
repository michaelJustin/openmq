/*
 * Copyright (c) 2000, 2017 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2021 Contributors to the Eclipse Foundation
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

/**
 *
 * Interface to store and retrieve mq client messages in the memory.
 *
 */

public interface MessageQueue {

    /**
     * get the number of elements in the queue.
     *
     * @return the number of elements in the queue.
     */
    int size();

    /**
     * check if the queue size is empty.
     *
     * @return true if the queue size is empty.
     */
    boolean isEmpty();

    /**
     * Clears all elements stored in the queue
     **/
    void clear();

    /**
     * Enqueues the specified object in the queue.
     *
     * @param nobj new object to be enqueued
     */
    void enqueue(Object nobj);

    /**
     * Adds the specified object to the front of the queue.
     *
     * @param nobj new object to be added to the front of the queue
     */
    void enqueueFirst(Object nobj);

    /**
     * Dequeues an element from the queue.
     *
     * @return dequeued object, or null if empty queue
     */
    Object dequeue();

    /**
     * Get all elements queue and return as an array of objects.
     *
     * @return an array of objects in the queue.
     */
    Object[] toArray();

    /**
     * Remove the specified obj from the queue.
     *
     * @param obj the object to be removed in the queue.
     * @return if the specified object was removed.
     */
    boolean remove(Object obj);
}
