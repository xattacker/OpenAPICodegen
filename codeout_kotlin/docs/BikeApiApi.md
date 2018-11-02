# BikeApiApi

All URIs are relative to *http://ptx.transportdata.tw/MOTC*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bikeApiAvailability**](BikeApiApi.md#bikeApiAvailability) | **GET** /v2/Bike/Availability/{City} | 取得動態指定[縣市]的公共自行車即時車位資料
[**bikeApiStation**](BikeApiApi.md#bikeApiStation) | **GET** /v2/Bike/Station/{City} | 取得指定[縣市]的公共自行車租借站位資料


<a name="bikeApiAvailability"></a>
# **bikeApiAvailability**
> kotlin.Array&lt;ServiceDTOVersion2BikeBikeAvailability&gt; bikeApiAvailability(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得動態指定[縣市]的公共自行車即時車位資料

取得動態指定[縣市]的公共自行車即時車位資料&lt;br /&gt;[更新頻率]2分鐘更新一次

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BikeApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BikeBikeAvailability> = apiInstance.bikeApiAvailability(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BikeApiApi#bikeApiAvailability")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BikeApiApi#bikeApiAvailability")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Hsinchu, MiaoliCounty, ChanghuaCounty, PingtungCounty]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BikeBikeAvailability&gt;**](ServiceDTOVersion2BikeBikeAvailability.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="bikeApiStation"></a>
# **bikeApiStation**
> kotlin.Array&lt;ServiceDTOVersion2BikeBikeStation&gt; bikeApiStation(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)

取得指定[縣市]的公共自行車租借站位資料

取得指定[縣市]的公共自行車租借站位資料&lt;br /&gt;[更新頻率]2分鐘更新一次

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BikeApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
val `$spatialFilter` : kotlin.String = `$spatialFilter`_example // kotlin.String | 空間過濾
try {
    val result : kotlin.Array<ServiceDTOVersion2BikeBikeStation> = apiInstance.bikeApiStation(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`, `$spatialFilter`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BikeApiApi#bikeApiStation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BikeApiApi#bikeApiStation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **kotlin.String**| 欲查詢縣市 | [default to null] [enum: Taipei, NewTaipei, Taoyuan, Taichung, Tainan, Kaohsiung, Hsinchu, MiaoliCounty, ChanghuaCounty, PingtungCounty]
 **&#x60;$format&#x60;** | **kotlin.String**| 指定來源格式 | [default to null] [enum: JSON, XML]
 **&#x60;$select&#x60;** | **kotlin.String**| 挑選 | [optional] [default to null]
 **&#x60;$filter&#x60;** | **kotlin.String**| 過濾 | [optional] [default to null]
 **&#x60;$orderby&#x60;** | **kotlin.String**| 排序 | [optional] [default to null]
 **&#x60;$top&#x60;** | **kotlin.String**| 取前幾筆 | [optional] [default to 30]
 **&#x60;$skip&#x60;** | **kotlin.String**| 跳過前幾筆 | [optional] [default to null]
 **&#x60;$spatialFilter&#x60;** | **kotlin.String**| 空間過濾 | [optional] [default to null]

### Return type

[**kotlin.Array&lt;ServiceDTOVersion2BikeBikeStation&gt;**](ServiceDTOVersion2BikeBikeStation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

