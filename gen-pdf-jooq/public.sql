/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : PostgreSQL
 Source Server Version : 100006
 Source Host           : localhost:5432
 Source Catalog        : postgres
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 100006
 File Encoding         : 65001

 Date: 06/12/2018 09:09:36
*/


-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS "public"."commodity";
CREATE TABLE "public"."commodity" (
  "id" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "category" varchar(255) COLLATE "pg_catalog"."default",
  "subcategory" varchar(255) COLLATE "pg_catalog"."default",
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "unit" varchar(255) COLLATE "pg_catalog"."default",
  "price" varchar(255) COLLATE "pg_catalog"."default",
  "remark" varchar(255) COLLATE "pg_catalog"."default",
  "subname" varchar(255) COLLATE "pg_catalog"."default",
  "col8" varchar(255) COLLATE "pg_catalog"."default",
  "col9" varchar(255) COLLATE "pg_catalog"."default",
  "col10" varchar(255) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO "public"."commodity" VALUES ('954c5bf4-75b5-4c16-8fd7-8ed90b728890', '征收集体土地青苗补偿费标准', '大春', NULL, NULL, '130000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('5ab37ea8-a228-4a84-a1cb-d5862d6544e0', '征收集体土地青苗补偿费标准', '小春', NULL, NULL, '120000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('c7f50b5f-d94f-4703-a0ec-5e9590a1ba24', '征收集体土地青苗补偿费标准', '其他作物', NULL, NULL, '120000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('24448e0e-6ea9-4d6f-94d4-afde4c1a1340', '征收集体土地建筑物及其它构筑物补偿标准', '框架结构', NULL, '元/平方米', '80000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('66d4510b-f4c0-4a63-a2d4-f3b3224026d4', '征收集体土地建筑物及其它构筑物补偿标准', '砖混结构', NULL, '元/平方米', '68000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('4bf50a42-6946-4973-81ac-a0a4f1198e18', '征收集体土地建筑物及其它构筑物补偿标准', '砖木结构', NULL, '元/平方米', '55000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('4a3491a3-39dc-43e1-9629-94e3551ed117', '征收集体土地建筑物及其它构筑物补偿标准', '土木、木结构', NULL, '元/平方米', '48000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('56ef7a3d-0edc-4cba-8449-85abda4a34bd', '征收集体土地建筑物及其它构筑物补偿标准', '砖纤结构', NULL, '元/平方米', '30000', '含彩钢、牛毛毡、阳光板、石棉瓦、玻纤等', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('ffbf8104-7e93-4fe2-9eeb-b47a4980fc7f', '征收集体土地建筑物及其它构筑物补偿标准', '简易结构', NULL, '元/平方米', '15000', '只作补偿，不列入建筑面积或土地使用权面积', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('f64c4fdd-91e7-4a7e-800d-c4dfe956bd61', '征收集体土地建筑物及其它构筑物补偿标准', '经营性用房', NULL, '', '0', '依据房屋主体结构的补偿标准再增加0.5倍计算', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('2f050c41-b013-4dbc-b191-f0e1aaf0912e', '征收集体土地建筑物及其它构筑物补偿标准', '搬家费', NULL, '户', '200000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('aa0ee40b-bd4c-44d5-97c5-4f914b3ce2a7', '征收集体土地建筑物及其它构筑物补偿标准', '临时过渡费', NULL, '元/平方米·月', '400', '自房屋腾空之日起，每户临时过渡期为10个月，临时过渡费为：10×4×房屋合法建筑面积。房屋产权调换安置不给过渡费。临时过渡期超出半年的，过渡费增加0.5倍，超出一年的过渡费增加1倍。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('d9dde03f-a39c-455f-9a53-0f6ff96e818b', '征收集体土地构筑物、附属设施补偿标准', '盆', '不锈钢淘菜盆', '个', '20000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('0040cdf6-ee31-447e-a6f9-22c98d11f5f2', '征收集体土地构筑物、附属设施补偿标准', '盆', '砖砌淘菜盆', '个', '10000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('b234ebcc-47a3-434a-b8eb-de71faa96a0d', '征收集体土地构筑物、附属设施补偿标准', '盆', '大瓷浴盆', '个', '50000', '1.2米×0.5米', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('160a88c6-69b3-406d-ab2b-c286212d6287', '征收集体土地构筑物、附属设施补偿标准', '盆', '大瓷浴盆', '个', '35000', '1.2米×0.5米以下', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('61bccba1-5861-462c-88be-edb293c76caf', '征收集体土地构筑物、附属设施补偿标准', '盆', '喷式大浴缸', '个', '100000', '自带喷头，玻璃制品', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('147c1284-0c2b-4751-a542-5c39d5ade77d', '征收集体土地构筑物、附属设施补偿标准', '灯', '吸顶灯', '盏', '5000', '含灯头、电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('1396d12b-9d5e-43f8-9f84-5a62f85f27d6', '征收集体土地构筑物、附属设施补偿标准', '灯', '电灯头', '个', '1200', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('c4f81e5e-f000-4df2-ad10-d6a6c04253fd', '征收集体土地构筑物、附属设施补偿标准', '灯', '日光灯', '个', '1500', '15瓦含灯头、电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('b1e828c4-507a-4c64-8577-be3855256709', '征收集体土地构筑物、附属设施补偿标准', '灯', '日光灯', '个', '2000', '20瓦含灯头、电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('2df75379-8de1-4b82-b358-342feb90c679', '征收集体土地构筑物、附属设施补偿标准', '灯', '日光灯', '个', '2500', '30瓦含灯头、电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('31430d52-4410-4704-abdb-460bc4072ad5', '征收集体土地构筑物、附属设施补偿标准', '灯', '日光灯', '个', '3000', '40瓦含灯头、电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('581b0fcf-f202-4685-8ba9-58255961434c', '征收集体土地构筑物、附属设施补偿标准', '灯', '节能日光灯', '个', '4000', '含灯头、电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('fa3950de-f209-44bb-be1d-39d76c89f42c', '征收集体土地构筑物、附属设施补偿标准', '灯', '双头壁灯', '盏', '5000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('51e10038-13f1-4003-afcd-67f79c8171f1', '征收集体土地构筑物、附属设施补偿标准', '灯', '吊灯', '盏', '50000', '24灯头、含电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('95dde4df-5fa8-4748-860b-f830674d1406', '征收集体土地构筑物、附属设施补偿标准', '灯', '吊灯', '盏', '45000', '16灯头、含电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('dff70a8f-b365-4b3e-b60d-8e515a23db99', '征收集体土地构筑物、附属设施补偿标准', '灯', '吊灯', '盏', '40000', '12灯头、含电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('47f7d09e-a939-4737-9a3b-834ffd1adcb6', '征收集体土地构筑物、附属设施补偿标准', '灯', '吊灯', '盏', '35000', '8灯头、含电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('b9bc6292-bc74-48ef-b807-7129f607fffe', '征收集体土地构筑物、附属设施补偿标准', '灯', '吊灯', '盏', '30000', '6灯头、含电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('60669f95-497d-4b20-a102-73be1f3759d0', '征收集体土地构筑物、附属设施补偿标准', '灯', '射灯', '盏', '2000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('0fe2afbf-8fef-4121-89ed-c7e5cbf90467', '征收集体土地构筑物、附属设施补偿标准', '灯', '伸降灯', '盏', '3500', '含电线', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('b8f00861-3cad-4682-af5d-8edbdd3e270c', '征收集体土地构筑物、附属设施补偿标准', '卫浴', '浴霸', '套', '30000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('019c6bac-aecd-4358-894a-f4c44b5f0bd6', '征收集体土地构筑物、附属设施补偿标准', '卫浴', '抽水马桶', '套', '35000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('6d3e8715-fb76-4fe8-9141-29ae6521c3ff', '征收集体土地构筑物、附属设施补偿标准', '卫浴', '便盆', '套', '8000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('6a46cf8a-c364-47ab-b7ff-fbb88383ec10', '征收集体土地构筑物、附属设施补偿标准', '卫浴', '便盆水箱', '个', '6000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('eda46264-9edd-4b1a-a6af-4af83dff8d3e', '征收集体土地构筑物、附属设施补偿标准', '插座', '', '个', '2000', '五孔以上', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('cc85dea0-bb83-4079-8e0f-ccfe6792cbd6', '征收集体土地构筑物、附属设施补偿标准', '插座', '', '个', '800', '五孔以下', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('b7b4619a-0b16-409b-afeb-ccd64a12fe5e', '征收集体土地构筑物、附属设施补偿标准', '开关', '', '个', '1000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('954be9aa-8f44-49a0-89af-4b3bd0282890', '征收集体土地构筑物、附属设施补偿标准', '水、电闸阀', '', '个', '2000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('aaf09f95-5b3f-407e-ac4e-279030cf3e89', '征收集体土地构筑物、附属设施补偿标准', '空气开关', '', '个', '3000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('790c7bda-8dff-4660-ad39-dd47b2dd9900', '征收集体土地构筑物、附属设施补偿标准', '电表', '开户', '个', '50000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('23ead707-5ed6-48fe-901d-d72a0006b353', '征收集体土地构筑物、附属设施补偿标准', '电表', '未开户', '个', '5000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('5216bcf3-02eb-4b61-9e1f-4b1a8d31876f', '征收集体土地构筑物、附属设施补偿标准', '防护栏', '10#元钢', '平方米', '5000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('eb52d792-9ee0-4035-905b-f94b8cfbef4c', '征收集体土地构筑物、附属设施补偿标准', '防护栏', '12#元钢', '平方米', '6000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('5704adc6-4291-44c2-be88-ffdc62f4a9f7', '征收集体土地构筑物、附属设施补偿标准', '防护栏', '14#元钢', '平方米', '7000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('de7a15aa-4730-477d-a05c-99b8932d380d', '征收集体土地构筑物、附属设施补偿标准', '防护栏', '不锈钢防护栏', '平方米', '12000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('6378b736-ea3e-4336-bc88-65856584cd1a', '征收集体土地构筑物、附属设施补偿标准', '顶棚（吊顶）', '档席、纸合板、塑编条', '平方米', '1000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('ade8a53d-459c-419d-95d9-61ed2140144a', '征收集体土地构筑物、附属设施补偿标准', '顶棚（吊顶）', '三合板', '平方米', '2000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('edb0da33-68e1-4666-8cb5-9c5c35c36fab', '征收集体土地构筑物、附属设施补偿标准', '顶棚（吊顶）', '竹胶、纤维板、柚木、保丽板', '平方米', '3000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('aeee804e-7514-47af-a354-d61c5c1020f5', '征收集体土地构筑物、附属设施补偿标准', '顶棚（吊顶）', '石膏板', '平方米', '3000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('1e6cbef3-2716-44bb-97ed-c253a89dda8f', '征收集体土地构筑物、附属设施补偿标准', '顶棚（吊顶）', '铝、塑胶板', '平方米', '6000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('5f4a78d2-8857-41ed-8f45-c7f83483ea35', '征收集体土地构筑物、附属设施补偿标准', '顶棚（吊顶）', '石膏装饰条', '米', '1500', '天花板边角装饰', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('960969db-52a2-4dc6-b524-9248de29dd05', '征收集体土地构筑物、附属设施补偿标准', '顶棚（吊顶）', '柚木板', '米', '2000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('3fc4a6cd-b62f-404a-a388-c19b9ed7296f', '征收集体土地构筑物、附属设施补偿标准', '窗', '普通纱窗', '平方米', '500', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('7cafbd9d-e181-4b9d-a098-bf76c0ce23e0', '征收集体土地构筑物、附属设施补偿标准', '窗', '铝合金活动纱窗', '平方米', '4000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('7ebee301-73cf-4614-b229-0679ada7603e', '征收集体土地构筑物、附属设施补偿标准', '窗', '铝合金普通窗', '平方米', '15000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('4a3279b0-c7f6-4963-aea3-22de7e03f20c', '征收集体土地构筑物、附属设施补偿标准', '窗', '铝合金硬材窗', '平方米', '18000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('34812773-d3ee-497f-bf11-3908ee6570ae', '征收集体土地构筑物、附属设施补偿标准', '窗', '木格窗', '平方米', '5000', '窗户不带钢筋', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('cd51fcd4-c56a-49fc-9deb-88ad7fc8c765', '征收集体土地构筑物、附属设施补偿标准', '窗', '钢筋窗', '平方米', '7000', '木窗带钢筋', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('9cc6e55c-cc52-4f2d-9862-316bfca3d9c2', '征收集体土地构筑物、附属设施补偿标准', '窗', '塑钢窗', '平方米', '20000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('1db6884f-287f-4b22-ad33-648f4a91e2d2', '征收集体土地构筑物、附属设施补偿标准', '门', '卷帘门', '平方米', '6000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('7782f13d-9f70-4180-93f4-37296de648c2', '征收集体土地构筑物、附属设施补偿标准', '门', '双层防盗门', '道', '100000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('e28f894c-fe46-4818-b1e7-68b0a026385e', '征收集体土地构筑物、附属设施补偿标准', '门', '防盗门', '道', '50000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('8f6d5b62-28e3-4758-8124-eb20426de72c', '征收集体土地构筑物、附属设施补偿标准', '门', '普通元钢铁门', '道', '30000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('218ccd14-1379-47a9-9437-56ac3517786b', '征收集体土地构筑物、附属设施补偿标准', '门', '铝合金、塑钢门', '道', '20000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('11d4c938-95ac-4b95-b3d0-dc7c05bf87cb', '征收集体土地构筑物、附属设施补偿标准', '门', '空心管大铁门', '道', '60000', '双扇', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('9812f5d0-226a-45d6-b77a-11071d7c9d73', '征收集体土地构筑物、附属设施补偿标准', '门', '不锈钢铁门', '道', '40000', '双扇800', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('9679a8f9-c9c3-44f2-a725-c7eb7227c86c', '征收集体土地构筑物、附属设施补偿标准', '门', '套装门', '道', '80000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('ccd15a23-c904-4073-9364-cf0f2f8416e6', '征收集体土地构筑物、附属设施补偿标准', '门', '铝合金拉门', '平方米', '18000', '含玻璃', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('d0b850d5-513f-4475-8f6b-d1cd9470e1f3', '征收集体土地构筑物、附属设施补偿标准', '门', '塑钢、玻璃推拉门', '平方米', '20000', '纯玻璃门厚度10mm以上', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('2ab6232c-2ebc-4f05-8e73-9c2dea7e72f7', '征收集体土地构筑物、附属设施补偿标准', '门', '普通木门', '道', '20000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('8e694c06-5207-4dfe-8258-88e6592aff9d', '征收集体土地构筑物、附属设施补偿标准', '地板', '陶瓷80＊80', '平方米', '18000', '含人工与材料', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('55d5b28e-7910-4150-b8b8-1dcffef3fde8', '征收集体土地构筑物、附属设施补偿标准', '地板', '陶瓷60＊60', '平方米', '15000', '含人工与材料', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('39b6ae7e-9901-4e33-a932-4347981e2dd7', '征收集体土地构筑物、附属设施补偿标准', '地板', '陶瓷50＊50', '平方米', '14000', '含人工与材料', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('04a9494e-8a25-42eb-adc7-95a1b6eb7182', '征收集体土地构筑物、附属设施补偿标准', '地板', '陶瓷40＊40', '平方米', '13000', '含人工与材料', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('c1bdb656-34b7-4279-a5ba-51d67e54cf54', '征收集体土地构筑物、附属设施补偿标准', '地板', '陶瓷30＊30', '平方米', '12500', '含人工与材料', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('957b9608-6dae-4eb6-8217-81fa133c772c', '征收集体土地构筑物、附属设施补偿标准', '地板', '普通磨石地面', '平方米', '12000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('67eec660-5a72-4fff-9a05-0833043fd75c', '征收集体土地构筑物、附属设施补偿标准', '地板', '大理石、花岗石地板', '平方米', '13000', '含人工与材料', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('a07be749-c53f-43c5-88d9-0393194b012d', '征收集体土地构筑物、附属设施补偿标准', '地板', '木质地板', '平方米', '10000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('629b7e04-3a91-418e-9b19-c3958e10e9c6', '征收集体土地构筑物、附属设施补偿标准', '地板', '地毯', '平方米', '15000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('4f584004-c0b9-4cf9-951c-1e4b3cd69303', '征收集体土地构筑物、附属设施补偿标准', '地板', '橡胶地板', '平方米', '8000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('6c93b3d0-b4d7-45f1-9d33-7219226f9890', '征收集体土地构筑物、附属设施补偿标准', '地板', '三合土', '平方米', '6000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('87798003-e556-4293-88d3-a09a7f8d153f', '征收集体土地构筑物、附属设施补偿标准', '地板', '混泥土', '平方米', '12000', '同时适用低于5cm厚的院坝、院户道路等', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('5cc92722-c531-4779-a03d-8f79fb1ec8af', '征收集体土地构筑物、附属设施补偿标准', '墙面', '瓷砖', '平方米', '3000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('070c218b-1909-450d-a752-3cb3a0f15444', '征收集体土地构筑物、附属设施补偿标准', '墙面', '瓷砖提脚线', '米', '2000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('105f8ed4-3e2e-408a-a7e6-321374aaad1e', '征收集体土地构筑物、附属设施补偿标准', '墙面', '柚木板', '平方米', '3500', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('af623389-5844-4805-9fca-c41b8f05dbbd', '征收集体土地构筑物、附属设施补偿标准', '墙面', '乳胶漆', '平方米', '2000', '含彩绘', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('f4bd1b0b-293f-42a3-8016-295d10d1831c', '征收集体土地构筑物、附属设施补偿标准', '墙面', '粉水', '平方米', '500', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('8505550c-644f-463e-976b-cf40e1634b2d', '征收集体土地构筑物、附属设施补偿标准', '墙面', '石灰', '平方米', '200', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('9eff9fd3-228e-4d79-a95a-212d75a709d6', '征收集体土地构筑物、附属设施补偿标准', '墙面', '细泥', '平方米', '100', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('9dcd163c-0221-4436-9787-4d8dc74bffb9', '征收集体土地构筑物、附属设施补偿标准', '墙面', '墙纸', '平方米', '4000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('cdcf6050-cff9-4242-b866-341d45ef0dcd', '征收集体土地构筑物、附属设施补偿标准', '墙面', '软包', '平方米', '6000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('a3350717-c47b-481e-86a2-482971b49081', '征收集体土地构筑物、附属设施补偿标准', '墙面', '磨砂玻璃', '平方米', '5000', '含带镂刻图案；背面带彩灯加30元/平方米。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('59e0e3cd-9c77-4dc3-a1fd-848d35c73740', '征收集体土地构筑物、附属设施补偿标准', '墙面', '镜面', '平方米', '3000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('ff476545-770c-4721-849b-40aa9fe4dbc9', '征收集体土地构筑物、附属设施补偿标准', '墙面', '浮雕', '平方米', '50000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('71b7eb07-2439-42fc-a791-2e5273d05780', '征收集体土地构筑物、附属设施补偿标准', '墙面', '仿漆涂料', '平方米', '800', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('3ecc687a-984d-4702-bb23-ca78b00ae49b', '征收集体土地构筑物、附属设施补偿标准', '墙面', '印花涂料墙壁', '平方米', '1500', '含彩绘', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('b08b4002-c4c0-4675-b0b0-c0acb67472cc', '征收集体土地构筑物、附属设施补偿标准', '雨棚', '铁皮雨棚', '平方米', '4000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('680bca26-77a8-4707-88ed-5983e6071791', '征收集体土地构筑物、附属设施补偿标准', '雨棚', '混凝土雨棚', '平方米', '3500', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('0e5924a3-e67a-4432-a247-b8a9b58b7793', '征收集体土地构筑物、附属设施补偿标准', '雨棚', '塑胶、中空塑胶', '平方米', '6000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('d0219e8c-4e32-4505-9c8b-8ab46619881e', '征收集体土地构筑物、附属设施补偿标准', '雨棚', '阳光板', '平方米', '7000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('60e4a8b6-2d67-4362-92e6-bfbfd4dc4ea5', '征收集体土地构筑物、附属设施补偿标准', '雨棚', '彩钢', '平方米', '8000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('59bd8f78-eb62-408a-bdc5-894273f58a3c', '征收集体土地构筑物、附属设施补偿标准', '雨棚', '彩秞瓦', '平方米', '5000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('beef5341-9221-404f-96dc-ea46c077ca32', '征收集体土地构筑物、附属设施补偿标准', '雨棚', '青瓦雨棚', '平方米', '3000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('62fa6b07-ab81-4451-9e1a-87226c1758aa', '征收集体土地构筑物、附属设施补偿标准', '堡坎', '浆砌片石', '立方米', '12000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('88b2fc2f-d6c2-41ee-b8e0-d56d549ed838', '征收集体土地构筑物、附属设施补偿标准', '堡坎', '乱石', '立方米', '4000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('81b8dd17-b567-4b94-b0ea-108bf6f5d095', '征收集体土地构筑物、附属设施补偿标准', '堡坎', '混泥土', '立方米', '35000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('edb076e1-3ffb-4ed5-85f4-07671700ec65', '征收集体土地构筑物、附属设施补偿标准', '堡坎', '砖砌、砖砌', '立方米', '35000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('cef6586d-f6ad-499a-a3ab-e7445f4ae160', '征收集体土地构筑物、附属设施补偿标准', '路', '石板', '平方米', '6000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('eae9f319-5270-4319-b028-ecccac8971bd', '征收集体土地构筑物、附属设施补偿标准', '路', '水泥路', '立方米', '35000', '厚度大于6cm以上', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('5245f560-897e-4fbf-8392-4a9e157e1388', '征收集体土地构筑物、附属设施补偿标准', '路', '泥结石', '平方米', '2000', '土路不予补偿', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('88577470-4a38-46e9-b4aa-9ec42bd464fc', '征收集体土地构筑物、附属设施补偿标准', '水沟', '石、砖砌、混泥土', '米', '4000', '单边40，双边60，双边既垫底80，四边暗沟100。特指房前屋后。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('d0fb1c42-a81d-4962-9ce0-2be7c5e455bb', '征收集体土地构筑物、附属设施补偿标准', '水沟', '土', '米', '800', '以院坝边为界', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('03f1285b-e432-4621-9b63-daa19457265c', '征收集体土地构筑物、附属设施补偿标准', '水龙头', '普通', '个', '1000', '塑料10，铁或不锈钢20', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('c941f352-9e10-43d2-99f4-59a0509df66f', '征收集体土地构筑物、附属设施补偿标准', '水龙头', '精品', '个', '5000', '造型的', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('4bd67aa8-1bd8-463b-87d2-dc9434ce457a', '征收集体土地构筑物、附属设施补偿标准', '闸阀', '', '个', '1000', '塑料10、铁20、不锈钢25、铜30', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('ddfeec6a-b85a-45ce-a440-0b1975887d33', '征收集体土地构筑物、附属设施补偿标准', '水管', '钢管', '米', '800', '4cm以下', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('6f6088d1-8f35-429b-8439-b037a34597ae', '征收集体土地构筑物、附属设施补偿标准', '水管', '钢管', '米', '1500', '5-8cm15,9cm以上20', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('d4b89839-706f-40fa-9611-52edfd1fb1e2', '征收集体土地构筑物、附属设施补偿标准', '水管', '塑管', '米', '500', '普通塑料管5，ppr管15，不锈钢管25，塑钢管30', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('5075a571-76c9-4498-a970-15e8d15702bf', '征收集体土地构筑物、附属设施补偿标准', '水管', 'PVC管', '米', '1000', '6cm以下10,6-10c平方米0,10cm以上30。含管道接头', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('e7fc5ee5-8c12-4615-a99c-3374ae1fb097', '征收集体土地构筑物、附属设施补偿标准', '水表', '未开户', '支', '3000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('dd7d174f-93e0-420f-bf15-3a301c597650', '征收集体土地构筑物、附属设施补偿标准', '水表', '开户', '支', '50000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('a34abb4f-0745-4451-9d0b-03590a92a359', '征收集体土地构筑物、附属设施补偿标准', '仓储', '木仓', '立方米', '8000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('f0d12546-0d05-451e-ab1d-379696cd8830', '征收集体土地构筑物、附属设施补偿标准', '仓储', '砖石仓', '立方米', '12000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('f6470ec7-ad5a-4d6e-b961-dcbadeddde7e', '征收集体土地构筑物、附属设施补偿标准', '电视线', '闭路、加密、光纤电视', '个', '40000', '卫星接收器给10元/台拆卸补偿', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('6849c439-749b-4a1d-a012-03bbee676aa9', '征收集体土地构筑物、附属设施补偿标准', '有线电话', '', '部', '30000', '无线电话不予补偿', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('589a489f-9e5b-477f-bb29-f3754251e484', '征收集体土地构筑物、附属设施补偿标准', '网络上户', '', '户', '30000', '无线网络不予补偿', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('faedeadc-275f-4943-be12-cec69b6f25bb', '征收集体土地构筑物、附属设施补偿标准', '空调', '', '个', '15000', '拆卸补偿', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('3b5c9ed7-0085-479b-9454-f2495d07a63c', '征收集体土地构筑物、附属设施补偿标准', '吊扇、壁扇、排风扇', '', '个', '2000', '拆卸补偿', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('c1eb0719-37ad-4f53-8e9a-3d333c5c4090', '征收集体土地构筑物、附属设施补偿标准', '隔断', '面板', '平方米', '7000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('1ad97074-c1c6-4598-bf6b-0e06df07913c', '征收集体土地构筑物、附属设施补偿标准', '隔断', '宝丽板、三合板', '平方米', '4000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('bfab35cb-b65b-4463-9ac5-1feb82ac0de3', '征收集体土地构筑物、附属设施补偿标准', '隔断', '精装装饰木隔断', '平方米', '15000', '含彩绘玻璃', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('75e82603-af97-4246-8a48-c1cc4f5a9520', '征收集体土地构筑物、附属设施补偿标准', '巴壁衣柜、装饰柜', '', '平方米', '16000', '含装饰', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('ac6ba69e-007c-4e6e-8d99-d1be2419b47e', '征收集体土地构筑物、附属设施补偿标准', '巴壁碗柜', '', '格', '9000', '含瓷砖', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('acf07c34-d6a2-4d34-9de1-ce48a28bd94e', '征收集体土地构筑物、附属设施补偿标准', '案板', '', '张', '20000', '含瓷砖.木案板不予补偿', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('8ebbc413-31d9-4265-8ffb-0d569087fadd', '征收集体土地构筑物、附属设施补偿标准', '灶', '', '眼', '20000', '含瓷砖，土灶扣50元/眼。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('8b8d861a-495b-4704-bd01-2e64544f75c8', '征收集体土地构筑物、附属设施补偿标准', '水缸', '', '口', '25000', '含瓷砖，未有瓷砖扣50元/口。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('c65e3210-8d8c-497e-8e75-4ff89c4ee560', '征收集体土地构筑物、附属设施补偿标准', '洗衣台', '', '张', '12000', '含瓷砖.未有瓷砖80元/张', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('64466c05-c136-4e08-839e-2219b24a69e5', '征收集体土地构筑物、附属设施补偿标准', '烟囱', '', '米', '2500', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('93b6f527-bbc5-4691-9476-6a241804aa5f', '征收集体土地构筑物、附属设施补偿标准', '砖、瓦窑', '', '口', '150000', '1万匹以下', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('5341c3fc-2f97-46c0-bd10-0d4d7aef20c8', '征收集体土地构筑物、附属设施补偿标准', '苕窖', '', '口', '35000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('ee25ff88-75da-4084-965e-b5b8cbfee2de', '征收集体土地构筑物、附属设施补偿标准', '栏杆', '钢筋', '平方米', '5000', '含装饰', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('93def227-fb83-499f-926f-001b5c774899', '征收集体土地构筑物、附属设施补偿标准', '栏杆', '不锈钢', '平方米', '12000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('c39e8253-1e9d-4dcd-88de-03093ef663ba', '征收集体土地构筑物、附属设施补偿标准', '栏杆', '木雕、玻璃或其它上等材料', '平方米', '25000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('cf3dd5b1-5b76-458b-bb65-c0321e8a3cbc', '征收集体土地构筑物、附属设施补偿标准', '栏杆', '砖、石', '平方米', '6000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('ea0bfa1e-92ba-4694-bfa5-e66cb3ac56e5', '征收集体土地构筑物、附属设施补偿标准', '抽油烟机、电气热水器', '', '个', '15000', '拆卸补偿', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('e2e138ea-ca2a-4238-8eab-f79532f0f785', '征收集体土地构筑物、附属设施补偿标准', '太阳能热水器', '', '台', '100000', '拆卸补偿', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('57d3a397-432d-45e2-8666-84a7168451ca', '征收集体土地构筑物、附属设施补偿标准', '农具废弃', '', '人', '50000', '集体经济组织土地全部征收后，农户无地可种的', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('3fa5f512-884d-482d-8e5c-0075b110a8c7', '征收集体土地构筑物、附属设施补偿标准', '磨面、打米、榨油、粉碎、斩草等机器', '', '台', '30000', '拆卸补偿', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('32b001f6-8e41-4488-b351-a8b9a902c383', '征收集体土地构筑物、附属设施补偿标准', '广告牌', '门面广告牌', '平方米', '10000', '木质100元，金属或玻璃200。带霓虹灯加20', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('a3aaf59f-c9f5-4b1d-83cc-330569cda97b', '征收集体土地构筑物、附属设施补偿标准', '广告牌', '霓虹显示屏', '平方米', '150000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('f16682e0-13b8-43cf-bda5-f81ef22b3b64', '征收集体土地构筑物、附属设施补偿标准', '雕塑', '', '个', '10000', '拆卸补偿。含石磨、碓窝、石碾等', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('559f5e18-0086-4618-8e3e-501065fef893', '征收集体土地构筑物、附属设施补偿标准', '堰塘、水库', '', '立方米', '3000', '含微水池', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('2d279b86-9449-442e-8098-74f625e76001', '征收集体土地构筑物、附属设施补偿标准', '围墙', '乱石、土围墙', '平方米', '4300', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('d6ca6f64-38cd-40e9-9a85-0bae227d8503', '征收集体土地构筑物、附属设施补偿标准', '围墙', '砖、石围墙', '平方米', '6000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('3c93d5f4-c2d9-4974-a7d3-e0935a9a0c25', '征收集体土地构筑物、附属设施补偿标准', '院坝（晒坝）', '土', '平方米', '800', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('6042f217-0c67-4285-a96d-fca12358bc09', '征收集体土地构筑物、附属设施补偿标准', '院坝（晒坝）', '三合土', '平方米', '6000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('fb338bca-898a-4035-814e-ecaddebd36d4', '征收集体土地构筑物、附属设施补偿标准', '院坝（晒坝）', '砖、石、水泥砂浆', '平方米', '12000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('4e2321db-8c5c-4918-81a9-e9b4cf757854', '征收集体土地构筑物、附属设施补偿标准', '院坝（晒坝）', '石板坝', '平方米', '16000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('03a1d0c7-0fd3-455d-9439-53cb9a7e62fc', '征收集体土地构筑物、附属设施补偿标准', '粪池', '土粪池', '立方米', '8000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('b78f0df6-1170-4510-b4a2-421f00c2bea8', '征收集体土地构筑物、附属设施补偿标准', '粪池', '水泥、三合土粪池', '立方米', '12000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('0c7fc4fa-e82f-4000-8809-2706c3fe753d', '征收集体土地构筑物、附属设施补偿标准', '粪池', '条石粪池', '立方米', '17000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('256cf52d-4b9d-452c-ad24-2a90f0f8a96e', '征收集体土地构筑物、附属设施补偿标准', '水井', '土水井', '口', '45000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('a55de318-d6d2-429a-9ae3-3fa7e3186478', '征收集体土地构筑物、附属设施补偿标准', '水井', '条石水井', '口', '150000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('8daac773-f5d7-4758-85e6-73be0b79d32b', '征收集体土地构筑物、附属设施补偿标准', '水井', '压水井（含机械取水）', '口', '180000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('a94b1d5f-3369-4b34-9eb8-ee768f2d88dc', '征收集体土地构筑物、附属设施补偿标准', '水井', '机井', '口', '180000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('d1ccdff8-78d2-452c-883b-e02bf0238fda', '征收集体土地构筑物、附属设施补偿标准', '坟墓', '普通土堆坟', '座', '100000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('8f08fe90-dc27-4590-bd9b-3e7cfbdd8ff5', '征收集体土地构筑物、附属设施补偿标准', '坟墓', '砖、石、水泥修砌', '座', '200000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('b55d4377-ece1-4bd2-994e-6dd4bf77027e', '征收集体土地构筑物、附属设施补偿标准', '坟墓', '砖、石、水泥修砌加有花岗石、其他材料刻成的墓碑', '座', '300000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('e39f13cf-337f-4cb8-acae-4bd5aca2faf9', '征收集体土地构筑物、附属设施补偿标准', '沼气池', '产气沼气', '立方米', '30000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('8aa1a58a-1fe7-4d40-a897-370b01b020d6', '征收集体土地构筑物、附属设施补偿标准', '沼气池', '未产气沼气', '立方米', '25000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('1ebbdafd-8d68-4308-a04d-995e871178ab', '征收集体土地构筑物、附属设施补偿标准', '鱼池', '浆砌鱼池', '平方米', '25000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('57f27162-849f-49ec-9c79-f3683d9ca54c', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '桑树', '产叶桑', '株', '3000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('0a690e33-67bb-4c24-b0ca-8fc312ee3cd3', '征收集体土地构筑物、附属设施补偿标准', '鱼池', '砖石砌筑鱼池', '平方米', '30000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('681e3453-dc7c-403e-9881-0d8da1436ab9', '征收集体土地构筑物、附属设施补偿标准', '鱼池', '土鱼池', '平方米', '8000', '注：1、以上项目补偿均含人工和辅助材料费；2、未尽项目按相似项目补偿标准进行补偿；3、可移动的附属设施不予补偿。', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('ef78851b-e492-4c89-8582-521c08d1702d', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '株', '30000', '指单株。成片林0.5亩以上盛产12000元/亩；初产8000元/亩；幼树5000元/亩；幼苗3000元/亩。', '盛产', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('33469f34-e0e4-4767-8799-131b963643c6', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '株', '5000', '', '初产', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('facddcdf-1850-46b0-81e8-b1ee2055044e', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '株', '500', '', '幼树', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('c6a36c90-ffbc-4c69-9883-23f15a235d70', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '株', '200', '', '幼苗', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('79b341bb-f60e-40fd-844a-047662bee821', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '藤本', '丛', '500', '成片在0.5亩以上按3500-5500元/亩计算', '', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('a876f306-5e04-4c31-9782-d6685fd5ee80', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '丛', '10000', '成片在0.5亩以上按8000元/亩计算', '盛产', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('514e2c40-0996-4851-b2c0-d8cf772bde0e', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '丛', '3000', '成片在0.5亩以上按5000元/亩计算', '初产', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('1a212b82-4502-4d8d-b80f-243d3b4fecbd', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '丛', '800', '成片在0.5亩以上按1200元/亩计算', '幼树', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('9072a68b-bc40-4928-a619-823eeaf0e30b', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '丛', '200', '成片在0.5亩以上按800元/亩计算', '幼苗', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('8b6a892e-e3ef-4286-8227-dffe9627b9c1', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '竹林', '', '笼', '18300', '楠竹归属,25根以上', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('146d64e5-2234-4037-9edf-f8415e1f338a', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '竹林', '', '笼', '10000', '用材木类,10—25根', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('831aa182-75b9-43c2-aa82-a2b340cc80a4', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉    花木', '乔木类', '株', '50000', '名贵类，合理密植株数', '大', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('4bc37096-04fc-4ac8-9dbe-63c4b5052a35', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉    花木', '乔木类', '株', '8000', '', '中', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('ba815f34-a86a-49c5-9cf0-4e236f1e09fa', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉    花木', '乔木类', '株', '500', '', '幼树', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('f09f1eb4-1bfc-459f-9ace-010761316b87', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉    花木', '乔木类', '株', '200', '', '幼苗', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('5e4a9462-bd95-4159-a695-5c70c04d6311', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉    花木', '灌木类', '丛', '20000', '', '大', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('93ca48ba-c24a-4c37-a48d-0510de19f45c', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉    花木', '灌木类', '丛', '1000', '', '中', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('707e89a9-a79f-408d-8b23-90b15052b92e', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉    花木', '灌木类', '丛', '300', '', '小', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('f35cf47e-3bc6-4a0d-a078-33798d5077cd', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉    花木', '草本类', '窝', '50', '成片在0.1亩以上按3000元/亩计算', '', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('e7125e5e-a2b0-414d-8510-41d86c644416', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉    花木', '藤本类', '丛', '5000', '', '大', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('609e2a5b-b072-4ade-987a-fd9b072fd3fa', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉    花木', '藤本类', '丛', '500', '', '中', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('32d47c2c-8269-4079-b1eb-8645c3f889cd', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '竹林', '', '笼', '6300', '10根以下', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('5f30d6c3-3994-4801-b741-479271c0da2f', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '竹林', '', '亩', '280000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('caecbe03-19ca-4154-83b5-b781d5841c39', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉    花木', '藤本类', '丛', '200', '', '小', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('3d59afef-d883-493e-9d5c-fee69f5f9ebe', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '用材木', '', '株', '3000', '单块面积在0.5亩以上的为成片用材林3000-5000元/亩，薪炭林和灌木林按用材林0.5倍补偿，防护林按用材林的2倍补偿，特殊用材林按用材林的3倍补偿。单块在0.5亩以下的为零星用材林。楠竹归属用材木类。', '大', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('bf673295-d865-4372-99cb-022d7c195c95', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '用材木', '', '株', '1000', '', '中', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('4e95c3d9-0a92-4a69-94e0-3ed23bdcc12b', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '用材木', '', '株', '300', '', '小', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('ace67abb-6fef-40af-82f8-615b6a06fd43', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '苗圃', '经济林', '亩', '400000', '', '', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('88443ec5-0efc-44d2-8198-47e454c264be', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '苗圃', '用材林', '亩', '100000', '', '', '1、征收集体土地所涉及的经济林木、用材林、花木花卉的补偿均为一次性补偿。2、同一片地块成片种植一种或多种经济林木、花木花卉、用材林及其他等，不按品种、数量、规格进行清点、登记，根据种植数量最多的品种计价或确定综合价进行补偿。3、盆景花木花卉不作损毁补偿。4、一年生草本药材或其它经济作物均按所在地年产值计补1720-1870元/亩。5、征地调查公告发布后抢栽、抢种的苗木不予补偿。', NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('d1f75c31-e125-49bf-80e4-6ed1bc82162c', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '产果期-初果', '株', '18300', '挂果3—9年', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('520205f3-1709-4910-a24e-e28e88393569', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '产果期-盛果', '株', '26700', '挂果10年以上', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('208e7ec3-67c0-41ae-9b25-caac973a3d8d', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '产果期-衰果', '株', '9700', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('dc462064-2ab9-4583-bdc5-53aeb693a826', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '幼苗', '株', '1700', '定植3年内', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('02ca49ee-42a4-403c-9ef5-b0f9666504e9', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '幼树', '株', '2300', '定植3年内', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('396e669e-9e86-4538-8b91-4e66bcaf6e5b', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '荔枝、樱桃、桂圆、枇杷、板栗、核桃、及其他坚果', '产果期-初果', '株', '16700', '挂果3—9年', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('c3879679-3dc5-40ca-b22e-a9fbaaea5d77', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '荔枝、樱桃、桂圆、枇杷、板栗、核桃、及其他坚果', '产果期-盛果', '株', '33300', '挂果10年以上', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('74628aba-0952-44f8-a797-fb8817a07ef6', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '荔枝、樱桃、桂圆、枇杷、板栗、核桃、及其他坚果', '产果期-衰果', '株', '10000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('bd410d78-e405-4ce2-94d5-9e97daebac5a', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '荔枝、樱桃、桂圆、枇杷、板栗、核桃、及其他坚果', '定植未挂果', '株', '4000', '定植3年以上', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('614adcd9-c17b-4eff-843f-ceaeb26f9d65', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '荔枝、樱桃、桂圆、枇杷、板栗、核桃、及其他坚果', '定植嫁接幼树', '株', '2700', '定植3年内', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('895e6893-e8c0-4e74-949b-7fcbde6d93f6', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '葡萄', '幼苗', '株', '700', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('587d8361-77c6-4f86-84b0-fe2596254b62', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '葡萄', '产果期', '株', '12000', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('02ef1ed8-0188-444b-b476-dabe8744c94e', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '桑树', '幼苗', '株', '400', '', NULL, NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('5caf2874-3195-4baf-a78e-dce797249e32', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '产果期-初果', '亩', '1300000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('9de546cb-476a-4648-93c6-76a9ffb59cbf', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '产果期-盛果', '亩', '1700000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('656966cf-9d21-461e-904a-bb9df77cf6cb', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '产果期-衰果', '亩', '800000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('fc6b8e43-1651-42ba-a6ee-bc09d8717331', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '幼苗', '亩', '80000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('4919c929-1e02-4a0d-af29-e1502c57278c', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '幼树', '亩', '80000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('49adcd05-71fb-4da1-b036-d0cba275eef1', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '荔枝、桂圆、枇杷、板栗、核桃、樱桃及各类坚果', '产果期-初果', '亩', '1200000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('be60d016-655c-4b17-a3f0-9231d33fb5ee', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '荔枝、桂圆、枇杷、板栗、核桃、樱桃及各类坚果', '产果期-盛果', '亩', '2100000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('c2db6781-44eb-46e1-90a5-517a544e3590', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '荔枝、桂圆、枇杷、板栗、核桃、樱桃及各类坚果', '产果期-衰果', '亩', '900000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('6e8c7576-9ff2-4827-9fa3-aa635843d9aa', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '荔枝、桂圆、枇杷、板栗、核桃、樱桃及各类坚果', '幼苗', '亩', '80000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('90e8b273-ca6e-42df-92da-537d07a349d2', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '荔枝、桂圆、枇杷、板栗、核桃、樱桃及各类坚果', '幼树', '亩', '80000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('6746bef8-b5ae-4a45-a8ba-93ecf3b8d5f6', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '葡萄', '幼苗', '亩', '80000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('64c6e82e-88a3-4dab-be63-bc787c164c02', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '葡萄', '产果期', '亩', '1000000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '成片面积0.5亩以上', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('19ac5aec-279b-4780-b245-50302cf90c95', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '桑树', '幼苗', '亩', '50000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '离地面高度1米以下', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('18c25eda-6d2f-4438-97aa-ae423ebd729a', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '桑树', '产叶桑', '亩', '200000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '初产叶', NULL, NULL, NULL);
INSERT INTO "public"."commodity" VALUES ('27655833-0e2d-405b-99ed-501be5304b1d', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '桑树', '', '亩', '350000', '对经济林木以外的其他成片林木的补偿按照《四川省物价局 四川省财政厅 四川省林业厅关于收取森林植被恢复费和林地林木补偿费的通知》（川价字非〔1993〕4号规定的标准执行.', '盛产叶', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS "public"."user";
CREATE TABLE "public"."user" (
  "user" varchar(255) COLLATE "pg_catalog"."default",
  "password" varchar(255) COLLATE "pg_catalog"."default",
  "id" int4 NOT NULL
)
;

-- ----------------------------
-- Primary Key structure for table commodity
-- ----------------------------
ALTER TABLE "public"."commodity" ADD CONSTRAINT "commodity_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table user
-- ----------------------------
ALTER TABLE "public"."user" ADD CONSTRAINT "user_pkey" PRIMARY KEY ("id");
