# TRAApiApi

All URIs are relative to *http://ptx.transportdata.tw/MOTC*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tRAApiDailyTimetable**](TRAApiApi.md#tRAApiDailyTimetable) | **GET** /v2/Rail/TRA/DailyTimetable/Today | 取得當天所有車次的時刻表資料
[**tRAApiDailyTimetableTrainDate**](TRAApiApi.md#tRAApiDailyTimetableTrainDate) | **GET** /v2/Rail/TRA/DailyTimetable/TrainDate/{TrainDate} | 取得指定[日期]所有車次的時刻表資料
[**tRAApiDailyTimetableTrainNo**](TRAApiApi.md#tRAApiDailyTimetableTrainNo) | **GET** /v2/Rail/TRA/DailyTimetable/Today/TrainNo/{TrainNo} | 取得當天指定[車次]的時刻表資料
[**tRAApiDailyTimetableTrainNoTrainDate**](TRAApiApi.md#tRAApiDailyTimetableTrainNoTrainDate) | **GET** /v2/Rail/TRA/DailyTimetable/TrainNo/{TrainNo}/TrainDate/{TrainDate} | 取得指定[日期],[車次]的時刻表資料
[**tRAApiDailyTrainInfo**](TRAApiApi.md#tRAApiDailyTrainInfo) | **GET** /v2/Rail/TRA/DailyTrainInfo/Today | 取得當天所有車次的車次資料
[**tRAApiDailyTrainInfoTrainDate**](TRAApiApi.md#tRAApiDailyTrainInfoTrainDate) | **GET** /v2/Rail/TRA/DailyTrainInfo/TrainDate/{TrainDate} | 取得指定[日期]所有車次的車次資料
[**tRAApiDailyTrainInfoTrainNo**](TRAApiApi.md#tRAApiDailyTrainInfoTrainNo) | **GET** /v2/Rail/TRA/DailyTrainInfo/Today/TrainNo/{TrainNo} | 取得當天指定[車次]的車次資料
[**tRAApiDailyTrainInfoTrainNoTrainDate**](TRAApiApi.md#tRAApiDailyTrainInfoTrainNoTrainDate) | **GET** /v2/Rail/TRA/DailyTrainInfo/TrainNo/{TrainNo}/TrainDate/{TrainDate} | 取得指定[日期]與[車次]的車次資料
[**tRAApiGeneralTimetable**](TRAApiApi.md#tRAApiGeneralTimetable) | **GET** /v2/Rail/TRA/GeneralTimetable | 取得所有車次的定期時刻表資料
[**tRAApiGeneralTimetableTrainNo**](TRAApiApi.md#tRAApiGeneralTimetableTrainNo) | **GET** /v2/Rail/TRA/GeneralTimetable/TrainNo/{TrainNo} | 取得指定[車次]的定期時刻表資料
[**tRAApiGeneralTrainInfo**](TRAApiApi.md#tRAApiGeneralTrainInfo) | **GET** /v2/Rail/TRA/GeneralTrainInfo | 取得所有車次的定期車次資料
[**tRAApiGeneralTrainInfoTrainNo**](TRAApiApi.md#tRAApiGeneralTrainInfoTrainNo) | **GET** /v2/Rail/TRA/GeneralTrainInfo/TrainNo/{TrainNo} | 取得指定[車次]的定期車次資料
[**tRAApiLine**](TRAApiApi.md#tRAApiLine) | **GET** /v2/Rail/TRA/Line | 取得路線基本資料
[**tRAApiLiveBoard**](TRAApiApi.md#tRAApiLiveBoard) | **GET** /v2/Rail/TRA/LiveBoard | 取得車站別列車即時到離站電子看板(動態前後30分鐘的車次)
[**tRAApiLiveBoardStation**](TRAApiApi.md#tRAApiLiveBoardStation) | **GET** /v2/Rail/TRA/LiveBoard/Station/{StationID} | 取得指定[車站]列車即時到離站電子看板(動態前後30分鐘的車次)
[**tRAApiLiveTrainDelay**](TRAApiApi.md#tRAApiLiveTrainDelay) | **GET** /v2/Rail/TRA/LiveTrainDelay | 取得列車即時準點/延誤時間資料
[**tRAApiNetwork**](TRAApiApi.md#tRAApiNetwork) | **GET** /v2/Rail/TRA/Network | 取得臺鐵路網資料
[**tRAApiODDailyTimetable**](TRAApiApi.md#tRAApiODDailyTimetable) | **GET** /v2/Rail/TRA/DailyTimetable/OD/{OriginStationID}/to/{DestinationStationID}/{TrainDate} | 取得指定[日期],[起迄站間]之站間時刻表資料
[**tRAApiODFareStation**](TRAApiApi.md#tRAApiODFareStation) | **GET** /v2/Rail/TRA/ODFare/{OriginStationID}/to/{DestinationStationID} | 取得指定[起訖站間]之票價資料
[**tRAApiShape**](TRAApiApi.md#tRAApiShape) | **GET** /v2/Rail/TRA/Shape | 取得軌道路網實體路線圖資資料
[**tRAApiStation**](TRAApiApi.md#tRAApiStation) | **GET** /v2/Rail/TRA/Station | 取得車站基本資料
[**tRAApiStationOfLine**](TRAApiApi.md#tRAApiStationOfLine) | **GET** /v2/Rail/TRA/StationOfLine | 取得路線車站基本資料
[**tRAApiStationTimetable**](TRAApiApi.md#tRAApiStationTimetable) | **GET** /v2/Rail/TRA/DailyTimetable/Station/{StationID}/{TrainDate} | 取得指定[日期],[車站]的站別時刻表資料
[**tRAApiTrainType**](TRAApiApi.md#tRAApiTrainType) | **GET** /v2/Rail/TRA/TrainType | 取得所有列車車種資料


<a name="tRAApiDailyTimetable"></a>
# **tRAApiDailyTimetable**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTimetable&gt; tRAApiDailyTimetable(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得當天所有車次的時刻表資料

取得當天所有車次的時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailDailyTimetable> = apiInstance.tRAApiDailyTimetable(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiDailyTimetable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiDailyTimetable")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTimetable&gt;**](ServiceDTOVersion2RailTRARailDailyTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiDailyTimetableTrainDate"></a>
# **tRAApiDailyTimetableTrainDate**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTimetable&gt; tRAApiDailyTimetableTrainDate(trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期]所有車次的時刻表資料

取得指定[日期]所有車次的時刻表資料(台鐵提供近60天每日時刻表)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val trainDate : kotlin.String = trainDate_example // kotlin.String | 欲查詢的日期(格式: yyyy-MM-dd)
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailDailyTimetable> = apiInstance.tRAApiDailyTimetableTrainDate(trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiDailyTimetableTrainDate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiDailyTimetableTrainDate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trainDate** | **kotlin.String**| 欲查詢的日期(格式: yyyy-MM-dd) | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTimetable&gt;**](ServiceDTOVersion2RailTRARailDailyTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tRAApiDailyTimetableTrainNo"></a>
# **tRAApiDailyTimetableTrainNo**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTimetable&gt; tRAApiDailyTimetableTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得當天指定[車次]的時刻表資料

取得當天指定[車次]的時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val trainNo : kotlin.String = trainNo_example // kotlin.String | 欲查詢車次的代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailDailyTimetable> = apiInstance.tRAApiDailyTimetableTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiDailyTimetableTrainNo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiDailyTimetableTrainNo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trainNo** | **kotlin.String**| 欲查詢車次的代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTimetable&gt;**](ServiceDTOVersion2RailTRARailDailyTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiDailyTimetableTrainNoTrainDate"></a>
# **tRAApiDailyTimetableTrainNoTrainDate**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTimetable&gt; tRAApiDailyTimetableTrainNoTrainDate(trainNo, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期],[車次]的時刻表資料

取得指定[日期],[車次]的時刻表資料(台鐵提供近60天每日時刻表)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val trainNo : kotlin.String = trainNo_example // kotlin.String | 欲查詢車次的代碼
val trainDate : kotlin.String = trainDate_example // kotlin.String | 欲查詢的日期(格式: yyyy-MM-dd)
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailDailyTimetable> = apiInstance.tRAApiDailyTimetableTrainNoTrainDate(trainNo, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiDailyTimetableTrainNoTrainDate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiDailyTimetableTrainNoTrainDate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trainNo** | **kotlin.String**| 欲查詢車次的代碼 | [default to null]
 **trainDate** | **kotlin.String**| 欲查詢的日期(格式: yyyy-MM-dd) | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTimetable&gt;**](ServiceDTOVersion2RailTRARailDailyTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tRAApiDailyTrainInfo"></a>
# **tRAApiDailyTrainInfo**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTrainInfo&gt; tRAApiDailyTrainInfo(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得當天所有車次的車次資料

取得當天所有車次的車次資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailDailyTrainInfo> = apiInstance.tRAApiDailyTrainInfo(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiDailyTrainInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiDailyTrainInfo")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTrainInfo&gt;**](ServiceDTOVersion2RailTRARailDailyTrainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiDailyTrainInfoTrainDate"></a>
# **tRAApiDailyTrainInfoTrainDate**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTrainInfo&gt; tRAApiDailyTrainInfoTrainDate(trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期]所有車次的車次資料

取得指定[日期]所有車次的車次資料(台鐵提供近60天每日時刻表)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val trainDate : kotlin.String = trainDate_example // kotlin.String | 欲查詢車次的日期(格式: yyyy-MM-dd)
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailDailyTrainInfo> = apiInstance.tRAApiDailyTrainInfoTrainDate(trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiDailyTrainInfoTrainDate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiDailyTrainInfoTrainDate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trainDate** | **kotlin.String**| 欲查詢車次的日期(格式: yyyy-MM-dd) | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTrainInfo&gt;**](ServiceDTOVersion2RailTRARailDailyTrainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tRAApiDailyTrainInfoTrainNo"></a>
# **tRAApiDailyTrainInfoTrainNo**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTrainInfo&gt; tRAApiDailyTrainInfoTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得當天指定[車次]的車次資料

取得當天指定[車次]的車次資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val trainNo : kotlin.String = trainNo_example // kotlin.String | 欲查詢車次的代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailDailyTrainInfo> = apiInstance.tRAApiDailyTrainInfoTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiDailyTrainInfoTrainNo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiDailyTrainInfoTrainNo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trainNo** | **kotlin.String**| 欲查詢車次的代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTrainInfo&gt;**](ServiceDTOVersion2RailTRARailDailyTrainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiDailyTrainInfoTrainNoTrainDate"></a>
# **tRAApiDailyTrainInfoTrainNoTrainDate**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTrainInfo&gt; tRAApiDailyTrainInfoTrainNoTrainDate(trainNo, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期]與[車次]的車次資料

取得指定[日期]與[車次]的車次資料(台鐵提供近60天每日時刻表)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val trainNo : kotlin.String = trainNo_example // kotlin.String | 欲查詢車次的代碼
val trainDate : kotlin.String = trainDate_example // kotlin.String | 欲查詢車次的日期(格式: yyyy-MM-dd)
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailDailyTrainInfo> = apiInstance.tRAApiDailyTrainInfoTrainNoTrainDate(trainNo, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiDailyTrainInfoTrainNoTrainDate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiDailyTrainInfoTrainNoTrainDate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trainNo** | **kotlin.String**| 欲查詢車次的代碼 | [default to null]
 **trainDate** | **kotlin.String**| 欲查詢車次的日期(格式: yyyy-MM-dd) | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTrainInfo&gt;**](ServiceDTOVersion2RailTRARailDailyTrainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tRAApiGeneralTimetable"></a>
# **tRAApiGeneralTimetable**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailGeneralTimetable&gt; tRAApiGeneralTimetable(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得所有車次的定期時刻表資料

取得所有車次的定期時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailGeneralTimetable> = apiInstance.tRAApiGeneralTimetable(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiGeneralTimetable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiGeneralTimetable")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailGeneralTimetable&gt;**](ServiceDTOVersion2RailTRARailGeneralTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiGeneralTimetableTrainNo"></a>
# **tRAApiGeneralTimetableTrainNo**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailGeneralTimetable&gt; tRAApiGeneralTimetableTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[車次]的定期時刻表資料

取得指定[車次]的定期時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val trainNo : kotlin.String = trainNo_example // kotlin.String | 欲查詢車次的代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailGeneralTimetable> = apiInstance.tRAApiGeneralTimetableTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiGeneralTimetableTrainNo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiGeneralTimetableTrainNo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trainNo** | **kotlin.String**| 欲查詢車次的代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailGeneralTimetable&gt;**](ServiceDTOVersion2RailTRARailGeneralTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiGeneralTrainInfo"></a>
# **tRAApiGeneralTrainInfo**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailGeneralTrainInfo&gt; tRAApiGeneralTrainInfo(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得所有車次的定期車次資料

取得所有車次的定期車次資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailGeneralTrainInfo> = apiInstance.tRAApiGeneralTrainInfo(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiGeneralTrainInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiGeneralTrainInfo")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailGeneralTrainInfo&gt;**](ServiceDTOVersion2RailTRARailGeneralTrainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiGeneralTrainInfoTrainNo"></a>
# **tRAApiGeneralTrainInfoTrainNo**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailGeneralTrainInfo&gt; tRAApiGeneralTrainInfoTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[車次]的定期車次資料

取得指定[車次]的定期車次資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val trainNo : kotlin.String = trainNo_example // kotlin.String | 欲查詢車次的代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailGeneralTrainInfo> = apiInstance.tRAApiGeneralTrainInfoTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiGeneralTrainInfoTrainNo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiGeneralTrainInfoTrainNo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trainNo** | **kotlin.String**| 欲查詢車次的代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailGeneralTrainInfo&gt;**](ServiceDTOVersion2RailTRARailGeneralTrainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiLine"></a>
# **tRAApiLine**
> kotlin.Array&lt;ServiceDTOVersion2RailTRALine&gt; tRAApiLine(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得路線基本資料

取得路線基本資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRALine> = apiInstance.tRAApiLine(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiLine")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRALine&gt;**](ServiceDTOVersion2RailTRALine.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiLiveBoard"></a>
# **tRAApiLiveBoard**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailLiveBoard&gt; tRAApiLiveBoard(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得車站別列車即時到離站電子看板(動態前後30分鐘的車次)

取得車站別列車即時到離站電子看板(動態前後30分鐘的車次)。更新頻率：2分鐘。此資料已過濾離站車次資訊

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailLiveBoard> = apiInstance.tRAApiLiveBoard(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiLiveBoard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiLiveBoard")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailLiveBoard&gt;**](ServiceDTOVersion2RailTRARailLiveBoard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiLiveBoardStation"></a>
# **tRAApiLiveBoardStation**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailLiveBoard&gt; tRAApiLiveBoardStation(stationID, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[車站]列車即時到離站電子看板(動態前後30分鐘的車次)

取得指定[車站]列車即時到離站電子看板(動態前後30分鐘的車次)。更新頻率：2分鐘。此資料已過濾離站車次資訊

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val stationID : kotlin.String = stationID_example // kotlin.String | 車站代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailLiveBoard> = apiInstance.tRAApiLiveBoardStation(stationID, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiLiveBoardStation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiLiveBoardStation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stationID** | **kotlin.String**| 車站代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailLiveBoard&gt;**](ServiceDTOVersion2RailTRARailLiveBoard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiLiveTrainDelay"></a>
# **tRAApiLiveTrainDelay**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailLiveTrainDelay&gt; tRAApiLiveTrainDelay(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得列車即時準點/延誤時間資料

取得列車即時準點/延誤時間資料。更新頻率：2分鐘

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailLiveTrainDelay> = apiInstance.tRAApiLiveTrainDelay(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiLiveTrainDelay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiLiveTrainDelay")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailLiveTrainDelay&gt;**](ServiceDTOVersion2RailTRARailLiveTrainDelay.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiNetwork"></a>
# **tRAApiNetwork**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTrainInfo&gt; tRAApiNetwork(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得臺鐵路網資料

取得臺鐵路網資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailDailyTrainInfo> = apiInstance.tRAApiNetwork(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiNetwork")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiNetwork")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailDailyTrainInfo&gt;**](ServiceDTOVersion2RailTRARailDailyTrainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiODDailyTimetable"></a>
# **tRAApiODDailyTimetable**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailODDailyTimetable&gt; tRAApiODDailyTimetable(originStationID, destinationStationID, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期],[起迄站間]之站間時刻表資料

取得指定[日期],[起迄站間]之站間時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val originStationID : kotlin.String = originStationID_example // kotlin.String | 起點車站代碼
val destinationStationID : kotlin.String = destinationStationID_example // kotlin.String | 迄點車站代碼
val trainDate : kotlin.String = trainDate_example // kotlin.String | 欲查詢的日期(格式: yyyy-MM-dd)
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailODDailyTimetable> = apiInstance.tRAApiODDailyTimetable(originStationID, destinationStationID, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiODDailyTimetable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiODDailyTimetable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **originStationID** | **kotlin.String**| 起點車站代碼 | [default to null]
 **destinationStationID** | **kotlin.String**| 迄點車站代碼 | [default to null]
 **trainDate** | **kotlin.String**| 欲查詢的日期(格式: yyyy-MM-dd) | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailODDailyTimetable&gt;**](ServiceDTOVersion2RailTRARailODDailyTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tRAApiODFareStation"></a>
# **tRAApiODFareStation**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailODFare&gt; tRAApiODFareStation(originStationID, destinationStationID, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[起訖站間]之票價資料

取得指定[起訖站間]之票價資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val originStationID : kotlin.String = originStationID_example // kotlin.String | 起點車站代碼
val destinationStationID : kotlin.String = destinationStationID_example // kotlin.String | 迄點車站代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailODFare> = apiInstance.tRAApiODFareStation(originStationID, destinationStationID, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiODFareStation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiODFareStation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **originStationID** | **kotlin.String**| 起點車站代碼 | [default to null]
 **destinationStationID** | **kotlin.String**| 迄點車站代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailODFare&gt;**](ServiceDTOVersion2RailTRARailODFare.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiShape"></a>
# **tRAApiShape**
> kotlin.Array&lt;ServiceDTOVersion2RailTRATRAShape&gt; tRAApiShape(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得軌道路網實體路線圖資資料

取得軌道路網實體路線圖資資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRATRAShape> = apiInstance.tRAApiShape(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiShape")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiShape")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRATRAShape&gt;**](ServiceDTOVersion2RailTRATRAShape.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiStation"></a>
# **tRAApiStation**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailStation&gt; tRAApiStation(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得車站基本資料

取得車站基本資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailStation> = apiInstance.tRAApiStation(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiStation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiStation")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailStation&gt;**](ServiceDTOVersion2RailTRARailStation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiStationOfLine"></a>
# **tRAApiStationOfLine**
> kotlin.Array&lt;ServiceDTOVersion2RailTRAStationOfLine&gt; tRAApiStationOfLine(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得路線車站基本資料

取得路線車站基本資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRAStationOfLine> = apiInstance.tRAApiStationOfLine(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiStationOfLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiStationOfLine")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRAStationOfLine&gt;**](ServiceDTOVersion2RailTRAStationOfLine.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tRAApiStationTimetable"></a>
# **tRAApiStationTimetable**
> kotlin.Array&lt;ServiceDTOVersion2RailTRARailStationTimetable&gt; tRAApiStationTimetable(stationID, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期],[車站]的站別時刻表資料

取得指定[日期],[車站]的站別時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val stationID : kotlin.String = stationID_example // kotlin.String | 車站代號
val trainDate : kotlin.String = trainDate_example // kotlin.String | 時刻表日期(格式: yyyy-MM-dd)
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRARailStationTimetable> = apiInstance.tRAApiStationTimetable(stationID, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiStationTimetable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiStationTimetable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stationID** | **kotlin.String**| 車站代號 | [default to null]
 **trainDate** | **kotlin.String**| 時刻表日期(格式: yyyy-MM-dd) | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTRARailStationTimetable&gt;**](ServiceDTOVersion2RailTRARailStationTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tRAApiTrainType"></a>
# **tRAApiTrainType**
> kotlin.Array&lt;ServiceDTOVersion2RailTRATrainType&gt; tRAApiTrainType(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得所有列車車種資料

取得所有列車車種資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TRAApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTRATrainType> = apiInstance.tRAApiTrainType(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TRAApiApi#tRAApiTrainType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TRAApiApi#tRAApiTrainType")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTRATrainType&gt;**](ServiceDTOVersion2RailTRATrainType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

