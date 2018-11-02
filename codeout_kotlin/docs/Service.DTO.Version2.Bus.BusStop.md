
# ServiceDTOVersion2BusBusStop

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stopUID** | **kotlin.String** | 站牌唯一識別代碼，規則為 {業管機關簡碼} + {StopID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**stopID** | **kotlin.String** | 地區既用中之站牌代碼(為原資料內碼) | 
**authorityID** | **kotlin.String** | 業管機關代碼 | 
**stopName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**stopPosition** | [**ServiceDTOVersion2BasePointType**](ServiceDTOVersion2BasePointType.md) |  | 
**stopAddress** | **kotlin.String** | 站牌地址 |  [optional]
**bearing** | **kotlin.String** | 方位角，E:東行;W:西行;S:南行;N:北行;SE:東南行;NE:東北行;SW:西南行;NW:西北行 |  [optional]
**stationID** | **kotlin.String** | 站牌所屬的站位ID |  [optional]
**stopDescription** | **kotlin.String** | 站牌詳細說明描述 |  [optional]
**city** | **kotlin.String** | 站牌權管所屬縣市(相當於市區公車API的City參數)[若為公路/國道客運路線則為空值] |  [optional]
**cityCode** | **kotlin.String** | 站牌權管所屬縣市之代碼(國際ISO 3166-2 三碼城市代碼)[若為公路/國道客運路線則為空值] |  [optional]
**locationCityCode** | **kotlin.String** | 站牌位置縣市之代碼(國際ISO 3166-2 三碼城市代碼)[若為公路/國道客運路線則為空值] |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**versionID** | **kotlin.Int** | 資料版本編號 | 



