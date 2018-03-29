

-------------------------------------------------------------------------------
--  ticket info
-------------------------------------------------------------------------------
CREATE TABLE TICKET_INFO(
        ID BIGINT NOT NULL,
	CODE VARCHAR(200),
        NAME VARCHAR(200),
	CONTENT VARCHAR(65535),
	CREATOR VARCHAR(64),
	STATUS VARCHAR(50),
	CREATE_TIME DATETIME,
	ASSIGNEE VARCHAR(64),
	UPDATE_TIME DATETIME,
	CATALOG_ID BIGINT,
	GROUP_ID BIGINT,
        CONSTRAINT PK_TICKET_INFO PRIMARY KEY(ID),
	CONSTRAINT FK_TIKCET_INFO_CATALOG FOREIGN KEY (CATALOG_ID) REFERENCES TICKET_CATALOG(ID),
	CONSTRAINT FK_TICKET_INFO_GRUOP FOREIGN KEY (GROUP_ID) REFERENCES TICKET_GROUP(ID)
);

