
# ServiceDTOVersion2BusBusFare

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fareName** | **kotlin.String** | 票價名稱 |  [optional]
**ticketType** | [**inline**](#TicketTypeEnum) | 票種類型 | 
**fareClass** | [**inline**](#FareClassEnum) | 費率等級 | 
**price** | **kotlin.Int** | 計費價格(新臺幣) | 
**discountPeriods** | [**kotlin.Array&lt;ServiceDTOVersion2BusBusDiscountPeriods&gt;**](ServiceDTOVersion2BusBusDiscountPeriods.md) | 優惠時段 |  [optional]


<a name="TicketTypeEnum"></a>
## Enum: TicketType
Name | Value
---- | -----
ticketType | 1: 一般票, 2: 來回票, 3: 電子票證, 4: 回數票, 5: 定期票30天期, 6: 定期票60天期, 7: 早鳥票, 8: 定期票90天期


<a name="FareClassEnum"></a>
## Enum: FareClass
Name | Value
---- | -----
fareClass | 1: 成人, 2: 學生, 3: 孩童, 4: 敬老, 5: 愛心, 6: 愛心孩童, 7: 愛心優待或愛心陪伴, 8: 團體, 9: 軍警, 10: 由各運業者自行定義的半票



