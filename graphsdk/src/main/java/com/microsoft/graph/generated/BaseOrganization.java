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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Organization.
 */
public class BaseOrganization extends DirectoryObject implements IJsonBackedObject {


    public BaseOrganization() {
        oDataType = "microsoft.graph.organization";
    }

    /**
     * The Assigned Plans.
     */
    @SerializedName("assignedPlans")
    @Expose
    public List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     */
    @SerializedName("businessPhones")
    @Expose
    public List<String> businessPhones;

    /**
     * The City.
     */
    @SerializedName("city")
    @Expose
    public String city;

    /**
     * The Country.
     */
    @SerializedName("country")
    @Expose
    public String country;

    /**
     * The Country Letter Code.
     */
    @SerializedName("countryLetterCode")
    @Expose
    public String countryLetterCode;

    /**
     * The Display Name.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Marketing Notification Emails.
     */
    @SerializedName("marketingNotificationEmails")
    @Expose
    public List<String> marketingNotificationEmails;

    /**
     * The On Premises Last Sync Date Time.
     */
    @SerializedName("onPremisesLastSyncDateTime")
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Sync Enabled.
     */
    @SerializedName("onPremisesSyncEnabled")
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Postal Code.
     */
    @SerializedName("postalCode")
    @Expose
    public String postalCode;

    /**
     * The Preferred Language.
     */
    @SerializedName("preferredLanguage")
    @Expose
    public String preferredLanguage;

    /**
     * The Provisioned Plans.
     */
    @SerializedName("provisionedPlans")
    @Expose
    public List<ProvisionedPlan> provisionedPlans;

    /**
     * The Security Compliance Notification Mails.
     */
    @SerializedName("securityComplianceNotificationMails")
    @Expose
    public List<String> securityComplianceNotificationMails;

    /**
     * The Security Compliance Notification Phones.
     */
    @SerializedName("securityComplianceNotificationPhones")
    @Expose
    public List<String> securityComplianceNotificationPhones;

    /**
     * The State.
     */
    @SerializedName("state")
    @Expose
    public String state;

    /**
     * The Street.
     */
    @SerializedName("street")
    @Expose
    public String street;

    /**
     * The Technical Notification Mails.
     */
    @SerializedName("technicalNotificationMails")
    @Expose
    public List<String> technicalNotificationMails;

    /**
     * The Verified Domains.
     */
    @SerializedName("verifiedDomains")
    @Expose
    public List<VerifiedDomain> verifiedDomains;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;

    }
}
