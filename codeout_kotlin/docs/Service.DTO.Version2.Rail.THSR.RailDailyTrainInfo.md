
# ServiceDTOVersion2RailTHSRRailDailyTrainInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trainNo** | **kotlin.String** | 車次代碼 | 
**direction** | [**inline**](#DirectionEnum) | 行駛方向 | 
**startingStationID** | **kotlin.String** | 列車起點車站代號 |  [optional]
**startingStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**endingStationID** | **kotlin.String** | 列車終點車站代號 |  [optional]
**endingStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**note** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 南下, 1: 北上


