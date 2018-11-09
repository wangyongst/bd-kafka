DROP TABLE IF EXISTS xiuzheng;

CREATE TABLE xiuzheng
(
      id STRING ,
     xingming STRING ,
shoujihaoma STRING ,
hanghao STRING ,
      PRIMARY KEY(id)
)
PARTITION BY HASH PARTITIONS 4
STORED AS KUDU
TBLPROPERTIES
(
    'kudu.table_name' = 'xiuzheng',
    'kudu.master_addresses' = 'ZHS-1:7051'
);
