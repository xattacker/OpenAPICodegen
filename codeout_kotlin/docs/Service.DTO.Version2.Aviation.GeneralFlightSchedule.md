
# ServiceDTOVersion2AviationGeneralFlightSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**airlineID** | **kotlin.String** | 航空公司IATA國際代碼 | 
**scheduleStartDate** | **kotlin.String** | 班表開始日期(ISO8601格式:yyyy-MM-dd) | 
**scheduleEndDate** | **kotlin.String** | 班表結束日期(ISO8601格式:yyyy-MM-dd) | 
**flightNumber** | **kotlin.String** | 班機號碼 | 
**departureAirportID** | **kotlin.String** | 起點機場IATA國際代碼 | 
**departureTime** | **kotlin.String** | 起點機場出發時間 (格式: HH:mm 當地時間，跨日以+1 表示) | 
**codeShare** | [**kotlin.Array&lt;ServiceDTOVersion2AviationCodeShare&gt;**](ServiceDTOVersion2AviationCodeShare.md) | 共用班號 |  [optional]
**arrivalAirportID** | **kotlin.String** | 目的地機場IATA國際代碼 | 
**arrivalTime** | **kotlin.String** | 終點機場抵達時間 (格式: HH:mm 當地時間，跨日以+1 表示) | 
**monday** | **kotlin.Boolean** | 週一飛行與否 | 
**tuesday** | **kotlin.Boolean** | 週二飛行與否 | 
**wednesday** | **kotlin.Boolean** | 週三飛行與否 | 
**thursday** | **kotlin.Boolean** | 週四飛行與否 | 
**friday** | **kotlin.Boolean** | 週五飛行與否 | 
**saturday** | **kotlin.Boolean** | 週六飛行與否 | 
**sunday** | **kotlin.Boolean** | 週日飛行與否 | 
**terminal** | **kotlin.String** | 航廈 |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 



