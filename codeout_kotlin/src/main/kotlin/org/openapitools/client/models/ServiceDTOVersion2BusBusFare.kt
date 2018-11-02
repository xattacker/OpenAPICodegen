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

import org.openapitools.client.models.ServiceDTOVersion2BusBusDiscountPeriods

import com.squareup.moshi.Json
/**
 * 票票價種類及費率說明
 * @param fareName 票價名稱
 * @param ticketType 票種類型
 * @param fareClass 費率等級
 * @param price 計費價格(新臺幣)
 * @param discountPeriods 優惠時段
 */
data class ServiceDTOVersion2BusBusFare (
    /* 票種類型 */
    val ticketType: ServiceDTOVersion2BusBusFare.TicketType,
    /* 費率等級 */
    val fareClass: ServiceDTOVersion2BusBusFare.FareClass,
    /* 計費價格(新臺幣) */
    val price: kotlin.Int,
    /* 票價名稱 */
    val fareName: kotlin.String? = null,
    /* 優惠時段 */
    val discountPeriods: kotlin.Array<ServiceDTOVersion2BusBusDiscountPeriods>? = null
) {

    /**
    * 票種類型
    * Values: _1colon,_2colon,_3colon,_4colon,_5colon30,_6colon60,_7colon,_8colon90
    */
    enum class TicketType(val value: kotlin.String){
    
        @Json(name = "1: 一般票") _1colon("1: 一般票"),
    
        @Json(name = "2: 來回票") _2colon("2: 來回票"),
    
        @Json(name = "3: 電子票證") _3colon("3: 電子票證"),
    
        @Json(name = "4: 回數票") _4colon("4: 回數票"),
    
        @Json(name = "5: 定期票30天期") _5colon30("5: 定期票30天期"),
    
        @Json(name = "6: 定期票60天期") _6colon60("6: 定期票60天期"),
    
        @Json(name = "7: 早鳥票") _7colon("7: 早鳥票"),
    
        @Json(name = "8: 定期票90天期") _8colon90("8: 定期票90天期");
    
    }

    /**
    * 費率等級
    * Values: _1colon,_2colon,_3colon,_4colon,_5colon,_6colon,_7colon,_8colon,_9colon,_10colon
    */
    enum class FareClass(val value: kotlin.String){
    
        @Json(name = "1: 成人") _1colon("1: 成人"),
    
        @Json(name = "2: 學生") _2colon("2: 學生"),
    
        @Json(name = "3: 孩童") _3colon("3: 孩童"),
    
        @Json(name = "4: 敬老") _4colon("4: 敬老"),
    
        @Json(name = "5: 愛心") _5colon("5: 愛心"),
    
        @Json(name = "6: 愛心孩童") _6colon("6: 愛心孩童"),
    
        @Json(name = "7: 愛心優待或愛心陪伴") _7colon("7: 愛心優待或愛心陪伴"),
    
        @Json(name = "8: 團體") _8colon("8: 團體"),
    
        @Json(name = "9: 軍警") _9colon("9: 軍警"),
    
        @Json(name = "10: 由各運業者自行定義的半票") _10colon("10: 由各運業者自行定義的半票");
    
    }

}

