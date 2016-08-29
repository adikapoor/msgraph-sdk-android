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
 * The class for the Base Workbook Functions Convert Request Builder.
 */
public class BaseWorkbookFunctionsConvertRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsConvert
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsConvertRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement fromUnit, final com.google.gson.JsonElement toUnit) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("number", number);
        mBodyParams.put("fromUnit", fromUnit);
        mBodyParams.put("toUnit", toUnit);
    }

    /**
     * Creates the IWorkbookFunctionsConvertRequest
     *
     * @return The IWorkbookFunctionsConvertRequest instance
     */
    public IWorkbookFunctionsConvertRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsConvertRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsConvertRequest instance
     */
    public IWorkbookFunctionsConvertRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsConvertRequest request = new WorkbookFunctionsConvertRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.mBody.number = getParameter("number");
        }
        if (hasParameter("fromUnit")) {
            request.mBody.fromUnit = getParameter("fromUnit");
        }
        if (hasParameter("toUnit")) {
            request.mBody.toUnit = getParameter("toUnit");
        }
  
        return request;
    }
}