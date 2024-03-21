/*
 * langfuse
 * ## Authentication  Authenticate with the API using Basic Auth, get API keys in the project settings:  - username: Langfuse Public Key - password: Langfuse Secret Key
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.DailyMetrics;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MetricsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MetricsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public MetricsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call dailyCall(Integer page, Integer limit, String traceName, String userId, List<String> tags, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/public/metrics/daily";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (traceName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("traceName", traceName));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
        }

        if (tags != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "tags", tags));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call dailyValidateBeforeCall(Integer page, Integer limit, String traceName, String userId, List<String> tags, final ApiCallback _callback) throws ApiException {
        return dailyCall(page, limit, traceName, userId, tags, _callback);

    }


    private ApiResponse<DailyMetrics> dailyWithHttpInfo(Integer page, Integer limit, String traceName, String userId, List<String> tags) throws ApiException {
        okhttp3.Call localVarCall = dailyValidateBeforeCall(page, limit, traceName, userId, tags, null);
        Type localVarReturnType = new TypeToken<DailyMetrics>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call dailyAsync(Integer page, Integer limit, String traceName, String userId, List<String> tags, final ApiCallback<DailyMetrics> _callback) throws ApiException {

        okhttp3.Call localVarCall = dailyValidateBeforeCall(page, limit, traceName, userId, tags, _callback);
        Type localVarReturnType = new TypeToken<DailyMetrics>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class DailyRequestBuilder {
        private Integer page;
        private Integer limit;
        private String traceName;
        private String userId;
        private List<String> tags;

        private DailyRequestBuilder() {
        }

        /**
         * Set page
         * @param page  (optional)
         * @return DailyRequestBuilder
         */
        public DailyRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set limit
         * @param limit  (optional)
         * @return DailyRequestBuilder
         */
        public DailyRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set traceName
         * @param traceName Optional filter by the name of the trace (optional)
         * @return DailyRequestBuilder
         */
        public DailyRequestBuilder traceName(String traceName) {
            this.traceName = traceName;
            return this;
        }
        
        /**
         * Set userId
         * @param userId Optional filter by the userId associated with the trace (optional)
         * @return DailyRequestBuilder
         */
        public DailyRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }
        
        /**
         * Set tags
         * @param tags Optional filter for metrics where traces include all of these tags (optional)
         * @return DailyRequestBuilder
         */
        public DailyRequestBuilder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }
        
        /**
         * Build call for daily
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return dailyCall(page, limit, traceName, userId, tags, _callback);
        }


        /**
         * Execute daily request
         * @return DailyMetrics
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public DailyMetrics execute() throws ApiException {
            ApiResponse<DailyMetrics> localVarResp = dailyWithHttpInfo(page, limit, traceName, userId, tags);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute daily request with HTTP info returned
         * @return ApiResponse&lt;DailyMetrics&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<DailyMetrics> executeWithHttpInfo() throws ApiException {
            return dailyWithHttpInfo(page, limit, traceName, userId, tags);
        }

        /**
         * Execute daily request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<DailyMetrics> _callback) throws ApiException {
            return dailyAsync(page, limit, traceName, userId, tags, _callback);
        }
    }

    /**
     * 
     * Get daily metrics of the Langfuse project
     * @return DailyRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public DailyRequestBuilder daily() throws IllegalArgumentException {
        return new DailyRequestBuilder();
    }
}