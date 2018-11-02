
# ServiceDTOVersion2AviationFIDSDeparture

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flightDate** | **kotlin.String** | 航班日期(ISO8601格式:yyyy-MM-dd) | 
**flightNumber** | **kotlin.String** | 航機班號 | 
**airRouteType** | [**inline**](#AirRouteTypeEnum) | 航線種類(目前民航局與桃機的FIDS系統都尚未提供此欄位資料) |  [optional]
**airlineID** | **kotlin.String** | 航空公司IATA國際代碼 | 
**departureAirportID** | **kotlin.String** | 起點機場IATA國際代碼 | 
**arrivalAirportID** | **kotlin.String** | 目的地機場IATA國際代碼 | 
**scheduleDepartureTime** | **kotlin.String** | 表訂出發時間(ISO8601格式:yyyy-MM-ddTHH:mm) |  [optional]
**actualDepartureTime** | **kotlin.String** | 實際出發時間(ISO8601格式:yyyy-MM-ddTHH:mm) |  [optional]
**estimatedDepartureTime** | **kotlin.String** | 預估出發時間(ISO8601格式:yyyy-MM-ddTHH:mm) |  [optional]
**departureRemark** | **kotlin.String** | 航班屬性狀態, ,為該機場觀點的狀態 |  [optional]
**departureRemarkEn** | **kotlin.String** | 航班屬性狀態(英文) |  [optional]
**terminal** | **kotlin.String** | 航廈 |  [optional]
**gate** | **kotlin.String** | 登機門 |  [optional]
**codeShare** | **kotlin.String** | 航班共用班號 |  [optional]
**isCargo** | **kotlin.Boolean** | 是否為貨機 |  [optional]
**acType** | **kotlin.String** | 航空器型號 |  [optional]
**baggageClaim** | **kotlin.String** | 行李轉盤(離站FIDS沒有「行李轉盤」資訊, 到站FIDS才可能有) |  [optional]
**checkCounter** | **kotlin.String** | 報到櫃檯(離站FIDS可能有「報到櫃台」資訊, 到站FIDS不會有) |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="AirRouteTypeEnum"></a>
## Enum: AirRouteType
Name | Value
---- | -----
airRouteType | 1: 國際, 2: 國內, 3: 兩岸, 4: 國際包機, 5: 國內包機, 6: 兩岸包機, -2: 特殊


