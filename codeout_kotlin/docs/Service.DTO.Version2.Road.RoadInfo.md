
# ServiceDTOVersion2RoadRoadInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeID** | **kotlin.String** | 路段編號(營運業者代碼+路段原編號) | 
**sourceID** | **kotlin.String** | 營運業者代碼 | 
**roadSection** | **kotlin.String** | 路段中文名稱描述 |  [optional]
**localtionPath** | **kotlin.String** | 路段(Link)所屬 Location Path ID |  [optional]
**startLocaltionPoint** | **kotlin.String** | 路段(Link)起點 Location Point ID |  [optional]
**endLocaltionPoint** | **kotlin.String** | 路段(Link)迄點 Location Point ID |  [optional]
**roadType** | **kotlin.String** | 道路等級(1.國道、2.快速公路(如西濱快速公路等)、 3.省道、4.快速道路(如建國高架橋等)、5.市區道路、 6.縣道、7.其它) |  [optional]
**fromkm** | **kotlin.String** | 起點里程數(表示方式：整數公里數+整數公里數下 3 位，如 36K+525，無里程數則填 WGS84 坐標系統 （X,Y） |  [optional]
**tokm** | **kotlin.String** | 迄點里程數(表示方式：整數公里數+整數公里數下 3 位，如 36K+525，無里程數則填 WGS84 坐標系統 （X,Y） |  [optional]
**speedLimit** | **kotlin.String** | 路段速限值，單位：kph。 |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]



