
# ServiceDTOVersion2RailTHSRAvailableSeat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trainNo** | **kotlin.String** | 車次號碼 | 
**direction** | [**inline**](#DirectionEnum) | 方向 | 
**stationID** | **kotlin.String** | 查詢車站代碼 | 
**stationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**departureTime** | **kotlin.String** | 發車時間(格式: HH:mm) | 
**endingStationID** | **kotlin.String** | 終點車站代碼 | 
**endingStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**stopStations** | [**kotlin.Array&lt;ServiceDTOVersion2RailTHSRStopStation&gt;**](ServiceDTOVersion2RailTHSRStopStation.md) | 車次停靠站點組合 | 
**srcRecTime** | **kotlin.String** | 來源端平台接收時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 南下, 1: 北上



