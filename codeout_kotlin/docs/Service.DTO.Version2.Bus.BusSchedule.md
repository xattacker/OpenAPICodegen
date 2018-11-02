
# ServiceDTOVersion2BusBusSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeUID** | **kotlin.String** | 路線唯一識別代碼，規則為 {業管機關簡碼} + {RouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**routeID** | **kotlin.String** | 地區既用中之路線代碼(為原資料內碼) | 
**routeName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**subRouteUID** | **kotlin.String** | 附屬路線唯一識別代碼，規則為 {業管機關簡碼} + {SubRouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**subRouteID** | **kotlin.String** | 地區既用中之附屬路線代碼(為原資料內碼) | 
**subRouteName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**direction** | [**inline**](#DirectionEnum) | 去返程 | 
**operatorID** | **kotlin.String** | 營運業者代碼 |  [optional]
**operatorCode** | **kotlin.String** | 營運業者簡碼 |  [optional]
**timetables** | [**kotlin.Array&lt;ServiceDTOVersion2BusBusTimetable&gt;**](ServiceDTOVersion2BusBusTimetable.md) | 預定班表 |  [optional]
**frequencys** | [**kotlin.Array&lt;ServiceDTOVersion2BusBusFrequency&gt;**](ServiceDTOVersion2BusBusFrequency.md) | 發車班距 |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**versionID** | **kotlin.Int** | 資料版本編號 | 


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 去程, 1: 返程



