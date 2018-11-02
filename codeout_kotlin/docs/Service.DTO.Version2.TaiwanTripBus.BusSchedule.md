
# ServiceDTOVersion2TaiwanTripBusBusSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeUID** | **kotlin.String** | 路線唯一識別代碼，規則為 {業管機關代碼} + {RouteID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**routeID** | **kotlin.String** | 地區既用中之路線代碼(為原資料內碼) | 
**taiwanTripName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**subRouteUID** | **kotlin.String** | 子路線唯一識別代碼，規則為 {業管機關代碼} + {SubRouteID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**subRouteID** | **kotlin.String** | 地區既用中之子路線代碼(為原資料內碼) | 
**subRouteName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**direction** | [**inline**](#DirectionEnum) | 去返程 | 
**timetables** | [**kotlin.Array&lt;ServiceDTOVersion2BusBusTimetable&gt;**](ServiceDTOVersion2BusBusTimetable.md) | 預定班表 |  [optional]
**frequencys** | [**kotlin.Array&lt;ServiceDTOVersion2BusBusFrequency&gt;**](ServiceDTOVersion2BusBusFrequency.md) | 發車班距 |  [optional]


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 去程, 1: 返程



