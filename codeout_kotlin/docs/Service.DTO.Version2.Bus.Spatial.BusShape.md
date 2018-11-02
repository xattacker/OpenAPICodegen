
# ServiceDTOVersion2BusSpatialBusShape

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeUID** | **kotlin.String** | 路線唯一識別代碼，規則為 {業管機關代碼} + {RouteID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**routeID** | **kotlin.String** | 地區既用中之路線代碼(為原資料內碼) | 
**routeName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**geographyLineString** | [**MicrosoftSpatialGeographyLineString**](MicrosoftSpatialGeographyLineString.md) |  | 
**geometryLineString** | [**MicrosoftSpatialGeometryLineString**](MicrosoftSpatialGeometryLineString.md) |  | 
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**versionID** | **kotlin.Int** | 資料版本編號 | 



