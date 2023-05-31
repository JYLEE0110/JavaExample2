CREATE TABLE `member` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `uid` varchar(45)  NOT NULL,
  `pw` varchar(45) NOT NULL,
  `uuid` varchar(45) DEFAULT NULL, -- Cookie => 자동로그인 
  `uname` varchar(45) NOT NULL,
  `uphoto` varchar(45) DEFAULT NULL, -- 특정 Directory
  PRIMARY KEY (`idx`),
  UNIQUE KEY `uid_UNIQUE` (`uid`)
);

-- insert
INSERT INTO member
(uid, pw, uname , uphoto) -- idx는 autoIncrement / uuid는 난수 자동로그인이라 X
VALUES
('cool','1111','COOL','photo.jpg');
 
 -- INSERT INTO member (uid, pw, uname , uphoto) VALUES(?, ?, ?, ?);
 
 -- select : 로그인처리 -> uid, pw 비교해서 질의
 select *from member where uid = 'cool' and pw = '1111';
-- MemberDTO 데이터 저장 
-- select idx, uid, uname, uphoto from member where uid = ? and pw = ?;

select count(*) from member where uid = 'cool123';