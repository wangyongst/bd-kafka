DROP TABLE IF EXISTS xiaoshou;

CREATE TABLE xiaoshou
(
      id STRING ,
         hanghao   STRING,
   shujuguishujigou   STRING,
   shujuguishusheng   STRING,
   shujuguishushi   STRING,
   mingdanleixing   STRING,
   mingdanxiangshu   STRING,
   shoujihaoma   STRING,
   xingming   STRING,
   xingbie   STRING,
   shengri   STRING,
   nianling   STRING,
   shujulaiyuan   STRING,
   yewumoshi   STRING,
   fugaileixing   STRING,
   beizhu   STRING,
      PRIMARY KEY(id)
)
PARTITION BY HASH PARTITIONS 4
STORED AS KUDU
TBLPROPERTIES
(
    'kudu.table_name' = 'xiaoshou',
    'kudu.master_addresses' = 'ZHS-1:7051'
);
