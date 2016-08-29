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
 * The class for the Base Workbook Filter Apply Top Percent Filter Request Builder.
 */
public class BaseWorkbookFilterApplyTopPercentFilterRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyTopPercentFilter
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFilterApplyTopPercentFilterRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final Integer percent) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("percent", percent);
    }

    /**
     * Creates the IWorkbookFilterApplyTopPercentFilterRequest
     *
     * @return The IWorkbookFilterApplyTopPercentFilterRequest instance
     */
    public IWorkbookFilterApplyTopPercentFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyTopPercentFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFilterApplyTopPercentFilterRequest instance
     */
    public IWorkbookFilterApplyTopPercentFilterRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFilterApplyTopPercentFilterRequest request = new WorkbookFilterApplyTopPercentFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("percent")) {
            request.mBody.percent = getParameter("percent");
        }

        return request;
    }
}
