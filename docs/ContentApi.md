# ContentApi

All URIs are relative to *http://api.estuary.tech*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contentAddCarPost**](ContentApi.md#contentAddCarPost) | **POST** /content/add-car | Add Car object |
| [**contentAddIpfsPost**](ContentApi.md#contentAddIpfsPost) | **POST** /content/add-ipfs | Add IPFS object |
| [**contentAddPost**](ContentApi.md#contentAddPost) | **POST** /content/add | Add new content |
| [**contentAggregatedContentGet**](ContentApi.md#contentAggregatedContentGet) | **GET** /content/aggregated/{content} | Get aggregated content stats |
| [**contentAllDealsGet**](ContentApi.md#contentAllDealsGet) | **GET** /content/all-deals | Get all deals for a user |
| [**contentBwUsageContentGet**](ContentApi.md#contentBwUsageContentGet) | **GET** /content/bw-usage/{content} | Get content bandwidth |
| [**contentCreatePost**](ContentApi.md#contentCreatePost) | **POST** /content/create | Add a new content |
| [**contentDealsGet**](ContentApi.md#contentDealsGet) | **GET** /content/deals | Content with deals |
| [**contentEnsureReplicationDatacidGet**](ContentApi.md#contentEnsureReplicationDatacidGet) | **GET** /content/ensure-replication/{datacid} | Ensure Replication |
| [**contentFailuresContentGet**](ContentApi.md#contentFailuresContentGet) | **GET** /content/failures/{content} | List all failures for a content |
| [**contentImportdealPost**](ContentApi.md#contentImportdealPost) | **POST** /content/importdeal | Import a deal |
| [**contentListGet**](ContentApi.md#contentListGet) | **GET** /content/list | List all pinned content |
| [**contentReadContGet**](ContentApi.md#contentReadContGet) | **GET** /content/read/{cont} | Read content |
| [**contentStagingZonesGet**](ContentApi.md#contentStagingZonesGet) | **GET** /content/staging-zones | Get staging zone for user |
| [**contentStatsGet**](ContentApi.md#contentStatsGet) | **GET** /content/stats | Get content statistics |
| [**contentStatusIdGet**](ContentApi.md#contentStatusIdGet) | **GET** /content/status/{id} | Content Status |


<a name="contentAddCarPost"></a>
# **contentAddCarPost**
> String contentAddCarPost(body, filename, commp, size)

Add Car object

This endpoint is used to add a car object to the network. The object can be a file or a directory.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    String body = "body_example"; // String | Car
    String filename = "filename_example"; // String | Filename
    String commp = "commp_example"; // String | Commp
    String size = "size_example"; // String | Size
    try {
      String result = apiInstance.contentAddCarPost(body, filename, commp, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentAddCarPost");
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
| **body** | **String**| Car | |
| **filename** | **String**| Filename | [optional] |
| **commp** | **String**| Commp | [optional] |
| **size** | **String**| Size | [optional] |

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

<a name="contentAddIpfsPost"></a>
# **contentAddIpfsPost**
> String contentAddIpfsPost(body)

Add IPFS object

This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    UtilContentAddIpfsBody body = new UtilContentAddIpfsBody(); // UtilContentAddIpfsBody | IPFS Body
    try {
      String result = apiInstance.contentAddIpfsPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentAddIpfsPost");
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
| **body** | [**UtilContentAddIpfsBody**](UtilContentAddIpfsBody.md)| IPFS Body | |

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

<a name="contentAddPost"></a>
# **contentAddPost**
> String contentAddPost(_file, collection, collectionPath)

Add new content

This endpoint is used to upload new content.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    File _file = new File("/path/to/file"); // File | File to upload
    String collection = "collection_example"; // String | Collection
    String collectionPath = "collectionPath_example"; // String | Collection Path
    try {
      String result = apiInstance.contentAddPost(_file, collection, collectionPath);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentAddPost");
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
| **_file** | **File**| File to upload | |
| **collection** | **String**| Collection | [optional] |
| **collectionPath** | **String**| Collection Path | [optional] |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="contentAggregatedContentGet"></a>
# **contentAggregatedContentGet**
> String contentAggregatedContentGet(content)

Get aggregated content stats

This endpoint returns aggregated content stats

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    String content = "content_example"; // String | Content ID
    try {
      String result = apiInstance.contentAggregatedContentGet(content);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentAggregatedContentGet");
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
| **content** | **String**| Content ID | |

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

<a name="contentAllDealsGet"></a>
# **contentAllDealsGet**
> String contentAllDealsGet(begin, duration, all)

Get all deals for a user

This endpoint is used to get all deals for a user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    String begin = "begin_example"; // String | Begin
    String duration = "duration_example"; // String | Duration
    String all = "all_example"; // String | All
    try {
      String result = apiInstance.contentAllDealsGet(begin, duration, all);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentAllDealsGet");
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
| **begin** | **String**| Begin | |
| **duration** | **String**| Duration | |
| **all** | **String**| All | |

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

<a name="contentBwUsageContentGet"></a>
# **contentBwUsageContentGet**
> String contentBwUsageContentGet(content)

Get content bandwidth

This endpoint returns content bandwidth

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    String content = "content_example"; // String | Content ID
    try {
      String result = apiInstance.contentBwUsageContentGet(content);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentBwUsageContentGet");
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
| **content** | **String**| Content ID | |

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

<a name="contentCreatePost"></a>
# **contentCreatePost**
> String contentCreatePost(body)

Add a new content

This endpoint adds a new content

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    String body = "body_example"; // String | Content
    try {
      String result = apiInstance.contentCreatePost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentCreatePost");
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
| **body** | **String**| Content | |

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

<a name="contentDealsGet"></a>
# **contentDealsGet**
> String contentDealsGet(limit, offset)

Content with deals

This endpoint lists all content with deals

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    Integer limit = 56; // Integer | Limit
    Integer offset = 56; // Integer | Offset
    try {
      String result = apiInstance.contentDealsGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentDealsGet");
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
| **limit** | **Integer**| Limit | [optional] |
| **offset** | **Integer**| Offset | [optional] |

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

<a name="contentEnsureReplicationDatacidGet"></a>
# **contentEnsureReplicationDatacidGet**
> String contentEnsureReplicationDatacidGet(datacid)

Ensure Replication

This endpoint ensures that the content is replicated to the specified number of providers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    String datacid = "datacid_example"; // String | Data CID
    try {
      String result = apiInstance.contentEnsureReplicationDatacidGet(datacid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentEnsureReplicationDatacidGet");
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
| **datacid** | **String**| Data CID | |

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

<a name="contentFailuresContentGet"></a>
# **contentFailuresContentGet**
> String contentFailuresContentGet(content)

List all failures for a content

This endpoint returns all failures for a content

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    String content = "content_example"; // String | Content ID
    try {
      String result = apiInstance.contentFailuresContentGet(content);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentFailuresContentGet");
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
| **content** | **String**| Content ID | |

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

<a name="contentImportdealPost"></a>
# **contentImportdealPost**
> String contentImportdealPost(body)

Import a deal

This endpoint imports a deal into the shuttle.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    MainImportDealBody body = new MainImportDealBody(); // MainImportDealBody | Import a deal
    try {
      String result = apiInstance.contentImportdealPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentImportdealPost");
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
| **body** | [**MainImportDealBody**](MainImportDealBody.md)| Import a deal | |

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

<a name="contentListGet"></a>
# **contentListGet**
> List&lt;String&gt; contentListGet()

List all pinned content

This endpoint lists all content

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    try {
      List<String> result = apiInstance.contentListGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentListGet");
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

**List&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="contentReadContGet"></a>
# **contentReadContGet**
> String contentReadContGet(cont)

Read content

This endpoint reads content from the blockstore

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    String cont = "cont_example"; // String | CID
    try {
      String result = apiInstance.contentReadContGet(cont);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentReadContGet");
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
| **cont** | **String**| CID | |

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

<a name="contentStagingZonesGet"></a>
# **contentStagingZonesGet**
> String contentStagingZonesGet()

Get staging zone for user

This endpoint is used to get staging zone for user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    try {
      String result = apiInstance.contentStagingZonesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentStagingZonesGet");
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

<a name="contentStatsGet"></a>
# **contentStatsGet**
> String contentStatsGet(limit)

Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    String limit = "limit_example"; // String | limit
    try {
      String result = apiInstance.contentStatsGet(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentStatsGet");
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
| **limit** | **String**| limit | |

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

<a name="contentStatusIdGet"></a>
# **contentStatusIdGet**
> String contentStatusIdGet(id)

Content Status

This endpoint returns the status of a content

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.estuary.tech");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    ContentApi apiInstance = new ContentApi(defaultClient);
    Integer id = 56; // Integer | Content ID
    try {
      String result = apiInstance.contentStatusIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#contentStatusIdGet");
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
| **id** | **Integer**| Content ID | |

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

