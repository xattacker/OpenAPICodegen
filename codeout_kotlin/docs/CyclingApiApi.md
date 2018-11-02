# CyclingApiApi

All URIs are relative to *http://ptx.transportdata.tw/MOTC*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cyclingApiShape**](CyclingApiApi.md#cyclingApiShape) | **GET** /v2/Cycling/Shape/{City} | 取得指定縣市之自行車道路網圖資


<a name="cyclingApiShape"></a>
# **cyclingApiShape**
> kotlin.Array&lt;ServiceDTOVersion2BikeBikeShape&gt; cyclingApiShape(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)

取得指定縣市之自行車道路網圖資

取得指定縣市之自行車道路網圖資

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CyclingApiApi()
val city : kotlin.String = city_example // kotlin.String | 欲查詢縣市
val `$format` : kotlin.String = `$format`_example // kotlin.String | 指定來源格式
val `$select` : kotlin.String = `$select`_example // kotlin.String | 挑選
val `$filter` : kotlin.String = `$filter`_example // kotlin.String | 過濾
val `$orderby` : kotlin.String = `$orderby`_example // kotlin.String | 排序
val `$top` : kotlin.String = `$top`_example // kotlin.String | 取前幾筆
val `$skip` : kotlin.String = `$skip`_example // kotlin.String | 跳過前幾筆
try {
    val result : kotlin.Array<ServiceDTOVersion2BikeBikeShape> = apiInstance.cyclingApiShape(city, `$format`, `$select`, `$filter`, `$orderby`, `$top`, `$skip`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CyclingApiApi#cyclingApiShape")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CyclingApiApi#cyclingApiShape")
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

[**kotlin.Array&lt;ServiceDTOVersion2BikeBikeShape&gt;**](ServiceDTOVersion2BikeBikeShape.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

