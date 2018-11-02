/**
* MOTC Transport  API V2
* </div>   <div class=\"info_description markdown\">本平臺提供涵蓋全國尺度之公車、臺鐵、高鐵、捷運、航空、自行車等公共運輸旅運資料服務API，歡迎各產政學單位介接使用。<br><span class=\"swagger-description-indicatation\">利用本平臺開放資料進行各項應用服務開發時，請考量不同特性使用者(如:性別/殘障/視障/老幼等)的需求，並歡迎回饋寶貴意見。</span><br><br>資料使用葵花寶典:<a href= https://ptxmotc.gitbooks.io/ptx-api-documentation/content/ >請點我</a><br>資料服務開發實作參考手冊:<a href= https://docs.google.com/viewer?url=https://github.com/ptxmotc/PTX_Web/blob/master/Swagger%E6%9C%8D%E5%8B%99%E8%AA%AA%E6%98%8E%E4%B8%8A%E5%82%B3%E5%8F%83%E8%80%83%E6%AA%94%E6%A1%88/%E5%85%AC%E5%85%B1%E9%81%8B%E8%BC%B8%E6%95%B4%E5%90%88%E8%B3%87%E8%A8%8A%E5%B9%B3%E5%8F%B0%E8%B3%87%E6%96%99%E6%9C%8D%E5%8B%99%E9%96%8B%E7%99%BC%E5%AF%A6%E4%BD%9C.pdf?raw=true >請點我</a><br>API URI Convention文件說明:<a href= https://docs.google.com/viewer?url=https://github.com/ptxmotc/PTX_Web/blob/master/Swagger%E6%9C%8D%E5%8B%99%E8%AA%AA%E6%98%8E%E4%B8%8A%E5%82%B3%E5%8F%83%E8%80%83%E6%AA%94%E6%A1%88/API_URI_Convention%E6%96%87%E4%BB%B6_v1.pdf?raw=true >請點我</a>
*
* OpenAPI spec version: v2
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.ServiceDTOVersion2BaseNameType
import org.openapitools.client.models.ServiceDTOVersion2BusBusSubRoute

import com.squareup.moshi.Json
/**
 * 路線資料型別
 * @param routeUID 路線唯一識別代碼，規則為 {業管機關代碼} + {RouteID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢
 * @param routeID 地區既用中之路線代碼(為原資料內碼)
 * @param operatorIDs 營運業者代碼
 * @param authorityID 業管單位代碼
 * @param providerID 資料提供平台代碼
 * @param subRoutes 子路線資料
 * @param busRouteType 公車路線類別
 * @param taiwanTripName 
 * @param departureStopNameZh 起站中文名稱
 * @param departureStopNameEn 起站英文名稱
 * @param destinationStopNameZh 終點站中文名稱
 * @param destinationStopNameEn 終點站英文名稱
 * @param ticketPriceDescriptionZh 票價中文敘述
 * @param ticketPriceDescriptionEn 票價英文敘述
 * @param fareBufferZoneDescriptionZh 收費緩衝區中文敘述
 * @param fareBufferZoneDescriptionEn 收費緩衝區英文敘述
 * @param routeMapImageUrl 路線簡圖網址
 */
data class ServiceDTOVersion2TaiwanTripBusBusRoute (
    /* 路線唯一識別代碼，規則為 {業管機關代碼} + {RouteID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 */
    val routeUID: kotlin.String,
    /* 地區既用中之路線代碼(為原資料內碼) */
    val routeID: kotlin.String,
    /* 營運業者代碼 */
    val operatorIDs: kotlin.Array<kotlin.String>,
    /* 業管單位代碼 */
    val authorityID: kotlin.String,
    /* 資料提供平台代碼 */
    val providerID: kotlin.String,
    /* 公車路線類別 */
    val busRouteType: ServiceDTOVersion2TaiwanTripBusBusRoute.BusRouteType,
    /* 票價中文敘述 */
    val ticketPriceDescriptionZh: kotlin.String,
    /* 票價英文敘述 */
    val ticketPriceDescriptionEn: kotlin.String,
    /* 子路線資料 */
    val subRoutes: kotlin.Array<ServiceDTOVersion2BusBusSubRoute>? = null,
    val taiwanTripName: ServiceDTOVersion2BaseNameType? = null,
    /* 起站中文名稱 */
    val departureStopNameZh: kotlin.String? = null,
    /* 起站英文名稱 */
    val departureStopNameEn: kotlin.String? = null,
    /* 終點站中文名稱 */
    val destinationStopNameZh: kotlin.String? = null,
    /* 終點站英文名稱 */
    val destinationStopNameEn: kotlin.String? = null,
    /* 收費緩衝區中文敘述 */
    val fareBufferZoneDescriptionZh: kotlin.String? = null,
    /* 收費緩衝區英文敘述 */
    val fareBufferZoneDescriptionEn: kotlin.String? = null,
    /* 路線簡圖網址 */
    val routeMapImageUrl: kotlin.String? = null
) {

    /**
    * 公車路線類別
    * Values: _11colon,_12colon,_13colon,_14colon
    */
    enum class BusRouteType(val value: kotlin.String){
    
        @Json(name = "11: 市區公車") _11colon("11: 市區公車"),
    
        @Json(name = "12: 公路客運") _12colon("12: 公路客運"),
    
        @Json(name = "13: 國道客運") _13colon("13: 國道客運"),
    
        @Json(name = "14: 接駁車") _14colon("14: 接駁車");
    
    }

}
