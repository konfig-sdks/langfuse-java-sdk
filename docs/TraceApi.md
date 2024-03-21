# TraceApi

All URIs are relative to *https://cloud.langfuse.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](TraceApi.md#get) | **GET** /api/public/traces/{traceId} |  |
| [**list**](TraceApi.md#list) | **GET** /api/public/traces |  |


<a name="get"></a>
# **get**
> Trace get(traceId).execute();



Get a specific trace

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TraceApi;
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
    String traceId = "traceId_example"; // The unique langfuse identifier of a trace
    try {
      Trace result = client
              .trace
              .get(traceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getTimestamp());
      System.out.println(result.getName());
      System.out.println(result.getInput());
      System.out.println(result.getOutput());
      System.out.println(result.getSessionId());
      System.out.println(result.getRelease());
      System.out.println(result.getUserId());
      System.out.println(result.getMetadata());
      System.out.println(result.getPublic());
    } catch (ApiException e) {
      System.err.println("Exception when calling TraceApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Trace> response = client
              .trace
              .get(traceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TraceApi#get");
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
| **traceId** | **String**| The unique langfuse identifier of a trace | |

### Return type

[**Trace**](Trace.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="list"></a>
# **list**
> Traces list().page(page).limit(limit).userId(userId).name(name).orderBy(orderBy).tags(tags).execute();



Get list of traces

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TraceApi;
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
    String userId = "userId_example";
    String name = "name_example";
    String orderBy = "orderBy_example"; // Format of the string [field].[asc/desc]. Fields: id, timestamp, name, userId, release, version, public, bookmarked, sessionId. Example: timestamp.asc
    List<String> tags = Arrays.asList(); // Only traces that include all of these tags will be returned.
    try {
      Traces result = client
              .trace
              .list()
              .page(page)
              .limit(limit)
              .userId(userId)
              .name(name)
              .orderBy(orderBy)
              .tags(tags)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TraceApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Traces> response = client
              .trace
              .list()
              .page(page)
              .limit(limit)
              .userId(userId)
              .name(name)
              .orderBy(orderBy)
              .tags(tags)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TraceApi#list");
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
| **userId** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **orderBy** | **String**| Format of the string [field].[asc/desc]. Fields: id, timestamp, name, userId, release, version, public, bookmarked, sessionId. Example: timestamp.asc | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| Only traces that include all of these tags will be returned. | [optional] |

### Return type

[**Traces**](Traces.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

