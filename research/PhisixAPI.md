# Phisix API
http://www.pse.com.ph/stockMarket/home.html

## List Securities/Company
```
POST
http://www.pse.com.ph/stockMarket/companyInfoSecurityProfile.html?method=getListedRecords&common=yes&ajax=true
```

###### Request:
```
Query Params:
method:getListedRecords
common:yes
ajax:true

Form Params:
start:25
limit:25
company:
sector:
subsector:
listingDate:
```

###### Response:
```json
{  
   "count":25,
   "totalCount":318,
   "records":[  
      {  
         "securityStatus":"O",
         "listingDate":"1996-03-19 00:00:00.0",
         "securityType":"S",
         "subsectorName":"9",
         "indexName":"",
         "securitySymbol":"ALCO",
         "securityName":"ARTHALAND CORPORATION",
         "companyId":"172",
         "companyName":"Arthaland Corporation",
         "securitySymbolId":"316"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1997-01-06 00:00:00.0",
         "securityType":"S",
         "subsectorName":"2",
         "indexName":"",
         "securitySymbol":"BLFI",
         "securityName":"BDO LEASING & FINANCE, INC.",
         "companyId":"31",
         "companyName":"BDO Leasing and Finance, Inc.",
         "securitySymbolId":"121"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1950-09-28 00:00:00.0",
         "securityType":"S",
         "subsectorName":"4",
         "indexName":"",
         "securitySymbol":"BMM",
         "securityName":"BOGO-MEDELLIN MILLING COMPANY",
         "companyId":"181",
         "companyName":"Bogo-Medellin Milling Company, Inc.",
         "securitySymbolId":"359"
      }
   ]
}
```

## Search Securities/Company
```
POST
http://www.pse.com.ph/stockMarket/home.html?method=findSecurityOrCompany&ajax=true
```

###### Request:
```
Query Params:
method:findSecurityOrCompany
ajax:true

Form Params:
start:0
limit:6
query:bdo
```
###### Response:
```json
{  
   "count":1,
   "totalCount":1,
   "records":[  
      {  
         "securityStatus":"O",
         "listedCompany_companyId":"260",
         "symbol":"BDO",
         "listedCompany_companyName":"BDO Unibank, Inc.",
         "securityId":"468",
         "securityName":"BDO UNIBANK, INC."
      }
   ]
}
```

## Company Info: Dividend Rights
```
POST
http://www.pse.com.ph/stockMarket/dividendRights.html?method=getDividends&ajax=true
```

###### Request:
```
Query Params:
method:getDividends
ajax:true

Form Params:
start:0
limit:5
secid:165
```

###### Response:
```json
{  
   "count":5,
   "totalCount":9,
   "records":[  
      {  
         "dividendType":"PROPERTY",
         "securityID":"165",
         "disclosureNo":"7730-2013",
         "dividendId":"PSE_DVDND20130000150",
         "dividendValue":"240,196,000 common shares of stock of Top Frontier Investment Holdings, Inc. (\"Top Frontier\")",
         "companyName":"San Miguel Corporation",
         "exDividendDate":"2013-10-30 00:00:00.0",
         "disclosureLocation":"/resource/disclosures/2013/pdf/dc2013-7730_SMC.pdf",
         "recordDate":"2013-11-05 00:00:00.0",
         "securitySymbol":"SMC",
         "disclosureID":"PSE_DSCLR20130009186",
         "securityName":"SAN MIGUEL CORPORATION",
         "companyId":"154"
      },
      {  
         "dividendType":"CASH",
         "securityID":"165",
         "disclosureNo":"4849-2013",
         "dividendId":"PSE_DVDND20130000071",
         "dividendValue":"P0.35 per common share",
         "companyName":"San Miguel Corporation",
         "exDividendDate":"2013-06-25 00:00:00.0",
         "disclosureLocation":"/resource/disclosures/2013/pdf/dc2013-4849_SMC.pdf",
         "recordDate":"2013-06-28 00:00:00.0",
         "disclosureID":"PSE_DSCLR20130006042",
         "securitySymbol":"SMC",
         "securityName":"SAN MIGUEL CORPORATION",
         "companyId":"154",
         "datePayable":"2013-07-15 00:00:00.0"
      },
      {  
         "dividendType":"CASH",
         "securityID":"165",
         "disclosureNo":"2879-2013",
         "dividendId":"PSE_DVDND2012022780",
         "dividendValue":"P0.35 per common share",
         "companyName":"San Miguel Corporation",
         "exDividendDate":"2013-04-23 00:00:00.0",
         "disclosureLocation":"/resource/disclosures/2013/pdf/dc2013-2879_SMC.pdf",
         "recordDate":"2013-04-26 00:00:00.0",
         "disclosureID":"PSE_DSCLR20130003693",
         "securitySymbol":"SMC",
         "securityName":"SAN MIGUEL CORPORATION",
         "companyId":"154",
         "datePayable":"2013-05-06 00:00:00.0"
      }
   ]
}
```

