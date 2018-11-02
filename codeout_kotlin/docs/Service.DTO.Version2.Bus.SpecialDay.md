
# ServiceDTOVersion2BusSpecialDay

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dates** | **kotlin.Array&lt;kotlin.String&gt;** | 不連續特殊日期 |  [optional]
**datePeriod** | [**ServiceDTOVersion2BusDatePeriod**](ServiceDTOVersion2BusDatePeriod.md) |  |  [optional]
**serviceStatus** | [**inline**](#ServiceStatusEnum) | 營運服務狀態代碼 |  [optional]
**description** | **kotlin.String** | 特殊營運描述 |  [optional]


<a name="ServiceStatusEnum"></a>
## Enum: ServiceStatus
Name | Value
---- | -----
serviceStatus | 0: 正常營運, 1: 加班營運, 2: 取消/停駛營運



