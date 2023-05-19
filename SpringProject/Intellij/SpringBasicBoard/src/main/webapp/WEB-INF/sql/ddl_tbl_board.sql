
-- tbl_board SQL

-- select
SELECT * FROM project.tbl_board;

-- insert
insert into tbl_board (title, content, writer) values('게시글 테스트1','게시글 쓰기 테스트 1','테스터');


-- update
update tbl_board set title='test11', content='test22', writer='test33', file='aa.jpg' where bno = 7;


-- delete