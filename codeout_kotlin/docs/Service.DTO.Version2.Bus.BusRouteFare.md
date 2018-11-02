
# ServiceDTOVersion2BusBusRouteFare

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeID** | **kotlin.String** | 機關定義路線代號 | 
**routeName** | **kotlin.String** | 路線名稱 |  [optional]
**operatorID** | **kotlin.String** | 營運業者代碼 | 
**subRouteID** | **kotlin.String** | 機關定義附屬路線代碼 |  [optional]
**subRouteName** | **kotlin.String** | 附屬路線名稱 |  [optional]
**farePricingType** | [**inline**](#FarePricingTypeEnum) | 描述該路線計費方式 | 
**isFreeBus** | [**inline**](#IsFreeBusEnum) | 是否為免費公車 | 
**isForAllSubRoutes** | [**inline**](#IsForAllSubRoutesEnum) | 該收費方式是否應用到所有附屬路線 | 
**stageFares** | [**kotlin.Array&lt;ServiceDTOVersion2BusBusStageFare&gt;**](ServiceDTOVersion2BusBusStageFare.md) | 計費站區間計費 |  [optional]
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="FarePricingTypeEnum"></a>
## Enum: FarePricingType
Name | Value
---- | -----
farePricingType | 0: 段次計費, 1: 起迄站間計費, 2: 計費站區間計費


<a name="IsFreeBusEnum"></a>
## Enum: IsFreeBus
Name | Value
---- | -----
isFreeBus | 0: 否, 1: 是


<a name="IsForAllSubRoutesEnum"></a>
## Enum: IsForAllSubRoutes
Name | Value
---- | -----
isForAllSubRoutes | 0: 否, 1: 是



