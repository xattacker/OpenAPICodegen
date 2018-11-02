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

/**
 * 
 * @param airportID 機場代碼(IATA)
 * @param stationID 機場氣象觀測站代碼(ICAO)
 * @param countryName 
 * @param cityName 
 * @param airportName 
 * @param stationPosition 
 * @param observationTime 觀測時間
 * @param metarText 機場天氣報告(METAR/SPECI)
 * @param metarTime 機場天氣報告時間(地方時)
 * @param windDirection 風向(含單位)
 * @param windSpeed 風速(含單位)
 * @param visibility 盛行能見度(含單位，9999以10公里以上表示)
 * @param ceiling 雲冪(含單位)
 * @param temperature 溫度(含單位)
 * @param weatherDescription 
 * @param updateTime 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 */
data class ServiceDTOVersion2ApplicationMETAR (
    /* 機場代碼(IATA) */
    val airportID: kotlin.String,
    /* 機場氣象觀測站代碼(ICAO) */
    val stationID: kotlin.String,
    val countryName: ServiceDTOVersion2BaseNameType,
    val cityName: ServiceDTOVersion2BaseNameType,
    val airportName: ServiceDTOVersion2BaseNameType,
    val stationPosition: ServiceDTOVersion2BasePointType,
    /* 觀測時間 */
    val observationTime: kotlin.String,
    /* 機場天氣報告(METAR/SPECI) */
    val metarText: kotlin.String,
    /* 機場天氣報告時間(地方時) */
    val metarTime: kotlin.String,
    /* 風向(含單位) */
    val windDirection: kotlin.String,
    /* 風速(含單位) */
    val windSpeed: kotlin.String,
    /* 盛行能見度(含單位，9999以10公里以上表示) */
    val visibility: kotlin.String,
    /* 雲冪(含單位) */
    val ceiling: kotlin.String,
    /* 溫度(含單位) */
    val temperature: kotlin.String,
    val weatherDescription: ServiceDTOVersion2BaseNameType,
    /* 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val updateTime: kotlin.String
) {

}
