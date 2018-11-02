
# ServiceDTOVersion2RoadTrafficVDLanes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vsrdir** | **kotlin.String** | 偵測車道方向，以 0 和 1 表示。 若為單向車道偵測器，則均以 0 表示； 若為雙向車道偵測器，配合偵測車流方向不同，則 會有 0 和 1 的區別（與偵測器偵測方向同向或與偵 測器設置同側的車輛行駛車道方向，則以 0 表示； 反之，則以 1 表示） |  [optional]
**speed** | **kotlin.String** | 依車道逐一詳列 1 分鐘平均速率偵測值(單位： kph) |  [optional]
**vsrid** | **kotlin.String** | 車道代碼(由內車道而外車道，以阿拉伯數字 0,1,2,3,4,…表示)，若為慢車道仍依內而外自 0,1,… 表示 |  [optional]
**laneOccupy** | **kotlin.String** | 依車道逐一詳列1分鐘 或 5分鐘佔有率偵測值(單位：%) |  [optional]
**cars** | [**kotlin.Array&lt;ServiceDTOVersion2RoadTrafficVDCars&gt;**](ServiceDTOVersion2RoadTrafficVDCars.md) | 不同種類車輛的流量資訊 |  [optional]



