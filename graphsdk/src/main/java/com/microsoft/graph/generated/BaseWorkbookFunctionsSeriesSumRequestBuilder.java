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
 * The class for the Base Workbook Functions Series Sum Request Builder.
 */
public class BaseWorkbookFunctionsSeriesSumRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSeriesSum
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsSeriesSumRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement n, final com.google.gson.JsonElement m, final com.google.gson.JsonElement coefficients) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("x", x);
        mBodyParams.put("n", n);
        mBodyParams.put("m", m);
        mBodyParams.put("coefficients", coefficients);
    }

    /**
     * Creates the IWorkbookFunctionsSeriesSumRequest
     *
     * @return The IWorkbookFunctionsSeriesSumRequest instance
     */
    public IWorkbookFunctionsSeriesSumRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSeriesSumRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsSeriesSumRequest instance
     */
    public IWorkbookFunctionsSeriesSumRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsSeriesSumRequest request = new WorkbookFunctionsSeriesSumRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.mBody.x = getParameter("x");
        }

        if (hasParameter("n")) {
            request.mBody.n = getParameter("n");
        }

        if (hasParameter("m")) {
            request.mBody.m = getParameter("m");
        }

        if (hasParameter("coefficients")) {
            request.mBody.coefficients = getParameter("coefficients");
        }

        return request;
    }
}
