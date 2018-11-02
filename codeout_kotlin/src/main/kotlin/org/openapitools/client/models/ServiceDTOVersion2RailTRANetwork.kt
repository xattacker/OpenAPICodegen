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

import org.openapitools.client.models.ServiceDTOVersion2RailTRALineSimple

/**
 * 臺鐵路網資料
 * @param networkID 臺鐵路網代碼
 * @param networkNameZh 臺鐵路網中文名稱
 * @param networkNameEn 臺鐵路網英文名稱
 * @param operatorID 營運業者代碼
 * @param operatorNameZh 臺鐵路網中文名稱
 * @param operatorNameEn 臺鐵路網英文名稱
 * @param networkMapUrl 臺鐵路網圖網址URL
 * @param lines 臺鐵路線資訊
 * @param updateTime 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz)
 */
data class ServiceDTOVersion2RailTRANetwork (
    /* 臺鐵路網代碼 */
    val networkID: kotlin.String,
    /* 臺鐵路網中文名稱 */
    val networkNameZh: kotlin.String,
    /* 臺鐵路網英文名稱 */
    val networkNameEn: kotlin.String,
    /* 營運業者代碼 */
    val operatorID: kotlin.String,
    /* 臺鐵路網中文名稱 */
    val operatorNameZh: kotlin.String,
    /* 臺鐵路網英文名稱 */
    val operatorNameEn: kotlin.String,
    /* 臺鐵路網圖網址URL */
    val networkMapUrl: kotlin.String,
    /* 臺鐵路線資訊 */
    val lines: kotlin.Array<ServiceDTOVersion2RailTRALineSimple>,
    /* 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) */
    val updateTime: kotlin.String
) {

}
