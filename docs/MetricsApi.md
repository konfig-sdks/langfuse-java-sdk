# MetricsApi

All URIs are relative to *https://cloud.langfuse.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**daily**](MetricsApi.md#daily) | **GET** /api/public/metrics/daily |  |


<a name="daily"></a>
# **daily**
> DailyMetrics daily().page(page).limit(limit).traceName(traceName).userId(userId).tags(tags).execute();



Get daily metrics of the Langfuse project

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetricsApi;
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
    Integer page = 56;
    Integer limit = 56;
    String traceName = "traceName_example"; // Optional filter by the name of the trace
    String userId = "userId_example"; // Optional filter by the userId associated with the trace
    List<String> tags = Arrays.asList(); // Optional filter for metrics where traces include all of these tags
    try {
      DailyMetrics result = client
              .metrics
              .daily()
              .page(page)
              .limit(limit)
              .traceName(traceName)
              .userId(userId)
              .tags(tags)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#daily");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DailyMetrics> response = client
              .metrics
              .daily()
              .page(page)
              .limit(limit)
              .traceName(traceName)
              .userId(userId)
              .tags(tags)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#daily");
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
| **page** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **traceName** | **String**| Optional filter by the name of the trace | [optional] |
| **userId** | **String**| Optional filter by the userId associated with the trace | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| Optional filter for metrics where traces include all of these tags | [optional] |

### Return type

[**DailyMetrics**](DailyMetrics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

