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

import org.openapitools.client.models.ServiceDTOVersion2RoadTrafficVDCars

/**
 * 
 * @param vsrdir 偵測車道方向，以 0 和 1 表示。 若為單向車道偵測器，則均以 0 表示； 若為雙向車道偵測器，配合偵測車流方向不同，則 會有 0 和 1 的區別（與偵測器偵測方向同向或與偵 測器設置同側的車輛行駛車道方向，則以 0 表示； 反之，則以 1 表示）
 * @param speed 依車道逐一詳列 1 分鐘平均速率偵測值(單位： kph)
 * @param vsrid 車道代碼(由內車道而外車道，以阿拉伯數字 0,1,2,3,4,…表示)，若為慢車道仍依內而外自 0,1,… 表示
 * @param laneOccupy 依車道逐一詳列1分鐘 或 5分鐘佔有率偵測值(單位：%)
 * @param cars 不同種類車輛的流量資訊
 */
data class ServiceDTOVersion2RoadTrafficVDLanes (
    /* 偵測車道方向，以 0 和 1 表示。 若為單向車道偵測器，則均以 0 表示； 若為雙向車道偵測器，配合偵測車流方向不同，則 會有 0 和 1 的區別（與偵測器偵測方向同向或與偵 測器設置同側的車輛行駛車道方向，則以 0 表示； 反之，則以 1 表示） */
    val vsrdir: kotlin.String? = null,
    /* 依車道逐一詳列 1 分鐘平均速率偵測值(單位： kph) */
    val speed: kotlin.String? = null,
    /* 車道代碼(由內車道而外車道，以阿拉伯數字 0,1,2,3,4,…表示)，若為慢車道仍依內而外自 0,1,… 表示 */
    val vsrid: kotlin.String? = null,
    /* 依車道逐一詳列1分鐘 或 5分鐘佔有率偵測值(單位：%) */
    val laneOccupy: kotlin.String? = null,
    /* 不同種類車輛的流量資訊 */
    val cars: kotlin.Array<ServiceDTOVersion2RoadTrafficVDCars>? = null
) {

}
