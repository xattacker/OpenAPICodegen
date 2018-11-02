
# ServiceDTOVersion2RailTHSRAlertInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**level** | [**inline**](#LevelEnum) | 動態事件影響等級(本資料僅作參考，實際資料請參考高鐵http://www.thsrc.com.tw/tw/Operation) | 
**status** | **kotlin.String** | 營運狀態 &#x3D; [&#39;空白: 正常&#39; or &#39;▲: 其他的異常狀態&#39; or &#39;X: 全線停止運行&#39;] | 
**title** | **kotlin.String** | 標題 | 
**description** | **kotlin.String** | 事件簡易描述 | 
**effects** | **kotlin.String** | 影響狀態 | 
**direction** | **kotlin.String** | 運行方向 | 
**effectedSection** | **kotlin.String** | 影響區間 | 
**occuredTime** | **kotlin.String** | 發生日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**publishTime** | **kotlin.String** | 訊息發布日期時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 
**updateTime** | **kotlin.String** | 本平台資料更新時間(ISO8601格式:yyyy-MM-ddTHH:mm:sszzz) | 


<a name="LevelEnum"></a>
## Enum: Level
Name | Value
---- | -----
level | 1: 全線正常運行, 2: 有異常狀況



