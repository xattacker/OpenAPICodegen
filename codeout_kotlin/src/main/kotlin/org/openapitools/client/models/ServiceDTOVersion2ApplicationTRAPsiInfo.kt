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

/**
 * 取得台鐵車站空氣品質資料
 * @param stationID 車站代碼
 * @param stationName 
 * @param majorPollutant 指標污染物
 * @param status 狀態
 * @param pm10 懸浮微粒濃度
 * @param pm25 細懸浮微粒濃度(請參考行政院環境保護署空氣品質監測網http://taqm.epa.gov.tw/taqm/tw/fpmi-2.aspx說明)
 * @param PSI 空氣污染指標(請參考行政院環境保護署空氣品質監測網http://taqm.epa.gov.tw/taqm/tw/b0201.aspx說明)
 * @param siteTime 空氣品質監測站接收時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 * @param updateTime 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 */
data class ServiceDTOVersion2ApplicationTRAPsiInfo (
    /* 車站代碼 */
    val stationID: kotlin.String,
    /* 指標污染物 */
    val majorPollutant: kotlin.String,
    /* 狀態 */
    val status: kotlin.String,
    /* 懸浮微粒濃度 */
    val pm10: kotlin.Double,
    /* 細懸浮微粒濃度(請參考行政院環境保護署空氣品質監測網http://taqm.epa.gov.tw/taqm/tw/fpmi-2.aspx說明) */
    val pm25: kotlin.Double,
    /* 空氣污染指標(請參考行政院環境保護署空氣品質監測網http://taqm.epa.gov.tw/taqm/tw/b0201.aspx說明) */
    val PSI: kotlin.Double,
    /* 空氣品質監測站接收時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val siteTime: kotlin.String,
    /* 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val updateTime: kotlin.String,
    val stationName: ServiceDTOVersion2BaseNameType? = null
) {

}

