DROP TABLE IF EXISTS jihua;

CREATE TABLE jihua
(
      id STRING ,
    hanghao    STRING,
    xiafajihuamingcheng    STRING,
    xiafafangshi    STRING,
    xiafabumen    STRING,
    xiafasheng    STRING,
    xiafashi    STRING,
    huodongyue    STRING,
    shifouchaijie    STRING,
    chaijiefenshu    STRING,
    xiafariqi    STRING,
    xiafaliang    STRING,
    mingdanleixing    STRING,
    mingdanxiangshu    STRING,
    youxianji    STRING,
      PRIMARY KEY(id)
)
PARTITION BY HASH PARTITIONS 4
STORED AS KUDU
TBLPROPERTIES
(
    'kudu.table_name' = 'jihua',
    'kudu.master_addresses' = 'ZHS-1:7051'
);
