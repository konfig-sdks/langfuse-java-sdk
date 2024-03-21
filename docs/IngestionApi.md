# IngestionApi

All URIs are relative to *https://cloud.langfuse.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batch**](IngestionApi.md#batch) | **POST** /api/public/ingestion |  |


<a name="batch"></a>
# **batch**
> IngestionResponse batch(ingestionBatchRequest).execute();



Batched ingestion for Langfuse Tracing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IngestionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.langfuse.com";
    
    // Configure HTTP basic authorization: BasicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Langfuse client = new Langfuse(configuration);
    List<Object> batch = Arrays.asList(null);
    try {
      IngestionResponse result = client
              .ingestion
              .batch(batch)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccesses());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling IngestionApi#batch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IngestionResponse> response = client
              .ingestion
              .batch(batch)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IngestionApi#batch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ingestionBatchRequest** | [**IngestionBatchRequest**](IngestionBatchRequest.md)|  | |

### Return type

[**IngestionResponse**](IngestionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

