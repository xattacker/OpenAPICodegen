
# ServiceDTOVersion2RailTRATimeInfoRailDailyTrainInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trainNo** | **kotlin.String** | 車次代碼 | 
**direction** | [**inline**](#DirectionEnum) | 順逆行 | 
**startingStationID** | **kotlin.String** | 列車起點車站代號 |  [optional]
**startingStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**endingStationID** | **kotlin.String** | 列車終點車站代號 |  [optional]
**endingStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**tripHeadsign** | **kotlin.String** | 車次車頭文字描述(通用以\&quot;往\&quot;+ 迄站中文站名\&quot;) |  [optional]
**trainTypeID** | **kotlin.String** | 列車車種代碼 | 
**trainTypeCode** | **kotlin.String** | 列車車種簡碼 | 
**trainTypeName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**tripLine** | [**inline**](#TripLineEnum) | 山海線類型 |  [optional]
**overNightStationID** | **kotlin.String** | 跨夜車站代碼 |  [optional]
**wheelchairFlag** | [**inline**](#WheelchairFlagEnum) | 是否設身障旅客專用座位車 | 
**packageServiceFlag** | [**inline**](#PackageServiceFlagEnum) | 是否提供行李服務 | 
**diningFlag** | [**inline**](#DiningFlagEnum) | 是否提供餐車服務 | 
**bikeFlag** | [**inline**](#BikeFlagEnum) | 是否人車同行班次(置於攜車袋之自行車各級列車均可乘車) | 
**breastFeedingFlag** | [**inline**](#BreastFeedingFlagEnum) | 是否設有哺(集)乳室車廂 | 
**dailyFlag** | [**inline**](#DailyFlagEnum) | 是否為每日行駛 | 
**serviceAddedFlag** | **kotlin.Boolean** | 是否為加班車 | 
**note** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]


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


<a name="WheelchairFlagEnum"></a>
## Enum: WheelchairFlag
Name | Value
---- | -----
wheelchairFlag | 0: 否, 1: 是


<a name="PackageServiceFlagEnum"></a>
## Enum: PackageServiceFlag
Name | Value
---- | -----
packageServiceFlag | 0: 否, 1: 是


<a name="DiningFlagEnum"></a>
## Enum: DiningFlag
Name | Value
---- | -----
diningFlag | 0: 否, 1: 是


<a name="BikeFlagEnum"></a>
## Enum: BikeFlag
Name | Value
---- | -----
bikeFlag | 0: 否, 1: 是


<a name="BreastFeedingFlagEnum"></a>
## Enum: BreastFeedingFlag
Name | Value
---- | -----
breastFeedingFlag | 0: 否, 1: 是


<a name="DailyFlagEnum"></a>
## Enum: DailyFlag
Name | Value
---- | -----
dailyFlag | 0: 否, 1: 是



