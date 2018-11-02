
# ServiceDTOVersion2BusBusSubRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subRouteUID** | **kotlin.String** | 附屬路線唯一識別代碼，規則為 {業管機關簡碼} + {SubRouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**subRouteID** | **kotlin.String** | 地區既用中之附屬路線代碼(為原資料內碼) | 
**operatorIDs** | **kotlin.Array&lt;kotlin.String&gt;** | 營運業者代碼 | 
**subRouteName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**headsign** | **kotlin.String** | 車頭描述 |  [optional]
**direction** | [**inline**](#DirectionEnum) | 去返程 | 
**firstBusTime** | **kotlin.String** | 平日第一班發車時間 |  [optional]
**lastBusTime** | **kotlin.String** | 平日返程第一班發車時間 |  [optional]
**holidayFirstBusTime** | **kotlin.String** | 假日去程第一班發車時間 |  [optional]
**holidayLastBusTime** | **kotlin.String** | 假日返程第一班發車時間 |  [optional]


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 去程, 1: 返程



