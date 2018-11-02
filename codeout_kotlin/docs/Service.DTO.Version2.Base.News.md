
# ServiceDTOVersion2BaseNews

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**newsID** | [**java.util.UUID**](java.util.UUID.md) | 最新消息原單位發布代碼 | 
**language** | **kotlin.String** | 語系 | 
**department** | **kotlin.String** | 發布單位 |  [optional]
**title** | **kotlin.String** | 消息標題 |  [optional]
**newsCategory** | [**inline**](#NewsCategoryEnum) | 消息類別 |  [optional]
**description** | **kotlin.String** | 內容描述 | 
**newsURL** | **kotlin.String** | 報導網站連結 |  [optional]
**attachmentURL** | **kotlin.String** | 相關網站連結 |  [optional]
**publishTime** | **kotlin.String** | 消息公告日期時間 |  [optional]
**startTime** | **kotlin.String** | 開始時間 |  [optional]
**endTime** | **kotlin.String** | 結束時間 |  [optional]
**updateTime** | **kotlin.String** | 消息更新時間 |  [optional]


<a name="NewsCategoryEnum"></a>
## Enum: NewsCategory
Name | Value
---- | -----
newsCategory | 1: 最新消息, 2: 新聞稿, 3: 營運資訊, 4: 轉乘資訊, 5: 活動訊息, 6: 系統公告, 7: 新服務上架, 8: API修正, 9: 來源異常, 99: 其他



