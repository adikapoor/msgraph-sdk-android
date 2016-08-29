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
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table Row Request.
 */
public class BaseWorkbookTableRowRequest extends BaseRequest implements IBaseWorkbookTableRowRequest {

    /**
     * The request for the WorkbookTableRow
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookTableRowRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookTableRow from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookTableRow> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTableRow from the service
     * @return The WorkbookTableRow from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookTableRow get() throws ClientException {
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
     * Patches this WorkbookTableRow with a source
     * @param sourceWorkbookTableRow The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookTableRow sourceWorkbookTableRow, final ICallback<WorkbookTableRow> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookTableRow);
    }

    /**
     * Patches this WorkbookTableRow with a source
     * @param sourceWorkbookTableRow The source object with updates
     * @return The updated WorkbookTableRow
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookTableRow patch(final WorkbookTableRow sourceWorkbookTableRow) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookTableRow);
    }

    /**
     * Creates a WorkbookTableRow with a new object
     * @param newWorkbookTableRow The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookTableRow newWorkbookTableRow, final ICallback<WorkbookTableRow> callback) {
        send(HttpMethod.POST, callback, newWorkbookTableRow);
    }

    /**
     * Creates a WorkbookTableRow with a new object
     * @param newWorkbookTableRow The new object to create
     * @return The created WorkbookTableRow
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookTableRow post(final WorkbookTableRow newWorkbookTableRow) throws ClientException {
        return send(HttpMethod.POST, newWorkbookTableRow);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookTableRowRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookTableRowRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookTableRowRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookTableRowRequest)this;
     }

}