
# ServiceDTOVersion2BusBusRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeUID** | **kotlin.String** | 路線唯一識別代碼，規則為 {業管機關簡碼} + {RouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**routeID** | **kotlin.String** | 地區既用中之路線代碼(為原資料內碼) | 
**hasSubRoutes** | **kotlin.Boolean** | 實際上是否有多條附屬路線。(此欄位值與SubRoutes結構並無強烈的絕對關聯。詳細說明請參閱swagger上方的【資料服務使用注意事項】) | 
**operators** | [**kotlin.Array&lt;ServiceDTOVersion2BusRouteOperator&gt;**](ServiceDTOVersion2BusRouteOperator.md) | 營運業者 | 
**authorityID** | **kotlin.String** | 業管機關代碼 | 
**providerID** | **kotlin.String** | 資料提供平台代碼 | 
**subRoutes** | [**kotlin.Array&lt;ServiceDTOVersion2BusBusSubRoute&gt;**](ServiceDTOVersion2BusBusSubRoute.md) | 附屬路線資料(如果原始資料並無提供附屬路線ID，而本平台基於跨來源資料之一致性，會以SubRouteID&#x3D;RouteID產製一份相對應的附屬路線資料(若有去返程，則會有兩筆)) |  [optional]
**busRouteType** | [**inline**](#BusRouteTypeEnum) | 公車路線類別 | 
**routeName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**departureStopNameZh** | **kotlin.String** | 起站中文名稱 |  [optional]
**departureStopNameEn** | **kotlin.String** | 起站英文名稱 |  [optional]
**destinationStopNameZh** | **kotlin.String** | 終點站中文名稱 |  [optional]
**destinationStopNameEn** | **kotlin.String** | 終點站英文名稱 |  [optional]
**ticketPriceDescriptionZh** | **kotlin.String** | 票價中文敘述 |  [optional]
**ticketPriceDescriptionEn** | **kotlin.String** | 票價英文敘述 |  [optional]
**fareBufferZoneDescriptionZh** | **kotlin.String** | 收費緩衝區中文敘述 |  [optional]
**fareBufferZoneDescriptionEn** | **kotlin.String** | 收費緩衝區英文敘述 |  [optional]
**routeMapImageUrl** | **kotlin.String** | 路線簡圖網址 |  [optional]
**city** | **kotlin.String** | 路線權管所屬縣市(相當於市區公車API的City參數)[若為公路/國道客運路線則為空值] |  [optional]
**cityCode** | **kotlin.String** | 路線權管所屬縣市之代碼(國際ISO 3166-2 三碼城市代碼)[若為公路/國道客運路線則為空值] |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**versionID** | **kotlin.Int** | 資料版本編號 | 


<a name="BusRouteTypeEnum"></a>
## Enum: BusRouteType
Name | Value
---- | -----
busRouteType | 11: 市區公車, 12: 公路客運, 13: 國道客運, 14: 接駁車



