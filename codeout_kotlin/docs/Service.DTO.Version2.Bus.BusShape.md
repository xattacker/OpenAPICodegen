
# ServiceDTOVersion2BusBusShape

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeUID** | **kotlin.String** | 路線唯一識別代碼，規則為 {業管機關簡碼} + {RouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**routeID** | **kotlin.String** | 地區既用中之路線代碼(為原資料內碼) | 
**routeName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**direction** | [**inline**](#DirectionEnum) | 去返程，若無值則表示來源尚無區分去返程 | 
**geometry** | **kotlin.String** | well-known text，為路線軌跡資料 | 
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**versionID** | **kotlin.Int** | 資料版本編號 | 


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 去程, 1: 返程



