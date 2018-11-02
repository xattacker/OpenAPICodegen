
# ServiceDTOVersion2BusStop

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stopUID** | **kotlin.String** | 站牌唯一識別代碼，規則為 {業管機關簡碼} + {StopID}，其中 {業管機關簡碼} 可於Authority API中的AuthorityCode欄位查詢 | 
**stopID** | **kotlin.String** | 地區既用中之站牌代碼(為原資料內碼) | 
**stopName** | [**ServiceDTOVersion2BaseNameType**](ServiceDTOVersion2BaseNameType.md) |  | 
**stationNameID** | **kotlin.String** | 站名碼 | 
**stopBoarding** | [**inline**](#StopBoardingEnum) | 上下車站別 |  [optional]
**stopSequence** | **kotlin.Int** | 路線經過站牌之順序 | 
**stopPosition** | [**ServiceDTOVersion2BasePointType**](ServiceDTOVersion2BasePointType.md) |  | 
**stationID** | **kotlin.String** | 站牌所屬的站位ID |  [optional]
**locationCityCode** | **kotlin.String** | 站牌位置縣市之代碼(國際ISO 3166-2 三碼城市代碼)[若為公路/國道客運路線則為空值] |  [optional]


<a name="StopBoardingEnum"></a>
## Enum: StopBoarding
Name | Value
---- | -----
stopBoarding | 0: 可上下車, 1: 可上車, -1: 可下車



