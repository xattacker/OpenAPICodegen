
# ServiceDTOVersion2BusBusStopOfRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeUID** | **kotlin.String** | 路線唯一識別代碼，規則為 {業管機關簡碼} + {RouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**routeID** | **kotlin.String** | 地區既用中之路線代碼(為原資料內碼) | 
**routeName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**operators** | [**kotlin.Array&lt;ServiceDTOVersion2BusRouteOperator&gt;**](ServiceDTOVersion2BusRouteOperator.md) | 營運業者 |  [optional]
**subRouteUID** | **kotlin.String** | 附屬路線唯一識別代碼，規則為 {業管機關簡碼} + {SubRouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**subRouteID** | **kotlin.String** | 地區既用中之附屬路線代碼(為原資料內碼) | 
**subRouteName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**direction** | [**inline**](#DirectionEnum) | 去返程 |  [optional]
**city** | **kotlin.String** | 站牌權管所屬縣市(相當於市區公車API的City參數)[若為公路/國道客運路線則為空值] |  [optional]
**cityCode** | **kotlin.String** | 站牌權管所屬縣市之代碼(國際ISO 3166-2 三碼城市代碼)[若為公路/國道客運路線則為空值] |  [optional]
**stops** | [**kotlin.Array&lt;ServiceDTOVersion2BusStop&gt;**](ServiceDTOVersion2BusStop.md) | 所有經過站牌 | 
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**versionID** | **kotlin.Int** | 資料版本編號 | 


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 去程, 1: 返程


