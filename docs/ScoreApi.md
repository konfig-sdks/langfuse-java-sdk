# ScoreApi

All URIs are relative to *https://cloud.langfuse.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](ScoreApi.md#create) | **POST** /api/public/scores |  |
| [**delete**](ScoreApi.md#delete) | **DELETE** /api/public/scores/{scoreId} |  |
| [**get**](ScoreApi.md#get) | **GET** /api/public/scores |  |
| [**getById**](ScoreApi.md#getById) | **GET** /api/public/scores/{scoreId} |  |


<a name="create"></a>
# **create**
> Score create(createScoreRequest).execute();



Create a score

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScoreApi;
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
    String traceId = "traceId_example";
    String name = "name_example";
    Double value = 3.4D;
    String id = "id_example";
    String observationId = "observationId_example";
    String comment = "comment_example";
    try {
      Score result = client
              .score
              .create(traceId, name, value)
              .id(id)
              .observationId(observationId)
              .comment(comment)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getTraceId());
      System.out.println(result.getName());
      System.out.println(result.getValue());
      System.out.println(result.getSource());
      System.out.println(result.getObservationId());
      System.out.println(result.getTimestamp());
      System.out.println(result.getComment());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Score> response = client
              .score
              .create(traceId, name, value)
              .id(id)
              .observationId(observationId)
              .comment(comment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#create");
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
| **createScoreRequest** | [**CreateScoreRequest**](CreateScoreRequest.md)|  | |

### Return type

[**Score**](Score.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="delete"></a>
# **delete**
> delete(scoreId).execute();



Delete a score

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScoreApi;
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
    String scoreId = "scoreId_example"; // The unique langfuse identifier of a score
    try {
      client
              .score
              .delete(scoreId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#delete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .score
              .delete(scoreId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#delete");
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
| **scoreId** | **String**| The unique langfuse identifier of a score | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

<a name="get"></a>
# **get**
> Scores get().page(page).limit(limit).userId(userId).name(name).execute();



Get a list of scores

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScoreApi;
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
    try {
      Scores result = client
              .score
              .get()
              .page(page)
              .limit(limit)
              .userId(userId)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Scores> response = client
              .score
              .get()
              .page(page)
              .limit(limit)
              .userId(userId)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#get");
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

### Return type

[**Scores**](Scores.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getById"></a>
# **getById**
> Score getById(scoreId).execute();



Get a score

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScoreApi;
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
    String scoreId = "scoreId_example"; // The unique langfuse identifier of a score
    try {
      Score result = client
              .score
              .getById(scoreId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getTraceId());
      System.out.println(result.getName());
      System.out.println(result.getValue());
      System.out.println(result.getSource());
      System.out.println(result.getObservationId());
      System.out.println(result.getTimestamp());
      System.out.println(result.getComment());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Score> response = client
              .score
              .getById(scoreId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#getById");
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
| **scoreId** | **String**| The unique langfuse identifier of a score | |

### Return type

[**Score**](Score.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

