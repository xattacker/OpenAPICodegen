
# ServiceDTOVersion2RailMetroODFare

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originStationID** | **kotlin.String** | 起站車站代碼 | 
**originStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**destinationStationID** | **kotlin.String** | 迄站車站代碼 | 
**destinationStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**trainType** | **kotlin.Int** | 車種(1:普通車, 2:直達車) |  [optional]
**fares** | [**kotlin.Array&lt;ServiceDTOVersion2RailMetroSubClassFare&gt;**](ServiceDTOVersion2RailMetroSubClassFare.md) | 票價資訊 | 
**travelTime** | **kotlin.Int** | 起迄站間乘車時間(分) |  [optional]
**travelDistance** | **kotlin.Float** | 起迄站間乘車距離(公里) |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 



