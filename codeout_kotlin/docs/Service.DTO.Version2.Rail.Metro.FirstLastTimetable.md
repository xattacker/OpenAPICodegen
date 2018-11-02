
# ServiceDTOVersion2RailMetroFirstLastTimetable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineNo** | **kotlin.String** | 首末班車次之路線代號 | 
**lineID** | **kotlin.String** | 首末班車次之路線代碼 | 
**stationID** | **kotlin.String** | 車站代號 | 
**stationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**tripHeadSign** | **kotlin.String** | 首末班車次之目的地方向描述 |  [optional]
**destinationStaionID** | **kotlin.String** | 目的站車站代號 | 
**destinationStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**trainType** | **kotlin.Int** | 車種(1:普通車, 2:直達車) |  [optional]
**firstTrainTime** | **kotlin.String** | 首班車時刻 | 
**lastTrainTime** | **kotlin.String** | 末班車時刻 | 
**serviceDays** | [**ServiceDTOVersion2RailMetroSubClassServiceDays**](ServiceDTOVersion2RailMetroSubClassServiceDays.md) |  | 
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 



