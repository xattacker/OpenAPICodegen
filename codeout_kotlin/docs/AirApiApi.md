# AirApiApi

All URIs are relative to *http://ptx.transportdata.tw/MOTC*

Method | HTTP request | Description
------------- | ------------- | -------------
[**airApiAirline**](AirApiApi.md#airApiAirline) | **GET** /v2/Air/Airline | 取得航空公司資料
[**airApiAirline_0**](AirApiApi.md#airApiAirline_0) | **GET** /v2/Air/Airline/{IATA} | 取得指定[航空公司]資料
[**airApiAirport**](AirApiApi.md#airApiAirport) | **GET** /v2/Air/Airport | 取得機場資料
[**airApiAirport_0**](AirApiApi.md#airApiAirport_0) | **GET** /v2/Air/Airport/{IATA} | 取得指定[機場]資料
[**airApiArrival**](AirApiApi.md#airApiArrival) | **GET** /v2/Air/FIDS/Airport/Arrival | 取得機場的即時入境航班
[**airApiArrival_0**](AirApiApi.md#airApiArrival_0) | **GET** /v2/Air/FIDS/Airport/Arrival/{IATA} | 取得指定[機場的即時入境航班]
[**airApiDeparture**](AirApiApi.md#airApiDeparture) | **GET** /v2/Air/FIDS/Airport/Departure | 取得機場的即時出境航班
[**airApiDeparture_0**](AirApiApi.md#airApiDeparture_0) | **GET** /v2/Air/FIDS/Airport/Departure/{IATA} | 取得指定[機場的即時出境航班]
[**airApiDomestic**](AirApiApi.md#airApiDomestic) | **GET** /v2/Air/GeneralSchedule/Domestic | 取得國內航空定期時刻表
[**airApiFIDS**](AirApiApi.md#airApiFIDS) | **GET** /v2/Air/FIDS/Airport | 取得機場的即時航班資料
[**airApiFIDS_0**](AirApiApi.md#airApiFIDS_0) | **GET** /v2/Air/FIDS/Airport/{IATA} | 取得指定[機場的即時航班]資料
[**airApiFlight**](AirApiApi.md#airApiFlight) | **GET** /v2/Air/FIDS/Flight | 取得即時航班資料
[**airApiFlight_0**](AirApiApi.md#airApiFlight_0) | **GET** /v2/Air/FIDS/Flight/{FlightNo} | 取得指定[即時航班]資料
[**airApiInternational**](AirApiApi.md#airApiInternational) | **GET** /v2/Air/GeneralSchedule/International | 取得國際航空定期時刻表
[**airApiMETAR**](AirApiApi.md#airApiMETAR) | **GET** /v2/Air/METAR/Airport | 取得[國內機場]氣象資訊觀測資料
[**airApiMETAR_0**](AirApiApi.md#airApiMETAR_0) | **GET** /v2/Air/METAR/Airport/{IATA} | 取得指定[國內機場]氣象資訊觀測資料


<a name="airApiAirline"></a>
# **airApiAirline**
> kotlin.Array&lt;ServiceDTOVersion2AviationAirline&gt; airApiAirline(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得航空公司資料

取得所有航空公司資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationAirline> = apiInstance.airApiAirline(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiAirline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiAirline")
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

[**kotlin.Array&lt;ServiceDTOVersion2AviationAirline&gt;**](ServiceDTOVersion2AviationAirline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiAirline_0"></a>
# **airApiAirline_0**
> ServiceDTOVersion2AviationAirline airApiAirline_0(IATA, `$format`)

取得指定[航空公司]資料

取得指定[航空公司]資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val IATA : kotlin.String = IATA_example // kotlin.String | 航空公司代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
try {
    val result : ServiceDTOVersion2AviationAirline = apiInstance.airApiAirline_0(IATA, `$format`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiAirline_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiAirline_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IATA** | **kotlin.String**| 航空公司代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]

### Return type

[**ServiceDTOVersion2AviationAirline**](ServiceDTOVersion2AviationAirline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiAirport"></a>
# **airApiAirport**
> kotlin.Array&lt;ServiceDTOVersion2AviationAirport&gt; airApiAirport(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得機場資料

取得所有機場資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationAirport> = apiInstance.airApiAirport(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiAirport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiAirport")
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

[**kotlin.Array&lt;ServiceDTOVersion2AviationAirport&gt;**](ServiceDTOVersion2AviationAirport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="airApiAirport_0"></a>
# **airApiAirport_0**
> ServiceDTOVersion2AviationAirport airApiAirport_0(IATA, `$format`)

取得指定[機場]資料

取得指定[機場]資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val IATA : kotlin.String = IATA_example // kotlin.String | 機場代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
try {
    val result : ServiceDTOVersion2AviationAirport = apiInstance.airApiAirport_0(IATA, `$format`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiAirport_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiAirport_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IATA** | **kotlin.String**| 機場代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]

### Return type

[**ServiceDTOVersion2AviationAirport**](ServiceDTOVersion2AviationAirport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="airApiArrival"></a>
# **airApiArrival**
> kotlin.Array&lt;ServiceDTOVersion2AviationFIDSArrival&gt; airApiArrival(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得機場的即時入境航班

取得機場的即時入境航班

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationFIDSArrival> = apiInstance.airApiArrival(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiArrival")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiArrival")
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

[**kotlin.Array&lt;ServiceDTOVersion2AviationFIDSArrival&gt;**](ServiceDTOVersion2AviationFIDSArrival.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiArrival_0"></a>
# **airApiArrival_0**
> kotlin.Array&lt;ServiceDTOVersion2AviationFIDSArrival&gt; airApiArrival_0(IATA, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[機場的即時入境航班]

取得[指定機場]的即時入境航班

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val IATA : kotlin.String = IATA_example // kotlin.String | 機場代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationFIDSArrival> = apiInstance.airApiArrival_0(IATA, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiArrival_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiArrival_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IATA** | **kotlin.String**| 機場代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2AviationFIDSArrival&gt;**](ServiceDTOVersion2AviationFIDSArrival.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiDeparture"></a>
# **airApiDeparture**
> kotlin.Array&lt;ServiceDTOVersion2AviationFIDSDeparture&gt; airApiDeparture(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得機場的即時出境航班

取得機場的即時出境航班

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationFIDSDeparture> = apiInstance.airApiDeparture(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiDeparture")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiDeparture")
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

[**kotlin.Array&lt;ServiceDTOVersion2AviationFIDSDeparture&gt;**](ServiceDTOVersion2AviationFIDSDeparture.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiDeparture_0"></a>
# **airApiDeparture_0**
> kotlin.Array&lt;ServiceDTOVersion2AviationFIDSDeparture&gt; airApiDeparture_0(IATA, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[機場的即時出境航班]

取得指定的[機場即時出境航班]

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val IATA : kotlin.String = IATA_example // kotlin.String | 機場代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationFIDSDeparture> = apiInstance.airApiDeparture_0(IATA, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiDeparture_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiDeparture_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IATA** | **kotlin.String**| 機場代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2AviationFIDSDeparture&gt;**](ServiceDTOVersion2AviationFIDSDeparture.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiDomestic"></a>
# **airApiDomestic**
> kotlin.Array&lt;ServiceDTOVersion2AviationGeneralFlightSchedule&gt; airApiDomestic(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得國內航空定期時刻表

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationGeneralFlightSchedule> = apiInstance.airApiDomestic(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiDomestic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiDomestic")
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

[**kotlin.Array&lt;ServiceDTOVersion2AviationGeneralFlightSchedule&gt;**](ServiceDTOVersion2AviationGeneralFlightSchedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiFIDS"></a>
# **airApiFIDS**
> kotlin.Array&lt;ServiceDTOVersion2AviationAirportFIDS&gt; airApiFIDS(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得機場的即時航班資料

取得即時航班資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationAirportFIDS> = apiInstance.airApiFIDS(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiFIDS")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiFIDS")
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

[**kotlin.Array&lt;ServiceDTOVersion2AviationAirportFIDS&gt;**](ServiceDTOVersion2AviationAirportFIDS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiFIDS_0"></a>
# **airApiFIDS_0**
> kotlin.Array&lt;ServiceDTOVersion2AviationAirportFIDS&gt; airApiFIDS_0(IATA, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[機場的即時航班]資料

取得指定[機場的即時航班]資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val IATA : kotlin.String = IATA_example // kotlin.String | 機場代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationAirportFIDS> = apiInstance.airApiFIDS_0(IATA, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiFIDS_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiFIDS_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IATA** | **kotlin.String**| 機場代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2AviationAirportFIDS&gt;**](ServiceDTOVersion2AviationAirportFIDS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiFlight"></a>
# **airApiFlight**
> kotlin.Array&lt;ServiceDTOVersion2AviationFIDS&gt; airApiFlight(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得即時航班資料

取得即時航班資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationFIDS> = apiInstance.airApiFlight(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiFlight")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiFlight")
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

[**kotlin.Array&lt;ServiceDTOVersion2AviationFIDS&gt;**](ServiceDTOVersion2AviationFIDS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiFlight_0"></a>
# **airApiFlight_0**
> kotlin.Array&lt;ServiceDTOVersion2AviationFIDS&gt; airApiFlight_0(flightNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定[即時航班]資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val flightNo : kotlin.String = flightNo_example // kotlin.String | 航機班號
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationFIDS> = apiInstance.airApiFlight_0(flightNo, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiFlight_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiFlight_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flightNo** | **kotlin.String**| 航機班號 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2AviationFIDS&gt;**](ServiceDTOVersion2AviationFIDS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiInternational"></a>
# **airApiInternational**
> kotlin.Array&lt;ServiceDTOVersion2AviationGeneralFlightSchedule&gt; airApiInternational(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得國際航空定期時刻表

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2AviationGeneralFlightSchedule> = apiInstance.airApiInternational(`$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiInternational")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiInternational")
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

[**kotlin.Array&lt;ServiceDTOVersion2AviationGeneralFlightSchedule&gt;**](ServiceDTOVersion2AviationGeneralFlightSchedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiMETAR"></a>
# **airApiMETAR**
> kotlin.Array&lt;ServiceDTOVersion2ApplicationMETAR&gt; airApiMETAR(`$format`, ticket, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得[國內機場]氣象資訊觀測資料

取得[國內機場]氣象資訊觀測資料  &lt;br /&gt;目前提供之機場氣象觀測站代碼清單  &lt;br /&gt;RCSS:松山機場    RCKH:高雄機場  &lt;br /&gt;RCTP:桃園機場    RCMT:北竿機場   &lt;br /&gt;RCFG:南竿機場    RCBS:金門機場   &lt;br /&gt;RCQC:馬公機場    RCMQ:臺中機場   &lt;br /&gt;RCKU:嘉義機場    RCNN:臺南機場   &lt;br /&gt;RCYU:花蓮機場    RCFN:臺東機場   &lt;br /&gt;RCLY:蘭嶼機場    RCGI:綠島機場

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val ticket : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 預設為guest的ticket
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2ApplicationMETAR> = apiInstance.airApiMETAR(`$format`, ticket, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiMETAR")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiMETAR")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **ticket** | [**java.util.UUID**](.md)| 預設為guest的ticket | [optional] [default to null]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]
 **&#x60;$spatialFilter&#x60;** | **kotlin.String**| 空間過濾 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2ApplicationMETAR&gt;**](ServiceDTOVersion2ApplicationMETAR.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="airApiMETAR_0"></a>
# **airApiMETAR_0**
> kotlin.Array&lt;ServiceDTOVersion2ApplicationMETAR&gt; airApiMETAR_0(IATA, `$format`, ticket, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得指定[國內機場]氣象資訊觀測資料

取得指定[國內機場]氣象資訊觀測資料

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirApiApi()
val IATA : kotlin.String = IATA_example // kotlin.String | 機場代碼
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val ticket : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 預設為guest的ticket
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2ApplicationMETAR> = apiInstance.airApiMETAR_0(IATA, `$format`, ticket, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirApiApi#airApiMETAR_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirApiApi#airApiMETAR_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IATA** | **kotlin.String**| 機場代碼 | [default to null]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **ticket** | [**java.util.UUID**](.md)| 預設為guest的ticket | [optional] [default to null]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]
 **&#x60;$spatialFilter&#x60;** | **kotlin.String**| 空間過濾 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2ApplicationMETAR&gt;**](ServiceDTOVersion2ApplicationMETAR.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

