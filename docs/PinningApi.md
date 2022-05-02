# PinningApi

All URIs are relative to *http://api.estuary.tech*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pinningPinsGet**](PinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pinned objects |
| [**pinningPinsPost**](PinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object |
| [**pinningPinsRequestidDelete**](PinningApi.md#pinningPinsRequestidDelete) | **DELETE** /pinning/pins/{requestid} | Delete a pinned object |
| [**pinningPinsRequestidGet**](PinningApi.md#pinningPinsRequestidGet) | **GET** /pinning/pins/{requestid} | Get a pinned objects |
| [**pinningPinsRequestidPost**](PinningApi.md#pinningPinsRequestidPost) | **POST** /pinning/pins/{requestid} | Replace a pinned object |


<a name="pinningPinsGet"></a>
# **pinningPinsGet**
> pinningPinsGet()

List all pinned objects

This endpoint lists all pinned objects

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PinningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    PinningApi apiInstance = new PinningApi(defaultClient);
    try {
      apiInstance.pinningPinsGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling PinningApi#pinningPinsGet");
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a name="pinningPinsPost"></a>
# **pinningPinsPost**
> String pinningPinsPost(cid, name)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PinningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    PinningApi apiInstance = new PinningApi(defaultClient);
    String cid = "cid_example"; // String | cid
    String name = "name_example"; // String | name
    try {
      String result = apiInstance.pinningPinsPost(cid, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PinningApi#pinningPinsPost");
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
| **cid** | **String**| cid | |
| **name** | **String**| name | |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="pinningPinsRequestidDelete"></a>
# **pinningPinsRequestidDelete**
> String pinningPinsRequestidDelete(requestid)

Delete a pinned object

This endpoint deletes a pinned object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PinningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    PinningApi apiInstance = new PinningApi(defaultClient);
    String requestid = "requestid_example"; // String | requestid
    try {
      String result = apiInstance.pinningPinsRequestidDelete(requestid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PinningApi#pinningPinsRequestidDelete");
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
| **requestid** | **String**| requestid | |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="pinningPinsRequestidGet"></a>
# **pinningPinsRequestidGet**
> String pinningPinsRequestidGet(requestid)

Get a pinned objects

This endpoint returns a pinned object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PinningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    PinningApi apiInstance = new PinningApi(defaultClient);
    String requestid = "requestid_example"; // String | cid
    try {
      String result = apiInstance.pinningPinsRequestidGet(requestid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PinningApi#pinningPinsRequestidGet");
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
| **requestid** | **String**| cid | |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="pinningPinsRequestidPost"></a>
# **pinningPinsRequestidPost**
> String pinningPinsRequestidPost(requestid)

Replace a pinned object

This endpoint replaces a pinned object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PinningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    PinningApi apiInstance = new PinningApi(defaultClient);
    String requestid = "requestid_example"; // String | id
    try {
      String result = apiInstance.pinningPinsRequestidPost(requestid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PinningApi#pinningPinsRequestidPost");
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
| **requestid** | **String**| id | |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

