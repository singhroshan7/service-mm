CREATE USER sys_mm IDENTIFIED BY 'winter@123';
COMMIT;

CREATE DATABASE mm_db;
COMMIT;
	
GRANT ALL PRIVILEGES ON mm_db.* TO 'sys_mm'@'%';
COMMIT;
