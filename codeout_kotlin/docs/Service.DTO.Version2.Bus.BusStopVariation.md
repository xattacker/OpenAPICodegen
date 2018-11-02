
# ServiceDTOVersion2BusBusStopVariation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stopID** | **kotlin.String** | 地區既用中之站牌代碼(為原資料內碼) | 
**oldVersionID** | **kotlin.Int** | 資料版本編號(舊) | 
**newVersionID** | **kotlin.Int** | 資料版本編號(新) | 
**variationType** | [**inline**](#VariationTypeEnum) | 資料更新狀態。其中若為修改狀態，資料可能實際上並無異動，詳細說明請參閱swagger上方的【資料服務使用注意事項】 | 
**stops** | [**ServiceDTOVersion2BusBusStop**](ServiceDTOVersion2BusBusStop.md) |  |  [optional]


<a name="VariationTypeEnum"></a>
## Enum: VariationType
Name | Value
---- | -----
variationType | 0: 修改, 1: 新增, -1: 刪除



