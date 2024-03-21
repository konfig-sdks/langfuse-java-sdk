# PromptsApi

All URIs are relative to *https://cloud.langfuse.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](PromptsApi.md#create) | **POST** /api/public/prompts |  |
| [**get**](PromptsApi.md#get) | **GET** /api/public/prompts |  |


<a name="create"></a>
# **create**
> Prompt create(createPromptRequest).execute();



Create a prompt

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptsApi;
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
    String name = "name_example";
    Boolean isActive = true; // Should the prompt be promoted to production immediately?
    String prompt = "prompt_example";
    Object config = null;
    try {
      Prompt result = client
              .prompts
              .create(name, isActive, prompt)
              .config(config)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getName());
      System.out.println(result.getPrompt());
      System.out.println(result.getConfig());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Prompt> response = client
              .prompts
              .create(name, isActive, prompt)
              .config(config)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptsApi#create");
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
| **createPromptRequest** | [**CreatePromptRequest**](CreatePromptRequest.md)|  | |

### Return type

[**Prompt**](Prompt.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="get"></a>
# **get**
> Prompt get(name).version(version).execute();



Get a prompt

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptsApi;
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
    String name = "name_example";
    Integer version = 56;
    try {
      Prompt result = client
              .prompts
              .get(name)
              .version(version)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getName());
      System.out.println(result.getPrompt());
      System.out.println(result.getConfig());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptsApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Prompt> response = client
              .prompts
              .get(name)
              .version(version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptsApi#get");
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
| **name** | **String**|  | |
| **version** | **Integer**|  | [optional] |

### Return type

[**Prompt**](Prompt.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

