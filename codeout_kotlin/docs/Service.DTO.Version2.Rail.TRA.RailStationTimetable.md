
# ServiceDTOVersion2RailTRARailStationTimetable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trainDate** | **kotlin.String** | 時刻表日期(格式: yyyy-MM-dd) | 
**stationID** | **kotlin.String** | 車站代號 | 
**stationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**trainNo** | **kotlin.String** | 車次代號 | 
**direction** | [**inline**](#DirectionEnum) | 順逆行 | 
**tripLine** | [**inline**](#TripLineEnum) | 山海線類型 |  [optional]
**trainTypeID** | **kotlin.String** | 列車車種代碼 | 
**trainTypeCode** | **kotlin.String** | 列車車種簡碼 | 
**trainTypeName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**startingStationID** | **kotlin.String** | 起點車站代號 | 
**startingStationName** | **kotlin.String** | 起點車站名稱 | 
**endingStationID** | **kotlin.String** | 終點車站代號 | 
**endingStationName** | **kotlin.String** | 終點車站名稱 | 
**arrivalTime** | **kotlin.String** | 到站時間(格式: HH:mm:ss) | 
**departureTime** | **kotlin.String** | 離站時間(格式: HH:mm:ss) | 
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 順行, 1: 逆行


<a name="TripLineEnum"></a>
## Enum: TripLine
Name | Value
---- | -----
tripLine | 0: 不經山海線, 1: 山線, 2: 海線



