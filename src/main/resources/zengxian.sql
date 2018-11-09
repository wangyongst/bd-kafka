DROP TABLE IF EXISTS zengxian;

CREATE TABLE zengxian
(
      id STRING ,
      transno   STRING,
      serviceid   STRING,
      partners   STRING,
      channel   STRING,
      theme   STRING,
      name   STRING,
      phone   STRING,
      sex   STRING,
      birth   STRING,
      idtype   STRING,
      idno   STRING,
      dataprovince   STRING,
      datacity   STRING,
      caddress   STRING,
      datacounty   STRING,
      sendlatestprd   STRING,
      sendlatestdate   STRING,
      czipcode   STRING,
      relationship   STRING,
      str1   STRING,
      str2   STRING,
      str3   STRING,
      str4   STRING,
      str5   STRING,
      str6   STRING,
      str7   STRING,
      str8   STRING,
      str9   STRING,
      str10   STRING,
      str11   STRING,
      str12   STRING,
      str13   STRING,
      str14   STRING,
      str15   STRING,
      str16   STRING,
      str17   STRING,
      str18   STRING,
      str19   STRING,
      str20   STRING,
      str21   STRING,
      str22   STRING,
      str23   STRING,
      str24   STRING,
      str25   STRING,
      str26   STRING,
      str27   STRING,
      str28   STRING,
      str29   STRING,
      str30   STRING,
      PRIMARY KEY(id)
)
PARTITION BY HASH PARTITIONS 4
STORED AS KUDU
TBLPROPERTIES
(
    'kudu.table_name' = 'zengxian',
    'kudu.master_addresses' = 'ZHS-1:7051'
);
