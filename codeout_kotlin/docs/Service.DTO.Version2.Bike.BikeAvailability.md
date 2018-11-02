
# ServiceDTOVersion2BikeBikeAvailability

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stationUID** | **kotlin.String** | 站點唯一識別代碼，規則為 {業管機關代碼} + {StationID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 |  [optional]
**stationID** | **kotlin.String** | 站點代碼 |  [optional]
**servieAvailable** | [**inline**](#ServieAvailableEnum) | 服務狀態 |  [optional]
**availableRentBikes** | **kotlin.Int** | 可租借車數 |  [optional]
**availableReturnBikes** | **kotlin.Int** | 可歸還車數 |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="ServieAvailableEnum"></a>
## Enum: ServieAvailable
Name | Value
---- | -----
servieAvailable | 0: 停止營運, 1: 正常營運



