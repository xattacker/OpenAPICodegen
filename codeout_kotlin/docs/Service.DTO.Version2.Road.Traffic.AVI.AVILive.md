
# ServiceDTOVersion2RoadTrafficAVIAVILive

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avIPairID** | **kotlin.String** | AVI 配對代碼(營運業者代碼+配對原編號) | 
**sourceID** | **kotlin.String** | 營運業者代碼 | 
**startAVIStatus** | **kotlin.String** | 配對起始點設備狀態 (正常為 0，通訊異常為 1，停 用或施工中為 2，設備故障為 3) |  [optional]
**endAVIStatus** | **kotlin.String** | 配對結束點設備狀態(正常為 0，通訊異常為 1，停用 或施工中為 2，設備故障為 3)\&quot; |  [optional]
**travelTime** | **kotlin.String** | 旅行時間，單位：秒，另外-99 代表資料不足 |  [optional]
**datacollectTime** | **kotlin.String** | 資料蒐集時間(時間資料格式為 24 小時制) |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]



