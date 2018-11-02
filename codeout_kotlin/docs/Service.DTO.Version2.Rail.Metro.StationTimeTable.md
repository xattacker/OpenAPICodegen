
# ServiceDTOVersion2RailMetroStationTimeTable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeID** | **kotlin.String** | 營運路線代碼 |  [optional]
**lineID** | **kotlin.String** | 路線代碼 | 
**stationID** | **kotlin.String** | 車站代碼 | 
**stationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**direction** | [**inline**](#DirectionEnum) | 營運路線方向描述 |  [optional]
**destinationStaionID** | **kotlin.String** | 目的站車站代號 | 
**destinationStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**timetables** | [**kotlin.Array&lt;ServiceDTOVersion2RailMetroSubClassTimetable&gt;**](ServiceDTOVersion2RailMetroSubClassTimetable.md) | 車站發車時刻資訊 | 
**serviceDays** | [**ServiceDTOVersion2RailMetroSubClassServiceDays**](ServiceDTOVersion2RailMetroSubClassServiceDays.md) |  | 
**specialDays** | [**kotlin.Array&lt;ServiceDTOVersion2RailMetroSubClassSpecialDay&gt;**](ServiceDTOVersion2RailMetroSubClassSpecialDay.md) | 特定日期 |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 去程, 1: 返程



