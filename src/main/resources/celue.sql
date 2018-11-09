DROP TABLE IF EXISTS celue;

CREATE TABLE celue
(
    id  STRING,
    hanghao  STRING,
    xiafaceluemingcheng  STRING,
    xiafashi  STRING,
    xiafabumen  STRING,
    xiafasheng  STRING,
    xiafajigou  STRING,
    guishujigou  STRING,
    huodongyue  STRING,
    xiafaliang  STRING,
    mingdanleixing  STRING,
    mingdanxiangshu  STRING,
    shujuguishusheng  STRING,
    shujuguishushi  STRING,
    dingshiqi  STRING,
    youxiaoqijiezhi  STRING,
    youxianji  STRING,
    youxiaoqiqishi  STRING,
    xiafajileiliang  STRING,
      PRIMARY KEY(id)
)
PARTITION BY HASH PARTITIONS 4
STORED AS KUDU
TBLPROPERTIES
(
    'kudu.table_name' = 'celue',
    'kudu.master_addresses' = 'ZHS-1:7051'
);
