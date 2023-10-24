// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.mojo.system;

import org.chromium.mojo.system.DataPipe.ConsumerHandle;
import org.chromium.mojo.system.DataPipe.ProducerHandle;

/**
 * A mojo handle of unknown type. This handle can be typed by using one of its methods, which will
 * return a handle of the requested type and invalidate this object. No validation is made when the
 * conversion operation is called.
 */
public interface UntypedHandle extends Handle {

    /**
     * @see org.chromium.mojo.system.Handle#pass()
     */
    @Override
    UntypedHandle pass();

    /**
     * Returns the underlying handle, as a {@link MessagePipeHandle}, invalidating this
     * representation.
     */
    MessagePipeHandle toMessagePipeHandle();

    /**
     * Returns the underlying handle, as a {@link ConsumerHandle}, invalidating this representation.
     */
    ConsumerHandle toDataPipeConsumerHandle();

    /**
     * Returns the underlying handle, as a {@link ProducerHandle}, invalidating this representation.
     */
    ProducerHandle toDataPipeProducerHandle();

    /**
     * Returns the underlying handle, as a {@link SharedBufferHandle}, invalidating this
     * representation.
     */
    SharedBufferHandle toSharedBufferHandle();

}
