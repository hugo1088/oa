


INSERT INTO JOB_GRADE(ID,NAME,TENANT_ID) VALUES(1,'A','1');
INSERT INTO JOB_GRADE(ID,NAME,TENANT_ID) VALUES(2,'B','1');



INSERT INTO JOB_LEVEL(ID,NAME,GRADE_ID,TENANT_ID) VALUES(1,'3',1,'1');
INSERT INTO JOB_LEVEL(ID,NAME,GRADE_ID,TENANT_ID) VALUES(2,'2',2,'1');
INSERT INTO JOB_LEVEL(ID,NAME,GRADE_ID,TENANT_ID) VALUES(3,'1',2,'1');



INSERT INTO JOB_TYPE(ID,NAME,TENANT_ID) VALUES(1,'决策管理类','1');
INSERT INTO JOB_TYPE(ID,NAME,TENANT_ID) VALUES(2,'技术类','2');



INSERT INTO JOB_TITLE(ID,NAME,TENANT_ID) VALUES(1,'总经理','1');
INSERT INTO JOB_TITLE(ID,NAME,TENANT_ID) VALUES(2,'部门经理','1');



INSERT INTO JOB_INFO(ID,LEVEL_ID,TYPE_ID,TITLE_ID,TENANT_ID) VALUES(1,1,1,1,'1');
INSERT INTO JOB_INFO(ID,LEVEL_ID,TYPE_ID,TITLE_ID,TENANT_ID) VALUES(2,2,2,2,'1');



INSERT INTO JOB_USER(ID,USER_REF,JOB_INFO_ID,TENANT_ID) VALUES(1,'5',1,'1');
INSERT INTO JOB_USER(ID,USER_REF,JOB_INFO_ID,TENANT_ID) VALUES(2,'3',2,'1');
INSERT INTO JOB_USER(ID,USER_REF,JOB_INFO_ID,TENANT_ID) VALUES(3,'4',2,'1');


