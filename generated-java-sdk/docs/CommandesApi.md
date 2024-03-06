# CommandesApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**commandesGet**](CommandesApi.md#commandesGet) | **GET** /commandes | Get a list of commands |
| [**commandesIdDelete**](CommandesApi.md#commandesIdDelete) | **DELETE** /commandes/{id} | Delete command by ID |
| [**commandesIdGet**](CommandesApi.md#commandesIdGet) | **GET** /commandes/{id} | Get command by ID |
| [**commandesIdPut**](CommandesApi.md#commandesIdPut) | **PUT** /commandes/{id} | Update command by ID |
| [**commandesPost**](CommandesApi.md#commandesPost) | **POST** /commandes | Create a new command |


<a id="commandesGet"></a>
# **commandesGet**
> List&lt;CommandesGet200ResponseInner&gt; commandesGet()

Get a list of commands

Retrieve information about commandes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    CommandesApi apiInstance = new CommandesApi(defaultClient);
    try {
      List<CommandesGet200ResponseInner> result = apiInstance.commandesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommandesApi#commandesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CommandesGet200ResponseInner&gt;**](CommandesGet200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="commandesIdDelete"></a>
# **commandesIdDelete**
> commandesIdDelete(id)

Delete command by ID

Remove a specific command.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    CommandesApi apiInstance = new CommandesApi(defaultClient);
    Long id = 56L; // Long | ID of the command
    try {
      apiInstance.commandesIdDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommandesApi#commandesIdDelete");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Long**| ID of the command | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Command deleted successfully |  -  |
| **404** | Command not found |  -  |

<a id="commandesIdGet"></a>
# **commandesIdGet**
> CommandesGet200ResponseInner commandesIdGet(id)

Get command by ID

Retrieve information about a specific command.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    CommandesApi apiInstance = new CommandesApi(defaultClient);
    Long id = 56L; // Long | ID of the command
    try {
      CommandesGet200ResponseInner result = apiInstance.commandesIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommandesApi#commandesIdGet");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Long**| ID of the command | |

### Return type

[**CommandesGet200ResponseInner**](CommandesGet200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Command not found |  -  |

<a id="commandesIdPut"></a>
# **commandesIdPut**
> commandesIdPut(id, commandesPostRequest)

Update command by ID

Update information about a specific command.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    CommandesApi apiInstance = new CommandesApi(defaultClient);
    Long id = 56L; // Long | ID of the command
    CommandesPostRequest commandesPostRequest = new CommandesPostRequest(); // CommandesPostRequest | 
    try {
      apiInstance.commandesIdPut(id, commandesPostRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommandesApi#commandesIdPut");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Long**| ID of the command | |
| **commandesPostRequest** | [**CommandesPostRequest**](CommandesPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request, invalid input |  -  |
| **404** | Command not found |  -  |

<a id="commandesPost"></a>
# **commandesPost**
> commandesPost(commandesPostRequest)

Create a new command

Add a new command to the list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    CommandesApi apiInstance = new CommandesApi(defaultClient);
    CommandesPostRequest commandesPostRequest = new CommandesPostRequest(); // CommandesPostRequest | 
    try {
      apiInstance.commandesPost(commandesPostRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommandesApi#commandesPost");
      System.err.println("Status code: " + e.getCode());
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
| **commandesPostRequest** | [**CommandesPostRequest**](CommandesPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Command created successfully |  -  |
| **400** | Bad request, invalid input |  -  |

