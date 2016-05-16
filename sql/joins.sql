-- 3 tables are as follows:

 mysql> select * from jlcstud;
+-----+------+-------+
| sid | name | email |
+-----+------+-------+
| 101 | a    | a@jlc |
| 102 | b    | b@jlc |
| 103 | c    | c@jlc |
| 104 | d    | d@jlc |
| 105 | e    | e@jlc |
| 106 | f    | f@jlc |
+-----+------+-------+
6 rows in set (0.00 sec)

mysql> select * from jlcfee;
+-----+------+------+
| fid | fee  | sid  |
+-----+------+------+
|   1 | 1000 |  101 |
|   2 | 2000 |  102 |
|   3 | 3000 |  103 |
|   4 | 4000 |  104 |
|   5 | 5000 |  105 |
+-----+------+------+
5 rows in set (0.00 sec)

mysql> select * from jlcadd;
+-----+----------+------+
| aid | location | sid  |
+-----+----------+------+
|  11 | bang     |  101 |
|  22 | hyd      |  102 |
|  33 | chennai  |  103 |
|  44 | pune     |  104 |
+-----+----------+------+
4 rows in set (0.00 sec)



create table jlcstud(sid int primary key, name varchar(12), email varchar(50));
create table jlcfee(fid int primary key, fee float, sid int);
create table jlcadd(aid int primary key, location varchar(15), sid int);

-- ################     INNER JOIN     ##################

select * from jlcstud, jlcfee where jlcstud.sid=jlcfee.sid;
select st.sid, st.name, st.email, fe.fee from jlcstud st, jlcfee fe where st.sid=fe.sid;
select * from jlcstud, jlcfee, jlcadd where jlcstud.sid = jlcfee.sid and jlcstud.sid = jlcadd.sid;
select st.sid, st.name, st.email, fe.fee, ad.location from jlcstud st, jlcfee fe, jlcadd ad where st.sid=fe.sid and st.sid=ad.sid;
select * from jlcstud inner join jlcfee on jlcstud.sid=jlcfee.sid;
select * from jlcstud inner join jlcfee using (sid);
select * from jlcstud natural join jlcfee;
select * from jlcstud inner join jlcfee;

-- ################     LEFT OUTER JOIN     ##################

select * from jlcstud left join jlcfee on jlcstud.sid=jlcfee.sid;
select * from jlcstud left outer join jlcfee on jlcstud.sid=jlcfee.sid;
select * from jlcstud left outer join jlcfee using(sid);

-- ################     RIGHT OUTER JOIN     ##################

select * from jlcstud right join jlcfee on jlcstud.sid=jlcfee.sid;
select * from jlcstud right outer join jlcfee on jlcstud.sid=jlcfee.sid;
select * from jlcstud right outer join jlcfee using(sid);

-- ################     FULL OUTER JOIN     ##################

select * from jlcstud left join jlcfee on jlcstud.sid=jlcfee.sid UNION select * from jlcstud right join jlcfee on jlcstud.sid=jlcfee.sid;

-- ################     SELF JOIN     ##################

create table employee(eid int, ename varchar(5), mgrid int);
insert into employee values(101, 'Sri', 103);

select emp.ename "Emp Name", mgr.ename as "Manager Name" from employee emp, employee mgr where emp.mgrid=mgr.eid;


-- ################     CROSS JOIN     ##################

select emp.ename "Emp Name", mgr.ename as "Manager Name" from employee emp, employee mgr;

-- ################     Sub Queries     ##################
create table emp1 as select * from employee;
create table emp2 as select ename, eid from employee;
create table emp3 as select emp.eid, ename, name, sid from employee emp, jlcstud st where emp.eid=st.sid;

-- ################     SEQUENCE     ##################
create table sqstud(sno int primary key, name varchar(12));
create table loginfo(sno int references sqstud(sno), uname varchar(12));

--	***********************************************************
SELECT VERSION( )	Server version string
SELECT DATABASE( )	Current database name (empty if none)
SELECT USER( )		Current username
SHOW STATUS			Server status indicators
SHOW VARIABLES		Server configuration variables

--	##########################################################################

