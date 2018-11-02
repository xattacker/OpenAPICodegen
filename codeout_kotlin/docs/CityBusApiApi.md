# CityBusApiApi

All URIs are relative to *http://ptx.transportdata.tw/MOTC*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cityBusApiDataVersion**](CityBusApiApi.md#cityBusApiDataVersion) | **GET** /v2/Bus/DataVersion/City/{City} | 取得指定[縣市]目前資料的最新版本資訊
[**cityBusApiDisplayStopOfRoute**](CityBusApiApi.md#cityBusApiDisplayStopOfRoute) | **GET** /v2/Bus/DisplayStopOfRoute/City/{City} | 取得指定[縣市]的市區公車顯示用路線站序資料
[**cityBusApiDisplayStopOfRoute_0**](CityBusApiApi.md#cityBusApiDisplayStopOfRoute_0) | **GET** /v2/Bus/DisplayStopOfRoute/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的市區公車顯示用路線站序資料
[**cityBusApiEstimatedTimeOfArrival**](CityBusApiApi.md#cityBusApiEstimatedTimeOfArrival) | **GET** /v2/Bus/EstimatedTimeOfArrival/City/{City} | 取得指定[縣市]的公車預估到站資料(N1)
[**cityBusApiEstimatedTimeOfArrival_0**](CityBusApiApi.md#cityBusApiEstimatedTimeOfArrival_0) | **GET** /v2/Bus/EstimatedTimeOfArrival/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的公車預估到站資料(N1)
[**cityBusApiNews**](CityBusApiApi.md#cityBusApiNews) | **GET** /v2/Bus/News/City/{City} | 取得市區客運之最新消息
[**cityBusApiOperator**](CityBusApiApi.md#cityBusApiOperator) | **GET** /v2/Bus/Operator/City/{City} | 取得指定[縣市]的市區公車營運業者資料
[**cityBusApiRealTimeByFrequency**](CityBusApiApi.md#cityBusApiRealTimeByFrequency) | **GET** /v2/Bus/RealTimeByFrequency/City/{City} | 取得指定[縣市]的公車動態定時資料(A1)
[**cityBusApiRealTimeByFrequency_0**](CityBusApiApi.md#cityBusApiRealTimeByFrequency_0) | **GET** /v2/Bus/RealTimeByFrequency/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的公車動態定時資料(A1)
[**cityBusApiRealTimeNearStop**](CityBusApiApi.md#cityBusApiRealTimeNearStop) | **GET** /v2/Bus/RealTimeNearStop/City/{City} | 取得指定[縣市]的公車動態定點資料(A2)
[**cityBusApiRealTimeNearStop_0**](CityBusApiApi.md#cityBusApiRealTimeNearStop_0) | **GET** /v2/Bus/RealTimeNearStop/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的公車動態定點資料(A2)
[**cityBusApiRoute**](CityBusApiApi.md#cityBusApiRoute) | **GET** /v2/Bus/Route/City/{City} | 取得指定[縣市]的市區公車路線資料
[**cityBusApiRouteFare**](CityBusApiApi.md#cityBusApiRouteFare) | **GET** /v2/Bus/RouteFare/City/{City} | 取得指定[縣市]的市區公車路線票價資料
[**cityBusApiRoute_0**](CityBusApiApi.md#cityBusApiRoute_0) | **GET** /v2/Bus/Route/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的路線資料
[**cityBusApiSchedule**](CityBusApiApi.md#cityBusApiSchedule) | **GET** /v2/Bus/Schedule/City/{City} | 取得指定[縣市]的市區公車路線班表資料
[**cityBusApiSchedule_0**](CityBusApiApi.md#cityBusApiSchedule_0) | **GET** /v2/Bus/Schedule/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的市區公車路線班表資料
[**cityBusApiShape**](CityBusApiApi.md#cityBusApiShape) | **GET** /v2/Bus/Shape/City/{City} | 取得指定[縣市]的市區公車線型資料
[**cityBusApiStation**](CityBusApiApi.md#cityBusApiStation) | **GET** /v2/Bus/Station/City/{City} | 取得指定[縣市]的市區公車站位資料
[**cityBusApiStop**](CityBusApiApi.md#cityBusApiStop) | **GET** /v2/Bus/Stop/City/{City} | 取得指定[縣市]的市區公車站牌資料
[**cityBusApiStopOfRoute**](CityBusApiApi.md#cityBusApiStopOfRoute) | **GET** /v2/Bus/StopOfRoute/City/{City} | 取得指定[縣市]的市區公車路線站序資料
[**cityBusApiStopOfRoute_0**](CityBusApiApi.md#cityBusApiStopOfRoute_0) | **GET** /v2/Bus/StopOfRoute/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的市區公車路線站序資料
[**cityBusApiVehicle**](CityBusApiApi.md#cityBusApiVehicle) | **GET** /v2/Bus/Vehicle/City/{City} | 取得指定[縣市]的市區公車車輛資料


<a name="cityBusApiDataVersion"></a>
# **cityBusApiDataVersion**
> ServiceDTOVersion2BusBusVersion cityBusApiDataVersion(city, `$format`)

取得指定[縣市]目前資料的最新版本資訊

版本詳細資訊

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
try {
    val result : ServiceDTOVersion2BusBusVersion = apiInstance.cityBusApiDataVersion(city, `$format`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiDataVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiDataVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]

### Return type

[**ServiceDTOVersion2BusBusVersion**](ServiceDTOVersion2BusBusVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cityBusApiDisplayStopOfRoute"></a>
# **cityBusApiDisplayStopOfRoute**
> kotlin.Array&lt;ServiceDTOVersion2BusBusDisplayStopOfRoute&gt; cityBusApiDisplayStopOfRoute(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市]的市區公車顯示用路線站序資料

市區公車之顯示用路線站序資料，僅台北市與新北市可查詢

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusDisplayStopOfRoute> = apiInstance.cityBusApiDisplayStopOfRoute(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiDisplayStopOfRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiDisplayStopOfRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusDisplayStopOfRoute&gt;**](ServiceDTOVersion2BusBusDisplayStopOfRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cityBusApiDisplayStopOfRoute_0"></a>
# **cityBusApiDisplayStopOfRoute_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusDisplayStopOfRoute&gt; cityBusApiDisplayStopOfRoute_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市],[路線名稱]的市區公車顯示用路線站序資料

市區公車之顯示用路線站序資料，僅台北市與新北市可查詢

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'307'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusDisplayStopOfRoute> = apiInstance.cityBusApiDisplayStopOfRoute_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiDisplayStopOfRoute_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiDisplayStopOfRoute_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei]
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;307&#39; | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusDisplayStopOfRoute&gt;**](ServiceDTOVersion2BusBusDisplayStopOfRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cityBusApiEstimatedTimeOfArrival"></a>
# **cityBusApiEstimatedTimeOfArrival**
> kotlin.Array&lt;ServiceDTOVersion2BusBusN1EstimateTime&gt; cityBusApiEstimatedTimeOfArrival(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市]的公車預估到站資料(N1)

[部分縣市] 當 StopStatus &#x3D; 1(尚未發車) 且 EstimateTime &amp;gt; 0 (有值) 的情形, 屬正常情形, 雖目前尚未發車, 但提供EstimateTime值為預計多久後開始發車之時間

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusN1EstimateTime> = apiInstance.cityBusApiEstimatedTimeOfArrival(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiEstimatedTimeOfArrival")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiEstimatedTimeOfArrival")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
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

<a name="cityBusApiEstimatedTimeOfArrival_0"></a>
# **cityBusApiEstimatedTimeOfArrival_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusN1EstimateTime&gt; cityBusApiEstimatedTimeOfArrival_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市],[路線名稱]的公車預估到站資料(N1)

[部分縣市] 當 StopStatus &#x3D; 1(尚未發車) 且 EstimateTime &amp;gt; 0 (有值) 的情形, 屬正常情形, 雖目前尚未發車, 但提供EstimateTime值為預計多久後開始發車之時間

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'307'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusN1EstimateTime> = apiInstance.cityBusApiEstimatedTimeOfArrival_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiEstimatedTimeOfArrival_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiEstimatedTimeOfArrival_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;307&#39; | [default to null]
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

<a name="cityBusApiNews"></a>
# **cityBusApiNews**
> kotlin.Array&lt;ServiceDTOVersion2BusBusNews&gt; cityBusApiNews(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得市區客運之最新消息

市區客運之最新消息

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusNews> = apiInstance.cityBusApiNews(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiNews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiNews")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**|  | [default to null] [enum: Keelung]
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

<a name="cityBusApiOperator"></a>
# **cityBusApiOperator**
> kotlin.Array&lt;ServiceDTOVersion2BaseOperator&gt; cityBusApiOperator(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市]的市區公車營運業者資料

市區公車之營運業者資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BaseOperator> = apiInstance.cityBusApiOperator(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiOperator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiOperator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
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

<a name="cityBusApiRealTimeByFrequency"></a>
# **cityBusApiRealTimeByFrequency**
> kotlin.Array&lt;ServiceDTOVersion2BusBusA1Data&gt; cityBusApiRealTimeByFrequency(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得指定[縣市]的公車動態定時資料(A1)

市區公車之定時資料(A1)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusA1Data> = apiInstance.cityBusApiRealTimeByFrequency(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiRealTimeByFrequency")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiRealTimeByFrequency")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
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
 - **Accept**: application/json, text/json

<a name="cityBusApiRealTimeByFrequency_0"></a>
# **cityBusApiRealTimeByFrequency_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusA1Data&gt; cityBusApiRealTimeByFrequency_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得指定[縣市],[路線名稱]的公車動態定時資料(A1)

市區公車之定時資料(A1)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'307'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusA1Data> = apiInstance.cityBusApiRealTimeByFrequency_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiRealTimeByFrequency_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiRealTimeByFrequency_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;307&#39; | [default to null]
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

<a name="cityBusApiRealTimeNearStop"></a>
# **cityBusApiRealTimeNearStop**
> kotlin.Array&lt;ServiceDTOVersion2BusBusA2Data&gt; cityBusApiRealTimeNearStop(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市]的公車動態定點資料(A2)

市區公車之定點資料(A2)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusA2Data> = apiInstance.cityBusApiRealTimeNearStop(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiRealTimeNearStop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiRealTimeNearStop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
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

<a name="cityBusApiRealTimeNearStop_0"></a>
# **cityBusApiRealTimeNearStop_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusA2Data&gt; cityBusApiRealTimeNearStop_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市],[路線名稱]的公車動態定點資料(A2)

市區公車之定點資料(A2)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'307'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusA2Data> = apiInstance.cityBusApiRealTimeNearStop_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiRealTimeNearStop_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiRealTimeNearStop_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;307&#39; | [default to null]
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

<a name="cityBusApiRoute"></a>
# **cityBusApiRoute**
> kotlin.Array&lt;ServiceDTOVersion2BusBusRoute&gt; cityBusApiRoute(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市]的市區公車路線資料

市區公車之路線資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusRoute> = apiInstance.cityBusApiRoute(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
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

<a name="cityBusApiRouteFare"></a>
# **cityBusApiRouteFare**
> kotlin.Array&lt;ServiceDTOVersion2BusBusRouteFare&gt; cityBusApiRouteFare(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市]的市區公車路線票價資料

市區公車路線票價資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusRouteFare> = apiInstance.cityBusApiRouteFare(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiRouteFare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiRouteFare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
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

<a name="cityBusApiRoute_0"></a>
# **cityBusApiRoute_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusRoute&gt; cityBusApiRoute_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市],[路線名稱]的路線資料

市區公車之路線資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'307'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusRoute> = apiInstance.cityBusApiRoute_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiRoute_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiRoute_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;307&#39; | [default to null]
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

<a name="cityBusApiSchedule"></a>
# **cityBusApiSchedule**
> kotlin.Array&lt;ServiceDTOVersion2BusBusSchedule&gt; cityBusApiSchedule(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市]的市區公車路線班表資料

市區公車之班表及班距資料。一般市區公車班次較多時會採用【班距】式時刻表；班次較少時會採用【班表】式時刻表

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusSchedule> = apiInstance.cityBusApiSchedule(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiSchedule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiSchedule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Tainan, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty]
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

<a name="cityBusApiSchedule_0"></a>
# **cityBusApiSchedule_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusSchedule&gt; cityBusApiSchedule_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市],[路線名稱]的市區公車路線班表資料

市區公車之預定班表及班距資料。一般市區公車班次較多時會採用【班距】式時刻表；班次較少時會採用【班表】式時刻表

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'307'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusSchedule> = apiInstance.cityBusApiSchedule_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiSchedule_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiSchedule_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Tainan, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty]
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;307&#39; | [default to null]
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

<a name="cityBusApiShape"></a>
# **cityBusApiShape**
> kotlin.Array&lt;ServiceDTOVersion2BusBusShape&gt; cityBusApiShape(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市]的市區公車線型資料

市區公車之線型資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusShape> = apiInstance.cityBusApiShape(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiShape")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiShape")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, KinmenCounty]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BusBusShape&gt;**](ServiceDTOVersion2BusBusShape.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cityBusApiStation"></a>
# **cityBusApiStation**
> kotlin.Array&lt;ServiceDTOVersion2BusBusStation&gt; cityBusApiStation(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得指定[縣市]的市區公車站位資料

市區公車之各站牌所屬的站位資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusStation> = apiInstance.cityBusApiStation(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiStation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiStation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Kaohsiung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, PenghuCounty]
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

<a name="cityBusApiStop"></a>
# **cityBusApiStop**
> kotlin.Array&lt;ServiceDTOVersion2BusBusStop&gt; cityBusApiStop(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得指定[縣市]的市區公車站牌資料

市區公車之站牌資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusStop> = apiInstance.cityBusApiStop(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiStop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiStop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
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

<a name="cityBusApiStopOfRoute"></a>
# **cityBusApiStopOfRoute**
> kotlin.Array&lt;ServiceDTOVersion2BusBusStopOfRoute&gt; cityBusApiStopOfRoute(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市]的市區公車路線站序資料

市區公車之路線站序資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusStopOfRoute> = apiInstance.cityBusApiStopOfRoute(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiStopOfRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiStopOfRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
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

<a name="cityBusApiStopOfRoute_0"></a>
# **cityBusApiStopOfRoute_0**
> kotlin.Array&lt;ServiceDTOVersion2BusBusStopOfRoute&gt; cityBusApiStopOfRoute_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市],[路線名稱]的市區公車路線站序資料

市區公車之路線站序資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val routeName : kotlin.String = routeName_example // kotlin.String | 繁體中文路線名稱，如'307'
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusStopOfRoute> = apiInstance.cityBusApiStopOfRoute_0(city, routeName, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiStopOfRoute_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiStopOfRoute_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
 **routeName** | **kotlin.String**| 繁體中文路線名稱，如&#39;307&#39; | [default to null]
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

<a name="cityBusApiVehicle"></a>
# **cityBusApiVehicle**
> kotlin.Array&lt;ServiceDTOVersion2BusBusVehicleInfo&gt; cityBusApiVehicle(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[縣市]的市區公車車輛資料

市區公車之車輛資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CityBusApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BusBusVehicleInfo> = apiInstance.cityBusApiVehicle(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CityBusApiApi#cityBusApiVehicle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CityBusApiApi#cityBusApiVehicle")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Keelung, Hsinchu, HsinchuCounty, MiaoliCounty, ChanghuaCounty, NantouCounty, YunlinCounty, ChiayiCounty, Chiayi, PingtungCounty, YilanCounty, HualienCounty, TaitungCounty, KinmenCounty, PenghuCounty, LienchiangCounty]
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

