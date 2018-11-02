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
import org.openapitools.client.models.ServiceDTOVersion2BasePointType

import com.squareup.moshi.Json
/**
 * 定時車機資料型別
 * @param plateNumb 車牌號碼
 * @param operatorID 營運業者代碼
 * @param routeUID 路線唯一識別代碼，規則為 {業管機關簡碼} + {RouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢
 * @param routeID 地區既用中之路線代碼(為原資料內碼)
 * @param routeName 
 * @param subRouteUID 子路線唯一識別代碼，規則為 {業管機關簡碼} + {SubRouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢
 * @param subRouteID 地區既用中之子路線代碼(為原資料內碼)
 * @param subRouteName 
 * @param direction 去返程
 * @param busPosition 
 * @param speed 行駛速度(kph)
 * @param azimuth 方位角
 * @param dutyStatus 勤務狀態
 * @param busStatus 行車狀況
 * @param messageType 資料型態種類
 * @param gpSTime 車機時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 * @param transTime 車機資料傳輸時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)[多數單位沒有提供此欄位資訊]
 * @param srcRecTime 來源端平台接收時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 * @param srcTransTime 來源端平台資料傳出時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)[公總使用TCP動態即時推播故有提供此欄位, 而非公總系統因使用整包資料更新, 故沒有提供此欄位]
 * @param srcUpdateTime 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)[公總使用TCP動態即時推播故沒有提供此欄位, 而非公總系統因提供整包資料更新, 故有提供此欄]
 * @param updateTime 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 */
data class ServiceDTOVersion2BusBusA1Data (
    /* 車牌號碼 */
    val plateNumb: kotlin.String,
    /* 車機時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val gpSTime: kotlin.String,
    /* 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val updateTime: kotlin.String,
    /* 營運業者代碼 */
    val operatorID: kotlin.String? = null,
    /* 路線唯一識別代碼，規則為 {業管機關簡碼} + {RouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 */
    val routeUID: kotlin.String? = null,
    /* 地區既用中之路線代碼(為原資料內碼) */
    val routeID: kotlin.String? = null,
    val routeName: ServiceDTOVersion2BaseNameType? = null,
    /* 子路線唯一識別代碼，規則為 {業管機關簡碼} + {SubRouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 */
    val subRouteUID: kotlin.String? = null,
    /* 地區既用中之子路線代碼(為原資料內碼) */
    val subRouteID: kotlin.String? = null,
    val subRouteName: ServiceDTOVersion2BaseNameType? = null,
    /* 去返程 */
    val direction: ServiceDTOVersion2BusBusA1Data.Direction? = null,
    val busPosition: ServiceDTOVersion2BasePointType? = null,
    /* 行駛速度(kph) */
    val speed: kotlin.Double? = null,
    /* 方位角 */
    val azimuth: kotlin.Double? = null,
    /* 勤務狀態 */
    val dutyStatus: ServiceDTOVersion2BusBusA1Data.DutyStatus? = null,
    /* 行車狀況 */
    val busStatus: ServiceDTOVersion2BusBusA1Data.BusStatus? = null,
    /* 資料型態種類 */
    val messageType: ServiceDTOVersion2BusBusA1Data.MessageType? = null,
    /* 車機資料傳輸時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)[多數單位沒有提供此欄位資訊] */
    val transTime: kotlin.String? = null,
    /* 來源端平台接收時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val srcRecTime: kotlin.String? = null,
    /* 來源端平台資料傳出時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)[公總使用TCP動態即時推播故有提供此欄位, 而非公總系統因使用整包資料更新, 故沒有提供此欄位] */
    val srcTransTime: kotlin.String? = null,
    /* 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)[公總使用TCP動態即時推播故沒有提供此欄位, 而非公總系統因提供整包資料更新, 故有提供此欄] */
    val srcUpdateTime: kotlin.String? = null
) {

    /**
    * 去返程
    * Values: _0colon,_1colon
    */
    enum class Direction(val value: kotlin.String){
    
        @Json(name = "0: 去程") _0colon("0: 去程"),
    
        @Json(name = "1: 返程") _1colon("1: 返程");
    
    }

    /**
    * 勤務狀態
    * Values: _0colon,_1colon,_2colon
    */
    enum class DutyStatus(val value: kotlin.String){
    
        @Json(name = "0: 正常") _0colon("0: 正常"),
    
        @Json(name = "1: 開始") _1colon("1: 開始"),
    
        @Json(name = "2: 結束") _2colon("2: 結束");
    
    }

    /**
    * 行車狀況
    * Values: _0colon,_1colon,_2colon,_3colon,_4colon,_5colon,_90colon,_91colon,_98colon,_99colon,_100colon,_101colon,_255colon
    */
    enum class BusStatus(val value: kotlin.String){
    
        @Json(name = "0: 正常") _0colon("0: 正常"),
    
        @Json(name = "1: 車禍") _1colon("1: 車禍"),
    
        @Json(name = "2: 故障") _2colon("2: 故障"),
    
        @Json(name = "3: 塞車") _3colon("3: 塞車"),
    
        @Json(name = "4: 緊急求援") _4colon("4: 緊急求援"),
    
        @Json(name = "5: 加油") _5colon("5: 加油"),
    
        @Json(name = "90: 不明") _90colon("90: 不明"),
    
        @Json(name = "91: 去回不明") _91colon("91: 去回不明"),
    
        @Json(name = "98: 偏移路線") _98colon("98: 偏移路線"),
    
        @Json(name = "99: 非營運狀態") _99colon("99: 非營運狀態"),
    
        @Json(name = "100: 客滿") _100colon("100: 客滿"),
    
        @Json(name = "101: 包車出租") _101colon("101: 包車出租"),
    
        @Json(name = "255: 未知") _255colon("255: 未知");
    
    }

    /**
    * 資料型態種類
    * Values: _0colon,_1colon,_2colon
    */
    enum class MessageType(val value: kotlin.String){
    
        @Json(name = "0: 未知") _0colon("0: 未知"),
    
        @Json(name = "1: 定期") _1colon("1: 定期"),
    
        @Json(name = "2: 非定期") _2colon("2: 非定期");
    
    }

}

