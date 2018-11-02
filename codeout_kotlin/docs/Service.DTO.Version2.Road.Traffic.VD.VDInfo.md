
# ServiceDTOVersion2RoadTrafficVDVDInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VDID** | **kotlin.String** | 設備代碼(營運業者代碼+設備原編號) | 
**sourceID** | **kotlin.String** | 營運業者代碼 | 
**routeID** | **kotlin.String** | 對應到該路段編碼(營運業者代碼+路段原編碼) |  [optional]
**roadSection** | **kotlin.String** | 路段文字描述 |  [optional]
**localtionPath** | **kotlin.String** | 路段(Link)所屬 Location Path ID |  [optional]
**startLocaltionPoint** | **kotlin.String** | 路段(Link)起點 Location Point ID |  [optional]
**endLocaltionPoint** | **kotlin.String** | 路段(Link)迄點 Location Point ID |  [optional]
**roadWay** | **kotlin.String** | 車輛偵測器可以偵測到的車道方向 |  [optional]
**vsrnum** | **kotlin.String** | 所在路段 VD 偵測之總車道數 |  [optional]
**vdType** | **kotlin.String** | VD 類別(1.線圈式、2.微波式、3.影像式、4.紅外線、 5.超音波、6.其它 |  [optional]
**locationType** | **kotlin.String** | 設置地點及說明，填寫格式為[設置地點代號]，設置地點代號：1.高快速公路 主線、2.高快速公路匝道、3.其它道路路段中、4. 其它道路路口 |  [optional]
**px** | **kotlin.String** | 設備架設位置 X 坐標(坐標系統為 WGS84) |  [optional]
**py** | **kotlin.String** | 設備架設位置 Y 坐標(坐標系統為 WGS84) |  [optional]
**srcUpdateTime** | **kotlin.String** | 來源端平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]
**updateTime** | **kotlin.String** | 資料更新日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) |  [optional]



