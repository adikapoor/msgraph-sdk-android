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
 * The class for the Base Workbook Functions Bitrshift Request Builder.
 */
public class BaseWorkbookFunctionsBitrshiftRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBitrshift
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsBitrshiftRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement shiftAmount) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("number", number);
        mBodyParams.put("shiftAmount", shiftAmount);
    }

    /**
     * Creates the IWorkbookFunctionsBitrshiftRequest
     *
     * @return The IWorkbookFunctionsBitrshiftRequest instance
     */
    public IWorkbookFunctionsBitrshiftRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBitrshiftRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsBitrshiftRequest instance
     */
    public IWorkbookFunctionsBitrshiftRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsBitrshiftRequest request = new WorkbookFunctionsBitrshiftRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.mBody.number = getParameter("number");
        }

        if (hasParameter("shiftAmount")) {
            request.mBody.shiftAmount = getParameter("shiftAmount");
        }

        return request;
    }
}