## Company Info: Fetch Headers
```
POST
http://www.pse.com.ph/stockMarket/companyInfo.html?method=fetchHeaderData&ajax=true
```

###### Request:
```
Query Params:
method:fetchHeaderData
ajax:true

Form Params:
company:154
security:165
```

###### Response:
```json
{  
   "count":1,
   "records":[  
      {  
         "headerSqLow":"103.0000000000",
         "headerFiftyTwoWeekHigh":"108.0000000000",
         "headerChangeClose":"-0.4000000000",
         "headerChangeClosePercChangeClose":"",
         "lastTradedDate":"2017-03-23 00:00:00.0",
         "headerTotalValue":"38,322,707.0000000000",
         "headerLastTradePrice":"104.0000000000",
         "headerSqHigh":"104.2000000000",
         "headerPercChangeClose":"-0.3831400000",
         "headerFiftyTwoWeekLow":"65.0000000000",
         "headerSqPrevious":"104.4000000000",
         "securitySymbol":"SMC",
         "headerCurrentPe":"41.1067193676",
         "headerSqOpen":"103.0000000000",
         "headerAvgPrice":"103.1816779301",
         "headerTotalVolume":"371,410.0000000000"
      }
   ]
}
```

## Company Info: Year Totals
```
POST
http://www.pse.com.ph/stockMarket/companyInfoSecurityInformation.html?method=getSecurityYearTotals&ajax=true
```

###### Request:
```
Query Params:
method:getSecurityYearTotals
ajax:true

Form Params:
security:468
```

###### Response:
```json
{  
   "count":7,
   "records":[  
      {  
         "valueTotal":6.5072100467509E10,
         "yearTotal":2016,
         "volumeTotal":6.09120401E8
      },
      {  
         "valueTotal":9.19579048577054E10,
         "yearTotal":2015,
         "volumeTotal":8.5895736E8
      },
      {  
         "valueTotal":1.002656749149182E11,
         "yearTotal":2014,
         "volumeTotal":1.100479842E9
      },
      {  
         "valueTotal":8.43445937861725E10,
         "yearTotal":2013,
         "volumeTotal":1.022895439E9
      },
      {  
         "valueTotal":5.746559362491E10,
         "yearTotal":2012,
         "volumeTotal":8.80561756E8
      },
      {  
         "valueTotal":3.770580104318E10,
         "yearTotal":2011,
         "volumeTotal":6.72513769E8
      },
      {  
         "valueTotal":3.2976476110758E10,
         "yearTotal":2010,
         "volumeTotal":6.76411464E8
      }
   ]
}
```

## Others: Security Type
```
GET
http://www.pse.com.ph/stockMarket/companyInfoSecurityProfile.html?method=getSecurityTypes&ajax=true&_dc=1490519319702
```

###### Request:
```
Query Params:
method:getSecurityTypes
ajax:true
```

###### Response:
```json
{  
   "count":7,
   "records":[  
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Common",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"S"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Warrants",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"W"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Mutual Fund",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"M"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Preferred",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"P"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Government Bond",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"G"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Common Dollar",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"D"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Philippine Deposit Receipts",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"R"
      }
   ]
}
```

## Others: Sector
```
GET
http://www.pse.com.ph/stockMarket/companyInfoSecurityProfile.html?method=getSectors&ajax=true&_dc=1490519319799
```

###### Request
```
Query Params:
method:getSectors
ajax:true
```

