
# ServiceDTOVersion2BusBusDisplayStopOfRouteVariation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeID** | **kotlin.String** | 地區既用中之路線代碼(為原資料內碼) | 
**direction** | [**inline**](#DirectionEnum) | 去返程 |  [optional]
**oldVersionID** | **kotlin.Int** | 資料版本編號(舊) | 
**newVersionID** | **kotlin.Int** | 資料版本編號(新) | 
**variationType** | [**inline**](#VariationTypeEnum) | 資料更新狀態。其中若為修改狀態，資料可能實際上並無異動，詳細說明請參閱swagger上方的【資料服務使用注意事項】 | 
**displayStopOfRoutes** | [**ServiceDTOVersion2BusBusDisplayStopOfRoute**](ServiceDTOVersion2BusBusDisplayStopOfRoute.md) |  |  [optional]


<a name="DirectionEnum"></a>
## Enum: Direction
Name | Value
---- | -----
direction | 0: 去程, 1: 返程


<a name="VariationTypeEnum"></a>
## Enum: VariationType
Name | Value
---- | -----
variationType | 0: 修改, 1: 新增, -1: 刪除



