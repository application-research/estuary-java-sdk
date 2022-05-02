# MinerApi

All URIs are relative to *http://api.estuary.tech*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**publicMinersDealsMinerGet**](MinerApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals |
| [**publicMinersStatsMinerGet**](MinerApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats |


<a name="publicMinersDealsMinerGet"></a>
# **publicMinersDealsMinerGet**
> String publicMinersDealsMinerGet(miner)

Get all miners deals

This endpoint returns all miners deals

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MinerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    MinerApi apiInstance = new MinerApi(defaultClient);
    String miner = "miner_example"; // String | Filter by miner
    try {
      String result = apiInstance.publicMinersDealsMinerGet(miner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MinerApi#publicMinersDealsMinerGet");
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
| **miner** | **String**| Filter by miner | |

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

<a name="publicMinersStatsMinerGet"></a>
# **publicMinersStatsMinerGet**
> String publicMinersStatsMinerGet(miner)

Get miner stats

This endpoint returns miner stats

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MinerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    MinerApi apiInstance = new MinerApi(defaultClient);
    String miner = "miner_example"; // String | Filter by miner
    try {
      String result = apiInstance.publicMinersStatsMinerGet(miner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MinerApi#publicMinersStatsMinerGet");
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
| **miner** | **String**| Filter by miner | |

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

