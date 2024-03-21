<div align="left">

[![Visit Langfuse](./header.png)](https://langfuse.com)

# [Langfuse](https://langfuse.com)

## Authentication

Authenticate with the API using Basic Auth, get API keys in the project settings:

- username: Langfuse Public Key
- password: Langfuse Secret Key

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Langfuse&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>langfuse-java-sdk</artifactId>
  <version></version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:langfuse-java-sdk:"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/langfuse-java-sdk-.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Langfuse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetItemsApi;
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
    String datasetName = "datasetName_example";
    Object input = null;
    Object expectedOutput = null;
    String id = "id_example"; // Dataset items are upserted on their id
    try {
      DatasetItem result = client
              .datasetItems
              .create(datasetName, input)
              .expectedOutput(expectedOutput)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getInput());
      System.out.println(result.getExpectedOutput());
      System.out.println(result.getSourceObservationId());
      System.out.println(result.getDatasetId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetItemsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DatasetItem> response = client
              .datasetItems
              .create(datasetName, input)
              .expectedOutput(expectedOutput)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetItemsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://cloud.langfuse.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DatasetItemsApi* | [**create**](docs/DatasetItemsApi.md#create) | **POST** /api/public/dataset-items | 
*DatasetItemsApi* | [**get**](docs/DatasetItemsApi.md#get) | **GET** /api/public/dataset-items/{id} | 
*DatasetRunItemsApi* | [**create**](docs/DatasetRunItemsApi.md#create) | **POST** /api/public/dataset-run-items | 
*DatasetsApi* | [**create**](docs/DatasetsApi.md#create) | **POST** /api/public/datasets | 
*DatasetsApi* | [**get**](docs/DatasetsApi.md#get) | **GET** /api/public/datasets/{datasetName} | 
*DatasetsApi* | [**getRuns**](docs/DatasetsApi.md#getRuns) | **GET** /api/public/datasets/{datasetName}/runs/{runName} | 
*HealthApi* | [**health**](docs/HealthApi.md#health) | **GET** /api/public/health | 
*IngestionApi* | [**batch**](docs/IngestionApi.md#batch) | **POST** /api/public/ingestion | 
*MetricsApi* | [**daily**](docs/MetricsApi.md#daily) | **GET** /api/public/metrics/daily | 
*ObservationsApi* | [**get**](docs/ObservationsApi.md#get) | **GET** /api/public/observations/{observationId} | 
*ObservationsApi* | [**getMany**](docs/ObservationsApi.md#getMany) | **GET** /api/public/observations | 
*ProjectsApi* | [**get**](docs/ProjectsApi.md#get) | **GET** /api/public/projects | 
*PromptsApi* | [**create**](docs/PromptsApi.md#create) | **POST** /api/public/prompts | 
*PromptsApi* | [**get**](docs/PromptsApi.md#get) | **GET** /api/public/prompts | 
*ScoreApi* | [**create**](docs/ScoreApi.md#create) | **POST** /api/public/scores | 
*ScoreApi* | [**delete**](docs/ScoreApi.md#delete) | **DELETE** /api/public/scores/{scoreId} | 
*ScoreApi* | [**get**](docs/ScoreApi.md#get) | **GET** /api/public/scores | 
*ScoreApi* | [**getById**](docs/ScoreApi.md#getById) | **GET** /api/public/scores/{scoreId} | 
*SessionsApi* | [**get**](docs/SessionsApi.md#get) | **GET** /api/public/sessions/{sessionId} | 
*TraceApi* | [**get**](docs/TraceApi.md#get) | **GET** /api/public/traces/{traceId} | 
*TraceApi* | [**list**](docs/TraceApi.md#list) | **GET** /api/public/traces | 


## Documentation for Models

 - [BaseEvent](docs/BaseEvent.md)
 - [CreateDatasetItemRequest](docs/CreateDatasetItemRequest.md)
 - [CreateDatasetRequest](docs/CreateDatasetRequest.md)
 - [CreateDatasetRunItemRequest](docs/CreateDatasetRunItemRequest.md)
 - [CreatePromptRequest](docs/CreatePromptRequest.md)
 - [CreateScoreRequest](docs/CreateScoreRequest.md)
 - [DailyMetrics](docs/DailyMetrics.md)
 - [DailyMetricsDetails](docs/DailyMetricsDetails.md)
 - [Dataset](docs/Dataset.md)
 - [DatasetItem](docs/DatasetItem.md)
 - [DatasetRun](docs/DatasetRun.md)
 - [DatasetRunItem](docs/DatasetRunItem.md)
 - [DatasetStatus](docs/DatasetStatus.md)
 - [HealthResponse](docs/HealthResponse.md)
 - [IngestionBatchRequest](docs/IngestionBatchRequest.md)
 - [IngestionError](docs/IngestionError.md)
 - [IngestionResponse](docs/IngestionResponse.md)
 - [IngestionSuccess](docs/IngestionSuccess.md)
 - [ModelUsageUnit](docs/ModelUsageUnit.md)
 - [Observation](docs/Observation.md)
 - [ObservationBody](docs/ObservationBody.md)
 - [ObservationLevel](docs/ObservationLevel.md)
 - [ObservationType](docs/ObservationType.md)
 - [Observations](docs/Observations.md)
 - [ObservationsViews](docs/ObservationsViews.md)
 - [OpenAIUsage](docs/OpenAIUsage.md)
 - [OptionalObservationBody](docs/OptionalObservationBody.md)
 - [Project](docs/Project.md)
 - [Projects](docs/Projects.md)
 - [Prompt](docs/Prompt.md)
 - [SDKLogBody](docs/SDKLogBody.md)
 - [Score](docs/Score.md)
 - [ScoreBody](docs/ScoreBody.md)
 - [ScoreSource](docs/ScoreSource.md)
 - [Scores](docs/Scores.md)
 - [Session](docs/Session.md)
 - [Sort](docs/Sort.md)
 - [Trace](docs/Trace.md)
 - [TraceBody](docs/TraceBody.md)
 - [Traces](docs/Traces.md)
 - [Usage](docs/Usage.md)
 - [UsageByModel](docs/UsageByModel.md)
 - [UtilsMetaResponse](docs/UtilsMetaResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
