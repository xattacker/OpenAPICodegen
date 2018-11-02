
# ServiceDTOVersion2RoadTrafficVDVDLive

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VDID** | **kotlin.String** | 設備代碼(營運業者代碼+設備原編號) | 
**sourceID** | **kotlin.String** | 營運業者代碼 | 
**status** | **kotlin.String** | 狀態(正常為 0，通訊異常為 1，停用或施工中為 2， 設備故障為 3) |  [optional]
**lanes** | [**kotlin.Array&lt;ServiceDTOVersion2RoadTrafficVDLanes&gt;**](ServiceDTOVersion2RoadTrafficVDLanes.md) | 多條車道內的流量資訊 |  [optional]
**dataCollectTime** | **kotlin.String** | 資料蒐集時間(時間資料格式為 24 小時制 |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 



