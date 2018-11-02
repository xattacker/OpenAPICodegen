# InterCityBusApiApi

All URIs are relative to *http://ptx.transportdata.tw/MOTC*

Method | HTTP request | Description
------------- | ------------- | -------------
[**interCityBusApiDataVersion**](InterCityBusApiApi.md#interCityBusApiDataVersion) | **GET** /v2/Bus/DataVersion/InterCity | 取得指公路客運的最新版本資訊
[**interCityBusApiEstimatedTimeOfArrival**](InterCityBusApiApi.md#interCityBusApiEstimatedTimeOfArrival) | **GET** /v2/Bus/EstimatedTimeOfArrival/InterCity | 取得公路客運的預估到站資料(N1)
[**interCityBusApiEstimatedTimeOfArrival_0**](InterCityBusApiApi.md#interCityBusApiEstimatedTimeOfArrival_0) | **GET** /v2/Bus/EstimatedTimeOfArrival/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運預估到站資料(N1)
[**interCityBusApiNews**](InterCityBusApiApi.md#interCityBusApiNews) | **GET** /v2/Bus/News/InterCity | 取得公路客運之最新消息
[**interCityBusApiOperator**](InterCityBusApiApi.md#interCityBusApiOperator) | **GET** /v2/Bus/Operator/InterCity | 取得公路客運的營運業者資料
[**interCityBusApiRealTimeByFrequency**](InterCityBusApiApi.md#interCityBusApiRealTimeByFrequency) | **GET** /v2/Bus/RealTimeByFrequency/InterCity | 取得公路客運的動態定時資料(A1)
[**interCityBusApiRealTimeByFrequency_0**](InterCityBusApiApi.md#interCityBusApiRealTimeByFrequency_0) | **GET** /v2/Bus/RealTimeByFrequency/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運動態定時資料(A1)
[**interCityBusApiRealTimeNearStop**](InterCityBusApiApi.md#interCityBusApiRealTimeNearStop) | **GET** /v2/Bus/RealTimeNearStop/InterCity | 取得公路客運的動態定點資料(A2)
[**interCityBusApiRealTimeNearStop_0**](InterCityBusApiApi.md#interCityBusApiRealTimeNearStop_0) | **GET** /v2/Bus/RealTimeNearStop/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運動態定點資料(A2)
[**interCityBusApiRoute**](InterCityBusApiApi.md#interCityBusApiRoute) | **GET** /v2/Bus/Route/InterCity | 取得公路客運路線資料
[**interCityBusApiRouteFare**](InterCityBusApiApi.md#interCityBusApiRouteFare) | **GET** /v2/Bus/RouteFare/InterCity | 取得公路客運之路線票價資料
[**interCityBusApiRoute_0**](InterCityBusApiApi.md#interCityBusApiRoute_0) | **GET** /v2/Bus/Route/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運路線資料
[**interCityBusApiSchedule**](InterCityBusApiApi.md#interCityBusApiSchedule) | **GET** /v2/Bus/Schedule/InterCity | 取得公路客運路線班表資料
[**interCityBusApiSchedule_0**](InterCityBusApiApi.md#interCityBusApiSchedule_0) | **GET** /v2/Bus/Schedule/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運路線班表資料
[**interCityBusApiStation**](InterCityBusApiApi.md#interCityBusApiStation) | **GET** /v2/Bus/Station/InterCity | 取得公路客運站位資料
[**interCityBusApiStop**](InterCityBusApiApi.md#interCityBusApiStop) | **GET** /v2/Bus/Stop/InterCity | 取得公路客運站牌資料
[**interCityBusApiStopOfRoute**](InterCityBusApiApi.md#interCityBusApiStopOfRoute) | **GET** /v2/Bus/StopOfRoute/InterCity | 取得公路客運路線與站牌資料
[**interCityBusApiStopOfRoute_0**](InterCityBusApiApi.md#interCityBusApiStopOfRoute_0) | **GET** /v2/Bus/StopOfRoute/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運路線與站牌資料
[**interCityBusApiVehicle**](InterCityBusApiApi.md#interCityBusApiVehicle) | **GET** /v2/Bus/Vehicle/InterCity | 取得公路客運之車輛資料


<a name="interCityBusApiDataVersion"></a>
# **interCityBusApiDataVersion**
> ServiceDTOVersion2BusBusVersion interCityBusApiDataVersion(`$format`)

取得指公路客運的最新版本資訊

版本詳細資訊

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
try {
    val result : ServiceDTOVersion2BusBusVersion = apiInstance.interCityBusApiDataVersion(`$format`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiDataVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiDataVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]

### Return type

[**ServiceDTOVersion2BusBusVersion**](ServiceDTOVersion2BusBusVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiEstimatedTimeOfArrival"></a>
# **interCityBusApiEstimatedTimeOfArrival**
> kotlin.Array&lt;ServiceDTOVersion2BusBusN1EstimateTime&gt; interCityBusApiEstimatedTimeOfArrival(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得公路客運的預估到站資料(N1)

公路客運之預估到站資料(N1)(不保留[現在時間]超過[本平台資料更新時間]兩分鐘的資料)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusN1EstimateTime> = apiInstance.interCityBusApiEstimatedTimeOfArrival(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiEstimatedTimeOfArrival")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiEstimatedTimeOfArrival")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusN1EstimateTime&gt;**](ServiceDTOVersion2BusBusN1EstimateTime.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiEstimatedTimeOfArrival_0"></a>
# **interCityBusApiEstimatedTimeOfArrival_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusN1EstimateTime&gt; interCityBusApiEstimatedTimeOfArrival_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[路線名稱]的公路客運預估到站資料(N1)

公路客運之預估到站資料(N1)(不保留[現在時間]超過[本平台資料更新時間]兩分鐘的資料)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'9102'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusN1EstimateTime> = apiInstance.interCityBusApiEstimatedTimeOfArrival_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiEstimatedTimeOfArrival_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiEstimatedTimeOfArrival_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;9102&#39; | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusN1EstimateTime&gt;**](ServiceDTOVersion2BusBusN1EstimateTime.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiNews"></a>
# **interCityBusApiNews**
> kotlin.Array&lt;ServiceDTOVersion2BusBusNews&gt; interCityBusApiNews(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得公路客運之最新消息

公路客運之最新消息

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusNews> = apiInstance.interCityBusApiNews(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiNews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiNews")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusNews&gt;**](ServiceDTOVersion2BusBusNews.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiOperator"></a>
# **interCityBusApiOperator**
> kotlin.Array&lt;ServiceDTOVersion2BaseOperator&gt; interCityBusApiOperator(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得公路客運的營運業者資料

公路客運之營運業者資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BaseOperator> = apiInstance.interCityBusApiOperator(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiOperator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiOperator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BaseOperator&gt;**](ServiceDTOVersion2BaseOperator.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiRealTimeByFrequency"></a>
# **interCityBusApiRealTimeByFrequency**
> kotlin.Array&lt;ServiceDTOVersion2BusBusA1Data&gt; interCityBusApiRealTimeByFrequency(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得公路客運的動態定時資料(A1)

公路客運之定時資料(A1)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusA1Data> = apiInstance.interCityBusApiRealTimeByFrequency(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiRealTimeByFrequency")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiRealTimeByFrequency")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]
 **&#x60;$spatialFilter&#x60;** | **kotlin.String**| 空間過濾 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusA1Data&gt;**](ServiceDTOVersion2BusBusA1Data.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiRealTimeByFrequency_0"></a>
# **interCityBusApiRealTimeByFrequency_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusA1Data&gt; interCityBusApiRealTimeByFrequency_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得指定[路線名稱]的公路客運動態定時資料(A1)

公路客運之定時資料(A1)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'9102'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusA1Data> = apiInstance.interCityBusApiRealTimeByFrequency_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiRealTimeByFrequency_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiRealTimeByFrequency_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;9102&#39; | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]
 **&#x60;$spatialFilter&#x60;** | **kotlin.String**| 空間過濾 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusA1Data&gt;**](ServiceDTOVersion2BusBusA1Data.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiRealTimeNearStop"></a>
# **interCityBusApiRealTimeNearStop**
> kotlin.Array&lt;ServiceDTOVersion2BusBusA2Data&gt; interCityBusApiRealTimeNearStop(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得公路客運的動態定點資料(A2)

公路客運之定點資料(A2)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusA2Data> = apiInstance.interCityBusApiRealTimeNearStop(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiRealTimeNearStop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiRealTimeNearStop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusA2Data&gt;**](ServiceDTOVersion2BusBusA2Data.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiRealTimeNearStop_0"></a>
# **interCityBusApiRealTimeNearStop_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusA2Data&gt; interCityBusApiRealTimeNearStop_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[路線名稱]的公路客運動態定點資料(A2)

公路客運之定點資料(A2)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'9102'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusA2Data> = apiInstance.interCityBusApiRealTimeNearStop_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiRealTimeNearStop_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiRealTimeNearStop_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;9102&#39; | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusA2Data&gt;**](ServiceDTOVersion2BusBusA2Data.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiRoute"></a>
# **interCityBusApiRoute**
> kotlin.Array&lt;ServiceDTOVersion2BusBusRoute&gt; interCityBusApiRoute(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得公路客運路線資料

公路客運之路線資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusRoute> = apiInstance.interCityBusApiRoute(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusRoute&gt;**](ServiceDTOVersion2BusBusRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiRouteFare"></a>
# **interCityBusApiRouteFare**
> kotlin.Array&lt;ServiceDTOVersion2BusBusRouteFare&gt; interCityBusApiRouteFare(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得公路客運之路線票價資料

公路客運之路線票價資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusRouteFare> = apiInstance.interCityBusApiRouteFare(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiRouteFare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiRouteFare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusRouteFare&gt;**](ServiceDTOVersion2BusBusRouteFare.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiRoute_0"></a>
# **interCityBusApiRoute_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusRoute&gt; interCityBusApiRoute_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[路線名稱]的公路客運路線資料

公路客運之路線資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'9102'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusRoute> = apiInstance.interCityBusApiRoute_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiRoute_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiRoute_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;9102&#39; | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusRoute&gt;**](ServiceDTOVersion2BusBusRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiSchedule"></a>
# **interCityBusApiSchedule**
> kotlin.Array&lt;ServiceDTOVersion2BusBusSchedule&gt; interCityBusApiSchedule(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得公路客運路線班表資料

公路客運之預定班表及班距資料。公路及國道客運多採用【班表】式時刻表

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusSchedule> = apiInstance.interCityBusApiSchedule(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiSchedule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiSchedule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusSchedule&gt;**](ServiceDTOVersion2BusBusSchedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiSchedule_0"></a>
# **interCityBusApiSchedule_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusSchedule&gt; interCityBusApiSchedule_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[路線名稱]的公路客運路線班表資料

公路客運之預定班表及班距資料。公路及國道客運多採用【班表】式時刻表

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'9102'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusSchedule> = apiInstance.interCityBusApiSchedule_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiSchedule_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiSchedule_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;9102&#39; | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusSchedule&gt;**](ServiceDTOVersion2BusBusSchedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiStation"></a>
# **interCityBusApiStation**
> kotlin.Array&lt;ServiceDTOVersion2BusBusStation&gt; interCityBusApiStation(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得公路客運站位資料

公路客運之各站牌所屬的站位資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusStation> = apiInstance.interCityBusApiStation(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiStation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiStation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]
 **&#x60;$spatialFilter&#x60;** | **kotlin.String**| 空間過濾 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusStation&gt;**](ServiceDTOVersion2BusBusStation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiStop"></a>
# **interCityBusApiStop**
> kotlin.Array&lt;ServiceDTOVersion2BusBusStop&gt; interCityBusApiStop(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得公路客運站牌資料

公路客運之站牌資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusStop> = apiInstance.interCityBusApiStop(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiStop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiStop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]
 **&#x60;$spatialFilter&#x60;** | **kotlin.String**| 空間過濾 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusStop&gt;**](ServiceDTOVersion2BusBusStop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiStopOfRoute"></a>
# **interCityBusApiStopOfRoute**
> kotlin.Array&lt;ServiceDTOVersion2BusBusStopOfRoute&gt; interCityBusApiStopOfRoute(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得公路客運路線與站牌資料

公路客運之路線與站牌資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusStopOfRoute> = apiInstance.interCityBusApiStopOfRoute(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiStopOfRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiStopOfRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusStopOfRoute&gt;**](ServiceDTOVersion2BusBusStopOfRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiStopOfRoute_0"></a>
# **interCityBusApiStopOfRoute_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusStopOfRoute&gt; interCityBusApiStopOfRoute_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[路線名稱]的公路客運路線與站牌資料

公路客運之路線與站牌資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'9102'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusStopOfRoute> = apiInstance.interCityBusApiStopOfRoute_0(routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiStopOfRoute_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiStopOfRoute_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;9102&#39; | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusStopOfRoute&gt;**](ServiceDTOVersion2BusBusStopOfRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="interCityBusApiVehicle"></a>
# **interCityBusApiVehicle**
> kotlin.Array&lt;ServiceDTOVersion2BusBusVehicleInfo&gt; interCityBusApiVehicle(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得公路客運之車輛資料

公路客運之車輛資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InterCityBusApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusVehicleInfo> = apiInstance.interCityBusApiVehicle(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterCityBusApiApi#interCityBusApiVehicle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterCityBusApiApi#interCityBusApiVehicle")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusVehicleInfo&gt;**](ServiceDTOVersion2BusBusVehicleInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

