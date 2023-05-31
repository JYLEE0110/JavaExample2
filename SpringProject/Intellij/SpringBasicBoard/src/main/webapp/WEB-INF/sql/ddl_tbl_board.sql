
-- tbl_board SQL

-- select
select *from tbl_board;


select b.bno, b.title, b.content, b.file, m.uname as writer, b.memidx
from tbl_board b, member m
where b.memidx = m.idx;


SELECT * FROM project.tbl_board;
SELECT * FROM project.tbl_board order by bno desc limit 0, 5; -- 1 page (1-1)*5 => 0
SELECT * FROM project.tbl_board order by bno desc limit 5, 5; -- 2 page (2-1)*5 => 5
SELECT * FROM project.tbl_board order by bno desc limit 10, 5; -- 2 page (3-1)*5 => 10
SELECT * FROM project.tbl_board order by bno desc limit 15, 5; -- 2 page (4-1)*5 => 15



-- insert
insert into tbl_board (title, content, writer) values('게시글 테스트1','게시글 쓰기 테스트 1','테스터');

insert into tbl_board (title, content, memidx) values('게시글 테스트1','게시글 쓰기 테스트 1',1);
-- insert into tbl_board (title, content, memidx) values(#{}, #{}, #{});

insert into tbl_board (title, content, memidx) values('게시글 테스트1','게시글 쓰기 테스트 1',5);

-- update
update tbl_board set title='test11', content='test22', writer='test33', file='aa.jpg' where bno = 7;
-- update tbl_board set title=#{}, content=#{}, writer=#{}, file=#{} where bno = #{};

-- delete



select count(*) from tbl_board;