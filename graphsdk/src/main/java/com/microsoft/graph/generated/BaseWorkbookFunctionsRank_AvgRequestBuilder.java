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
 * The class for the Base Workbook Functions Rank_Avg Request Builder.
 */
public class BaseWorkbookFunctionsRank_AvgRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRank_Avg
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsRank_AvgRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement ref, final com.google.gson.JsonElement order) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("number", number);
        mBodyParams.put("ref", ref);
        mBodyParams.put("order", order);
    }

    /**
     * Creates the IWorkbookFunctionsRank_AvgRequest
     *
     * @return The IWorkbookFunctionsRank_AvgRequest instance
     */
    public IWorkbookFunctionsRank_AvgRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRank_AvgRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsRank_AvgRequest instance
     */
    public IWorkbookFunctionsRank_AvgRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsRank_AvgRequest request = new WorkbookFunctionsRank_AvgRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.mBody.number = getParameter("number");
        }
        if (hasParameter("ref")) {
            request.mBody.ref = getParameter("ref");
        }
        if (hasParameter("order")) {
            request.mBody.order = getParameter("order");
        }
  
        return request;
    }
}