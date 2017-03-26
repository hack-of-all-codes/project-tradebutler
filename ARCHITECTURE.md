# System Architecture

#### Version 0.1:
```
Alfred
- master data storage
- stores the following data: Stocks, StockPrice


Bautista
- harvests master data from the Phisix Server
- possibly illegal **wink**
- receives mining commands from a Messaging Queue (Kafka)
- as of the moment, just manually send Messages to test functionality

+------------+
| PostgreSQL |
+------------+
      ↑
  Spring Data
      ↑
+--------------------+          +------------------------------------+          +---------------+
| Data Core (Alfred) | ← REST ← |  Data Miner[Phisix API] (Bautista) | → REST → | PHISIX SERVER |
+--------------------+          +------------------------------------+          +---------------+
                                                   ↑
                                             Spring Integration
                                                   ↑
                                              +---------+
                                              |  Kafka  |
                                              +---------+
```

###### For Reference:
```
← ↑ → ↓ ↔ ↕ ↖ ↗ ↘ ↙
```
