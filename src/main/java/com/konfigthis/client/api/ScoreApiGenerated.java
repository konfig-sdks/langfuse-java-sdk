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


import com.konfigthis.client.model.CreateScoreRequest;
import com.konfigthis.client.model.Score;
import com.konfigthis.client.model.Scores;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ScoreApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ScoreApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ScoreApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createCall(CreateScoreRequest createScoreRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createScoreRequest;

        // create path and map variables
        String localVarPath = "/api/public/scores";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createValidateBeforeCall(CreateScoreRequest createScoreRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createScoreRequest' is set
        if (createScoreRequest == null) {
            throw new ApiException("Missing the required parameter 'createScoreRequest' when calling create(Async)");
        }

        return createCall(createScoreRequest, _callback);

    }


    private ApiResponse<Score> createWithHttpInfo(CreateScoreRequest createScoreRequest) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(createScoreRequest, null);
        Type localVarReturnType = new TypeToken<Score>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createAsync(CreateScoreRequest createScoreRequest, final ApiCallback<Score> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(createScoreRequest, _callback);
        Type localVarReturnType = new TypeToken<Score>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateRequestBuilder {
        private final String traceId;
        private final String name;
        private final Double value;
        private String id;
        private String observationId;
        private String comment;

        private CreateRequestBuilder(String traceId, String name, Double value) {
            this.traceId = traceId;
            this.name = name;
            this.value = value;
        }

        /**
         * Set id
         * @param id  (optional)
         * @return CreateRequestBuilder
         */
        public CreateRequestBuilder id(String id) {
            this.id = id;
            return this;
        }
        
        /**
         * Set observationId
         * @param observationId  (optional)
         * @return CreateRequestBuilder
         */
        public CreateRequestBuilder observationId(String observationId) {
            this.observationId = observationId;
            return this;
        }
        
        /**
         * Set comment
         * @param comment  (optional)
         * @return CreateRequestBuilder
         */
        public CreateRequestBuilder comment(String comment) {
            this.comment = comment;
            return this;
        }
        
        /**
         * Build call for create
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
            CreateScoreRequest createScoreRequest = buildBodyParams();
            return createCall(createScoreRequest, _callback);
        }

        private CreateScoreRequest buildBodyParams() {
            CreateScoreRequest createScoreRequest = new CreateScoreRequest();
            createScoreRequest.id(this.id);
            createScoreRequest.traceId(this.traceId);
            createScoreRequest.name(this.name);
            createScoreRequest.value(this.value);
            createScoreRequest.observationId(this.observationId);
            createScoreRequest.comment(this.comment);
            return createScoreRequest;
        }

        /**
         * Execute create request
         * @return Score
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public Score execute() throws ApiException {
            CreateScoreRequest createScoreRequest = buildBodyParams();
            ApiResponse<Score> localVarResp = createWithHttpInfo(createScoreRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute create request with HTTP info returned
         * @return ApiResponse&lt;Score&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Score> executeWithHttpInfo() throws ApiException {
            CreateScoreRequest createScoreRequest = buildBodyParams();
            return createWithHttpInfo(createScoreRequest);
        }

        /**
         * Execute create request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Score> _callback) throws ApiException {
            CreateScoreRequest createScoreRequest = buildBodyParams();
            return createAsync(createScoreRequest, _callback);
        }
    }

    /**
     * 
     * Create a score
     * @param createScoreRequest  (required)
     * @return CreateRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public CreateRequestBuilder create(String traceId, String name, Double value) throws IllegalArgumentException {
        if (traceId == null) throw new IllegalArgumentException("\"traceId\" is required but got null");
            

        if (name == null) throw new IllegalArgumentException("\"name\" is required but got null");
            

        if (value == null) throw new IllegalArgumentException("\"value\" is required but got null");
        return new CreateRequestBuilder(traceId, name, value);
    }
    private okhttp3.Call deleteCall(String scoreId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/public/scores/{scoreId}"
            .replace("{" + "scoreId" + "}", localVarApiClient.escapeString(scoreId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteValidateBeforeCall(String scoreId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scoreId' is set
        if (scoreId == null) {
            throw new ApiException("Missing the required parameter 'scoreId' when calling delete(Async)");
        }

        return deleteCall(scoreId, _callback);

    }


    private ApiResponse<Void> deleteWithHttpInfo(String scoreId) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(scoreId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteAsync(String scoreId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(scoreId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DeleteRequestBuilder {
        private final String scoreId;

        private DeleteRequestBuilder(String scoreId) {
            this.scoreId = scoreId;
        }

        /**
         * Build call for delete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteCall(scoreId, _callback);
        }


        /**
         * Execute delete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteWithHttpInfo(scoreId);
        }

        /**
         * Execute delete request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteWithHttpInfo(scoreId);
        }

        /**
         * Execute delete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteAsync(scoreId, _callback);
        }
    }

    /**
     * 
     * Delete a score
     * @param scoreId The unique langfuse identifier of a score (required)
     * @return DeleteRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public DeleteRequestBuilder delete(String scoreId) throws IllegalArgumentException {
        if (scoreId == null) throw new IllegalArgumentException("\"scoreId\" is required but got null");
            

        return new DeleteRequestBuilder(scoreId);
    }
    private okhttp3.Call getCall(Integer page, Integer limit, String userId, String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/public/scores";

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

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
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
    private okhttp3.Call getValidateBeforeCall(Integer page, Integer limit, String userId, String name, final ApiCallback _callback) throws ApiException {
        return getCall(page, limit, userId, name, _callback);

    }


    private ApiResponse<Scores> getWithHttpInfo(Integer page, Integer limit, String userId, String name) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(page, limit, userId, name, null);
        Type localVarReturnType = new TypeToken<Scores>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAsync(Integer page, Integer limit, String userId, String name, final ApiCallback<Scores> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(page, limit, userId, name, _callback);
        Type localVarReturnType = new TypeToken<Scores>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetRequestBuilder {
        private Integer page;
        private Integer limit;
        private String userId;
        private String name;

        private GetRequestBuilder() {
        }

        /**
         * Set page
         * @param page  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set limit
         * @param limit  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set userId
         * @param userId  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }
        
        /**
         * Set name
         * @param name  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Build call for get
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
            return getCall(page, limit, userId, name, _callback);
        }


        /**
         * Execute get request
         * @return Scores
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public Scores execute() throws ApiException {
            ApiResponse<Scores> localVarResp = getWithHttpInfo(page, limit, userId, name);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute get request with HTTP info returned
         * @return ApiResponse&lt;Scores&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Scores> executeWithHttpInfo() throws ApiException {
            return getWithHttpInfo(page, limit, userId, name);
        }

        /**
         * Execute get request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Scores> _callback) throws ApiException {
            return getAsync(page, limit, userId, name, _callback);
        }
    }

    /**
     * 
     * Get a list of scores
     * @return GetRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public GetRequestBuilder get() throws IllegalArgumentException {
        return new GetRequestBuilder();
    }
    private okhttp3.Call getByIdCall(String scoreId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/public/scores/{scoreId}"
            .replace("{" + "scoreId" + "}", localVarApiClient.escapeString(scoreId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getByIdValidateBeforeCall(String scoreId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scoreId' is set
        if (scoreId == null) {
            throw new ApiException("Missing the required parameter 'scoreId' when calling getById(Async)");
        }

        return getByIdCall(scoreId, _callback);

    }


    private ApiResponse<Score> getByIdWithHttpInfo(String scoreId) throws ApiException {
        okhttp3.Call localVarCall = getByIdValidateBeforeCall(scoreId, null);
        Type localVarReturnType = new TypeToken<Score>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByIdAsync(String scoreId, final ApiCallback<Score> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByIdValidateBeforeCall(scoreId, _callback);
        Type localVarReturnType = new TypeToken<Score>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByIdRequestBuilder {
        private final String scoreId;

        private GetByIdRequestBuilder(String scoreId) {
            this.scoreId = scoreId;
        }

        /**
         * Build call for getById
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
            return getByIdCall(scoreId, _callback);
        }


        /**
         * Execute getById request
         * @return Score
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public Score execute() throws ApiException {
            ApiResponse<Score> localVarResp = getByIdWithHttpInfo(scoreId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getById request with HTTP info returned
         * @return ApiResponse&lt;Score&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Score> executeWithHttpInfo() throws ApiException {
            return getByIdWithHttpInfo(scoreId);
        }

        /**
         * Execute getById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Score> _callback) throws ApiException {
            return getByIdAsync(scoreId, _callback);
        }
    }

    /**
     * 
     * Get a score
     * @param scoreId The unique langfuse identifier of a score (required)
     * @return GetByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public GetByIdRequestBuilder getById(String scoreId) throws IllegalArgumentException {
        if (scoreId == null) throw new IllegalArgumentException("\"scoreId\" is required but got null");
            

        return new GetByIdRequestBuilder(scoreId);
    }
}