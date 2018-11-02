# org.openapitools.client - Kotlin client library for MOTC Transport  API V2

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://ptx.transportdata.tw/MOTC*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AirApiApi* | [**airApiAirline**](docs/AirApiApi.md#airapiairline) | **GET** /v2/Air/Airline | 取得航空公司資料
*AirApiApi* | [**airApiAirline_0**](docs/AirApiApi.md#airapiairline_0) | **GET** /v2/Air/Airline/{IATA} | 取得指定[航空公司]資料
*AirApiApi* | [**airApiAirport**](docs/AirApiApi.md#airapiairport) | **GET** /v2/Air/Airport | 取得機場資料
*AirApiApi* | [**airApiAirport_0**](docs/AirApiApi.md#airapiairport_0) | **GET** /v2/Air/Airport/{IATA} | 取得指定[機場]資料
*AirApiApi* | [**airApiArrival**](docs/AirApiApi.md#airapiarrival) | **GET** /v2/Air/FIDS/Airport/Arrival | 取得機場的即時入境航班
*AirApiApi* | [**airApiArrival_0**](docs/AirApiApi.md#airapiarrival_0) | **GET** /v2/Air/FIDS/Airport/Arrival/{IATA} | 取得指定[機場的即時入境航班]
*AirApiApi* | [**airApiDeparture**](docs/AirApiApi.md#airapideparture) | **GET** /v2/Air/FIDS/Airport/Departure | 取得機場的即時出境航班
*AirApiApi* | [**airApiDeparture_0**](docs/AirApiApi.md#airapideparture_0) | **GET** /v2/Air/FIDS/Airport/Departure/{IATA} | 取得指定[機場的即時出境航班]
*AirApiApi* | [**airApiDomestic**](docs/AirApiApi.md#airapidomestic) | **GET** /v2/Air/GeneralSchedule/Domestic | 取得國內航空定期時刻表
*AirApiApi* | [**airApiFIDS**](docs/AirApiApi.md#airapifids) | **GET** /v2/Air/FIDS/Airport | 取得機場的即時航班資料
*AirApiApi* | [**airApiFIDS_0**](docs/AirApiApi.md#airapifids_0) | **GET** /v2/Air/FIDS/Airport/{IATA} | 取得指定[機場的即時航班]資料
*AirApiApi* | [**airApiFlight**](docs/AirApiApi.md#airapiflight) | **GET** /v2/Air/FIDS/Flight | 取得即時航班資料
*AirApiApi* | [**airApiFlight_0**](docs/AirApiApi.md#airapiflight_0) | **GET** /v2/Air/FIDS/Flight/{FlightNo} | 取得指定[即時航班]資料
*AirApiApi* | [**airApiInternational**](docs/AirApiApi.md#airapiinternational) | **GET** /v2/Air/GeneralSchedule/International | 取得國際航空定期時刻表
*AirApiApi* | [**airApiMETAR**](docs/AirApiApi.md#airapimetar) | **GET** /v2/Air/METAR/Airport | 取得[國內機場]氣象資訊觀測資料
*AirApiApi* | [**airApiMETAR_0**](docs/AirApiApi.md#airapimetar_0) | **GET** /v2/Air/METAR/Airport/{IATA} | 取得指定[國內機場]氣象資訊觀測資料
*BasicApiApi* | [**basicApiAuthority**](docs/BasicApiApi.md#basicapiauthority) | **GET** /v2/Basic/Authority | 取得所有業管機關資料
*BasicApiApi* | [**basicApiOperator**](docs/BasicApiApi.md#basicapioperator) | **GET** /v2/Basic/Operator | 取得所有營運業者資料
*BasicApiApi* | [**basicApiProvider**](docs/BasicApiApi.md#basicapiprovider) | **GET** /v2/Basic/Provider | 取得所有資料提供平台資料
*BikeApiApi* | [**bikeApiAvailability**](docs/BikeApiApi.md#bikeapiavailability) | **GET** /v2/Bike/Availability/{City} | 取得動態指定[縣市]的公共自行車即時車位資料
*BikeApiApi* | [**bikeApiStation**](docs/BikeApiApi.md#bikeapistation) | **GET** /v2/Bike/Station/{City} | 取得指定[縣市]的公共自行車租借站位資料
*CityBusApiApi* | [**cityBusApiDataVersion**](docs/CityBusApiApi.md#citybusapidataversion) | **GET** /v2/Bus/DataVersion/City/{City} | 取得指定[縣市]目前資料的最新版本資訊
*CityBusApiApi* | [**cityBusApiDisplayStopOfRoute**](docs/CityBusApiApi.md#citybusapidisplaystopofroute) | **GET** /v2/Bus/DisplayStopOfRoute/City/{City} | 取得指定[縣市]的市區公車顯示用路線站序資料
*CityBusApiApi* | [**cityBusApiDisplayStopOfRoute_0**](docs/CityBusApiApi.md#citybusapidisplaystopofroute_0) | **GET** /v2/Bus/DisplayStopOfRoute/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的市區公車顯示用路線站序資料
*CityBusApiApi* | [**cityBusApiEstimatedTimeOfArrival**](docs/CityBusApiApi.md#citybusapiestimatedtimeofarrival) | **GET** /v2/Bus/EstimatedTimeOfArrival/City/{City} | 取得指定[縣市]的公車預估到站資料(N1)
*CityBusApiApi* | [**cityBusApiEstimatedTimeOfArrival_0**](docs/CityBusApiApi.md#citybusapiestimatedtimeofarrival_0) | **GET** /v2/Bus/EstimatedTimeOfArrival/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的公車預估到站資料(N1)
*CityBusApiApi* | [**cityBusApiNews**](docs/CityBusApiApi.md#citybusapinews) | **GET** /v2/Bus/News/City/{City} | 取得市區客運之最新消息
*CityBusApiApi* | [**cityBusApiOperator**](docs/CityBusApiApi.md#citybusapioperator) | **GET** /v2/Bus/Operator/City/{City} | 取得指定[縣市]的市區公車營運業者資料
*CityBusApiApi* | [**cityBusApiRealTimeByFrequency**](docs/CityBusApiApi.md#citybusapirealtimebyfrequency) | **GET** /v2/Bus/RealTimeByFrequency/City/{City} | 取得指定[縣市]的公車動態定時資料(A1)
*CityBusApiApi* | [**cityBusApiRealTimeByFrequency_0**](docs/CityBusApiApi.md#citybusapirealtimebyfrequency_0) | **GET** /v2/Bus/RealTimeByFrequency/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的公車動態定時資料(A1)
*CityBusApiApi* | [**cityBusApiRealTimeNearStop**](docs/CityBusApiApi.md#citybusapirealtimenearstop) | **GET** /v2/Bus/RealTimeNearStop/City/{City} | 取得指定[縣市]的公車動態定點資料(A2)
*CityBusApiApi* | [**cityBusApiRealTimeNearStop_0**](docs/CityBusApiApi.md#citybusapirealtimenearstop_0) | **GET** /v2/Bus/RealTimeNearStop/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的公車動態定點資料(A2)
*CityBusApiApi* | [**cityBusApiRoute**](docs/CityBusApiApi.md#citybusapiroute) | **GET** /v2/Bus/Route/City/{City} | 取得指定[縣市]的市區公車路線資料
*CityBusApiApi* | [**cityBusApiRouteFare**](docs/CityBusApiApi.md#citybusapiroutefare) | **GET** /v2/Bus/RouteFare/City/{City} | 取得指定[縣市]的市區公車路線票價資料
*CityBusApiApi* | [**cityBusApiRoute_0**](docs/CityBusApiApi.md#citybusapiroute_0) | **GET** /v2/Bus/Route/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的路線資料
*CityBusApiApi* | [**cityBusApiSchedule**](docs/CityBusApiApi.md#citybusapischedule) | **GET** /v2/Bus/Schedule/City/{City} | 取得指定[縣市]的市區公車路線班表資料
*CityBusApiApi* | [**cityBusApiSchedule_0**](docs/CityBusApiApi.md#citybusapischedule_0) | **GET** /v2/Bus/Schedule/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的市區公車路線班表資料
*CityBusApiApi* | [**cityBusApiShape**](docs/CityBusApiApi.md#citybusapishape) | **GET** /v2/Bus/Shape/City/{City} | 取得指定[縣市]的市區公車線型資料
*CityBusApiApi* | [**cityBusApiStation**](docs/CityBusApiApi.md#citybusapistation) | **GET** /v2/Bus/Station/City/{City} | 取得指定[縣市]的市區公車站位資料
*CityBusApiApi* | [**cityBusApiStop**](docs/CityBusApiApi.md#citybusapistop) | **GET** /v2/Bus/Stop/City/{City} | 取得指定[縣市]的市區公車站牌資料
*CityBusApiApi* | [**cityBusApiStopOfRoute**](docs/CityBusApiApi.md#citybusapistopofroute) | **GET** /v2/Bus/StopOfRoute/City/{City} | 取得指定[縣市]的市區公車路線站序資料
*CityBusApiApi* | [**cityBusApiStopOfRoute_0**](docs/CityBusApiApi.md#citybusapistopofroute_0) | **GET** /v2/Bus/StopOfRoute/City/{City}/{RouteName} | 取得指定[縣市],[路線名稱]的市區公車路線站序資料
*CityBusApiApi* | [**cityBusApiVehicle**](docs/CityBusApiApi.md#citybusapivehicle) | **GET** /v2/Bus/Vehicle/City/{City} | 取得指定[縣市]的市區公車車輛資料
*CyclingApiApi* | [**cyclingApiShape**](docs/CyclingApiApi.md#cyclingapishape) | **GET** /v2/Cycling/Shape/{City} | 取得指定縣市之自行車道路網圖資
*InterCityBusApiApi* | [**interCityBusApiDataVersion**](docs/InterCityBusApiApi.md#intercitybusapidataversion) | **GET** /v2/Bus/DataVersion/InterCity | 取得指公路客運的最新版本資訊
*InterCityBusApiApi* | [**interCityBusApiEstimatedTimeOfArrival**](docs/InterCityBusApiApi.md#intercitybusapiestimatedtimeofarrival) | **GET** /v2/Bus/EstimatedTimeOfArrival/InterCity | 取得公路客運的預估到站資料(N1)
*InterCityBusApiApi* | [**interCityBusApiEstimatedTimeOfArrival_0**](docs/InterCityBusApiApi.md#intercitybusapiestimatedtimeofarrival_0) | **GET** /v2/Bus/EstimatedTimeOfArrival/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運預估到站資料(N1)
*InterCityBusApiApi* | [**interCityBusApiNews**](docs/InterCityBusApiApi.md#intercitybusapinews) | **GET** /v2/Bus/News/InterCity | 取得公路客運之最新消息
*InterCityBusApiApi* | [**interCityBusApiOperator**](docs/InterCityBusApiApi.md#intercitybusapioperator) | **GET** /v2/Bus/Operator/InterCity | 取得公路客運的營運業者資料
*InterCityBusApiApi* | [**interCityBusApiRealTimeByFrequency**](docs/InterCityBusApiApi.md#intercitybusapirealtimebyfrequency) | **GET** /v2/Bus/RealTimeByFrequency/InterCity | 取得公路客運的動態定時資料(A1)
*InterCityBusApiApi* | [**interCityBusApiRealTimeByFrequency_0**](docs/InterCityBusApiApi.md#intercitybusapirealtimebyfrequency_0) | **GET** /v2/Bus/RealTimeByFrequency/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運動態定時資料(A1)
*InterCityBusApiApi* | [**interCityBusApiRealTimeNearStop**](docs/InterCityBusApiApi.md#intercitybusapirealtimenearstop) | **GET** /v2/Bus/RealTimeNearStop/InterCity | 取得公路客運的動態定點資料(A2)
*InterCityBusApiApi* | [**interCityBusApiRealTimeNearStop_0**](docs/InterCityBusApiApi.md#intercitybusapirealtimenearstop_0) | **GET** /v2/Bus/RealTimeNearStop/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運動態定點資料(A2)
*InterCityBusApiApi* | [**interCityBusApiRoute**](docs/InterCityBusApiApi.md#intercitybusapiroute) | **GET** /v2/Bus/Route/InterCity | 取得公路客運路線資料
*InterCityBusApiApi* | [**interCityBusApiRouteFare**](docs/InterCityBusApiApi.md#intercitybusapiroutefare) | **GET** /v2/Bus/RouteFare/InterCity | 取得公路客運之路線票價資料
*InterCityBusApiApi* | [**interCityBusApiRoute_0**](docs/InterCityBusApiApi.md#intercitybusapiroute_0) | **GET** /v2/Bus/Route/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運路線資料
*InterCityBusApiApi* | [**interCityBusApiSchedule**](docs/InterCityBusApiApi.md#intercitybusapischedule) | **GET** /v2/Bus/Schedule/InterCity | 取得公路客運路線班表資料
*InterCityBusApiApi* | [**interCityBusApiSchedule_0**](docs/InterCityBusApiApi.md#intercitybusapischedule_0) | **GET** /v2/Bus/Schedule/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運路線班表資料
*InterCityBusApiApi* | [**interCityBusApiStation**](docs/InterCityBusApiApi.md#intercitybusapistation) | **GET** /v2/Bus/Station/InterCity | 取得公路客運站位資料
*InterCityBusApiApi* | [**interCityBusApiStop**](docs/InterCityBusApiApi.md#intercitybusapistop) | **GET** /v2/Bus/Stop/InterCity | 取得公路客運站牌資料
*InterCityBusApiApi* | [**interCityBusApiStopOfRoute**](docs/InterCityBusApiApi.md#intercitybusapistopofroute) | **GET** /v2/Bus/StopOfRoute/InterCity | 取得公路客運路線與站牌資料
*InterCityBusApiApi* | [**interCityBusApiStopOfRoute_0**](docs/InterCityBusApiApi.md#intercitybusapistopofroute_0) | **GET** /v2/Bus/StopOfRoute/InterCity/{RouteName} | 取得指定[路線名稱]的公路客運路線與站牌資料
*InterCityBusApiApi* | [**interCityBusApiVehicle**](docs/InterCityBusApiApi.md#intercitybusapivehicle) | **GET** /v2/Bus/Vehicle/InterCity | 取得公路客運之車輛資料
*MetroApiApi* | [**metroApiFirstLastTimetable**](docs/MetroApiApi.md#metroapifirstlasttimetable) | **GET** /v2/Rail/Metro/FirstLastTimetable/{Operator} | 取得捷運首末班車時刻表資料
*MetroApiApi* | [**metroApiFrequency**](docs/MetroApiApi.md#metroapifrequency) | **GET** /v2/Rail/Metro/Frequency/{Operator} | 取得捷運路線發車班距頻率資料
*MetroApiApi* | [**metroApiLine**](docs/MetroApiApi.md#metroapiline) | **GET** /v2/Rail/Metro/Line/{Operator} | 取得捷運路線基本資料
*MetroApiApi* | [**metroApiLineTransfer**](docs/MetroApiApi.md#metroapilinetransfer) | **GET** /v2/Rail/Metro/LineTransfer/{Operator} | 取得捷運路線站間轉乘基本資料
*MetroApiApi* | [**metroApiLiveBoard**](docs/MetroApiApi.md#metroapiliveboard) | **GET** /v2/Rail/Metro/LiveBoard/{Operator} | 取得捷運車站別列車即時到離站電子看板資訊
*MetroApiApi* | [**metroApiNetwork**](docs/MetroApiApi.md#metroapinetwork) | **GET** /v2/Rail/Metro/Network | 取得捷運路網資料
*MetroApiApi* | [**metroApiODFare**](docs/MetroApiApi.md#metroapiodfare) | **GET** /v2/Rail/Metro/ODFare/{Operator} | 取得捷運起迄站間票價資料
*MetroApiApi* | [**metroApiRoute**](docs/MetroApiApi.md#metroapiroute) | **GET** /v2/Rail/Metro/Route/{Operator} | 取得捷運營運路線基本資料
*MetroApiApi* | [**metroApiS2STravelTime**](docs/MetroApiApi.md#metroapis2straveltime) | **GET** /v2/Rail/Metro/S2STravelTime/{Operator} | 取得捷運列車站間運行時間資料
*MetroApiApi* | [**metroApiShape**](docs/MetroApiApi.md#metroapishape) | **GET** /v2/Rail/Metro/Shape/{Operator} | 取得指定營運業者之軌道路網實體路線圖資資料
*MetroApiApi* | [**metroApiStation**](docs/MetroApiApi.md#metroapistation) | **GET** /v2/Rail/Metro/Station/{Operator} | 取得捷運車站基本資料
*MetroApiApi* | [**metroApiStationExit**](docs/MetroApiApi.md#metroapistationexit) | **GET** /v2/Rail/Metro/StationExit/{Operator} | 取得捷運車站出入口基本資料
*MetroApiApi* | [**metroApiStationFacility**](docs/MetroApiApi.md#metroapistationfacility) | **GET** /v2/Rail/Metro/StationFacility/{Operator} | 取得捷運車站設施資料
*MetroApiApi* | [**metroApiStationOfLine**](docs/MetroApiApi.md#metroapistationofline) | **GET** /v2/Rail/Metro/StationOfLine/{Operator} | 取得捷運路線車站基本資料
*MetroApiApi* | [**metroApiStationOfRoute**](docs/MetroApiApi.md#metroapistationofroute) | **GET** /v2/Rail/Metro/StationOfRoute/{Operator} | 取得捷運營運路線車站基本資料
*MetroApiApi* | [**metroApiStationTimeTable**](docs/MetroApiApi.md#metroapistationtimetable) | **GET** /v2/Rail/Metro/StationTimeTable/{Operator} | 取得捷運站別時刻表資料
*THSRApiApi* | [**tHSRApiAlertInfo**](docs/THSRApiApi.md#thsrapialertinfo) | **GET** /v2/Rail/THSR/AlertInfo | 取得即時通阻事件資料
*THSRApiApi* | [**tHSRApiAvailableSeatStatusList**](docs/THSRApiApi.md#thsrapiavailableseatstatuslist) | **GET** /v2/Rail/THSR/AvailableSeatStatusList/{StationID} | 取得動態指定[車站]的對號座剩餘座位資訊看板資料
*THSRApiApi* | [**tHSRApiDailyTimetable**](docs/THSRApiApi.md#thsrapidailytimetable) | **GET** /v2/Rail/THSR/DailyTimetable/Today | 取得當天所有車次的時刻表資料
*THSRApiApi* | [**tHSRApiDailyTimetableTrainDate**](docs/THSRApiApi.md#thsrapidailytimetabletraindate) | **GET** /v2/Rail/THSR/DailyTimetable/TrainDate/{TrainDate} | 取得指定[日期]所有車次的時刻表資料
*THSRApiApi* | [**tHSRApiDailyTimetableTrainNo**](docs/THSRApiApi.md#thsrapidailytimetabletrainno) | **GET** /v2/Rail/THSR/DailyTimetable/Today/TrainNo/{TrainNo} | 取得當天指定[車次]的時刻表資料
*THSRApiApi* | [**tHSRApiDailyTimetableTrainNoTrainDate**](docs/THSRApiApi.md#thsrapidailytimetabletrainnotraindate) | **GET** /v2/Rail/THSR/DailyTimetable/TrainNo/{TrainNo}/TrainDate/{TrainDate} | 取得指定[日期],[車次]的時刻表資料
*THSRApiApi* | [**tHSRApiDailyTrainInfo**](docs/THSRApiApi.md#thsrapidailytraininfo) | **GET** /v2/Rail/THSR/DailyTrainInfo/Today | 取得當天所有車次的車次資料
*THSRApiApi* | [**tHSRApiDailyTrainInfoTrainDate**](docs/THSRApiApi.md#thsrapidailytraininfotraindate) | **GET** /v2/Rail/THSR/DailyTrainInfo/TrainDate/{TrainDate} | 取得指定[日期]所有車次的車次資料
*THSRApiApi* | [**tHSRApiDailyTrainInfoTrainNo**](docs/THSRApiApi.md#thsrapidailytraininfotrainno) | **GET** /v2/Rail/THSR/DailyTrainInfo/Today/TrainNo/{TrainNo} | 取得當天指定[車次]的車次資料
*THSRApiApi* | [**tHSRApiDailyTrainInfoTrainNoTrainDate**](docs/THSRApiApi.md#thsrapidailytraininfotrainnotraindate) | **GET** /v2/Rail/THSR/DailyTrainInfo/TrainNo/{TrainNo}/TrainDate/{TrainDate} | 取得指定[日期],[車次]的車次資料
*THSRApiApi* | [**tHSRApiGeneralTimetable**](docs/THSRApiApi.md#thsrapigeneraltimetable) | **GET** /v2/Rail/THSR/GeneralTimetable | 取得所有車次的定期時刻表資料
*THSRApiApi* | [**tHSRApiGeneralTimetableTrainNo**](docs/THSRApiApi.md#thsrapigeneraltimetabletrainno) | **GET** /v2/Rail/THSR/GeneralTimetable/TrainNo/{TrainNo} | 取得指定[車次]的定期時刻表資料
*THSRApiApi* | [**tHSRApiNews**](docs/THSRApiApi.md#thsrapinews) | **GET** /v2/Rail/THSR/News | 取得高鐵最新消息資料
*THSRApiApi* | [**tHSRApiODDailyTimetable**](docs/THSRApiApi.md#thsrapioddailytimetable) | **GET** /v2/Rail/THSR/DailyTimetable/OD/{OriginStationID}/to/{DestinationStationID}/{TrainDate} | 取得指定[日期],[起迄站間]之時刻表資料
*THSRApiApi* | [**tHSRApiODFare**](docs/THSRApiApi.md#thsrapiodfare) | **GET** /v2/Rail/THSR/ODFare/{OriginStationID}/to/{DestinationStationID} | 取得指定[起訖站間]之票價資料
*THSRApiApi* | [**tHSRApiShape**](docs/THSRApiApi.md#thsrapishape) | **GET** /v2/Rail/THSR/Shape | 取得軌道路網實體路線圖資資料
*THSRApiApi* | [**tHSRApiStation**](docs/THSRApiApi.md#thsrapistation) | **GET** /v2/Rail/THSR/Station | 取得車站基本資料
*THSRApiApi* | [**tHSRApiStationTimetable**](docs/THSRApiApi.md#thsrapistationtimetable) | **GET** /v2/Rail/THSR/DailyTimetable/Station/{StationID}/{TrainDate} | 取得指定[日期],[車站]的站別時刻表資料
*TRAApiApi* | [**tRAApiDailyTimetable**](docs/TRAApiApi.md#traapidailytimetable) | **GET** /v2/Rail/TRA/DailyTimetable/Today | 取得當天所有車次的時刻表資料
*TRAApiApi* | [**tRAApiDailyTimetableTrainDate**](docs/TRAApiApi.md#traapidailytimetabletraindate) | **GET** /v2/Rail/TRA/DailyTimetable/TrainDate/{TrainDate} | 取得指定[日期]所有車次的時刻表資料
*TRAApiApi* | [**tRAApiDailyTimetableTrainNo**](docs/TRAApiApi.md#traapidailytimetabletrainno) | **GET** /v2/Rail/TRA/DailyTimetable/Today/TrainNo/{TrainNo} | 取得當天指定[車次]的時刻表資料
*TRAApiApi* | [**tRAApiDailyTimetableTrainNoTrainDate**](docs/TRAApiApi.md#traapidailytimetabletrainnotraindate) | **GET** /v2/Rail/TRA/DailyTimetable/TrainNo/{TrainNo}/TrainDate/{TrainDate} | 取得指定[日期],[車次]的時刻表資料
*TRAApiApi* | [**tRAApiDailyTrainInfo**](docs/TRAApiApi.md#traapidailytraininfo) | **GET** /v2/Rail/TRA/DailyTrainInfo/Today | 取得當天所有車次的車次資料
*TRAApiApi* | [**tRAApiDailyTrainInfoTrainDate**](docs/TRAApiApi.md#traapidailytraininfotraindate) | **GET** /v2/Rail/TRA/DailyTrainInfo/TrainDate/{TrainDate} | 取得指定[日期]所有車次的車次資料
*TRAApiApi* | [**tRAApiDailyTrainInfoTrainNo**](docs/TRAApiApi.md#traapidailytraininfotrainno) | **GET** /v2/Rail/TRA/DailyTrainInfo/Today/TrainNo/{TrainNo} | 取得當天指定[車次]的車次資料
*TRAApiApi* | [**tRAApiDailyTrainInfoTrainNoTrainDate**](docs/TRAApiApi.md#traapidailytraininfotrainnotraindate) | **GET** /v2/Rail/TRA/DailyTrainInfo/TrainNo/{TrainNo}/TrainDate/{TrainDate} | 取得指定[日期]與[車次]的車次資料
*TRAApiApi* | [**tRAApiGeneralTimetable**](docs/TRAApiApi.md#traapigeneraltimetable) | **GET** /v2/Rail/TRA/GeneralTimetable | 取得所有車次的定期時刻表資料
*TRAApiApi* | [**tRAApiGeneralTimetableTrainNo**](docs/TRAApiApi.md#traapigeneraltimetabletrainno) | **GET** /v2/Rail/TRA/GeneralTimetable/TrainNo/{TrainNo} | 取得指定[車次]的定期時刻表資料
*TRAApiApi* | [**tRAApiGeneralTrainInfo**](docs/TRAApiApi.md#traapigeneraltraininfo) | **GET** /v2/Rail/TRA/GeneralTrainInfo | 取得所有車次的定期車次資料
*TRAApiApi* | [**tRAApiGeneralTrainInfoTrainNo**](docs/TRAApiApi.md#traapigeneraltraininfotrainno) | **GET** /v2/Rail/TRA/GeneralTrainInfo/TrainNo/{TrainNo} | 取得指定[車次]的定期車次資料
*TRAApiApi* | [**tRAApiLine**](docs/TRAApiApi.md#traapiline) | **GET** /v2/Rail/TRA/Line | 取得路線基本資料
*TRAApiApi* | [**tRAApiLiveBoard**](docs/TRAApiApi.md#traapiliveboard) | **GET** /v2/Rail/TRA/LiveBoard | 取得車站別列車即時到離站電子看板(動態前後30分鐘的車次)
*TRAApiApi* | [**tRAApiLiveBoardStation**](docs/TRAApiApi.md#traapiliveboardstation) | **GET** /v2/Rail/TRA/LiveBoard/Station/{StationID} | 取得指定[車站]列車即時到離站電子看板(動態前後30分鐘的車次)
*TRAApiApi* | [**tRAApiLiveTrainDelay**](docs/TRAApiApi.md#traapilivetraindelay) | **GET** /v2/Rail/TRA/LiveTrainDelay | 取得列車即時準點/延誤時間資料
*TRAApiApi* | [**tRAApiNetwork**](docs/TRAApiApi.md#traapinetwork) | **GET** /v2/Rail/TRA/Network | 取得臺鐵路網資料
*TRAApiApi* | [**tRAApiODDailyTimetable**](docs/TRAApiApi.md#traapioddailytimetable) | **GET** /v2/Rail/TRA/DailyTimetable/OD/{OriginStationID}/to/{DestinationStationID}/{TrainDate} | 取得指定[日期],[起迄站間]之站間時刻表資料
*TRAApiApi* | [**tRAApiODFareStation**](docs/TRAApiApi.md#traapiodfarestation) | **GET** /v2/Rail/TRA/ODFare/{OriginStationID}/to/{DestinationStationID} | 取得指定[起訖站間]之票價資料
*TRAApiApi* | [**tRAApiShape**](docs/TRAApiApi.md#traapishape) | **GET** /v2/Rail/TRA/Shape | 取得軌道路網實體路線圖資資料
*TRAApiApi* | [**tRAApiStation**](docs/TRAApiApi.md#traapistation) | **GET** /v2/Rail/TRA/Station | 取得車站基本資料
*TRAApiApi* | [**tRAApiStationOfLine**](docs/TRAApiApi.md#traapistationofline) | **GET** /v2/Rail/TRA/StationOfLine | 取得路線車站基本資料
*TRAApiApi* | [**tRAApiStationTimetable**](docs/TRAApiApi.md#traapistationtimetable) | **GET** /v2/Rail/TRA/DailyTimetable/Station/{StationID}/{TrainDate} | 取得指定[日期],[車站]的站別時刻表資料
*TRAApiApi* | [**tRAApiTrainType**](docs/TRAApiApi.md#traapitraintype) | **GET** /v2/Rail/TRA/TrainType | 取得所有列車車種資料
*WebSiteApiApi* | [**webSiteApiNews**](docs/WebSiteApiApi.md#websiteapinews) | **GET** /v2/PTX/Web/News | 取得最新消息


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.MOTCAPIModelsHttpStateModel](docs/MOTCAPIModelsHttpStateModel.md)
 - [org.openapitools.client.models.MOTCAPIModelsWebHook](docs/MOTCAPIModelsWebHook.md)
 - [org.openapitools.client.models.MicrosoftSpatialGeographyLineString](docs/MicrosoftSpatialGeographyLineString.md)
 - [org.openapitools.client.models.MicrosoftSpatialGeographyPoint](docs/MicrosoftSpatialGeographyPoint.md)
 - [org.openapitools.client.models.MicrosoftSpatialGeometryLineString](docs/MicrosoftSpatialGeometryLineString.md)
 - [org.openapitools.client.models.MicrosoftSpatialGeometryPoint](docs/MicrosoftSpatialGeometryPoint.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationActivityTourismInfo](docs/ServiceDTOVersion2ApplicationActivityTourismInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationAirPsiInfo](docs/ServiceDTOVersion2ApplicationAirPsiInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationAirQPERainInfo](docs/ServiceDTOVersion2ApplicationAirQPERainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationAirQPFRainInfo](docs/ServiceDTOVersion2ApplicationAirQPFRainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationHotelTourismInfo](docs/ServiceDTOVersion2ApplicationHotelTourismInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationMETAR](docs/ServiceDTOVersion2ApplicationMETAR.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationRestaurantTourismInfo](docs/ServiceDTOVersion2ApplicationRestaurantTourismInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationScenicSpotTourismInfo](docs/ServiceDTOVersion2ApplicationScenicSpotTourismInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationTHSRPsiInfo](docs/ServiceDTOVersion2ApplicationTHSRPsiInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationTHSRQPERainInfo](docs/ServiceDTOVersion2ApplicationTHSRQPERainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationTHSRQPFRainInfo](docs/ServiceDTOVersion2ApplicationTHSRQPFRainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationTRAPsiInfo](docs/ServiceDTOVersion2ApplicationTRAPsiInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationTRAQPERainInfo](docs/ServiceDTOVersion2ApplicationTRAQPERainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationTRAQPFRainInfo](docs/ServiceDTOVersion2ApplicationTRAQPFRainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2ApplicationTourismPicture](docs/ServiceDTOVersion2ApplicationTourismPicture.md)
 - [org.openapitools.client.models.ServiceDTOVersion2AviationAirline](docs/ServiceDTOVersion2AviationAirline.md)
 - [org.openapitools.client.models.ServiceDTOVersion2AviationAirport](docs/ServiceDTOVersion2AviationAirport.md)
 - [org.openapitools.client.models.ServiceDTOVersion2AviationAirportFIDS](docs/ServiceDTOVersion2AviationAirportFIDS.md)
 - [org.openapitools.client.models.ServiceDTOVersion2AviationCodeShare](docs/ServiceDTOVersion2AviationCodeShare.md)
 - [org.openapitools.client.models.ServiceDTOVersion2AviationFIDS](docs/ServiceDTOVersion2AviationFIDS.md)
 - [org.openapitools.client.models.ServiceDTOVersion2AviationFIDSArrival](docs/ServiceDTOVersion2AviationFIDSArrival.md)
 - [org.openapitools.client.models.ServiceDTOVersion2AviationFIDSDeparture](docs/ServiceDTOVersion2AviationFIDSDeparture.md)
 - [org.openapitools.client.models.ServiceDTOVersion2AviationGeneralFlightSchedule](docs/ServiceDTOVersion2AviationGeneralFlightSchedule.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BaseAuthority](docs/ServiceDTOVersion2BaseAuthority.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BaseFare](docs/ServiceDTOVersion2BaseFare.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BaseFileList](docs/ServiceDTOVersion2BaseFileList.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BaseNameType](docs/ServiceDTOVersion2BaseNameType.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BaseNews](docs/ServiceDTOVersion2BaseNews.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BaseNewsList](docs/ServiceDTOVersion2BaseNewsList.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BaseNotification](docs/ServiceDTOVersion2BaseNotification.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BaseOperator](docs/ServiceDTOVersion2BaseOperator.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BasePointType](docs/ServiceDTOVersion2BasePointType.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BaseProvider](docs/ServiceDTOVersion2BaseProvider.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BaseUpdateNotification](docs/ServiceDTOVersion2BaseUpdateNotification.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BikeBikeAvailability](docs/ServiceDTOVersion2BikeBikeAvailability.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BikeBikeShape](docs/ServiceDTOVersion2BikeBikeShape.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BikeBikeStation](docs/ServiceDTOVersion2BikeBikeStation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusA1Data](docs/ServiceDTOVersion2BusBusA1Data.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusA2Data](docs/ServiceDTOVersion2BusBusA2Data.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusDiffLog](docs/ServiceDTOVersion2BusBusDiffLog.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusDiscountPeriods](docs/ServiceDTOVersion2BusBusDiscountPeriods.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusDisplayStopOfRoute](docs/ServiceDTOVersion2BusBusDisplayStopOfRoute.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusDisplayStopOfRouteVariation](docs/ServiceDTOVersion2BusBusDisplayStopOfRouteVariation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusFare](docs/ServiceDTOVersion2BusBusFare.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusFrequency](docs/ServiceDTOVersion2BusBusFrequency.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusN1EstimateTime](docs/ServiceDTOVersion2BusBusN1EstimateTime.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusNews](docs/ServiceDTOVersion2BusBusNews.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusRoute](docs/ServiceDTOVersion2BusBusRoute.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusRouteFare](docs/ServiceDTOVersion2BusBusRouteFare.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusRouteVariation](docs/ServiceDTOVersion2BusBusRouteVariation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusSchedule](docs/ServiceDTOVersion2BusBusSchedule.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusScheduleVariation](docs/ServiceDTOVersion2BusBusScheduleVariation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusShape](docs/ServiceDTOVersion2BusBusShape.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusShapeVariation](docs/ServiceDTOVersion2BusBusShapeVariation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusStage](docs/ServiceDTOVersion2BusBusStage.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusStageFare](docs/ServiceDTOVersion2BusBusStageFare.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusStation](docs/ServiceDTOVersion2BusBusStation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusStationVariation](docs/ServiceDTOVersion2BusBusStationVariation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusStop](docs/ServiceDTOVersion2BusBusStop.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusStopOfRoute](docs/ServiceDTOVersion2BusBusStopOfRoute.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusStopOfRouteVariation](docs/ServiceDTOVersion2BusBusStopOfRouteVariation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusStopTime](docs/ServiceDTOVersion2BusBusStopTime.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusStopVariation](docs/ServiceDTOVersion2BusBusStopVariation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusSubRoute](docs/ServiceDTOVersion2BusBusSubRoute.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusTimetable](docs/ServiceDTOVersion2BusBusTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusVehicleInfo](docs/ServiceDTOVersion2BusBusVehicleInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusBusVersion](docs/ServiceDTOVersion2BusBusVersion.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusDatePeriod](docs/ServiceDTOVersion2BusDatePeriod.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusRouteOperator](docs/ServiceDTOVersion2BusRouteOperator.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusServiceDay](docs/ServiceDTOVersion2BusServiceDay.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusSpatialBusA1Data](docs/ServiceDTOVersion2BusSpatialBusA1Data.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusSpatialBusShape](docs/ServiceDTOVersion2BusSpatialBusShape.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusSpecialDay](docs/ServiceDTOVersion2BusSpecialDay.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusStationStop](docs/ServiceDTOVersion2BusStationStop.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusStop](docs/ServiceDTOVersion2BusStop.md)
 - [org.openapitools.client.models.ServiceDTOVersion2BusVariation](docs/ServiceDTOVersion2BusVariation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroFacilityDrinkingFountain](docs/ServiceDTOVersion2RailMetroFacilityDrinkingFountain.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroFacilityElevator](docs/ServiceDTOVersion2RailMetroFacilityElevator.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroFacilityInformationSpot](docs/ServiceDTOVersion2RailMetroFacilityInformationSpot.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroFacilityToilet](docs/ServiceDTOVersion2RailMetroFacilityToilet.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroFirstLastTimetable](docs/ServiceDTOVersion2RailMetroFirstLastTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroFrequency](docs/ServiceDTOVersion2RailMetroFrequency.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroLine](docs/ServiceDTOVersion2RailMetroLine.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroLineTransfer](docs/ServiceDTOVersion2RailMetroLineTransfer.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroLiveBoard](docs/ServiceDTOVersion2RailMetroLiveBoard.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroMetroShape](docs/ServiceDTOVersion2RailMetroMetroShape.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroNetwork](docs/ServiceDTOVersion2RailMetroNetwork.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroNetworkSubClassLine](docs/ServiceDTOVersion2RailMetroNetworkSubClassLine.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroODFare](docs/ServiceDTOVersion2RailMetroODFare.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroRoute](docs/ServiceDTOVersion2RailMetroRoute.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroS2STravelTime](docs/ServiceDTOVersion2RailMetroS2STravelTime.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroStation](docs/ServiceDTOVersion2RailMetroStation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroStationExit](docs/ServiceDTOVersion2RailMetroStationExit.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroStationFacility](docs/ServiceDTOVersion2RailMetroStationFacility.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroStationOfLine](docs/ServiceDTOVersion2RailMetroStationOfLine.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroStationOfRoute](docs/ServiceDTOVersion2RailMetroStationOfRoute.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroStationTimeTable](docs/ServiceDTOVersion2RailMetroStationTimeTable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroSubClassFare](docs/ServiceDTOVersion2RailMetroSubClassFare.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroSubClassHeadway](docs/ServiceDTOVersion2RailMetroSubClassHeadway.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroSubClassOperationTime](docs/ServiceDTOVersion2RailMetroSubClassOperationTime.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroSubClassServiceDays](docs/ServiceDTOVersion2RailMetroSubClassServiceDays.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroSubClassSpecialDay](docs/ServiceDTOVersion2RailMetroSubClassSpecialDay.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroSubClassStation](docs/ServiceDTOVersion2RailMetroSubClassStation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroSubClassTimetable](docs/ServiceDTOVersion2RailMetroSubClassTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailMetroSubClassTravelTime](docs/ServiceDTOVersion2RailMetroSubClassTravelTime.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRAlertInfo](docs/ServiceDTOVersion2RailTHSRAlertInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRAvailableSeat](docs/ServiceDTOVersion2RailTHSRAvailableSeat.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRAvailableSeatStatusList](docs/ServiceDTOVersion2RailTHSRAvailableSeatStatusList.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRGeneralTimetable](docs/ServiceDTOVersion2RailTHSRGeneralTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRNews](docs/ServiceDTOVersion2RailTHSRNews.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRRailDailyTimetable](docs/ServiceDTOVersion2RailTHSRRailDailyTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRRailDailyTrainInfo](docs/ServiceDTOVersion2RailTHSRRailDailyTrainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRRailGeneralTimetable](docs/ServiceDTOVersion2RailTHSRRailGeneralTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRRailGeneralTrainInfo](docs/ServiceDTOVersion2RailTHSRRailGeneralTrainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRRailODDailyTimetable](docs/ServiceDTOVersion2RailTHSRRailODDailyTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRRailODFare](docs/ServiceDTOVersion2RailTHSRRailODFare.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRRailStation](docs/ServiceDTOVersion2RailTHSRRailStation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRRailStationTimetable](docs/ServiceDTOVersion2RailTHSRRailStationTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRRailStopTime](docs/ServiceDTOVersion2RailTHSRRailStopTime.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRServiceDay](docs/ServiceDTOVersion2RailTHSRServiceDay.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRStopStation](docs/ServiceDTOVersion2RailTHSRStopStation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRTHSRShape](docs/ServiceDTOVersion2RailTHSRTHSRShape.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTHSRTimeInfoRailDailyTrainInfo](docs/ServiceDTOVersion2RailTHSRTimeInfoRailDailyTrainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRAGeneralTimetable](docs/ServiceDTOVersion2RailTRAGeneralTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRALine](docs/ServiceDTOVersion2RailTRALine.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRALineSimple](docs/ServiceDTOVersion2RailTRALineSimple.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRALineStation](docs/ServiceDTOVersion2RailTRALineStation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRANetwork](docs/ServiceDTOVersion2RailTRANetwork.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRARailDailyTimetable](docs/ServiceDTOVersion2RailTRARailDailyTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRARailDailyTrainInfo](docs/ServiceDTOVersion2RailTRARailDailyTrainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRARailGeneralTimetable](docs/ServiceDTOVersion2RailTRARailGeneralTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRARailGeneralTrainInfo](docs/ServiceDTOVersion2RailTRARailGeneralTrainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRARailLiveBoard](docs/ServiceDTOVersion2RailTRARailLiveBoard.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRARailLiveTrainDelay](docs/ServiceDTOVersion2RailTRARailLiveTrainDelay.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRARailODDailyTimetable](docs/ServiceDTOVersion2RailTRARailODDailyTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRARailODFare](docs/ServiceDTOVersion2RailTRARailODFare.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRARailStation](docs/ServiceDTOVersion2RailTRARailStation.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRARailStationTimetable](docs/ServiceDTOVersion2RailTRARailStationTimetable.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRARailStopTime](docs/ServiceDTOVersion2RailTRARailStopTime.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRAServiceDay](docs/ServiceDTOVersion2RailTRAServiceDay.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRAStationOfLine](docs/ServiceDTOVersion2RailTRAStationOfLine.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRATRAShape](docs/ServiceDTOVersion2RailTRATRAShape.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRATimeInfoRailDailyTrainInfo](docs/ServiceDTOVersion2RailTRATimeInfoRailDailyTrainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRATimeInfoRailGeneralTrainInfo](docs/ServiceDTOVersion2RailTRATimeInfoRailGeneralTrainInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RailTRATrainType](docs/ServiceDTOVersion2RailTRATrainType.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadRoadInfo](docs/ServiceDTOVersion2RoadRoadInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadRoadLive](docs/ServiceDTOVersion2RoadRoadLive.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadRoadThreshold](docs/ServiceDTOVersion2RoadRoadThreshold.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficAVIAVIInfo](docs/ServiceDTOVersion2RoadTrafficAVIAVIInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficAVIAVILive](docs/ServiceDTOVersion2RoadTrafficAVIAVILive.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficAVIAVIPair](docs/ServiceDTOVersion2RoadTrafficAVIAVIPair.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficCCTVCCTVInfo](docs/ServiceDTOVersion2RoadTrafficCCTVCCTVInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficCCTVCCTVLive](docs/ServiceDTOVersion2RoadTrafficCCTVCCTVLive.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficCMSCMSInfo](docs/ServiceDTOVersion2RoadTrafficCMSCMSInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficCMSCMSLive](docs/ServiceDTOVersion2RoadTrafficCMSCMSLive.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficSource](docs/ServiceDTOVersion2RoadTrafficSource.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficVDCars](docs/ServiceDTOVersion2RoadTrafficVDCars.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficVDLanes](docs/ServiceDTOVersion2RoadTrafficVDLanes.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficVDVDInfo](docs/ServiceDTOVersion2RoadTrafficVDVDInfo.md)
 - [org.openapitools.client.models.ServiceDTOVersion2RoadTrafficVDVDLive](docs/ServiceDTOVersion2RoadTrafficVDVDLive.md)
 - [org.openapitools.client.models.ServiceDTOVersion2TaiwanTripBusBusA1Data](docs/ServiceDTOVersion2TaiwanTripBusBusA1Data.md)
 - [org.openapitools.client.models.ServiceDTOVersion2TaiwanTripBusBusA2Data](docs/ServiceDTOVersion2TaiwanTripBusBusA2Data.md)
 - [org.openapitools.client.models.ServiceDTOVersion2TaiwanTripBusBusN1EstimateTime](docs/ServiceDTOVersion2TaiwanTripBusBusN1EstimateTime.md)
 - [org.openapitools.client.models.ServiceDTOVersion2TaiwanTripBusBusRoute](docs/ServiceDTOVersion2TaiwanTripBusBusRoute.md)
 - [org.openapitools.client.models.ServiceDTOVersion2TaiwanTripBusBusSchedule](docs/ServiceDTOVersion2TaiwanTripBusBusSchedule.md)
 - [org.openapitools.client.models.ServiceDTOVersion2TaiwanTripBusBusStopOfRoute](docs/ServiceDTOVersion2TaiwanTripBusBusStopOfRoute.md)
 - [org.openapitools.client.models.SystemIServiceProvider](docs/SystemIServiceProvider.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
