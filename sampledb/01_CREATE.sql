/* DB作成 */
DROP DATABASE IF EXISTS sampledb;
CREATE DATABASE sampledb CHARACTER SET utf8 COLLATE utf8_general_ci;
 
/* ユーザを作成 */
DROP USER IF EXISTS embexU;
CREATE USER embexU IDENTIFIED BY 'embexP';

/* 権限付与 */
GRANT ALL PRIVILEGES ON sampledb.* TO embexU;

/*テーブル作成*/
CREATE TABLE sampledb.m_employee
(
    code                        CHAR(6) NOT NULL,
    name                        VARCHAR(15),
    age                         INT,
    section                     VARCHAR(15),
    PRIMARY KEY (code)
);
