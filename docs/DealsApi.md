# DealsApi

All URIs are relative to *http://api.estuary.tech*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dealsEstimatePost**](DealsApi.md#dealsEstimatePost) | **POST** /deals/estimate | Estimate the cost of a deal |
| [**dealsFailuresGet**](DealsApi.md#dealsFailuresGet) | **GET** /deals/failures | Get storage failures |
| [**dealsInfoDealidGet**](DealsApi.md#dealsInfoDealidGet) | **GET** /deals/info/{dealid} | Get Deal Info |
| [**dealsMakeMinerPost**](DealsApi.md#dealsMakeMinerPost) | **POST** /deals/make/{miner} | Make Deal |
| [**dealsProposalPropcidGet**](DealsApi.md#dealsProposalPropcidGet) | **GET** /deals/proposal/{propcid} | Get Proposal |
| [**dealsQueryMinerGet**](DealsApi.md#dealsQueryMinerGet) | **GET** /deals/query/{miner} | Query Ask |
| [**dealsStatusByProposalPropcidGet**](DealsApi.md#dealsStatusByProposalPropcidGet) | **GET** /deals/status-by-proposal/{propcid} | Get Deal Status by PropCid |
| [**dealsStatusDealGet**](DealsApi.md#dealsStatusDealGet) | **GET** /deals/status/{deal} | Get Deal Status |
| [**dealsStatusMinerPropcidGet**](DealsApi.md#dealsStatusMinerPropcidGet) | **GET** /deals/status/{miner}/{propcid} | Deal Status |
| [**dealsTransferInProgressGet**](DealsApi.md#dealsTransferInProgressGet) | **GET** /deals/transfer/in-progress | Transfer In Progress |
| [**dealsTransferStatusPost**](DealsApi.md#dealsTransferStatusPost) | **POST** /deals/transfer/status | Transfer Status |


<a name="dealsEstimatePost"></a>
# **dealsEstimatePost**
> String dealsEstimatePost(body)

Estimate the cost of a deal

This endpoint estimates the cost of a deal

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DealsApi apiInstance = new DealsApi(defaultClient);
    MainEstimateDealBody body = new MainEstimateDealBody(); // MainEstimateDealBody | The size of the deal in bytes, the replication factor, and the duration of the deal in blocks
    try {
      String result = apiInstance.dealsEstimatePost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#dealsEstimatePost");
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
| **body** | [**MainEstimateDealBody**](MainEstimateDealBody.md)| The size of the deal in bytes, the replication factor, and the duration of the deal in blocks | |

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

<a name="dealsFailuresGet"></a>
# **dealsFailuresGet**
> String dealsFailuresGet()

Get storage failures

This endpoint returns a list of storage failures

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DealsApi apiInstance = new DealsApi(defaultClient);
    try {
      String result = apiInstance.dealsFailuresGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#dealsFailuresGet");
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

<a name="dealsInfoDealidGet"></a>
# **dealsInfoDealidGet**
> String dealsInfoDealidGet(dealid)

Get Deal Info

This endpoint returns the deal info for a deal

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DealsApi apiInstance = new DealsApi(defaultClient);
    Integer dealid = 56; // Integer | Deal ID
    try {
      String result = apiInstance.dealsInfoDealidGet(dealid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#dealsInfoDealidGet");
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
| **dealid** | **Integer**| Deal ID | |

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

<a name="dealsMakeMinerPost"></a>
# **dealsMakeMinerPost**
> String dealsMakeMinerPost(miner, dealRequest)

Make Deal

This endpoint makes a deal for a given content and miner

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DealsApi apiInstance = new DealsApi(defaultClient);
    String miner = "miner_example"; // String | Miner
    String dealRequest = "dealRequest_example"; // String | Deal Request
    try {
      String result = apiInstance.dealsMakeMinerPost(miner, dealRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#dealsMakeMinerPost");
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
| **miner** | **String**| Miner | |
| **dealRequest** | **String**| Deal Request | |

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

<a name="dealsProposalPropcidGet"></a>
# **dealsProposalPropcidGet**
> String dealsProposalPropcidGet(propcid)

Get Proposal

This endpoint returns the proposal for a deal

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DealsApi apiInstance = new DealsApi(defaultClient);
    String propcid = "propcid_example"; // String | Proposal CID
    try {
      String result = apiInstance.dealsProposalPropcidGet(propcid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#dealsProposalPropcidGet");
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
| **propcid** | **String**| Proposal CID | |

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

<a name="dealsQueryMinerGet"></a>
# **dealsQueryMinerGet**
> String dealsQueryMinerGet(miner)

Query Ask

This endpoint returns the ask for a given CID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DealsApi apiInstance = new DealsApi(defaultClient);
    String miner = "miner_example"; // String | CID
    try {
      String result = apiInstance.dealsQueryMinerGet(miner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#dealsQueryMinerGet");
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
| **miner** | **String**| CID | |

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

<a name="dealsStatusByProposalPropcidGet"></a>
# **dealsStatusByProposalPropcidGet**
> String dealsStatusByProposalPropcidGet(propcid)

Get Deal Status by PropCid

Get Deal Status by PropCid

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DealsApi apiInstance = new DealsApi(defaultClient);
    String propcid = "propcid_example"; // String | PropCid
    try {
      String result = apiInstance.dealsStatusByProposalPropcidGet(propcid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#dealsStatusByProposalPropcidGet");
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
| **propcid** | **String**| PropCid | |

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

<a name="dealsStatusDealGet"></a>
# **dealsStatusDealGet**
> String dealsStatusDealGet(deal)

Get Deal Status

This endpoint returns the status of a deal

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DealsApi apiInstance = new DealsApi(defaultClient);
    Integer deal = 56; // Integer | Deal ID
    try {
      String result = apiInstance.dealsStatusDealGet(deal);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#dealsStatusDealGet");
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
| **deal** | **Integer**| Deal ID | |

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

<a name="dealsStatusMinerPropcidGet"></a>
# **dealsStatusMinerPropcidGet**
> String dealsStatusMinerPropcidGet(miner, propcid)

Deal Status

This endpoint returns the status of a deal

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DealsApi apiInstance = new DealsApi(defaultClient);
    String miner = "miner_example"; // String | Miner
    String propcid = "propcid_example"; // String | Proposal CID
    try {
      String result = apiInstance.dealsStatusMinerPropcidGet(miner, propcid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#dealsStatusMinerPropcidGet");
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
| **miner** | **String**| Miner | |
| **propcid** | **String**| Proposal CID | |

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

<a name="dealsTransferInProgressGet"></a>
# **dealsTransferInProgressGet**
> String dealsTransferInProgressGet()

Transfer In Progress

This endpoint returns the in-progress transfers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DealsApi apiInstance = new DealsApi(defaultClient);
    try {
      String result = apiInstance.dealsTransferInProgressGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#dealsTransferInProgressGet");
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

<a name="dealsTransferStatusPost"></a>
# **dealsTransferStatusPost**
> String dealsTransferStatusPost()

Transfer Status

This endpoint returns the status of a transfer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DealsApi apiInstance = new DealsApi(defaultClient);
    try {
      String result = apiInstance.dealsTransferStatusPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#dealsTransferStatusPost");
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

