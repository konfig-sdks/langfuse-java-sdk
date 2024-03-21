# ObservationsApi

All URIs are relative to *https://cloud.langfuse.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](ObservationsApi.md#get) | **GET** /api/public/observations/{observationId} |  |
| [**getMany**](ObservationsApi.md#getMany) | **GET** /api/public/observations |  |


<a name="get"></a>
# **get**
> Observation get(observationId).execute();



Get a observation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ObservationsApi;
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
    String observationId = "observationId_example"; // The unique langfuse identifier of an observation, can be an event, span or generation
    try {
      Observation result = client
              .observations
              .get(observationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getTraceId());
      System.out.println(result.getType());
      System.out.println(result.getName());
      System.out.println(result.getStartTime());
      System.out.println(result.getEndTime());
      System.out.println(result.getCompletionStartTime());
      System.out.println(result.getModel());
      System.out.println(result.getModelParameters());
      System.out.println(result.getInput());
      System.out.println(result.getMetadata());
      System.out.println(result.getOutput());
      System.out.println(result.getUsage());
      System.out.println(result.getLevel());
      System.out.println(result.getStatusMessage());
      System.out.println(result.getParentObservationId());
      System.out.println(result.getPromptId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservationsApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Observation> response = client
              .observations
              .get(observationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservationsApi#get");
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
| **observationId** | **String**| The unique langfuse identifier of an observation, can be an event, span or generation | |

### Return type

[**Observation**](Observation.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getMany"></a>
# **getMany**
> ObservationsViews getMany().page(page).limit(limit).name(name).userId(userId).type(type).traceId(traceId).parentObservationId(parentObservationId).execute();



Get a list of observations

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ObservationsApi;
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
    String name = "name_example";
    String userId = "userId_example";
    String type = "type_example";
    String traceId = "traceId_example";
    String parentObservationId = "parentObservationId_example";
    try {
      ObservationsViews result = client
              .observations
              .getMany()
              .page(page)
              .limit(limit)
              .name(name)
              .userId(userId)
              .type(type)
              .traceId(traceId)
              .parentObservationId(parentObservationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservationsApi#getMany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ObservationsViews> response = client
              .observations
              .getMany()
              .page(page)
              .limit(limit)
              .name(name)
              .userId(userId)
              .type(type)
              .traceId(traceId)
              .parentObservationId(parentObservationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservationsApi#getMany");
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
| **name** | **String**|  | [optional] |
| **userId** | **String**|  | [optional] |
| **type** | **String**|  | [optional] |
| **traceId** | **String**|  | [optional] |
| **parentObservationId** | **String**|  | [optional] |

### Return type

[**ObservationsViews**](ObservationsViews.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

