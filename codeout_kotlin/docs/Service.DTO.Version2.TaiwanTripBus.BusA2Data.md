
# ServiceDTOVersion2TaiwanTripBusBusA2Data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plateNumb** | **kotlin.String** | 車牌號碼 | 
**operatorID** | **kotlin.String** | 營運業者代碼 |  [optional]
**routeUID** | **kotlin.String** | 路線唯一識別代碼，規則為 {業管機關代碼} + {RouteID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 |  [optional]
**routeID** | **kotlin.String** | 地區既用中之路線代碼(為原資料內碼) |  [optional]
**taiwanTripName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**subRouteUID** | **kotlin.String** | 子路線唯一識別代碼，規則為 {業管機關代碼} + {SubRouteID}，其中 {業管機關代碼} 可於Authority API中的AuthorityCode欄位查詢 |  [optional]
**subRouteID** | **kotlin.String** | 地區既用中之子路線代碼(為原資料內碼) |  [optional]
**subRouteName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**direction** | [**inline**](#DirectionEnum) | 去返程 | 
**stopUID** | **kotlin.String** | 站牌唯一識別代碼，規則為 {平台代碼} + {StopID}，其中 {平台代碼} 可於Provider API中的ProviderCode欄位查詢 |  [optional]
**stopID** | **kotlin.String** | 地區既用中之站牌代號(為原資料內碼) |  [optional]
**stopName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  |  [optional]
**messageType** | [**inline**](#MessageTypeEnum) | 資料型態種類 |  [optional]
**dutyStatus** | [**inline**](#DutyStatusEnum) | 勤務狀態 |  [optional]
**busStatus** | [**inline**](#BusStatusEnum) | 行車狀況 |  [optional]
**a2EventType** | [**inline**](#A2EventTypeEnum) | 進站離站 |  [optional]
**gpSTime** | **kotlin.String** | 車機時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**transTime** | **kotlin.String** | 車機資料傳輸時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**srcRecTime** | **kotlin.String** | 來源端平台接收時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 去程, 1: 返程


<a name="MessageTypeEnum"></a>
## Enum: MessageType
Name | Value
---- | -----
messageType | 0: 未知, 1: 定期, 2: 非定期


<a name="DutyStatusEnum"></a>
## Enum: DutyStatus
Name | Value
---- | -----
dutyStatus | 0: 正常, 1: 開始, 2: 結束


<a name="BusStatusEnum"></a>
## Enum: BusStatus
Name | Value
---- | -----
busStatus | 0: 正常, 1: 車禍, 2: 故障, 3: 塞車, 4: 緊急求援, 5: 加油, 90: 不明, 91: 去回不明, 98: 偏移路線, 99: 非營運狀態, 100: 客滿, 101: 包車出租, 255: 未知


<a name="A2EventTypeEnum"></a>
## Enum: A2EventType
Name | Value
---- | -----
a2EventType | 0: 離站, 1: 進站



