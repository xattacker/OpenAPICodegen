
# ServiceDTOVersion2RoadTrafficCMSCMSLive

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CMSID** | **kotlin.String** | 設備代碼(營運業者代碼+設備原編號) | 
**sourceID** | **kotlin.String** | 營運業者代碼 | 
**status** | **kotlin.String** | 狀態(正常為 0，通訊異常為 1，停用或施工中為 2， 設備故障為 3、目前無資料顯示為 4、目前正執行循 環顯示為 5)。 |  [optional]
**message** | **kotlin.String** | 內容訊息 |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]



