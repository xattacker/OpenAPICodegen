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
 * 站牌/位資料型別
 * @param stopUID 站牌唯一識別代碼，規則為 {業管機關簡碼} + {StopID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢
 * @param stopID 地區既用中之站牌代碼(為原資料內碼)
 * @param authorityID 業管機關代碼
 * @param stopName 
 * @param stopPosition 
 * @param stopAddress 站牌地址
 * @param bearing 方位角，E:東行;W:西行;S:南行;N:北行;SE:東南行;NE:東北行;SW:西南行;NW:西北行
 * @param stationID 站牌所屬的站位ID
 * @param stopDescription 站牌詳細說明描述
 * @param city 站牌權管所屬縣市(相當於市區公車API的City參數)[若為公路/國道客運路線則為空值]
 * @param cityCode 站牌權管所屬縣市之代碼(國際ISO 3166-2 三碼城市代碼)[若為公路/國道客運路線則為空值]
 * @param locationCityCode 站牌位置縣市之代碼(國際ISO 3166-2 三碼城市代碼)[若為公路/國道客運路線則為空值]
 * @param updateTime 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 * @param versionID 資料版本編號
 */
data class ServiceDTOVersion2BusBusStop (
    /* 站牌唯一識別代碼，規則為 {業管機關簡碼} + {StopID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 */
    val stopUID: kotlin.String,
    /* 地區既用中之站牌代碼(為原資料內碼) */
    val stopID: kotlin.String,
    /* 業管機關代碼 */
    val authorityID: kotlin.String,
    val stopName: ServiceDTOVersion2BaseNameType,
    val stopPosition: ServiceDTOVersion2BasePointType,
    /* 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val updateTime: kotlin.String,
    /* 資料版本編號 */
    val versionID: kotlin.Int,
    /* 站牌地址 */
    val stopAddress: kotlin.String? = null,
    /* 方位角，E:東行;W:西行;S:南行;N:北行;SE:東南行;NE:東北行;SW:西南行;NW:西北行 */
    val bearing: kotlin.String? = null,
    /* 站牌所屬的站位ID */
    val stationID: kotlin.String? = null,
    /* 站牌詳細說明描述 */
    val stopDescription: kotlin.String? = null,
    /* 站牌權管所屬縣市(相當於市區公車API的City參數)[若為公路/國道客運路線則為空值] */
    val city: kotlin.String? = null,
    /* 站牌權管所屬縣市之代碼(國際ISO 3166-2 三碼城市代碼)[若為公路/國道客運路線則為空值] */
    val cityCode: kotlin.String? = null,
    /* 站牌位置縣市之代碼(國際ISO 3166-2 三碼城市代碼)[若為公路/國道客運路線則為空值] */
    val locationCityCode: kotlin.String? = null
) {

}

