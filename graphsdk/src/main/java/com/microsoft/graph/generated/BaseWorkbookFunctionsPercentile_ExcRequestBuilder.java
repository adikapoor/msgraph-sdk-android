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
 * The class for the Base Workbook Functions Percentile_Exc Request Builder.
 */
public class BaseWorkbookFunctionsPercentile_ExcRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPercentile_Exc
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsPercentile_ExcRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement k) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("array", array);
        mBodyParams.put("k", k);
    }

    /**
     * Creates the IWorkbookFunctionsPercentile_ExcRequest
     *
     * @return The IWorkbookFunctionsPercentile_ExcRequest instance
     */
    public IWorkbookFunctionsPercentile_ExcRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPercentile_ExcRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsPercentile_ExcRequest instance
     */
    public IWorkbookFunctionsPercentile_ExcRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsPercentile_ExcRequest request = new WorkbookFunctionsPercentile_ExcRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.mBody.array = getParameter("array");
        }

        if (hasParameter("k")) {
            request.mBody.k = getParameter("k");
        }

        return request;
    }
}
