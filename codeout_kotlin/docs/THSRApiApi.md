# THSRApiApi

All URIs are relative to *http://ptx.transportdata.tw/MOTC*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tHSRApiAlertInfo**](THSRApiApi.md#tHSRApiAlertInfo) | **GET** /v2/Rail/THSR/AlertInfo | 取得即時通阻事件資料
[**tHSRApiAvailableSeatStatusList**](THSRApiApi.md#tHSRApiAvailableSeatStatusList) | **GET** /v2/Rail/THSR/AvailableSeatStatusList/{StationID} | 取得動態指定[車站]的對號座剩餘座位資訊看板資料
[**tHSRApiDailyTimetable**](THSRApiApi.md#tHSRApiDailyTimetable) | **GET** /v2/Rail/THSR/DailyTimetable/Today | 取得當天所有車次的時刻表資料
[**tHSRApiDailyTimetableTrainDate**](THSRApiApi.md#tHSRApiDailyTimetableTrainDate) | **GET** /v2/Rail/THSR/DailyTimetable/TrainDate/{TrainDate} | 取得指定[日期]所有車次的時刻表資料
[**tHSRApiDailyTimetableTrainNo**](THSRApiApi.md#tHSRApiDailyTimetableTrainNo) | **GET** /v2/Rail/THSR/DailyTimetable/Today/TrainNo/{TrainNo} | 取得當天指定[車次]的時刻表資料
[**tHSRApiDailyTimetableTrainNoTrainDate**](THSRApiApi.md#tHSRApiDailyTimetableTrainNoTrainDate) | **GET** /v2/Rail/THSR/DailyTimetable/TrainNo/{TrainNo}/TrainDate/{TrainDate} | 取得指定[日期],[車次]的時刻表資料
[**tHSRApiDailyTrainInfo**](THSRApiApi.md#tHSRApiDailyTrainInfo) | **GET** /v2/Rail/THSR/DailyTrainInfo/Today | 取得當天所有車次的車次資料
[**tHSRApiDailyTrainInfoTrainDate**](THSRApiApi.md#tHSRApiDailyTrainInfoTrainDate) | **GET** /v2/Rail/THSR/DailyTrainInfo/TrainDate/{TrainDate} | 取得指定[日期]所有車次的車次資料
[**tHSRApiDailyTrainInfoTrainNo**](THSRApiApi.md#tHSRApiDailyTrainInfoTrainNo) | **GET** /v2/Rail/THSR/DailyTrainInfo/Today/TrainNo/{TrainNo} | 取得當天指定[車次]的車次資料
[**tHSRApiDailyTrainInfoTrainNoTrainDate**](THSRApiApi.md#tHSRApiDailyTrainInfoTrainNoTrainDate) | **GET** /v2/Rail/THSR/DailyTrainInfo/TrainNo/{TrainNo}/TrainDate/{TrainDate} | 取得指定[日期],[車次]的車次資料
[**tHSRApiGeneralTimetable**](THSRApiApi.md#tHSRApiGeneralTimetable) | **GET** /v2/Rail/THSR/GeneralTimetable | 取得所有車次的定期時刻表資料
[**tHSRApiGeneralTimetableTrainNo**](THSRApiApi.md#tHSRApiGeneralTimetableTrainNo) | **GET** /v2/Rail/THSR/GeneralTimetable/TrainNo/{TrainNo} | 取得指定[車次]的定期時刻表資料
[**tHSRApiNews**](THSRApiApi.md#tHSRApiNews) | **GET** /v2/Rail/THSR/News | 取得高鐵最新消息資料
[**tHSRApiODDailyTimetable**](THSRApiApi.md#tHSRApiODDailyTimetable) | **GET** /v2/Rail/THSR/DailyTimetable/OD/{OriginStationID}/to/{DestinationStationID}/{TrainDate} | 取得指定[日期],[起迄站間]之時刻表資料
[**tHSRApiODFare**](THSRApiApi.md#tHSRApiODFare) | **GET** /v2/Rail/THSR/ODFare/{OriginStationID}/to/{DestinationStationID} | 取得指定[起訖站間]之票價資料
[**tHSRApiShape**](THSRApiApi.md#tHSRApiShape) | **GET** /v2/Rail/THSR/Shape | 取得軌道路網實體路線圖資資料
[**tHSRApiStation**](THSRApiApi.md#tHSRApiStation) | **GET** /v2/Rail/THSR/Station | 取得車站基本資料
[**tHSRApiStationTimetable**](THSRApiApi.md#tHSRApiStationTimetable) | **GET** /v2/Rail/THSR/DailyTimetable/Station/{StationID}/{TrainDate} | 取得指定[日期],[車站]的站別時刻表資料


<a name="tHSRApiAlertInfo"></a>
# **tHSRApiAlertInfo**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRAlertInfo&gt; tHSRApiAlertInfo(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得即時通阻事件資料

取得即時通阻事件資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRAlertInfo> = apiInstance.tHSRApiAlertInfo(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiAlertInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiAlertInfo")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRAlertInfo&gt;**](ServiceDTOVersion2RailTHSRAlertInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiAvailableSeatStatusList"></a>
# **tHSRApiAvailableSeatStatusList**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRAvailableSeatStatusList&gt; tHSRApiAvailableSeatStatusList(stationID, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得動態指定[車站]的對號座剩餘座位資訊看板資料

取得動態指定[車站]的對號座剩餘座位資訊看板資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val stationID : kotlin.String = stationID_example // kotlin.String | 起點車站代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRAvailableSeatStatusList> = apiInstance.tHSRApiAvailableSeatStatusList(stationID, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiAvailableSeatStatusList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiAvailableSeatStatusList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stationID** | **kotlin.String**| 起點車站代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRAvailableSeatStatusList&gt;**](ServiceDTOVersion2RailTHSRAvailableSeatStatusList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiDailyTimetable"></a>
# **tHSRApiDailyTimetable**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTimetable&gt; tHSRApiDailyTimetable(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得當天所有車次的時刻表資料

取得當天所有車次的時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailDailyTimetable> = apiInstance.tHSRApiDailyTimetable(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiDailyTimetable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiDailyTimetable")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTimetable&gt;**](ServiceDTOVersion2RailTHSRRailDailyTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiDailyTimetableTrainDate"></a>
# **tHSRApiDailyTimetableTrainDate**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTimetable&gt; tHSRApiDailyTimetableTrainDate(trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期]所有車次的時刻表資料

取得指定[日期]所有車次的時刻表資料(高鐵提供近28天每日時刻表)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val trainDate : kotlin.String = trainDate_example // kotlin.String | 欲查詢的日期(格式: yyyy-MM-dd)
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailDailyTimetable> = apiInstance.tHSRApiDailyTimetableTrainDate(trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiDailyTimetableTrainDate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiDailyTimetableTrainDate")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTimetable&gt;**](ServiceDTOVersion2RailTHSRRailDailyTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tHSRApiDailyTimetableTrainNo"></a>
# **tHSRApiDailyTimetableTrainNo**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTimetable&gt; tHSRApiDailyTimetableTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得當天指定[車次]的時刻表資料

取得當天指定[車次]的時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val trainNo : kotlin.String = trainNo_example // kotlin.String | 欲查詢車次的代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailDailyTimetable> = apiInstance.tHSRApiDailyTimetableTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiDailyTimetableTrainNo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiDailyTimetableTrainNo")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTimetable&gt;**](ServiceDTOVersion2RailTHSRRailDailyTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiDailyTimetableTrainNoTrainDate"></a>
# **tHSRApiDailyTimetableTrainNoTrainDate**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTimetable&gt; tHSRApiDailyTimetableTrainNoTrainDate(trainNo, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期],[車次]的時刻表資料

取得指定[日期],[車次]的時刻表資料(高鐵提供近28天每日時刻表)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val trainNo : kotlin.String = trainNo_example // kotlin.String | 欲查詢車次的代碼
val trainDate : kotlin.String = trainDate_example // kotlin.String | 欲查詢的日期(格式: yyyy-MM-dd)
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailDailyTimetable> = apiInstance.tHSRApiDailyTimetableTrainNoTrainDate(trainNo, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiDailyTimetableTrainNoTrainDate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiDailyTimetableTrainNoTrainDate")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTimetable&gt;**](ServiceDTOVersion2RailTHSRRailDailyTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tHSRApiDailyTrainInfo"></a>
# **tHSRApiDailyTrainInfo**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTrainInfo&gt; tHSRApiDailyTrainInfo(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得當天所有車次的車次資料

取得當天所有車次的車次資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailDailyTrainInfo> = apiInstance.tHSRApiDailyTrainInfo(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiDailyTrainInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiDailyTrainInfo")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTrainInfo&gt;**](ServiceDTOVersion2RailTHSRRailDailyTrainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiDailyTrainInfoTrainDate"></a>
# **tHSRApiDailyTrainInfoTrainDate**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTrainInfo&gt; tHSRApiDailyTrainInfoTrainDate(trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期]所有車次的車次資料

取得指定[日期]所有車次的車次資料(高鐵提供近28天每日時刻表)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val trainDate : kotlin.String = trainDate_example // kotlin.String | 欲查詢車次的日期(格式: yyyy-MM-dd)
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailDailyTrainInfo> = apiInstance.tHSRApiDailyTrainInfoTrainDate(trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiDailyTrainInfoTrainDate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiDailyTrainInfoTrainDate")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTrainInfo&gt;**](ServiceDTOVersion2RailTHSRRailDailyTrainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tHSRApiDailyTrainInfoTrainNo"></a>
# **tHSRApiDailyTrainInfoTrainNo**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTrainInfo&gt; tHSRApiDailyTrainInfoTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得當天指定[車次]的車次資料

取得當天指定[車次]的車次資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val trainNo : kotlin.String = trainNo_example // kotlin.String | 欲查詢車次的代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailDailyTrainInfo> = apiInstance.tHSRApiDailyTrainInfoTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiDailyTrainInfoTrainNo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiDailyTrainInfoTrainNo")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTrainInfo&gt;**](ServiceDTOVersion2RailTHSRRailDailyTrainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiDailyTrainInfoTrainNoTrainDate"></a>
# **tHSRApiDailyTrainInfoTrainNoTrainDate**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTrainInfo&gt; tHSRApiDailyTrainInfoTrainNoTrainDate(trainNo, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期],[車次]的車次資料

取得指定[日期],[車次]的車次資料(高鐵提供近28天每日時刻表)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val trainNo : kotlin.String = trainNo_example // kotlin.String | 欲查詢車次的代碼
val trainDate : kotlin.String = trainDate_example // kotlin.String | 欲查詢車次的日期(格式: yyyy-MM-dd)
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailDailyTrainInfo> = apiInstance.tHSRApiDailyTrainInfoTrainNoTrainDate(trainNo, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiDailyTrainInfoTrainNoTrainDate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiDailyTrainInfoTrainNoTrainDate")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailDailyTrainInfo&gt;**](ServiceDTOVersion2RailTHSRRailDailyTrainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tHSRApiGeneralTimetable"></a>
# **tHSRApiGeneralTimetable**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailGeneralTimetable&gt; tHSRApiGeneralTimetable(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得所有車次的定期時刻表資料

取得所有車次的定期時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailGeneralTimetable> = apiInstance.tHSRApiGeneralTimetable(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiGeneralTimetable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiGeneralTimetable")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailGeneralTimetable&gt;**](ServiceDTOVersion2RailTHSRRailGeneralTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiGeneralTimetableTrainNo"></a>
# **tHSRApiGeneralTimetableTrainNo**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailGeneralTimetable&gt; tHSRApiGeneralTimetableTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[車次]的定期時刻表資料

取得指定[車次]的定期時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val trainNo : kotlin.String = trainNo_example // kotlin.String | 欲查詢車次的代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailGeneralTimetable> = apiInstance.tHSRApiGeneralTimetableTrainNo(trainNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiGeneralTimetableTrainNo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiGeneralTimetableTrainNo")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailGeneralTimetable&gt;**](ServiceDTOVersion2RailTHSRRailGeneralTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiNews"></a>
# **tHSRApiNews**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRNews&gt; tHSRApiNews(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得高鐵最新消息資料

取得高鐵最新消息資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRNews> = apiInstance.tHSRApiNews(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiNews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiNews")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRNews&gt;**](ServiceDTOVersion2RailTHSRNews.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiODDailyTimetable"></a>
# **tHSRApiODDailyTimetable**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailODDailyTimetable&gt; tHSRApiODDailyTimetable(originStationID, destinationStationID, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期],[起迄站間]之時刻表資料

取得指定[日期],[起迄站間]之時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
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
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailODDailyTimetable> = apiInstance.tHSRApiODDailyTimetable(originStationID, destinationStationID, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiODDailyTimetable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiODDailyTimetable")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailODDailyTimetable&gt;**](ServiceDTOVersion2RailTHSRRailODDailyTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tHSRApiODFare"></a>
# **tHSRApiODFare**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailODFare&gt; tHSRApiODFare(originStationID, destinationStationID, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[起訖站間]之票價資料

取得指定[起訖站間]之票價資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val originStationID : kotlin.String = originStationID_example // kotlin.String | 起點車站代碼
val destinationStationID : kotlin.String = destinationStationID_example // kotlin.String | 迄點車站代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailODFare> = apiInstance.tHSRApiODFare(originStationID, destinationStationID, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiODFare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiODFare")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailODFare&gt;**](ServiceDTOVersion2RailTHSRRailODFare.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiShape"></a>
# **tHSRApiShape**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRTHSRShape&gt; tHSRApiShape(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得軌道路網實體路線圖資資料

取得軌道路網實體路線圖資資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRTHSRShape> = apiInstance.tHSRApiShape(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiShape")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiShape")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRTHSRShape&gt;**](ServiceDTOVersion2RailTHSRTHSRShape.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiStation"></a>
# **tHSRApiStation**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailStation&gt; tHSRApiStation(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得車站基本資料

取得車站基本資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailStation> = apiInstance.tHSRApiStation(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiStation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiStation")
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

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailStation&gt;**](ServiceDTOVersion2RailTHSRRailStation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tHSRApiStationTimetable"></a>
# **tHSRApiStationTimetable**
> kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailStationTimetable&gt; tHSRApiStationTimetable(stationID, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[日期],[車站]的站別時刻表資料

取得指定[日期],[車站]的站別時刻表資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = THSRApiApi()
val stationID : kotlin.String = stationID_example // kotlin.String | 
val trainDate : kotlin.String = trainDate_example // kotlin.String | 
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2RailTHSRRailStationTimetable> = apiInstance.tHSRApiStationTimetable(stationID, trainDate, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling THSRApiApi#tHSRApiStationTimetable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling THSRApiApi#tHSRApiStationTimetable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stationID** | **kotlin.String**|  | [default to null]
 **trainDate** | **kotlin.String**|  | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2RailTHSRRailStationTimetable&gt;**](ServiceDTOVersion2RailTHSRRailStationTimetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

