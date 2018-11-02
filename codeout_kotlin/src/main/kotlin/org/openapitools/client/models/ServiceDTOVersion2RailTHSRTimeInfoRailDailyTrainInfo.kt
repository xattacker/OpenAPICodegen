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

import com.squareup.moshi.Json
/**
 * 高鐵車次資料型別(時刻表用)
 * @param trainNo 車次代碼
 * @param direction 行駛方向
 * @param startingStationID 列車起點車站代號
 * @param startingStationName 
 * @param endingStationID 列車終點車站代號
 * @param endingStationName 
 * @param note 
 */
data class ServiceDTOVersion2RailTHSRTimeInfoRailDailyTrainInfo (
    /* 車次代碼 */
    val trainNo: kotlin.String,
    /* 行駛方向 */
    val direction: ServiceDTOVersion2RailTHSRTimeInfoRailDailyTrainInfo.Direction,
    /* 列車起點車站代號 */
    val startingStationID: kotlin.String? = null,
    val startingStationName: ServiceDTOVersion2BaseNameType? = null,
    /* 列車終點車站代號 */
    val endingStationID: kotlin.String? = null,
    val endingStationName: ServiceDTOVersion2BaseNameType? = null,
    val note: ServiceDTOVersion2BaseNameType? = null
) {

    /**
    * 行駛方向
    * Values: _0colon,_1colon
    */
    enum class Direction(val value: kotlin.String){
    
        @Json(name = "0: 南下") _0colon("0: 南下"),
    
        @Json(name = "1: 北上") _1colon("1: 北上");
    
    }

}

