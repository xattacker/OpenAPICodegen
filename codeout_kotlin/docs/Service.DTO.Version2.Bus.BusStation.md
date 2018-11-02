
# ServiceDTOVersion2BusBusStation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stationUID** | **kotlin.String** | 站位唯一識別代碼，規則為 {業管機關簡碼} + {StationID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**stationID** | **kotlin.String** | 站位代碼 | 
**stationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**stationPosition** | [**ServiceDTOVersion2BasePointType**](ServiceDTOVersion2BasePointType.md) |  | 
**stationAddress** | **kotlin.String** | 站位地址 |  [optional]
**stops** | [**kotlin.Array&lt;ServiceDTOVersion2BusStationStop&gt;**](ServiceDTOVersion2BusStationStop.md) | 站牌與所行經此站牌之路線列表(資料會對路線展開，因此可能會有重複的站牌資料) |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**versionID** | **kotlin.Int** | 資料版本編號 | 



