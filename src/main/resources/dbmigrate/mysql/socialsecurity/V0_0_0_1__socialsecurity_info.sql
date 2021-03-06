

-------------------------------------------------------------------------------
--  socialsecurity info
-------------------------------------------------------------------------------
CREATE TABLE SOCIALSECURITY_INFO(
        ID BIGINT NOT NULL,
	NAME VARCHAR(200),
	CREATE_TIME DATETIME,
	STATUS VARCHAR(50),
	TYPE VARCHAR(50),
	MONEY DOUBLE,
	START_TIME DATETIME,
	END_TIME DATETIME,
	EMPLOYEE_ID VARCHAR(64),
	TENANT_ID VARCHAR(64),
        CONSTRAINT PK_SOCIALSECURITY_INFO PRIMARY KEY(ID)
) ENGINE=INNODB CHARSET=UTF8;

