
# ServiceDTOVersion2TaiwanTripBusBusN1EstimateTime

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plateNumb** | **kotlin.String** | 車牌號碼 |  [optional]
**stopUID** | **kotlin.String** | 站牌唯一識別代碼，規則為 {業管機關代碼} + {StopID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 |  [optional]
**stopID** | **kotlin.String** | 地區既用中之站牌代碼(為原資料內碼) |  [optional]
**stopName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**routeUID** | **kotlin.String** | 路線唯一識別代碼，規則為 {業管機關代碼} + {RouteID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 |  [optional]
**routeID** | **kotlin.String** | 地區既用中之路線代碼(為原資料內碼) |  [optional]
**taiwanTripName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**subRouteUID** | **kotlin.String** | 子路線唯一識別代碼，規則為 {業管機關代碼} + {SubRouteID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 |  [optional]
**subRouteID** | **kotlin.String** | 地區既用中之子路線代碼(為原資料內碼) |  [optional]
**subRouteName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**direction** | [**inline**](#DirectionEnum) | 去返程 | 
**estimateTime** | **kotlin.Int** | 到站時間預估(秒) |  [optional]
**stopCountDown** | **kotlin.Int** | 車輛距離本站站數 |  [optional]
**currentStop** | **kotlin.String** | 車輛目前所在站牌代碼 |  [optional]
**destinationStop** | **kotlin.String** | 車輛目的站牌代碼 |  [optional]
**stopStatus** | [**inline**](#StopStatusEnum) | 車輛狀態備註 |  [optional]
**messageType** | [**inline**](#MessageTypeEnum) | 資料型態種類 |  [optional]
**nextBusTime** | **kotlin.String** | 下一班公車到達時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**isLastBus** | **kotlin.Boolean** | 是否為末班車 |  [optional]
**transTime** | **kotlin.String** | 車機資料傳輸時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**srcRecTime** | **kotlin.String** | 來源端平台接收時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 去程, 1: 返程


<a name="StopStatusEnum"></a>
## Enum: StopStatus
Name | Value
---- | -----
stopStatus | 1: 尚未發車, 2: 交管不停靠, 3: 末班車已過, 4: 今日未營運


<a name="MessageTypeEnum"></a>
## Enum: MessageType
Name | Value
---- | -----
messageType | 0: 未知, 1: 定期, 2: 非定期



