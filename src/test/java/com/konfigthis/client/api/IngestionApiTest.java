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
import com.konfigthis.client.model.IngestionBatchRequest;
import com.konfigthis.client.model.IngestionResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IngestionApi
 */
@Disabled
public class IngestionApiTest {

    private static IngestionApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IngestionApi(apiClient);
    }

    /**
     * Batched ingestion for Langfuse Tracing
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchTest() throws ApiException {
        List<Object> batch = null;
        IngestionResponse response = api.batch(batch)
                .execute();
        // TODO: test validations
    }

}
