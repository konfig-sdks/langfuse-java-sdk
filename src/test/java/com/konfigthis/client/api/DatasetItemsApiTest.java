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
import com.konfigthis.client.model.CreateDatasetItemRequest;
import com.konfigthis.client.model.DatasetItem;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatasetItemsApi
 */
@Disabled
public class DatasetItemsApiTest {

    private static DatasetItemsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DatasetItemsApi(apiClient);
    }

    /**
     * Create a dataset item
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        String datasetName = null;
        Object input = null;
        Object expectedOutput = null;
        String id = null;
        DatasetItem response = api.create(datasetName, input)
                .expectedOutput(expectedOutput)
                .id(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a dataset item
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String id = null;
        DatasetItem response = api.get(id)
                .execute();
        // TODO: test validations
    }

}
