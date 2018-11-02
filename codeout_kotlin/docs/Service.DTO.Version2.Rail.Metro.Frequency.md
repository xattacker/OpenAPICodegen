
# ServiceDTOVersion2RailMetroFrequency

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineNo** | **kotlin.String** | 營運路線所屬之路線編號 | 
**lineID** | **kotlin.String** | 營運路線所屬之路線代碼 | 
**routeID** | **kotlin.String** | 營運路線代碼 | 
**trainType** | **kotlin.Int** | 車種(1:普通車, 2:直達車) |  [optional]
**serviceDays** | [**ServiceDTOVersion2RailMetroSubClassServiceDays**](ServiceDTOVersion2RailMetroSubClassServiceDays.md) |  | 
**operationTime** | [**ServiceDTOVersion2RailMetroSubClassOperationTime**](ServiceDTOVersion2RailMetroSubClassOperationTime.md) |  | 
**headways** | [**kotlin.Array&lt;ServiceDTOVersion2RailMetroSubClassHeadway&gt;**](ServiceDTOVersion2RailMetroSubClassHeadway.md) | 班距頻率資訊 | 
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 



