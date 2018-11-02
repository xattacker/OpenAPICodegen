
# ServiceDTOVersion2RailTRARailODFare

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originStationID** | **kotlin.String** | 起點車站代碼 | 
**originStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**destinationStationID** | **kotlin.String** | 迄點車站代碼 | 
**destinationStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**direction** | [**inline**](#DirectionEnum) | 順逆行 | 
**fares** | [**kotlin.Array&lt;ServiceDTOVersion2BaseFare&gt;**](ServiceDTOVersion2BaseFare.md) | 票價收費資訊 | 
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 順行, 1: 逆行