###### Response
```json
{  
   "count":10,
   "records":[  
      {  
         "indexId":"PSE_MKTIN20080000001",
         "isSectoral":"Y",
         "sortOrder":2,
         "indexName":"All Shares",
         "indexAbb":"ALL"
      },
      {  
         "indexId":"PSE_MKTIN20080000002",
         "isSectoral":"N",
         "sortOrder":1,
         "indexName":"PSEi",
         "indexAbb":"PSE"
      },
      {  
         "indexId":"PSE_MKTIN20080000003",
         "isSectoral":"Y",
         "sortOrder":3,
         "indexName":"Financials",
         "indexAbb":"FIN"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "isSectoral":"Y",
         "sortOrder":4,
         "indexName":"Industrial",
         "indexAbb":"IND"
      },
      {  
         "indexId":"PSE_MKTIN20080000004",
         "isSectoral":"Y",
         "sortOrder":5,
         "indexName":"Holding Firms",
         "indexAbb":"HDG"
      },
      {  
         "indexId":"PSE_MKTIN20080000007",
         "isSectoral":"Y",
         "sortOrder":7,
         "indexName":"Mining and Oil",
         "indexAbb":"M-O"
      },
      {  
         "indexId":"PSE_MKTIN20080000005",
         "isSectoral":"Y",
         "sortOrder":8,
         "indexName":"Property",
         "indexAbb":"PRO"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "isSectoral":"Y",
         "sortOrder":6,
         "indexName":"Services",
         "indexAbb":"SVC"
      },
      {  
         "indexId":"PSE_MKTIN20080000009",
         "isSectoral":"Y",
         "sortOrder":9,
         "indexName":"SME",
         "indexAbb":"SME"
      },
      {  
         "indexId":"PSE_MKTIN20080000010",
         "isSectoral":"Y",
         "sortOrder":9,
         "indexName":"ETF Equity",
         "indexAbb":"ETF"
      }
   ]
}
```

## Others: Sub-sector
```
GET
http://www.pse.com.ph/stockMarket/companyInfoSecurityProfile.html?method=getSubsectors&ajax=true&_dc=1490519319900
```

###### Request
```
Query Params:
method:getSubsectors
ajax:true
```

###### Response
```json
{  
   "count":27,
   "records":[  
      {  
         "indexId":"PSE_MKTIN20080000003",
         "subsectorName":"Banks",
         "subsectorID":"1"
      },
      {  
         "indexId":"PSE_MKTIN20080000003",
         "subsectorName":"Other Financial Institutions",
         "subsectorID":"2"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Electricity, Energy, Power & Water",
         "subsectorID":"3"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Food, Beverage & Tobacco",
         "subsectorID":"4"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Construction, Infra. & Allied Services",
         "subsectorID":"5"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Chemicals",
         "subsectorID":"6"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Other Industrials",
         "subsectorID":"7"
      },
      {  
         "indexId":"PSE_MKTIN20080000004",
         "subsectorName":"Holding Firms",
         "subsectorID":"8"
      },
      {  
         "indexId":"PSE_MKTIN20080000005",
         "subsectorName":"Property",
         "subsectorID":"9"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Media",
         "subsectorID":"10"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Telecommunications",
         "subsectorID":"11"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Information Technology",
         "subsectorID":"12"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Transportation Services",
         "subsectorID":"13"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Hotel & Leisure",
         "subsectorID":"14"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Education",
         "subsectorID":"15"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Other Services",
         "subsectorID":"16"
      },
      {  
         "indexId":"PSE_MKTIN20080000007",
         "subsectorName":"Mining",
         "subsectorID":"17"
      },
      {  
         "indexId":"PSE_MKTIN20080000007",
         "subsectorName":"Oil",
         "subsectorID":"18"
      },
      {  
         "subsectorName":"Preferred",
         "subsectorID":"19"
      },
      {  
         "subsectorName":"Warrants, Phil. Deposit Receipts, etc.",
         "subsectorID":"20"
      },
      {  
         "indexId":"PSE_MKTIN20080000009",
         "subsectorName":"Small, Medium & Emerging Board",
         "subsectorID":"21"
      },
      {  
         "subsectorName":"Bonds",
         "subsectorID":"22"
      },
      {  
         "subsectorName":"Dollar Denominated Trading",
         "subsectorID":"23"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Electrical Components & Equipment",
         "subsectorID":"24"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Casinos & Gaming",
         "subsectorID":"25"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Retail",
         "subsectorID":"26"
      },
      {  
         "indexId":"PSE_MKTIN20080000010",
         "subsectorName":"ETF-Equity",
         "subsectorID":"27"
      }
   ]
}
```
