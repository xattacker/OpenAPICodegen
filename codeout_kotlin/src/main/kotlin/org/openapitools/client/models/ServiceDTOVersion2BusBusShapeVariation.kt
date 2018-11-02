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

import org.openapitools.client.models.ServiceDTOVersion2BusBusShape

import com.squareup.moshi.Json
/**
 * 路線線型差異資料型別
 * @param routeID 地區既用中之路線代碼(為原資料內碼)
 * @param oldVersionID 資料版本編號(舊)
 * @param newVersionID 資料版本編號(新)
 * @param variationType 資料更新狀態。其中若為修改狀態，資料可能實際上並無異動，詳細說明請參閱swagger上方的【資料服務使用注意事項】
 * @param shapes 
 */
data class ServiceDTOVersion2BusBusShapeVariation (
    /* 地區既用中之路線代碼(為原資料內碼) */
    val routeID: kotlin.String,
    /* 資料版本編號(舊) */
    val oldVersionID: kotlin.Int,
    /* 資料版本編號(新) */
    val newVersionID: kotlin.Int,
    /* 資料更新狀態。其中若為修改狀態，資料可能實際上並無異動，詳細說明請參閱swagger上方的【資料服務使用注意事項】 */
    val variationType: ServiceDTOVersion2BusBusShapeVariation.VariationType,
    val shapes: ServiceDTOVersion2BusBusShape? = null
) {

    /**
    * 資料更新狀態。其中若為修改狀態，資料可能實際上並無異動，詳細說明請參閱swagger上方的【資料服務使用注意事項】
    * Values: _0colon,_1colon,minus1Colon
    */
    enum class VariationType(val value: kotlin.String){
    
        @Json(name = "0: 修改") _0colon("0: 修改"),
    
        @Json(name = "1: 新增") _1colon("1: 新增"),
    
        @Json(name = "-1: 刪除") minus1Colon("-1: 刪除");
    
    }

}

