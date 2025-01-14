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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Observation;
import com.konfigthis.client.model.ObservationsViews;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObservationsApi
 */
@Disabled
public class ObservationsApiTest {

    private static ObservationsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ObservationsApi(apiClient);
    }

    /**
     * Get a observation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String observationId = null;
        Observation response = api.get(observationId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a list of observations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getManyTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String name = null;
        String userId = null;
        String type = null;
        String traceId = null;
        String parentObservationId = null;
        ObservationsViews response = api.getMany()
                .page(page)
                .limit(limit)
                .name(name)
                .userId(userId)
                .type(type)
                .traceId(traceId)
                .parentObservationId(parentObservationId)
                .execute();
        // TODO: test validations
    }

}
