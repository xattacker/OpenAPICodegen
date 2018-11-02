
# ServiceDTOVersion2BusStationStop

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stopUID** | **kotlin.String** | 站牌唯一識別代碼，規則為 {業管機關簡碼} + {StopID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 |  [optional]
**stopID** | **kotlin.String** | 地區既用中之站牌代碼(為原資料內碼) |  [optional]
**stopName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**routeUID** | **kotlin.String** | 路線唯一識別代碼，規則為 {業管機關簡碼} + {RouteID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 |  [optional]
**routeID** | **kotlin.String** | 地區既用中之路線代碼(為原資料內碼) |  [optional]
**routeName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 



