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

import org.openapitools.client.models.ServiceDTOVersion2ApplicationTourismPicture
import org.openapitools.client.models.ServiceDTOVersion2BasePointType

/**
 * 取得觀光活動資料
 * @param ID 活動訊息代碼
 * @param name 活動名稱
 * @param description 活動簡述
 * @param particpation 活動參與對象
 * @param location 主要活動地點名稱
 * @param address 主要活動地點地址
 * @param phone 活動聯絡電話
 * @param organizer 活動主辦單位
 * @param startTime 活動開始時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 * @param endTime 活動結束時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 * @param cycle 週期性活動執行時間
 * @param nonCycle 非週期性活動執行時間
 * @param websiteUrl 活動網址
 * @param picture 
 * @param position 
 * @param class1 活動分類1
 * @param class2 活動分類2
 * @param mapUrl 活動地圖/簡圖連結網址
 * @param travelInfo 交通資訊
 * @param parkingInfo 停車資訊
 * @param charge 費用標示
 * @param remarks 備註(其他活動相關事項)
 * @param city 所屬縣市
 * @param srcUpdateTime 觀光局檔案更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 * @param updateTime 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 */
data class ServiceDTOVersion2ApplicationActivityTourismInfo (
    /* 活動訊息代碼 */
    val ID: kotlin.String,
    /* 觀光局檔案更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val srcUpdateTime: kotlin.String,
    /* 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val updateTime: kotlin.String,
    /* 活動名稱 */
    val name: kotlin.String? = null,
    /* 活動簡述 */
    val description: kotlin.String? = null,
    /* 活動參與對象 */
    val particpation: kotlin.String? = null,
    /* 主要活動地點名稱 */
    val location: kotlin.String? = null,
    /* 主要活動地點地址 */
    val address: kotlin.String? = null,
    /* 活動聯絡電話 */
    val phone: kotlin.String? = null,
    /* 活動主辦單位 */
    val organizer: kotlin.String? = null,
    /* 活動開始時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val startTime: kotlin.String? = null,
    /* 活動結束時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val endTime: kotlin.String? = null,
    /* 週期性活動執行時間 */
    val cycle: kotlin.String? = null,
    /* 非週期性活動執行時間 */
    val nonCycle: kotlin.String? = null,
    /* 活動網址 */
    val websiteUrl: kotlin.String? = null,
    val picture: ServiceDTOVersion2ApplicationTourismPicture? = null,
    val position: ServiceDTOVersion2BasePointType? = null,
    /* 活動分類1 */
    val class1: kotlin.String? = null,
    /* 活動分類2 */
    val class2: kotlin.String? = null,
    /* 活動地圖/簡圖連結網址 */
    val mapUrl: kotlin.String? = null,
    /* 交通資訊 */
    val travelInfo: kotlin.String? = null,
    /* 停車資訊 */
    val parkingInfo: kotlin.String? = null,
    /* 費用標示 */
    val charge: kotlin.String? = null,
    /* 備註(其他活動相關事項) */
    val remarks: kotlin.String? = null,
    /* 所屬縣市 */
    val city: kotlin.String? = null
) {

}
