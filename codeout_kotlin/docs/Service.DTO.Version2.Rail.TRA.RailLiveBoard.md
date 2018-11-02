
# ServiceDTOVersion2RailTRARailLiveBoard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stationID** | **kotlin.String** | 車站代碼 | 
**stationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**trainNo** | **kotlin.String** | 車次代碼 | 
**direction** | [**inline**](#DirectionEnum) | 順逆行 | 
**trainTypeID** | **kotlin.String** | 列車車種代碼 | 
**trainTypeCode** | **kotlin.String** | 列車車種簡碼 | 
**trainTypeName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**tripLine** | [**inline**](#TripLineEnum) | 山海線類型 |  [optional]
**endingStationID** | **kotlin.String** | 車次終點車站代號 | 
**endingStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**scheduledArrivalTime** | **kotlin.String** | 表訂到站時間(格式: HH:mm:ss) | 
**scheduledDepartureTime** | **kotlin.String** | 表訂離站時間(格式: HH:mm:ss) | 
**delayTime** | **kotlin.Int** | 誤點時間(0:準點;&amp;gt;&#x3D;1誤點) | 
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
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



