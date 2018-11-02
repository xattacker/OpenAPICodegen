
# ServiceDTOVersion2RoadRoadLive

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeID** | **kotlin.String** | 路段編碼(營運業者代碼+路段原編碼) | 
**sourceID** | **kotlin.String** | 營運業者代碼 | 
**level** | **kotlin.Int** | 級別(以 1,2,3,4,…方式描述服務水準級別，另外 -99 代表資料不足) |  [optional]
**value** | **kotlin.Int** | 門檻指標數值，例如對照之門檻指標為路段平均 速率，value&#x3D;10 (單位：kph) |  [optional]
**travelTime** | **kotlin.Float** | 路段旅行時間，單位：秒 |  [optional]
**datacollectTime** | **kotlin.String** | 資料蒐集時間 |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]



