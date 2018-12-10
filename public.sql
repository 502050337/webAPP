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

 Date: 10/12/2018 22:27:49
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
COMMENT ON COLUMN "public"."commodity"."id" IS 'uuid';
COMMENT ON COLUMN "public"."commodity"."category" IS '类别';
COMMENT ON COLUMN "public"."commodity"."subcategory" IS '子类别';
COMMENT ON COLUMN "public"."commodity"."name" IS '名称';
COMMENT ON COLUMN "public"."commodity"."unit" IS '单位';
COMMENT ON COLUMN "public"."commodity"."price" IS '单价';
COMMENT ON COLUMN "public"."commodity"."remark" IS '备注';
COMMENT ON COLUMN "public"."commodity"."subname" IS '二级子分类';

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO "public"."commodity" VALUES ('7ca92a68-1398-4826-b13b-b02326f26aed', '征收集体土地青苗补偿费标准', '大春', NULL, '元/亩', '1300.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('acfa5da7-4546-4f7b-82bf-ae4e7c94b1f0', '征收集体土地青苗补偿费标准', '小春', NULL, '元/亩', '1200.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('ab02d9e7-1b56-4732-9f6f-b4b1c7b58dd1', '征收集体土地青苗补偿费标准', '其他作物', NULL, '元/亩', '1200.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('0a15b05a-08d5-4f47-bd1c-e57c0062f358', '征收集体土地建筑物及其它构筑物补偿标准', '框架结构', '框架结构', '元/平方米', '900.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('6d3531d1-6b91-4c96-b08f-87b04b82ce79', '征收集体土地建筑物及其它构筑物补偿标准', '砖混结构', '砖混结构', '元/平方米', '750.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('a5620980-e9fc-4be0-a682-9d4cc4540f71', '征收集体土地建筑物及其它构筑物补偿标准', '砖木结构', '砖木结构', '元/平方米', '600.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('867e9505-f9db-46cf-b550-9cc6a125468e', '征收集体土地建筑物及其它构筑物补偿标准', '土木、木结构', '土木、木结构', '元/平方米', '520.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('369e8510-4ab2-4e25-9c04-51681bb7d2dc', '征收集体土地建筑物及其它构筑物补偿标准', '砖纤结构', '砖纤结构', '元/平方米', '350.0', '含彩钢、牛毛毡、阳光板、石棉瓦、玻纤等', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('546ed979-c458-4772-bdae-aa10b700f4d0', '征收集体土地建筑物及其它构筑物补偿标准', '简易结构', '简易结构', '元/平方米', '220.0', '只作补偿，不列入建筑面积或土地使用权面积', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('2a018e3c-00ba-4d75-83f1-36f7eb4fdfc1', '征收集体土地建筑物及其它构筑物补偿标准', '经营性用房', '经营性用房', '元/平方米', '0.0', '依据房屋主体结构的补偿标准再增加0.5倍计算', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('14c1638a-deac-468d-8787-f7c5d9c5a45a', '征收集体土地建筑物及其它构筑物补偿标准', '搬家费', '搬家费', '户', '2000.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('dc0fe106-682f-4a73-899a-f2afc512783a', '征收集体土地建筑物及其它构筑物补偿标准', '临时过渡费', '临时过渡费(4个月内)', '元/平方米·月', '4.0', '自房屋腾空之日起，每户临时过渡期为10个月，临时过渡费为：10×4×房屋合法建筑面积。房屋产权调换安置不给过渡费。临时过渡期超出半年的，过渡费增加0.5倍，超出一年的过渡费增加1倍。', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('88865d64-dd7a-493d-88b8-77c92ca0ac99', '征收集体土地建筑物及其它构筑物补偿标准', '临时过渡费', '临时过渡费(11-22个月内)', '元/平方米·月', '8.0', '自房屋腾空之日起，每户临时过渡期为10个月，临时过渡费为：10×4×房屋合法建筑面积。房屋产权调换安置不给过渡费。临时过渡期超出半年的，过渡费增加0.5倍，超出一年的过渡费增加1倍。', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('d47dedf3-67cd-4a7d-9b6f-9a61370a62cf', '征收集体土地建筑物及其它构筑物补偿标准', '临时过渡费', '临时过渡费23个月以上', '元/平方米·月', '10.0', '自房屋腾空之日起，每户临时过渡期为10个月，临时过渡费为：10×4×房屋合法建筑面积。房屋产权调换安置不给过渡费。临时过渡期超出半年的，过渡费增加0.5倍，超出一年的过渡费增加1倍。', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('765e4a7e-398b-4509-9bf6-1b22017b56ed', '征收集体土地构筑物、附属设施补偿标准', '不锈钢淘菜盆', '盆', '个', '200.0', NULL, '不锈钢淘菜盆', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('176dcc3f-4e22-4fe7-b152-2d43baa22322', '征收集体土地构筑物、附属设施补偿标准', '砖砌淘菜盆', '盆', '个', '100.0', NULL, '砖砌淘菜盆', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b773258c-6747-4ed3-85d0-bc657b17c089', '征收集体土地构筑物、附属设施补偿标准', '大瓷浴盆', '盆', '个', '500.0', '1.2米×0.5米', '大瓷浴盆', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f9c151bb-a727-4b4f-9e77-1b90809ea216', '征收集体土地构筑物、附属设施补偿标准', '大瓷浴盆', '盆', '个', '350.0', '1.2米×0.5米以下', '大瓷浴盆', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('175ed910-5984-4980-b2d7-35264c4e7e98', '征收集体土地构筑物、附属设施补偿标准', '喷式大浴缸', '盆', '个', '1000.0', '自带喷头，玻璃制品', '喷式大浴缸', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('6fc60d99-f9e2-4da7-aee7-01503d8ad34b', '征收集体土地构筑物、附属设施补偿标准', '吸顶灯', '灯', '盏', '50.0', '含灯头、电线', '吸顶灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e7420cc0-ca28-4a4b-8ad2-006f9196881c', '征收集体土地构筑物、附属设施补偿标准', '电灯头', '灯', '个', '12.0', '含灯头、电线', '电灯头', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('ee810108-2f83-4131-a703-3cc5434553a0', '征收集体土地构筑物、附属设施补偿标准', '日光灯', '灯', '个', '15.0', '15瓦含灯头、电线', '日光灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('26cb288c-047d-4e34-94bb-ace3aea7802d', '征收集体土地构筑物、附属设施补偿标准', '日光灯', '灯', '个', '20.0', '20瓦含灯头、电线', '日光灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('34b072f8-08b1-45de-93b4-7f37c17e47ad', '征收集体土地构筑物、附属设施补偿标准', '日光灯', '灯', '个', '25.0', '30瓦含灯头、电线', '日光灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('9d7ef174-4352-4931-88f5-5b8aaff5716e', '征收集体土地构筑物、附属设施补偿标准', '日光灯', '灯', '个', '30.0', '40瓦含灯头、电线', '日光灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('950d824d-91e8-49d6-84a0-76ac53788aec', '征收集体土地构筑物、附属设施补偿标准', '节能日光灯', '灯', '个', '40.0', '含灯头、电线', '节能日光灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8c81b56b-04a6-4b6c-beb4-7e51e5aa84f6', '征收集体土地构筑物、附属设施补偿标准', '双头壁灯', '灯', '盏', '50.0', '含灯头、电线', '双头壁灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('cba2e3fd-27fe-43a8-ba8e-366c04a7d043', '征收集体土地构筑物、附属设施补偿标准', '吊灯', '灯', '盏', '500.0', '24灯头、含电线', '吊灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('506cc097-086b-4a1f-902e-cdb0e74e36f9', '征收集体土地构筑物、附属设施补偿标准', '吊灯', '灯', '盏', '450.0', '16灯头、含电线', '吊灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8bf5dfe8-1044-496a-b083-2480a8294b3e', '征收集体土地构筑物、附属设施补偿标准', '吊灯', '灯', '盏', '400.0', '12灯头、含电线', '吊灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('2645e047-77dc-490a-9e3b-b4fa8c7abeea', '征收集体土地构筑物、附属设施补偿标准', '吊灯', '灯', '盏', '350.0', '8灯头、含电线', '吊灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('2b9ef2c6-93fd-47ed-a146-73a98dd9da9e', '征收集体土地构筑物、附属设施补偿标准', '吊灯', '灯', '盏', '300.0', '6灯头、含电线', '吊灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('0d8a8fe2-64de-40de-92a2-0b28a9478162', '征收集体土地构筑物、附属设施补偿标准', '射灯', '灯', '盏', '20.0', '', '射灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b36416dc-2166-4e01-b2e3-fefabd2ee384', '征收集体土地构筑物、附属设施补偿标准', '伸降灯', '灯', '盏', '35.0', '含电线', '伸降灯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('69d0ded1-b189-4ead-bc2b-52852161f409', '征收集体土地构筑物、附属设施补偿标准', '浴霸', '卫浴', '套', '300.0', '', '浴霸', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b3df73f2-1bed-4003-aa81-9de257c8ef8e', '征收集体土地构筑物、附属设施补偿标准', '抽水马桶', '卫浴', '套', '350.0', '', '抽水马桶', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('9630e867-7574-4d8a-a953-adb899a0b0b5', '征收集体土地构筑物、附属设施补偿标准', '便盆', '卫浴', '套', '80.0', '', '便盆', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('95787345-7292-49ff-b27d-c104922e9479', '征收集体土地构筑物、附属设施补偿标准', '便盆水箱', '卫浴', '个', '60.0', '', '便盆水箱', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('9ab4bbf0-e950-4ab2-9f3c-eeb150d61e91', '征收集体土地构筑物、附属设施补偿标准', '插座', '插座', '个', '20.0', '五孔以上', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f6a49642-7b0a-4d06-a66d-7b25a710e3b8', '征收集体土地构筑物、附属设施补偿标准', '插座', '插座', '', '8.0', '五孔以下', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e784705a-9411-4523-bbec-e5e49a83606e', '征收集体土地构筑物、附属设施补偿标准', '开关', '开关', '个', '10.0', NULL, '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e8a17ff6-af51-47e9-9b5d-acc844246a79', '征收集体土地构筑物、附属设施补偿标准', '水、电闸阀', '水、电闸阀', '个', '20.0', NULL, '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('0a7b0e1e-567a-485b-b836-4979c2dd3bb6', '征收集体土地构筑物、附属设施补偿标准', '空气开关', '空气开关', '个', '30.0', NULL, '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('3496394a-5a3d-4546-8d90-ec2f3a8ebbf8', '征收集体土地构筑物、附属设施补偿标准', '开户', '电表', '个', '500.0', NULL, '开户', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('bbfae420-3bb4-44b7-a7f9-7e7d5186e5df', '征收集体土地构筑物、附属设施补偿标准', '未开户', '电表', '个', '50.0', NULL, '未开户', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('061d0dd6-43ca-415a-96b7-287b1c7cb7c7', '征收集体土地构筑物、附属设施补偿标准', '10#元钢', '防护栏', '平方米', '50.0', '', '10#元钢', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e40e6e4b-17ea-4686-8eab-9cfa48adbfbc', '征收集体土地构筑物、附属设施补偿标准', '12#元钢', '防护栏', '平方米', '60.0', '', '12#元钢', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('5783a21a-72a3-48dc-b79d-fcb19312cdad', '征收集体土地构筑物、附属设施补偿标准', '14#元钢', '防护栏', '平方米', '70.0', '', '14#元钢', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e6951e9e-ec75-404f-9ff6-9f33cf8a8454', '征收集体土地构筑物、附属设施补偿标准', '不锈钢防护栏', '防护栏', '平方米', '120.0', '', '不锈钢防护栏', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('6f9ef028-bdf9-483d-9132-5b472362acac', '征收集体土地构筑物、附属设施补偿标准', '档席、纸合板、塑编条', '顶棚（吊顶）', '平方米', '10.0', '', '档席、纸合板、塑编条', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('66890674-1232-4f0d-a433-df429fbb20cb', '征收集体土地构筑物、附属设施补偿标准', '三合板', '顶棚（吊顶）', '平方米', '20.0', '', '三合板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('4072c70f-3811-4936-8144-c5f10d58bfb9', '征收集体土地构筑物、附属设施补偿标准', '竹胶、纤维板、柚木、保丽板', '顶棚（吊顶）', '平方米', '30.0', '', '竹胶、纤维板、柚木、保丽板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('5ce3d353-2680-494a-9e6e-3a68ec141034', '征收集体土地构筑物、附属设施补偿标准', '石膏板', '顶棚（吊顶）', '平方米', '30.0', '', '石膏板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('693f6f7f-2880-407e-9c77-a8577702e6b8', '征收集体土地构筑物、附属设施补偿标准', '铝、塑胶板', '顶棚（吊顶）', '平方米', '60.0', '', '铝、塑胶板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('fd36a7e9-fcf7-4726-8182-3017bfac8286', '征收集体土地构筑物、附属设施补偿标准', '石膏装饰条', '顶棚（吊顶）', '米', '15.0', '天花板边角装饰', '石膏装饰条', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('82a054d6-ac96-481f-af81-3f89018b6dcf', '征收集体土地构筑物、附属设施补偿标准', '柚木板', '顶棚（吊顶）', '米', '20.0', '', '柚木板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('ae0398a4-54fc-40fc-aef5-ef7b2c5c0b99', '征收集体土地构筑物、附属设施补偿标准', '普通纱窗', '窗', '平方米', '6.0', '', '普通纱窗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('43beb0ef-5aa5-47f4-b8ae-e66aa3c53f67', '征收集体土地构筑物、附属设施补偿标准', '铝合金活动纱窗', '窗', '平方米', '40.0', '', '铝合金活动纱窗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('48abd124-5ae6-4f74-89e2-726ecc0adb10', '征收集体土地构筑物、附属设施补偿标准', '铝合金普通窗', '窗', '平方米', '150.0', '', '铝合金普通窗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('964b49dd-512e-4a3a-bc37-cdce992e70d3', '征收集体土地构筑物、附属设施补偿标准', '铝合金硬材窗', '窗', '平方米', '180.0', '', '铝合金硬材窗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('3f9409c1-77a6-46c1-8f1f-8e435f12fc51', '征收集体土地构筑物、附属设施补偿标准', '木格窗', '窗', '平方米', '50.0', '窗户不带钢筋', '木格窗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f2d7020c-d482-4c8b-84b5-91f72f60fdda', '征收集体土地构筑物、附属设施补偿标准', '钢筋窗', '窗', '平方米', '70.0', '木窗带钢筋', '钢筋窗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('7a59015f-a292-4ea2-9a64-b4b629c16999', '征收集体土地构筑物、附属设施补偿标准', '塑钢窗', '窗', '平方米', '200.0', '', '塑钢窗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('0ce7707c-2a8a-4ec5-84c4-b620e7a1765f', '征收集体土地构筑物、附属设施补偿标准', '卷帘门', '门', '平方米', '60.0', '', '卷帘门', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('5842d77d-8f4e-4252-b591-1f7baf675db4', '征收集体土地构筑物、附属设施补偿标准', '双层防盗门', '门', '道', '1000.0', '', '双层防盗门', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('43dce772-4690-4114-9427-3ef58238e4da', '征收集体土地构筑物、附属设施补偿标准', '防盗门', '门', '道', '500.0', '', '防盗门', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('0b5326db-6fdc-4638-89a0-c6cfdfcb9729', '征收集体土地构筑物、附属设施补偿标准', '普通元钢铁门', '门', '道', '300.0', '', '普通元钢铁门', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('405097ca-bf83-435b-ba38-264f8715457a', '征收集体土地构筑物、附属设施补偿标准', '铝合金、塑钢门', '门', '道', '200.0', '', '铝合金、塑钢门', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('19f307a8-2f86-4e86-b45d-b1c1d726ceb3', '征收集体土地构筑物、附属设施补偿标准', '空心管大铁门', '门', '道', '600.0', '双扇', '空心管大铁门', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e9ac0c8d-f4f3-415e-8cdd-6d3af17e8aaf', '征收集体土地构筑物、附属设施补偿标准', '不锈钢铁门', '门', '道', '400.0', '双扇800', '不锈钢铁门', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b991a5c9-3c59-4e8b-bc7a-437b6d0463fa', '征收集体土地构筑物、附属设施补偿标准', '套装门', '门', '道', '800.0', '', '套装门', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b8e40bc4-1318-4980-9b29-3d5db4e6ecb7', '征收集体土地构筑物、附属设施补偿标准', '铝合金拉门', '门', '平方米', '180.0', '含玻璃', '铝合金拉门', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('bcde07ab-7a4b-4e60-8e3d-44dd20eedafa', '征收集体土地构筑物、附属设施补偿标准', '塑钢、玻璃推拉门', '门', '平方米', '200.0', '纯玻璃门厚度10mm以上', '塑钢、玻璃推拉门', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b69db940-9f69-41a3-8176-69b21c39f8f6', '征收集体土地构筑物、附属设施补偿标准', '普通木门', '门', '道', '300.0', '', '普通木门', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('35c1bd38-7192-4488-a197-aebcf19f9d88', '征收集体土地构筑物、附属设施补偿标准', '陶瓷80＊80', '地板', '平方米', '180.0', '含人工与材料', '陶瓷80＊80', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('9747b448-dc90-42a3-8efb-6269786565d2', '征收集体土地构筑物、附属设施补偿标准', '陶瓷60＊60', '地板', '平方米', '150.0', '含人工与材料', '陶瓷60＊60', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('39389dbd-f250-41ca-ac83-d9541aeda1c6', '征收集体土地构筑物、附属设施补偿标准', '陶瓷50＊50', '地板', '平方米', '140.0', '含人工与材料', '陶瓷50＊50', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('08520ef0-5f5b-4b31-ab21-658f910c2b9c', '征收集体土地构筑物、附属设施补偿标准', '陶瓷40＊40', '地板', '平方米', '130.0', '含人工与材料', '陶瓷40＊40', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('1dd99e40-1a17-4b85-89c7-5919194ce4ad', '征收集体土地构筑物、附属设施补偿标准', '陶瓷30＊30', '地板', '平方米', '125.0', '含人工与材料', '陶瓷30＊30', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e496c33a-525d-4dab-a0f2-caf0bad80640', '征收集体土地构筑物、附属设施补偿标准', '普通磨石地面', '地板', '平方米', '120.0', '', '普通磨石地面', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('57778154-3269-47e3-8ae8-fd825b9069a9', '征收集体土地构筑物、附属设施补偿标准', '大理石、花岗石地板', '地板', '平方米', '130.0', '含人工与材料', '大理石、花岗石地板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('9849d3b9-34d7-45ad-b361-8d6a3a04bca5', '征收集体土地构筑物、附属设施补偿标准', '木质地板', '地板', '平方米', '150.0', '', '木质地板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('452cbf47-0a41-41d2-9bdb-375f75b8b795', '征收集体土地构筑物、附属设施补偿标准', '地毯', '地板', '平方米', '150.0', '', '地毯', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('567610d7-4742-487c-b592-92602df0d0e4', '征收集体土地构筑物、附属设施补偿标准', '橡胶地板', '地板', '平方米', '80.0', '', '橡胶地板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('056d56cc-df02-4420-833c-2e1757b8873e', '征收集体土地构筑物、附属设施补偿标准', '三合土', '地板', '平方米', '60.0', '', '三合土', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('774d5c9b-03da-491f-84de-223bf138900a', '征收集体土地构筑物、附属设施补偿标准', '混泥土', '地板', '平方米', '120.0', '同时适用低于5cm厚的院坝、院户道路等', '混泥土', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('afb6e980-82fe-4555-9186-6c172239275c', '征收集体土地构筑物、附属设施补偿标准', '瓷砖', '墙面', '平方米', '50.0', '', '瓷砖', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('5f2f3d85-392b-4be1-847a-f43b8d878739', '征收集体土地构筑物、附属设施补偿标准', '瓷砖提脚线', '墙面', '米', '20.0', '', '瓷砖提脚线', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('7c5bb5ef-0869-4e8f-bed0-14ae12193aa6', '征收集体土地构筑物、附属设施补偿标准', '柚木板', '墙面', '平方米', '35.0', '', '柚木板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('01b279bb-1a8d-4293-9a88-9313e4d923ec', '征收集体土地构筑物、附属设施补偿标准', '乳胶漆', '墙面', '平方米', '20.0', '含彩绘', '乳胶漆', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('741e26c2-81aa-4080-a65f-700475677d6b', '征收集体土地构筑物、附属设施补偿标准', '粉水', '墙面', '平方米', '5.0', '', '粉水', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('ff8deda2-3f1e-4033-bf94-dca6343e5f87', '征收集体土地构筑物、附属设施补偿标准', '石灰', '墙面', '平方米', '2.0', '', '石灰', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('cb168b85-e2bc-4970-b7d5-67c796568cfe', '征收集体土地构筑物、附属设施补偿标准', '细泥', '墙面', '平方米', '1.0', '', '细泥', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('224f006e-bc82-4063-a2c0-c49d669d366c', '征收集体土地构筑物、附属设施补偿标准', '墙纸', '墙面', '平方米', '40.0', '', '墙纸', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('eb9f6464-bc09-4f2c-8dae-5daf6bc46a76', '征收集体土地构筑物、附属设施补偿标准', '软包', '墙面', '平方米', '60.0', '', '软包', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('2ea3bba7-380b-4c0d-9060-dd1bb6b25952', '征收集体土地构筑物、附属设施补偿标准', '磨砂玻璃', '墙面', '平方米', '50.0', '含带镂刻图案；背面带彩灯加30元/平方米。', '磨砂玻璃', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f0286f3c-bb67-4f19-8b20-cbc572285a8e', '征收集体土地构筑物、附属设施补偿标准', '镜面', '墙面', '平方米', '30.0', '', '镜面', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('cdd75eda-4692-4f39-b786-813ad88bb305', '征收集体土地构筑物、附属设施补偿标准', '浮雕', '墙面', '平方米', '500.0', '', '浮雕', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('55b4bdb4-4d92-45d9-ad8d-9f984a8d4e0c', '征收集体土地构筑物、附属设施补偿标准', '仿漆涂料', '墙面', '平方米', '8.0', '', '仿漆涂料', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('0f7620d2-20ce-4fc1-857f-808e35a5c21e', '征收集体土地构筑物、附属设施补偿标准', '印花涂料墙壁', '墙面', '平方米', '15.0', '含彩绘', '印花涂料墙壁', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('4a03be89-0c4e-4135-b597-62f6e72a9f31', '征收集体土地构筑物、附属设施补偿标准', '铁皮雨棚', '雨棚', '平方米', '40.0', NULL, '铁皮雨棚', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('cf3cb1ae-0109-4048-9fb1-46352c6b03cc', '征收集体土地构筑物、附属设施补偿标准', '混凝土雨棚', '雨棚', '平方米', '35.0', NULL, '混凝土雨棚', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('0c04f05f-c2e2-4704-b892-139460e09196', '征收集体土地构筑物、附属设施补偿标准', '塑胶、中空塑胶', '雨棚', '平方米', '60.0', NULL, '塑胶、中空塑胶', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f3fb51bb-3359-421f-b6c7-2517829d1111', '征收集体土地构筑物、附属设施补偿标准', '阳光板', '雨棚', '平方米', '70.0', NULL, '阳光板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('33712d8a-10f0-4274-9447-c04e4b148e93', '征收集体土地构筑物、附属设施补偿标准', '彩钢', '雨棚', '平方米', '80.0', NULL, '彩钢', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('3f9523a5-5844-4c7a-86ff-54f8bf7db104', '征收集体土地构筑物、附属设施补偿标准', '彩秞瓦', '雨棚', '平方米', '50.0', NULL, '彩秞瓦', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('d48e4628-0916-40f7-8fd5-a9bfb924ce39', '征收集体土地构筑物、附属设施补偿标准', '青瓦雨棚', '雨棚', '平方米', '30.0', NULL, '青瓦雨棚', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('5c985ee4-3f0e-476f-902f-d788797dd6f8', '征收集体土地构筑物、附属设施补偿标准', '浆砌片石', '堡坎', '立方米', '120.0', NULL, '浆砌片石', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('abc20967-8c17-43ff-b365-c0e4e91ae303', '征收集体土地构筑物、附属设施补偿标准', '乱石', '堡坎', '立方米', '40.0', NULL, '乱石', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('79854af3-8248-4ba8-9b4a-dc74ddefce95', '征收集体土地构筑物、附属设施补偿标准', '混泥土', '堡坎', '立方米', '350.0', NULL, '混泥土', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('24614c50-5bb2-43cc-a529-6858540cdc5d', '征收集体土地构筑物、附属设施补偿标准', '砖砌、砖砌', '堡坎', '立方米', '350.0', NULL, '砖砌、砖砌', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('330bdf87-a575-4799-897c-c044b0a051b7', '征收集体土地构筑物、附属设施补偿标准', '石板', '路', '平方米', '60.0', '', '石板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('21b71062-302d-4649-9d33-f863d54e4929', '征收集体土地构筑物、附属设施补偿标准', '水泥路', '路', '立方米', '350.0', '厚度大于6cm以上', '水泥路', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('245a1461-ba9b-4e02-87e6-bb0171133afd', '征收集体土地构筑物、附属设施补偿标准', '泥结石', '路', '平方米', '20.0', '土路不予补偿', '泥结石', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('085505e3-37f2-4a8f-b1ac-83997e818d51', '征收集体土地构筑物、附属设施补偿标准', '石、砖砌、混泥土', '水沟', '米', '40.0', '单边40。特指房前屋后。', '石、砖砌、混泥土', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('2c60857a-3cd5-4585-abcb-acd4385342dc', '征收集体土地构筑物、附属设施补偿标准', '石、砖砌、混泥土', '水沟', '米', '60.0', '双边60。特指房前屋后。', '石、砖砌、混泥土', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('ba6ffa65-c5a0-471b-9498-ef7e47e3e2db', '征收集体土地构筑物、附属设施补偿标准', '石、砖砌、混泥土', '水沟', '米', '80.0', '双边既垫底80。特指房前屋后。', '石、砖砌、混泥土', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8c6111f6-2c4f-429b-88b3-c06773eb7d13', '征收集体土地构筑物、附属设施补偿标准', '石、砖砌、混泥土', '水沟', '米', '100.0', '四边暗沟100。特指房前屋后。', '石、砖砌、混泥土', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('778579ac-e811-4026-868f-b035046fd57d', '征收集体土地构筑物、附属设施补偿标准', '土 ', '水沟', '米', '8.0', '以院坝边为界', '土 ', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('199c29bf-df00-4491-853c-ddf4f657b8a7', '征收集体土地构筑物、附属设施补偿标准', '普通', '水龙头', '个', '10.0', '塑料10', '普通', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('49515aa4-bc27-4554-bd25-f161421a1774', '征收集体土地构筑物、附属设施补偿标准', '普通', '水龙头', '个', '20.0', '铁或不锈钢20', '普通', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('ffb3e51b-e7de-485d-bc59-a26c0886d50f', '征收集体土地构筑物、附属设施补偿标准', '精品', '水龙头', '个', '100.0', '造型的', '精品', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('535f3274-5175-454c-a9e2-385c2cbc7c9a', '征收集体土地构筑物、附属设施补偿标准', '闸阀', '闸阀', '个', '10.0', '塑料10', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('61b5487a-2b99-4fe1-9669-e20ea14386a5', '征收集体土地构筑物、附属设施补偿标准', '闸阀', '闸阀', '个', '20.0', '铁20', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('40149d25-32bb-40ed-8052-e2c9c18137b5', '征收集体土地构筑物、附属设施补偿标准', '闸阀', '闸阀', '个', '25.0', '不锈钢25', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e1a4e4dc-835f-40d9-9f9b-d569a00edc01', '征收集体土地构筑物、附属设施补偿标准', '闸阀', '闸阀', '个', '30.0', '铜30', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('c2845494-d9ea-4526-8fbb-e0f3530ffc81', '征收集体土地构筑物、附属设施补偿标准', '钢管', '水管', '米', '8.0', '4cm以下', '钢管', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('85760bf5-2db7-4b8d-a5e7-dd0955974d0f', '征收集体土地构筑物、附属设施补偿标准', '钢管', '水管', '米', '15.0', '5-8cm', '钢管', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('0e864094-a8f7-4a46-9726-9c50d73af935', '征收集体土地构筑物、附属设施补偿标准', '钢管', '水管', '米', '20.0', '9cm以上', '钢管', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8a1abb24-e9dd-4393-a5cc-6266579cc06c', '征收集体土地构筑物、附属设施补偿标准', '塑管', '水管', '米', '5.0', '普通塑料管5', '塑管', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('1a321299-79aa-4a9a-830d-748daf564f59', '征收集体土地构筑物、附属设施补偿标准', '塑管', '水管', '米', '15.0', 'ppr管15', '塑管', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('bd0a7d2b-6f8e-457e-b043-f7e7115e4fae', '征收集体土地构筑物、附属设施补偿标准', '塑管', '水管', '米', '25.0', '不锈钢管25', '塑管', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('6ef99588-5e0f-4ccc-a03b-47b2ef0f9e13', '征收集体土地构筑物、附属设施补偿标准', '塑管', '水管', '米', '30.0', '塑钢管30', '塑管', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8d8d116f-de5d-4a7e-b75c-78c6aa46c99c', '征收集体土地构筑物、附属设施补偿标准', 'PVC管', '水管', '米', '10.0', '6cm以下10。含管道接头', 'PVC管', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('c554438e-5673-4759-8c68-92bc486d0d03', '征收集体土地构筑物、附属设施补偿标准', 'PVC管', '水管', '米', '20.0', '6-10cm20。含管道接头', 'PVC管', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b32476ee-ca40-4c7e-9871-7ddf6b327dcc', '征收集体土地构筑物、附属设施补偿标准', 'PVC管', '水管', '米', '30.0', '10cm以上30。含管道接头', 'PVC管', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('077a6633-9c70-45cd-ad5b-1a4c8a8d6e59', '征收集体土地构筑物、附属设施补偿标准', '未开户', '水表', '支', '30.0', '', '未开户', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('a3a74dfb-3496-4c30-a00d-91bea2e4b0d4', '征收集体土地构筑物、附属设施补偿标准', '开户', '水表', '支', '500.0', '', '开户', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('859f4ef3-24ad-414d-99b1-8664688f59b1', '征收集体土地构筑物、附属设施补偿标准', '木仓', '仓储', '立方米', '80.0', '', '木仓', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('6aa970e9-4a06-4a4d-8620-ecd492a19a82', '征收集体土地构筑物、附属设施补偿标准', '砖石仓', '仓储', '立方米', '120.0', '', '砖石仓', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('cd7ef31f-c78a-4b63-bf92-6c42b7bdc474', '征收集体土地构筑物、附属设施补偿标准', '闭路、加密、光纤电视', '电视线', '个', '400.0', '卫星接收器给10元/台拆卸补偿', '闭路、加密、光纤电视', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('5780fc46-a2ed-4835-bf77-3bf27d61feac', '征收集体土地构筑物、附属设施补偿标准', '有线电话', '有线电话', '部', '300.0', '无线电话不予补偿', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('a3c329b3-82e5-45ab-a77c-c9609eebf695', '征收集体土地构筑物、附属设施补偿标准', '网络上户', '网络上户', '户', '300.0', '无线网络不予补偿', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e2528442-eb4f-4089-a6cf-03570e5325c6', '征收集体土地构筑物、附属设施补偿标准', '空调', '空调', '个', '150.0', '拆卸补偿', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('fc8f1aa9-6e19-4dba-b1d4-4dbda0f5545d', '征收集体土地构筑物、附属设施补偿标准', '吊扇、壁扇、排风扇', '吊扇、壁扇、排风扇', '个', '20.0', '拆卸补偿', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('c712c0b4-37d9-460a-a0b6-5dccdeb192b4', '征收集体土地构筑物、附属设施补偿标准', '面板', '隔断', '平方米', '70.0', '', '面板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('6e9c5187-fa32-4ef5-9bf6-4a8b3404c72f', '征收集体土地构筑物、附属设施补偿标准', '宝丽板、三合板', '隔断', '平方米', '40.0', '', '宝丽板、三合板', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('af85e764-61c3-4ff4-a023-0fa49939a342', '征收集体土地构筑物、附属设施补偿标准', '精装装饰木隔断', '隔断', '平方米', '150.0', '含彩绘玻璃', '精装装饰木隔断', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b7f52942-2aff-449f-987c-65b73fcf8d2c', '征收集体土地构筑物、附属设施补偿标准', '巴壁衣柜、装饰柜', '巴壁衣柜、装饰柜', '平方米', '160.0', '含装饰', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8e9861cb-cbbf-4ffe-9fb5-81de41f15390', '征收集体土地构筑物、附属设施补偿标准', '巴壁碗柜', '巴壁碗柜', '格', '90.0', '含瓷砖', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('01208ae3-fb57-4a73-81df-ba71beac3615', '征收集体土地构筑物、附属设施补偿标准', '案板', '案板', '张', '200.0', '含瓷砖.木案板不予补偿', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('211ae062-4d23-48a0-99e0-ab850c26e294', '征收集体土地构筑物、附属设施补偿标准', '灶', '灶', '眼', '200.0', '含瓷砖，土灶扣50元/眼。', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f52008f4-e539-49b0-b725-c0215bd8d661', '征收集体土地构筑物、附属设施补偿标准', '水缸', '水缸', '口', '250.0', '含瓷砖，未有瓷砖扣50元/口。', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e7e3fe3d-103b-43a8-a56b-c6c2d12b96e7', '征收集体土地构筑物、附属设施补偿标准', '洗衣台', '洗衣台', '张', '120.0', '含瓷砖.未有瓷砖80元/张', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8ffbd169-93af-477e-aa2c-a5567355d17b', '征收集体土地构筑物、附属设施补偿标准', '烟囱', '烟囱', '米', '25.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('a64db184-de29-49aa-9062-11a32fd263b9', '征收集体土地构筑物、附属设施补偿标准', '砖、瓦窑', '砖、瓦窑', '口', '2000.0', '1万匹以下', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('c884412e-5e54-44ab-aca7-99bb5aed968d', '征收集体土地构筑物、附属设施补偿标准', '苕窖', '苕窖', '口', '350.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f4d22d5b-7798-4b6a-a990-04f64ddcd611', '征收集体土地构筑物、附属设施补偿标准', '钢筋', '栏杆', '平方米', '70.0', '含装饰', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('65561a33-e864-40d0-866c-9f3af9386273', '征收集体土地构筑物、附属设施补偿标准', '不锈钢', '栏杆', '平方米', '120.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('ea168780-c74e-4f5d-9ebb-66b5c21e65f7', '征收集体土地构筑物、附属设施补偿标准', '木雕、玻璃或其它上等材料', '栏杆', '平方米', '250.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f66d3ab0-1cac-45b2-84f1-fb725b5eb006', '征收集体土地构筑物、附属设施补偿标准', '砖、石', '栏杆', '平方米', '80.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('ea667a02-78a2-4884-90f9-47a0bb3aa676', '征收集体土地构筑物、附属设施补偿标准', '抽油烟机、电气热水器', '抽油烟机、电气热水器', '个', '150.0', '拆卸补偿', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('424f83be-4b0a-4caf-8c87-35243dc05df5', '征收集体土地构筑物、附属设施补偿标准', '太阳能热水器', '太阳能热水器', '台', '1000.0', '拆卸补偿', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e03bbeda-499e-4fd2-9331-9b16309ae16f', '征收集体土地构筑物、附属设施补偿标准', '农具废弃', '农具废弃', '人', '500.0', '集体经济组织土地全部征收后，农户无地可种的', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('bdb8a1ed-cac4-48dc-a565-88f8ec3cb97a', '征收集体土地构筑物、附属设施补偿标准', '磨面、打米、榨油、粉碎、斩草等机器', '磨面、打米、榨油、粉碎、斩草等机器', '台', '300.0', '拆卸补偿', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('4dde4b37-d520-4ce3-89ee-38433af0bb16', '征收集体土地构筑物、附属设施补偿标准', '门面广告牌', '广告牌', '平方米', '100.0', '木质100元。', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f343e256-be0f-4e2c-9e8c-9635078c053a', '征收集体土地构筑物、附属设施补偿标准', '门面广告牌', '广告牌', '平方米', '120.0', '木质100元。带霓虹灯加20。', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('a2bbb94f-1b54-4732-8518-2017326c838e', '征收集体土地构筑物、附属设施补偿标准', '门面广告牌', '广告牌', '平方米', '200.0', '金属或玻璃200。', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('59997809-900f-433b-8cc0-5aa3dc6dec45', '征收集体土地构筑物、附属设施补偿标准', '门面广告牌', '广告牌', '平方米', '220.0', '金属或玻璃200。带霓虹灯加20。', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('18804a8d-cfdc-4d60-a31a-fec21ddb1c64', '征收集体土地构筑物、附属设施补偿标准', '霓虹显示屏', '广告牌', '平方米', '1500.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('1a631ed7-0cbf-4480-99ed-698d53f0513b', '征收集体土地构筑物、附属设施补偿标准', '雕塑', '雕塑', '个', '100.0', '拆卸补偿。含石磨、碓窝、石碾等', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('077fa288-0c5a-4b90-8a7e-cb983a2ddf79', '征收集体土地构筑物、附属设施补偿标准', '堰塘、水库', '堰塘、水库', '立方米', '30.0', '含微水池', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('bdd8350f-4836-41d6-9384-cc9f684b547c', '征收集体土地构筑物、附属设施补偿标准', '乱石、土围墙', '围墙', '平方米', '43.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('60e7c4c1-be3f-46d2-bd32-c9abb7e9f12f', '征收集体土地构筑物、附属设施补偿标准', '砖、石围墙', '围墙', '平方米', '60.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8a6018a3-7955-48cc-9ee7-c0dbe194a47e', '征收集体土地构筑物、附属设施补偿标准', '土 ', '院坝（晒坝）', '平方米', '8.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('cf061a00-2af2-4379-8034-dc50d955337a', '征收集体土地构筑物、附属设施补偿标准', '三合土', '院坝（晒坝）', '平方米', '60.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('eb3a569b-32c3-4ae9-bcc0-472c91aa99e0', '征收集体土地构筑物、附属设施补偿标准', '砖、石、水泥砂浆', '院坝（晒坝）', '平方米', '120.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e47179a6-6622-4eff-9a5a-87d189ea8348', '征收集体土地构筑物、附属设施补偿标准', '石板坝', '院坝（晒坝）', '平方米', '160.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('44139304-5191-408e-94b4-3ca2804a38ad', '征收集体土地构筑物、附属设施补偿标准', '土粪池', '粪池', '立方米', '80.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('186fb12e-e476-4b06-a331-a8c27e5f40b8', '征收集体土地构筑物、附属设施补偿标准', '水泥、三合土粪池', '粪池', '立方米', '120.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('07300aea-e10b-48a2-a018-594768cd78f9', '征收集体土地构筑物、附属设施补偿标准', '条石粪池', '粪池', '立方米', '170.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('73bc3146-cafd-44e8-a5d3-5b9c5694398b', '征收集体土地构筑物、附属设施补偿标准', '水井', '土水井', '口', '450.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('933ef8ed-c357-4cd2-92da-f11af651c3e8', '征收集体土地构筑物、附属设施补偿标准', '水井', '条石水井', '口', '1500.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('cdff9ce3-6111-4947-bad3-6ef8b74b509e', '征收集体土地构筑物、附属设施补偿标准', '水井', '压水井（含机械取水）', '口', '1800.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('9cec22b5-b111-4949-a11d-dbcd93192a00', '征收集体土地构筑物、附属设施补偿标准', '水井', '机井', '口', '1800.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8bfd9e07-75a2-4eab-b98d-1d313b9c527a', '征收集体土地构筑物、附属设施补偿标准', '坟墓', '普通土堆坟', '座', '1000.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b55f83df-c36d-41a8-a21d-2f0e3c6fbd93', '征收集体土地构筑物、附属设施补偿标准', '坟墓', '砖、石、水泥修砌', '座', '2000.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('dc562bf0-59ce-44bb-a147-17a86abdc65f', '征收集体土地构筑物、附属设施补偿标准', '坟墓', '砖、石、水泥修砌加有花岗石、其他材料刻成的墓碑', '座', '3000.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e30167e3-0208-47e7-a884-99fdae61bd50', '征收集体土地构筑物、附属设施补偿标准', '沼气池', '产气沼气', '立方米', '300.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('581a31a2-8fd1-44ac-9cea-226c6834da99', '征收集体土地构筑物、附属设施补偿标准', '沼气池', '未产气沼气', '立方米', '250.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('661fdc23-795f-47a0-8609-0da44f403129', '征收集体土地构筑物、附属设施补偿标准', '鱼池', '浆砌鱼池', '平方米', '250.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('a1e3a036-0b2c-4751-b705-3f5cc36a15a0', '征收集体土地构筑物、附属设施补偿标准', '鱼池', '砖石砌筑鱼池', '平方米', '300.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('deff0c46-d25f-4205-a1ad-2a764e8c9d4a', '征收集体土地构筑物、附属设施补偿标准', '鱼池', '土鱼池', '平方米', '80.0', NULL, NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('dc4217a6-a101-44ee-9bd1-e3b83170aff6', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '株', '500.0', '指单株。', '盛产', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('9bfca1a4-47e4-442a-958f-004058f2d0c2', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '元/亩', '12000.0', '成片林0.5亩以上盛产12000元/亩。', '盛产', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('c69b3f56-e9eb-4e25-a1d9-bf735da1b04a', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '株', '100.0', '指单株。', '初产', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('6c3cb367-9c46-4644-b7b7-3009908b1efb', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '元/亩', '8000.0', '成片林0.5亩以上初产8000元/亩。', '初产', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f5eb414c-88ca-4a7a-a6f7-fd2a4214425e', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '株', '20.0', '指单株。', '幼树', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f5b7f49a-2727-4903-a7db-252e7acc2425', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '元/亩', '5000.0', '成片林0.5亩以上幼树5000元/亩。', '幼树', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('fc1d9c70-88ac-4013-8bf8-9df3cef22e75', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '株', '2.0', '指单株。', '幼苗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8f2d7333-f9eb-49c9-a4fb-c8afc7a513f8', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '乔木', '元/亩', '3000.0', '成片林0.5亩以上幼苗3000元/亩。', '幼苗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b6c05bb5-6599-432d-9ddf-d4eb0c2ffade', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '藤本', '丛', '5.0', '', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b52cb0a7-df76-4ef6-b43a-357709e7c815', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '藤本', '元/亩', '5500.0', '成片在0.5亩以上按3500-5500元/亩计算', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b3770bf8-fa49-41e1-95f2-8c54cf6980cc', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '丛', '200.0', '', '盛产', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('3265d885-71dd-4534-b1ba-4a046518cb8a', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '元/亩', '8000.0', '成片在0.5亩以上按8000元/亩计算', '盛产', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8adaea97-b723-429a-8a20-17c12636c23b', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '丛', '80.0', '', '初产', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f7eed721-fb67-482b-90b3-ab89f9b2229d', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '元/亩', '5000.0', '成片在0.5亩以上按5000元/亩计算', '初产', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('6fe2c68c-6e04-45b7-b18d-c62e9f49b1f7', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '丛', '8.0', '', '幼树', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('75637493-b4b6-4f80-9388-98487acac2bc', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '元/亩', '1200.0', '成片在0.5亩以上按1200元/亩计算', '幼树', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('de5bb581-5e94-400f-b292-6edb250617e5', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '丛', '2.0', '', '幼苗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('c0695436-cfe1-4d58-ad66-9887a7cdc9e5', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '药材', '灌木', '元/亩', '800.0', '成片在0.5亩以上按800元/亩计算', '幼苗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('96e90a81-656b-4196-a41a-04d6d0235d05', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '乔木类', '株', '1000.0', '名贵类，合理密植株数', '大', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('fb8b53ee-0abf-40e0-b0eb-d725a69f0c1b', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '乔木类', '株', '300.0', '名贵类，合理密植株数', '中', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('70d015a8-de99-4305-95d6-b67312c99fee', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '乔木类', '株', '10.0', '名贵类，合理密植株数', '幼树', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('1470e6f0-00d7-4fff-bab8-3bcb2bb42df2', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '乔木类', '株', '2.0', '名贵类，合理密植株数', '幼苗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('3b133a00-9a2c-49e4-a2d9-3ccb31ba035f', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '灌木类', '丛', '300.0', '名贵类，合理密植株数', '大', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('93c83af2-bb8b-4e77-8ffd-9edd66905a1c', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '灌木类', '丛', '70.0', '名贵类，合理密植株数', '中', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b9790d47-118b-48fe-844a-1e0cf609510e', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '灌木类', '丛', '3.0', '名贵类，合理密植株数', '小', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e45d7d1c-66db-4ac7-bc24-c0bd87233777', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '草本类', '窝', '1.0', '', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('41fc47a6-d4e0-452e-b5b7-0933fce711f6', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '草本类', '元/亩', '3000.0', '成片在0.1亩以上按3000元/亩计算', '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('783b6f1e-18df-445e-ac05-c7170d432b6f', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '藤本类', '丛', '100.0', '', '大', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b79c8013-0f59-4f16-8631-b0a7df036d9e', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '藤本类', '丛', '10.0', '', '中', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('eaa01ef3-0cc9-4861-b1fe-95f76deca148', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '花卉、花木', '藤本类', '丛', '2.0', '', '小', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('42fc721b-3cb9-4fd4-bd69-d1fe919772c4', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '用材木', '用材木', '株', '40.0', '单块面积在0.5亩以上的为成片用材林3000-5000元/亩，薪炭林和灌木林按用材林0.5倍补偿，防护林按用材林的2倍补偿，特殊用材林按用材林的3倍补偿。单块在0.5亩以下的为零星用材林。楠竹归属用材木类。', '大', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('995a81b9-9aa9-4680-8943-a546403ecec4', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '用材木', '用材木', '株', '5000.0', '单块面积在0.5亩以上的为成片用材林3000-5000元/亩，薪炭林和灌木林按用材林0.5倍补偿，防护林按用材林的2倍补偿，特殊用材林按用材林的3倍补偿。单块在0.5亩以下的为零星用材林。楠竹归属用材木类。', '大', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('4e1b1625-dbaf-46c1-ae00-7e493a627469', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '用材木', '用材木', '株', '20.0', '单块面积在0.5亩以上的为成片用材林3000-5000元/亩，薪炭林和灌木林按用材林0.5倍补偿，防护林按用材林的2倍补偿，特殊用材林按用材林的3倍补偿。单块在0.5亩以下的为零星用材林。楠竹归属用材木类。', '中', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('87d420a6-814a-4de8-b538-80774d2641e9', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '用材木', '用材木', '株', '5000.0', '单块面积在0.5亩以上的为成片用材林3000-5000元/亩，薪炭林和灌木林按用材林0.5倍补偿，防护林按用材林的2倍补偿，特殊用材林按用材林的3倍补偿。单块在0.5亩以下的为零星用材林。楠竹归属用材木类。', '中', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b8adad73-b04e-4af7-8bc7-9133db1b87df', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '用材木', '用材木', '株', '3.0', '单块面积在0.5亩以上的为成片用材林3000-5000元/亩，薪炭林和灌木林按用材林0.5倍补偿，防护林按用材林的2倍补偿，特殊用材林按用材林的3倍补偿。单块在0.5亩以下的为零星用材林。楠竹归属用材木类。', '小', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('dad3e3a5-c52b-4440-ab4b-2c61397e6caf', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '用材木', '用材木', '株', '5000.0', '单块面积在0.5亩以上的为成片用材林3000-5000元/亩，薪炭林和灌木林按用材林0.5倍补偿，防护林按用材林的2倍补偿，特殊用材林按用材林的3倍补偿。单块在0.5亩以下的为零星用材林。楠竹归属用材木类。', '小', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('e58f737b-d1ce-4dd4-ab9a-2cf1e555d382', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '苗圃', '经济林', '亩', '5000.0', NULL, '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b4bce132-1511-4d64-acf8-311c6a17e8be', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准', '苗圃', '用材林', '亩', '2000.0', NULL, '', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('598c468a-ef21-4a4c-abc1-f70bbbeaf2bd', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '株', '183.0', '挂果3—9年', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('1f0af830-7dc0-4440-b26a-caf2242900b3', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '株', '267.0', '挂果10年以上', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('1dc38346-15fd-479d-a283-0737136543e3', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '株', '97.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('7920a8fc-8ce5-41f1-851a-50f0a7d4fbf6', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '株', '17.0', '定植3年内', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('414e50d8-d8ef-4d40-be94-89b276e57f66', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '株', '23.0', '定植3年内', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('208fa783-07ed-4dc6-aafd-2b13eec96868', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '荔枝、樱桃、桂圆、枇杷、板栗、核桃、及其他坚果', '株', '167.0', '挂果3—9年', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('bfc1c40f-bf5b-436d-b72f-afd3a8c1d66e', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '荔枝、樱桃、桂圆、枇杷、板栗、核桃、及其他坚果', '株', '333.0', '挂果10年以上', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('977dfa0c-8156-4200-9378-aa08626185f1', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '荔枝、樱桃、桂圆、枇杷、板栗、核桃、及其他坚果', '株', '100.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('cf09d68e-2d4c-4266-88ec-d62e39aabdb0', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '荔枝、樱桃、桂圆、枇杷、板栗、核桃、及其他坚果', '株', '40.0', '定植3年以上', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('d14c6310-c53f-41b8-8b1a-f3a8aa9ed9bb', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '荔枝、樱桃、桂圆、枇杷、板栗、核桃、及其他坚果', '株', '27.0', '定植3年内', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('6529a79d-3385-4730-a04e-8517a93ac5fe', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '葡萄', '株', '7.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('77a20af3-95aa-4382-8269-62dcb768119c', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '葡萄', '株', '120.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('03b81803-8cf8-408f-8c6f-b1074aa3815f', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '桑树', '株', '4.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('19ca2909-5cbf-4836-9b08-8e7047282088', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '桑树', '株', '30.0', '', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('03d50eec-49e9-4c82-9ad9-7ee977079d45', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '竹林', '笼', '183.0', '25根以上，楠竹归属', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('5d33d16a-009a-4c7a-ac93-a6f3258d9c47', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '竹林', '笼', '100.0', '10—25根，用材木类', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('b8844387-c298-4a3a-a362-03d9798f221c', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（零星林木）', '经济林木', '竹林', '笼', '63.0', '10根以下', NULL, NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('53e3dd39-905d-4f46-ab22-7ba006f01bf9', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '亩', '13000.0', '成片面积0.5亩以上', '产果期-初果', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f56ec8b7-46f3-409f-a255-bcd7e3d3fdb4', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '亩', '17000.0', '成片面积0.5亩以上', '产果期-盛果', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('cfdc2dec-774d-4ab4-bfee-1ad9ce6eb05a', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '亩', '8000.0', '成片面积0.5亩以上', '产果期-衰果', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('a5095969-60d7-4f96-8f9c-621b706de777', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '亩', '800.0', '成片面积0.5亩以上', '幼苗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('26ba1aeb-adb5-4fec-b660-a0874a6a5877', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '桃子、李子、梨子、橙、橘、柚、苹果、杏子、柿子、枣等水果类', '亩', '800.0', '成片面积0.5亩以上', '幼树', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('77befb03-78d5-4741-b4bb-02acdef7b54f', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '荔枝、桂圆、枇杷、板栗、核桃、樱桃及各类坚果', '亩', '12000.0', '成片面积0.5亩以上', '产果期-初果', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('fff2cf17-5aaf-4ac3-b8c7-953b619bfcbe', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '荔枝、桂圆、枇杷、板栗、核桃、樱桃及各类坚果', '亩', '21000.0', '成片面积0.5亩以上', '产果期-盛果', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('6d9c25c8-6f87-4907-8742-ce6071540bec', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '荔枝、桂圆、枇杷、板栗、核桃、樱桃及各类坚果', '亩', '9000.0', '成片面积0.5亩以上', '产果期-衰果', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('f3cabb56-9536-439d-903d-21512e7d0d67', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '荔枝、桂圆、枇杷、板栗、核桃、樱桃及各类坚果', '亩', '800.0', '成片面积0.5亩以上', '幼苗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('4fd270be-6a75-4b5b-b43b-b27c840db0f8', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '荔枝、桂圆、枇杷、板栗、核桃、樱桃及各类坚果', '亩', '800.0', '成片面积0.5亩以上', '幼树', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('d7e5df96-2d82-49d5-b90f-1ce97d8bc8d1', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '葡萄', '亩', '800.0', '成片面积0.5亩以上', '幼苗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('8f99980c-536e-4ecb-95d5-959aaeed221d', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '葡萄', '亩', '10000.0', '成片面积0.5亩以上', '产果期', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('310d3299-1537-422a-8aac-b7b3f898fcd4', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '桑树', '亩', '500.0', '离地面高度1米以下', '幼苗', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('ce09dd0c-056e-4d63-b419-19b094af7f91', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '桑树', '亩', '2000.0', '初产叶', '产叶桑', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('5842e883-db5a-4595-b424-70f6fe72e715', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '桑树', '亩', '3500.0', '盛产叶', '产叶桑', NULL, NULL, '1');
INSERT INTO "public"."commodity" VALUES ('99c792f7-e480-47e4-bc91-b1743cec94aa', '征收集体土地林地、经济林木、用材林、花木花卉补偿标准（成片林木）', '经济林木', '竹林', '亩', '2800.0', '成片面积0.5亩以上', '竹林', NULL, NULL, '1');

-- ----------------------------
-- Primary Key structure for table commodity
-- ----------------------------
ALTER TABLE "public"."commodity" ADD CONSTRAINT "commodity_pkey" PRIMARY KEY ("id");
