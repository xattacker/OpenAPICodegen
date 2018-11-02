
# ServiceDTOVersion2RailTRARailStation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stationID** | **kotlin.String** | 車站代碼 | 
**stationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**stationPosition** | [**ServiceDTOVersion2BasePointType**](ServiceDTOVersion2BasePointType.md) |  | 
**stationAddress** | **kotlin.String** | 車站地址 | 
**stationPhone** | **kotlin.String** | 車站聯絡電話 |  [optional]
**operatorID** | **kotlin.String** | 營運業者代碼 | 
**stationClass** | [**inline**](#StationClassEnum) | 車站級別 | 
**reservationCode** | **kotlin.String** | 票價用站牌代碼 |  [optional]
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="StationClassEnum"></a>
## Enum: StationClass
Name | Value
---- | -----
stationClass | 0: 特等站, 1: 一等站, 2: 二等站, 3: 三等站, 4: 簡易站, 5: 招呼站, 6: 未知



