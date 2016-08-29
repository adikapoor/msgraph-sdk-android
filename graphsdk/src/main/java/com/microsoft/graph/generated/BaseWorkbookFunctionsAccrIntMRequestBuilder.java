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
 * The class for the Base Workbook Functions Accr Int MRequest Builder.
 */
public class BaseWorkbookFunctionsAccrIntMRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAccrIntM
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsAccrIntMRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement issue, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement par, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("issue", issue);
        mBodyParams.put("settlement", settlement);
        mBodyParams.put("rate", rate);
        mBodyParams.put("par", par);
        mBodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsAccrIntMRequest
     *
     * @return The IWorkbookFunctionsAccrIntMRequest instance
     */
    public IWorkbookFunctionsAccrIntMRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAccrIntMRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsAccrIntMRequest instance
     */
    public IWorkbookFunctionsAccrIntMRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsAccrIntMRequest request = new WorkbookFunctionsAccrIntMRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("issue")) {
            request.mBody.issue = getParameter("issue");
        }

        if (hasParameter("settlement")) {
            request.mBody.settlement = getParameter("settlement");
        }

        if (hasParameter("rate")) {
            request.mBody.rate = getParameter("rate");
        }

        if (hasParameter("par")) {
            request.mBody.par = getParameter("par");
        }

        if (hasParameter("basis")) {
            request.mBody.basis = getParameter("basis");
        }

        return request;
    }
}
