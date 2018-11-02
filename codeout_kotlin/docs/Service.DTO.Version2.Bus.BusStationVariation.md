
# ServiceDTOVersion2BusBusStationVariation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stationID** | **kotlin.String** | 站位代碼 | 
**oldVersionID** | **kotlin.Int** | 資料版本編號(舊) | 
**newVersionID** | **kotlin.Int** | 資料版本編號(新) | 
**variationType** | [**inline**](#VariationTypeEnum) | 資料更新狀態。其中若為修改狀態，資料可能實際上並無異動，詳細說明請參閱swagger上方的【資料服務使用注意事項】 | 
**stations** | [**ServiceDTOVersion2BusBusStation**](ServiceDTOVersion2BusBusStation.md) |  |  [optional]


<a name="VariationTypeEnum"></a>
## Enum: VariationType
Name | Value
---- | -----
variationType | 0: 修改, 1: 新增, -1: 刪除



