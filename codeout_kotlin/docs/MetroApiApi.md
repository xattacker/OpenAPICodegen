# MetroApiApi

All URIs are relative to *http://ptx.transportdata.tw/MOTC*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metroApiFirstLastTimetable**](MetroApiApi.md#metroApiFirstLastTimetable) | **GET** /v2/Rail/Metro/FirstLastTimetable/{Operator} | 取得捷運首末班車時刻表資料
[**metroApiFrequency**](MetroApiApi.md#metroApiFrequency) | **GET** /v2/Rail/Metro/Frequency/{Operator} | 取得捷運路線發車班距頻率資料
[**metroApiLine**](MetroApiApi.md#metroApiLine) | **GET** /v2/Rail/Metro/Line/{Operator} | 取得捷運路線基本資料
[**metroApiLineTransfer**](MetroApiApi.md#metroApiLineTransfer) | **GET** /v2/Rail/Metro/LineTransfer/{Operator} | 取得捷運路線站間轉乘基本資料
[**metroApiLiveBoard**](MetroApiApi.md#metroApiLiveBoard) | **GET** /v2/Rail/Metro/LiveBoard/{Operator} | 取得捷運車站別列車即時到離站電子看板資訊
[**metroApiNetwork**](MetroApiApi.md#metroApiNetwork) | **GET** /v2/Rail/Metro/Network | 取得捷運路網資料
[**metroApiODFare**](MetroApiApi.md#metroApiODFare) | **GET** /v2/Rail/Metro/ODFare/{Operator} | 取得捷運起迄站間票價資料
[**metroApiRoute**](MetroApiApi.md#metroApiRoute) | **GET** /v2/Rail/Metro/Route/{Operator} | 取得捷運營運路線基本資料
[**metroApiS2STravelTime**](MetroApiApi.md#metroApiS2STravelTime) | **GET** /v2/Rail/Metro/S2STravelTime/{Operator} | 取得捷運列車站間運行時間資料
[**metroApiShape**](MetroApiApi.md#metroApiShape) | **GET** /v2/Rail/Metro/Shape/{Operator} | 取得指定營運業者之軌道路網實體路線圖資資料
[**metroApiStation**](MetroApiApi.md#metroApiStation) | **GET** /v2/Rail/Metro/Station/{Operator} | 取得捷運車站基本資料
[**metroApiStationExit**](MetroApiApi.md#metroApiStationExit) | **GET** /v2/Rail/Metro/StationExit/{Operator} | 取得捷運車站出入口基本資料
[**metroApiStationFacility**](MetroApiApi.md#metroApiStationFacility) | **GET** /v2/Rail/Metro/StationFacility/{Operator} | 取得捷運車站設施資料
[**metroApiStationOfLine**](MetroApiApi.md#metroApiStationOfLine) | **GET** /v2/Rail/Metro/StationOfLine/{Operator} | 取得捷運路線車站基本資料
[**metroApiStationOfRoute**](MetroApiApi.md#metroApiStationOfRoute) | **GET** /v2/Rail/Metro/StationOfRoute/{Operator} | 取得捷運營運路線車站基本資料
[**metroApiStationTimeTable**](MetroApiApi.md#metroApiStationTimeTable) | **GET** /v2/Rail/Metro/StationTimeTable/{Operator} | 取得捷運站別時刻表資料


<a name="metroApiFirstLastTimetable"></a>
# **metroApiFirstLastTimetable**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroFirstLastTimetable&gt; metroApiFirstLastTimetable(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運首末班車時刻表資料

取得捷運首末班車時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroFirstLastTimetable> = apiInstance.metroApiFirstLastTimetable(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiFirstLastTimetable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiFirstLastTimetable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroFirstLastTimetable&gt;**](ServiceDTOVersion2RailMetroFirstLastTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiFrequency"></a>
# **metroApiFrequency**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroFrequency&gt; metroApiFrequency(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運路線發車班距頻率資料

取得捷運路線發車班距頻率資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroFrequency> = apiInstance.metroApiFrequency(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiFrequency")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiFrequency")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroFrequency&gt;**](ServiceDTOVersion2RailMetroFrequency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiLine"></a>
# **metroApiLine**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroLine&gt; metroApiLine(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運路線基本資料

取得捷運路線基本資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroLine> = apiInstance.metroApiLine(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiLine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroLine&gt;**](ServiceDTOVersion2RailMetroLine.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiLineTransfer"></a>
# **metroApiLineTransfer**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroLineTransfer&gt; metroApiLineTransfer(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運路線站間轉乘基本資料

取得捷運路線站間轉乘基本資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroLineTransfer> = apiInstance.metroApiLineTransfer(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiLineTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiLineTransfer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroLineTransfer&gt;**](ServiceDTOVersion2RailMetroLineTransfer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiLiveBoard"></a>
# **metroApiLiveBoard**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroLiveBoard&gt; metroApiLiveBoard(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運車站別列車即時到離站電子看板資訊

取得捷運車站別列車即時到離站電子看板資訊

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroLiveBoard> = apiInstance.metroApiLiveBoard(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiLiveBoard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiLiveBoard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroLiveBoard&gt;**](ServiceDTOVersion2RailMetroLiveBoard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiNetwork"></a>
# **metroApiNetwork**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroNetwork&gt; metroApiNetwork(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運路網資料

取得捷運路網資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroNetwork> = apiInstance.metroApiNetwork(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiNetwork")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiNetwork")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroNetwork&gt;**](ServiceDTOVersion2RailMetroNetwork.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiODFare"></a>
# **metroApiODFare**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroODFare&gt; metroApiODFare(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運起迄站間票價資料

取得捷運起迄站間票價資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroODFare> = apiInstance.metroApiODFare(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiODFare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiODFare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroODFare&gt;**](ServiceDTOVersion2RailMetroODFare.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiRoute"></a>
# **metroApiRoute**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroRoute&gt; metroApiRoute(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運營運路線基本資料

取得捷運營運路線基本資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroRoute> = apiInstance.metroApiRoute(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroRoute&gt;**](ServiceDTOVersion2RailMetroRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiS2STravelTime"></a>
# **metroApiS2STravelTime**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroS2STravelTime&gt; metroApiS2STravelTime(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運列車站間運行時間資料

取得捷運列車站間運行時間資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroS2STravelTime> = apiInstance.metroApiS2STravelTime(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiS2STravelTime")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiS2STravelTime")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroS2STravelTime&gt;**](ServiceDTOVersion2RailMetroS2STravelTime.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiShape"></a>
# **metroApiShape**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroMetroShape&gt; metroApiShape(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定營運業者之軌道路網實體路線圖資資料

取得指定營運業者之軌道路網實體路線圖資資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroMetroShape> = apiInstance.metroApiShape(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiShape")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiShape")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**|  | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroMetroShape&gt;**](ServiceDTOVersion2RailMetroMetroShape.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiStation"></a>
# **metroApiStation**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroStation&gt; metroApiStation(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得捷運車站基本資料

取得捷運車站基本資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroStation> = apiInstance.metroApiStation(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiStation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiStation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]
 **&#x60;$spatialFilter&#x60;** | **kotlin.String**| 空間過濾 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroStation&gt;**](ServiceDTOVersion2RailMetroStation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiStationExit"></a>
# **metroApiStationExit**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroStationExit&gt; metroApiStationExit(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得捷運車站出入口基本資料

取得捷運車站出入口基本資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroStationExit> = apiInstance.metroApiStationExit(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiStationExit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiStationExit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]
 **&#x60;$spatialFilter&#x60;** | **kotlin.String**| 空間過濾 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroStationExit&gt;**](ServiceDTOVersion2RailMetroStationExit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiStationFacility"></a>
# **metroApiStationFacility**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroStationFacility&gt; metroApiStationFacility(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運車站設施資料

取得捷運車站設施資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroStationFacility> = apiInstance.metroApiStationFacility(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiStationFacility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiStationFacility")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroStationFacility&gt;**](ServiceDTOVersion2RailMetroStationFacility.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiStationOfLine"></a>
# **metroApiStationOfLine**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroStationOfLine&gt; metroApiStationOfLine(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運路線車站基本資料

取得捷運路線車站基本資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroStationOfLine> = apiInstance.metroApiStationOfLine(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiStationOfLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiStationOfLine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroStationOfLine&gt;**](ServiceDTOVersion2RailMetroStationOfLine.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiStationOfRoute"></a>
# **metroApiStationOfRoute**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroStationOfRoute&gt; metroApiStationOfRoute(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運營運路線車站基本資料

取得捷運營運路線車站基本資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroStationOfRoute> = apiInstance.metroApiStationOfRoute(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiStationOfRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiStationOfRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroStationOfRoute&gt;**](ServiceDTOVersion2RailMetroStationOfRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="metroApiStationTimeTable"></a>
# **metroApiStationTimeTable**
> kotlin.Array&lt;ServiceDTOVersion2RailMetroStationTimeTable&gt; metroApiStationTimeTable(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得捷運站別時刻表資料

取得捷運站別時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetroApiApi()
val `operator` : kotlin.String = `operator`_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailMetroStationTimeTable> = apiInstance.metroApiStationTimeTable(`operator`, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetroApiApi#metroApiStationTimeTable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetroApiApi#metroApiStationTimeTable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;operator&#x60;** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: TRTC, KRTC, TYMC]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailMetroStationTimeTable&gt;**](ServiceDTOVersion2RailMetroStationTimeTable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

