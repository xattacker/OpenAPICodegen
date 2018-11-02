
# ServiceDTOVersion2RailTHSRRailODFare

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originStationID** | **kotlin.String** | 起點車站代碼 | 
**originStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**destinationStationID** | **kotlin.String** | 迄點車站代碼 | 
**destinationStationName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**direction** | [**inline**](#DirectionEnum) | 行駛方向 | 
**fares** | [**kotlin.Array&lt;ServiceDTOVersion2BaseFare&gt;**](ServiceDTOVersion2BaseFare.md) | 票價收費資訊(本項僅列標準、商務及自由之基本票價，其他優待票及團體票之折扣計算請參考高鐵網站票價產品一覽表http://www.thsrc.com.tw/tw/Article/ArticleContent/caa6fac8-b875-4ad6-b1e6-96c2902d12a6 說明) | 
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 南下, 1: 北上



