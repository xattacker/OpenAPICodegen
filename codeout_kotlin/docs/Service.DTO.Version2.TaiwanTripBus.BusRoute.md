
# ServiceDTOVersion2TaiwanTripBusBusRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeUID** | **kotlin.String** | 路線唯一識別代碼，規則為 {業管機關代碼} + {RouteID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**routeID** | **kotlin.String** | 地區既用中之路線代碼(為原資料內碼) | 
**operatorIDs** | **kotlin.Array&lt;kotlin.String&gt;** | 營運業者代碼 | 
**authorityID** | **kotlin.String** | 業管單位代碼 | 
**providerID** | **kotlin.String** | 資料提供平台代碼 | 
**subRoutes** | [**kotlin.Array&lt;ServiceDTOVersion2BusBusSubRoute&gt;**](ServiceDTOVersion2BusBusSubRoute.md) | 子路線資料 |  [optional]
**busRouteType** | [**inline**](#BusRouteTypeEnum) | 公車路線類別 | 
**taiwanTripName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**departureStopNameZh** | **kotlin.String** | 起站中文名稱 |  [optional]
**departureStopNameEn** | **kotlin.String** | 起站英文名稱 |  [optional]
**destinationStopNameZh** | **kotlin.String** | 終點站中文名稱 |  [optional]
**destinationStopNameEn** | **kotlin.String** | 終點站英文名稱 |  [optional]
**ticketPriceDescriptionZh** | **kotlin.String** | 票價中文敘述 | 
**ticketPriceDescriptionEn** | **kotlin.String** | 票價英文敘述 | 
**fareBufferZoneDescriptionZh** | **kotlin.String** | 收費緩衝區中文敘述 |  [optional]
**fareBufferZoneDescriptionEn** | **kotlin.String** | 收費緩衝區英文敘述 |  [optional]
**routeMapImageUrl** | **kotlin.String** | 路線簡圖網址 |  [optional]


<a name="BusRouteTypeEnum"></a>
## Enum: BusRouteType
Name | Value
---- | -----
busRouteType | 11: 市區公車, 12: 公路客運, 13: 國道客運, 14: 接駁車



