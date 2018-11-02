
# ServiceDTOVersion2AviationFIDS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flightDate** | **kotlin.String** | 航班日期(ISO8601格式:yyyy-MM-dd) | 
**flightNumber** | **kotlin.String** | 航機班號 | 
**airRouteType** | [**inline**](#AirRouteTypeEnum) | 航線種類 |  [optional]
**airlineID** | **kotlin.String** | 航空公司IATA國際代碼 | 
**departureAirportID** | **kotlin.String** | 起點機場IATA國際代碼 | 
**arrivalAirportID** | **kotlin.String** | 目的地機場IATA國際代碼 | 
**scheduleDepartureTime** | **kotlin.String** | 表訂出發時間(ISO8601格式:yyyy-MM-ddTHH:mm) |  [optional]
**actualDepartureTime** | **kotlin.String** | 實際出發時間(ISO8601格式:yyyy-MM-ddTHH:mm) |  [optional]
**estimatedDepartureTime** | **kotlin.String** | 預估出發時間(ISO8601格式:yyyy-MM-ddTHH:mm) |  [optional]
**scheduleArrivalTime** | **kotlin.String** | 表訂抵達時間(ISO8601格式:yyyy-MM-ddTHH:mm) |  [optional]
**actualArrivalTime** | **kotlin.String** | 實際抵達時間(ISO8601格式:yyyy-MM-ddTHH:mm) |  [optional]
**estimatedArrivalTime** | **kotlin.String** | 預估抵達時間(ISO8601格式:yyyy-MM-ddTHH:mm) |  [optional]
**departureRemark** | **kotlin.String** | 航班屬性狀態,為第三方觀點的狀態(資料來源:民航局) |  [optional]
**departureRemarkEn** | **kotlin.String** | 航班屬性狀態(英文) |  [optional]
**arrivalRemark** | **kotlin.String** | 航班屬性狀態,為該機場觀點的狀態 |  [optional]
**arrivalRemarkEn** | **kotlin.String** | 航班屬性狀態(英文) |  [optional]
**flightStatus** | **kotlin.String** | 航班運行狀態,以航班的角度的狀態 |  [optional]
**flightStatusEn** | **kotlin.String** | 航班運行狀態(英文) |  [optional]
**flightStatusPC** | **kotlin.String** | 航班運行狀態百分比(國內線) |  [optional]
**flightRemark** | **kotlin.String** | 航班屬性 |  [optional]
**arrivalTerminal** | **kotlin.String** | 抵達航廈 |  [optional]
**departureTerminal** | **kotlin.String** | 出發航廈 |  [optional]
**arrivalGate** | **kotlin.String** | 抵達登機門 |  [optional]
**departureGate** | **kotlin.String** | 出發登機門 |  [optional]
**codeShare** | **kotlin.String** | 航班共用班號 |  [optional]
**isCargo** | **kotlin.Boolean** | 是否為貨機 |  [optional]
**acType** | **kotlin.String** | 航空器型號 |  [optional]
**baggageClaim** | **kotlin.String** | 行李轉盤 |  [optional]
**checkCounter** | **kotlin.String** | 報到櫃檯 |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="AirRouteTypeEnum"></a>
## Enum: AirRouteType
Name | Value
---- | -----
airRouteType | 1: 國際, 2: 國內, 3: 兩岸, 4: 國際包機, 5: 國內包機, 6: 兩岸包機, -2: 特殊



