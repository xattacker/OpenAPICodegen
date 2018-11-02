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


import com.squareup.moshi.Json
/**
 * 出發航班顯示資料
 * @param flightDate 航班日期(ISO8601格式:yyyy-MM-dd)
 * @param flightNumber 航機班號
 * @param airRouteType 航線種類(目前民航局與桃機的FIDS系統都尚未提供此欄位資料)
 * @param airlineID 航空公司IATA國際代碼
 * @param departureAirportID 起點機場IATA國際代碼
 * @param arrivalAirportID 目的地機場IATA國際代碼
 * @param scheduleDepartureTime 表訂出發時間(ISO8601格式:yyyy-MM-ddTHH:mm)
 * @param actualDepartureTime 實際出發時間(ISO8601格式:yyyy-MM-ddTHH:mm)
 * @param estimatedDepartureTime 預估出發時間(ISO8601格式:yyyy-MM-ddTHH:mm)
 * @param departureRemark 航班屬性狀態, ,為該機場觀點的狀態
 * @param departureRemarkEn 航班屬性狀態(英文)
 * @param terminal 航廈
 * @param gate 登機門
 * @param codeShare 航班共用班號
 * @param isCargo 是否為貨機
 * @param acType 航空器型號
 * @param baggageClaim 行李轉盤(離站FIDS沒有「行李轉盤」資訊, 到站FIDS才可能有)
 * @param checkCounter 報到櫃檯(離站FIDS可能有「報到櫃台」資訊, 到站FIDS不會有)
 * @param updateTime 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 */
data class ServiceDTOVersion2AviationFIDSDeparture (
    /* 航班日期(ISO8601格式:yyyy-MM-dd) */
    val flightDate: kotlin.String,
    /* 航機班號 */
    val flightNumber: kotlin.String,
    /* 航空公司IATA國際代碼 */
    val airlineID: kotlin.String,
    /* 起點機場IATA國際代碼 */
    val departureAirportID: kotlin.String,
    /* 目的地機場IATA國際代碼 */
    val arrivalAirportID: kotlin.String,
    /* 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val updateTime: kotlin.String,
    /* 航線種類(目前民航局與桃機的FIDS系統都尚未提供此欄位資料) */
    val airRouteType: ServiceDTOVersion2AviationFIDSDeparture.AirRouteType? = null,
    /* 表訂出發時間(ISO8601格式:yyyy-MM-ddTHH:mm) */
    val scheduleDepartureTime: kotlin.String? = null,
    /* 實際出發時間(ISO8601格式:yyyy-MM-ddTHH:mm) */
    val actualDepartureTime: kotlin.String? = null,
    /* 預估出發時間(ISO8601格式:yyyy-MM-ddTHH:mm) */
    val estimatedDepartureTime: kotlin.String? = null,
    /* 航班屬性狀態, ,為該機場觀點的狀態 */
    val departureRemark: kotlin.String? = null,
    /* 航班屬性狀態(英文) */
    val departureRemarkEn: kotlin.String? = null,
    /* 航廈 */
    val terminal: kotlin.String? = null,
    /* 登機門 */
    val gate: kotlin.String? = null,
    /* 航班共用班號 */
    val codeShare: kotlin.String? = null,
    /* 是否為貨機 */
    val isCargo: kotlin.Boolean? = null,
    /* 航空器型號 */
    val acType: kotlin.String? = null,
    /* 行李轉盤(離站FIDS沒有「行李轉盤」資訊, 到站FIDS才可能有) */
    val baggageClaim: kotlin.String? = null,
    /* 報到櫃檯(離站FIDS可能有「報到櫃台」資訊, 到站FIDS不會有) */
    val checkCounter: kotlin.String? = null
) {

    /**
    * 航線種類(目前民航局與桃機的FIDS系統都尚未提供此欄位資料)
    * Values: _1colon,_2colon,_3colon,_4colon,_5colon,_6colon,minus2Colon
    */
    enum class AirRouteType(val value: kotlin.String){
    
        @Json(name = "1: 國際") _1colon("1: 國際"),
    
        @Json(name = "2: 國內") _2colon("2: 國內"),
    
        @Json(name = "3: 兩岸") _3colon("3: 兩岸"),
    
        @Json(name = "4: 國際包機") _4colon("4: 國際包機"),
    
        @Json(name = "5: 國內包機") _5colon("5: 國內包機"),
    
        @Json(name = "6: 兩岸包機") _6colon("6: 兩岸包機"),
    
        @Json(name = "-2: 特殊") minus2Colon("-2: 特殊");
    
    }

}

