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
 * The class for the Base Planner Task Request.
 */
public class BasePlannerTaskRequest extends BaseRequest implements IBasePlannerTaskRequest {

    /**
     * The request for the PlannerTask
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BasePlannerTaskRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PlannerTask from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<PlannerTask> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerTask from the service
     * @return The PlannerTask from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlannerTask get() throws ClientException {
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
     * Patches this PlannerTask with a source
     * @param sourcePlannerTask The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final PlannerTask sourcePlannerTask, final ICallback<PlannerTask> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerTask);
    }

    /**
     * Patches this PlannerTask with a source
     * @param sourcePlannerTask The source object with updates
     * @return The updated PlannerTask
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlannerTask patch(final PlannerTask sourcePlannerTask) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerTask);
    }

    /**
     * Creates a PlannerTask with a new object
     * @param newPlannerTask The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final PlannerTask newPlannerTask, final ICallback<PlannerTask> callback) {
        send(HttpMethod.POST, callback, newPlannerTask);
    }

    /**
     * Creates a PlannerTask with a new object
     * @param newPlannerTask The new object to create
     * @return The created PlannerTask
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlannerTask post(final PlannerTask newPlannerTask) throws ClientException {
        return send(HttpMethod.POST, newPlannerTask);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IPlannerTaskRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PlannerTaskRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IPlannerTaskRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PlannerTaskRequest)this;
     }

}
