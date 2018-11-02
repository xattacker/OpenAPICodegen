
# ServiceDTOVersion2BikeBikeStation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stationUID** | **kotlin.String** | 站點唯一識別代碼，規則為 {業管機關代碼} + {StationID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 |  [optional]
**stationID** | **kotlin.String** | 站點代碼 |  [optional]
**authorityID** | **kotlin.String** | 業管單位代碼 |  [optional]
**stationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**stationPosition** | [**ServiceDTOVersion2BasePointType**](ServiceDTOVersion2BasePointType.md) |  |  [optional]
**stationAddress** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**stopDescription** | **kotlin.String** | 站點描述 |  [optional]
**bikesCapacity** | **kotlin.Int** | 可容納之自行車總數 |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 



