# OpenAPICodegen

一個可自動剖析 swagger open API yaml 文件並產出對應各種程式語言 call API 的 code gen project

project forked from:
https://github.com/OpenAPITools/openapi-generator

此專案改用 IDE eclipse 開啟, 並提供透過 Ant 方式封裝 jar 檔

目前主要針對 kotlin client 以及 swift4 的 mustache template 檔案內容進行過調整
(以上兩程式語言用於 App 端開發)

### How to use:

``` 
command for swift:
java -jar openapi-generator-cli.jar generate -i http://ptx.transportdata.tw/MOTC/API/Main/docs/v2 -g swift4 -o codeout_swift

command for kotlin:
java -jar openapi-generator-cli.jar generate -g kotlin -i http://ptx.transportdata.tw/MOTC/API/Main/docs/v2 -o codeout_kotlin

``` 

### How to include code generated API:
``` 
iOS project:
use cocoapod liculde 'Alamofire'

android project:
gradle dependencies add
    implementation 'com.squareup.moshi:moshi:1.7.0'
    implementation 'com.squareup.moshi:moshi-adapters:1.7.0'
    kapt "com.squareup.moshi:moshi-kotlin-codegen:1.6.0"
    implementation 'com.squareup.moshi:moshi-kotlin:1.7.0'
    implementation 'org.threeten:threetenbp:1.3.6'

``` 
