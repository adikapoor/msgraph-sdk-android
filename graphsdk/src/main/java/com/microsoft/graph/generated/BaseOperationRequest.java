// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Operation Request.
 */
public class BaseOperationRequest extends BaseRequest implements IBaseOperationRequest {

    /**
     * The request for the Operation
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseOperationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Operation from the service
     * @param callback The callback to be called after success or failure.
     */
    public void getOperation(final ICallback<Operation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Operation from the service
     * @return The Operation from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Operation getOperation() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this Operation with a source
     * @param sourceOperation The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Operation sourceOperation, final ICallback<Operation> callback) {
        send(HttpMethod.PATCH, callback, sourceOperation);
    }

    /**
     * Patches this Operation with a source
     * @param sourceOperation The source object with updates
     * @return The updated Operation
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Operation patch(final Operation sourceOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceOperation);
    }

    /**
     * Creates a Operation with a new object
     * @param newOperation The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Operation newOperation, final ICallback<Operation> callback) {
        send(HttpMethod.POST, callback, newOperation);
    }

    /**
     * Creates a Operation with a new object
     * @param newOperation The new object to create
     * @return The created Operation
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Operation post(final Operation newOperation) throws ClientException {
        return send(HttpMethod.POST, newOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IOperationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (OperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IOperationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (OperationRequest)this;
     }

}
