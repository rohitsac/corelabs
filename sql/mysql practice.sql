show databases;
use mydb;
show tables;
create table emp(id int not null, name varchar(50), primary key(id));
select * from emp;
select id, name from emp;
desc emp;
ALTER TABLE tmp ADD PRIMARY KEY (P_Id);
insert into emp values(101, "abc");
insert into emp (id) values (102);
select distinct id, name from emp;
select id from emp where id=1;
select id from emp where id<2;
select id from emp where id>1;
select id from emp where id!=1;
select id from emp where id<>1;
select * from emp where id=1 OR name = "abc";
select * from emp where id=1 AND name = "abc";
SELECT * FROM Customers WHERE Country='Germany' AND (City='Berlin' OR City='München');
select * from emp order by id asc;
select * from emp order by id desc;
select * from emp order by id, name;
select * from emp order by id asc, name desc;

UPDATE Customers SET ContactName='xyz', City='Hamburg' WHERE CustomerName='Adf';

delete from emp;
DELETE FROM Customers WHERE CustomerName='abc' AND ContactName='xyz';

-----------------------------------------------------------
-----------------------SQL INJECTION-----------------------
-----------------------------------------------------------
SELECT * FROM Users WHERE UserId = 105 or 1=1;			--	(ALWAYS TRUE)

SELECT TOP 2 * FROM Customers;		
SELECT * FROM EMP limit 5;
SELECT * FROM EMP limit 5, 2;		--	2 is offset

SELECT * FROM EMP where rownum <= 5;		--oracle

SELECT * FROM Customers WHERE City LIKE 's%';
SELECT * FROM Customers WHERE City LIKE '%s';
SELECT * FROM Customers WHERE City LIKE '%s%';
SELECT * FROM Customers WHERE City LIKE '_s';
SELECT * FROM Customers WHERE City LIKE 's_n_k';
SELECT * FROM Customers WHERE City LIKE '[abc]%';
SELECT * FROM Customers WHERE City LIKE '[!abc]%';
SELECT * FROM Customers WHERE City LIKE '[a-f]%';

SELECT * FROM Customers WHERE City IN ('Paris','London');

SELECT * FROM Products WHERE Price BETWEEN 10 AND 20;
SELECT * FROM Products WHERE Price NOT BETWEEN 10 AND 20;

SELECT * FROM Products WHERE (Price BETWEEN 10 AND 20) AND NOT CategoryID IN (1,2,3);

SELECT * FROM Products WHERE ProductName BETWEEN 'C' AND 'M';
SELECT * FROM Products WHERE ProductName NOT BETWEEN 'C' AND 'M';

SELECT * FROM Orders WHERE OrderDate BETWEEN #07/04/1996# AND #07/09/1996#;
---------------------------------------------------------------------------------
-----------------------ALIAS----------------------------------------------------
----------------------------------------------------------------------------------
SELECT CustomerName AS Customer, ContactName AS [Contact Person] FROM Customers;

SELECT Name, Address+', '+City+', '+PostalCode+', '+Country AS Address FROM Customers;
SELECT Name, CONCAT(Address,', ',City,', ',PostalCode) AS Address FROM Customers;

SELECT o.OrderID, o.OrderDate, c.Name FROM Customers AS c, Orders AS o WHERE c.Name="Around the Horn" AND c.ID=o.ID;


----------------------------------------------------------------------------------
In SQL, we have the following constraints:

NOT NULL - Indicates that a column cannot store NULL value
UNIQUE - Ensures that each row for a column must have a unique value
PRIMARY KEY - A combination of a NOT NULL and UNIQUE. Ensures that a column (or combination of two or more columns) have a unique identity which helps to find a particular record in a table more easily and quickly
FOREIGN KEY - Ensure the referential integrity of the data in one table to match values in another table
CHECK - Ensures that the value in a column meets a specific condition
DEFAULT - Specifies a default value for a column

-------------------------------------------------------------------------------------

CREATE TABLE Persons
(
P_Id int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255),
PRIMARY KEY (P_Id)
);
---------------------primary key on multople columns(composite primary key)--------------
CREATE TABLE Persons
(
P_Id int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255),
CONSTRAINT pk_PersonID PRIMARY KEY (P_Id,LastName)
)
-------------------------
ALTER TABLE Persons DROP PRIMARY KEY;

ALTER TABLE Persons ADD PRIMARY KEY (P_Id);
-------------------------FOREIGN KEY-----------------------------
CREATE TABLE Orders
(
O_Id int NOT NULL,
OrderNo int NOT NULL,
P_Id int,
PRIMARY KEY (O_Id),
FOREIGN KEY (P_Id) REFERENCES Persons(P_Id)
)
------------------------FOREIGN KEY ON MULTIPLE COLUMNS----------------------------

CREATE TABLE Orders
(
O_Id int NOT NULL,
OrderNo int NOT NULL,
P_Id int,
PRIMARY KEY (O_Id),
CONSTRAINT fk_PerOrders FOREIGN KEY (P_Id)
REFERENCES Persons(P_Id)
)
--------------------------------------------------------------------

ALTER TABLE Orders ADD FOREIGN KEY (P_Id) REFERENCES Persons(P_Id);

ALTER TABLE Orders DROP FOREIGN KEY fk_PerOrders;

--------------CHECK----------------------------
CREATE TABLE Persons
(
P_Id int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255),
CHECK (P_Id>0)
)
-------------------------------------------------
-----------------------CHECK ON MULTIPLE COMUMNS--------------------------
CREATE TABLE Persons
(
P_Id int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255),
CONSTRAINT chk_Person CHECK (P_Id>0 AND City='Sandnes')
)
------------------------------------------------------------------------

ALTER TABLE Persons ADD CHECK (P_Id>0);
ALTER TABLE Persons ADD CONSTRAINT chk_Person CHECK (P_Id>0 AND City='Sandnes');

ALTER TABLE Persons DROP CHECK chk_Person;

--------------------DEFAULT---------------------------------
CREATE TABLE Persons
(
P_Id int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255) DEFAULT 'Sandnes'
)
------------------------------------------------------------

ALTER TABLE Person ALTER City SET DEFAULT 'SANDNES';
ALTER TABLE Persons ALTER City DROP DEFAULT;

-----------------INDEX-------------------------------
CREATE INDEX PIndex ON Persons (LastName);
CREATE UNIQUE INDEX PIndex ON Persons (LastName);

CREATE INDEX PIndex ON Persons (LastName, FirstName);

---------------DROP--------------------------
ALTER TABLE table_name DROP INDEX index_name;
DROP TABLE table_name;
DROP DATABASE DB_name;
TRUNCATE TABLE TABLE_NAME;
ALTER TABLE Persons DROP COLUMN DateOfBirth;

ALTER TABLE Persons ALTER COLUMN DateOfBirth year;
----------------------------------------------------------
----------------AUTO INCREMENT------------------------------
CREATE TABLE Persons
(
ID int NOT NULL AUTO_INCREMENT,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255),
PRIMARY KEY (ID)
)
-------------------------------------------------------
ALTER TABLE Persons AUTO_INCREMENT=100;

-----------------------------------------------------------------------
----------------------SQL FUNCTIONS------------------------------------
SQL Aggregate Functions
SQL aggregate functions return a single value, calculated from values in a column.

Useful aggregate functions:

AVG() - Returns the average value
COUNT() - Returns the number of rows
FIRST() - Returns the first value
LAST() - Returns the last value
MAX() - Returns the largest value
MIN() - Returns the smallest value
SUM() - Returns the sum
SQL Scalar functions
SQL scalar functions return a single value, based on the input value.

Useful scalar functions:

UCASE() - Converts a field to upper case
LCASE() - Converts a field to lower case
MID() - Extract characters from a text field
LEN() - Returns the length of a text field
ROUND() - Rounds a numeric field to the number of decimals specified
NOW() - Returns the current system date and time
FORMAT() - Formats how a field is to be displayed
-----------------------------------
SELECT AVG(Price) AS PriceAverage FROM Products;
SELECT COUNT(*) FROM EMPLOYEES;
SELECT COUNT(EMP_ID) FROM EMPLOYEES;

SELECT COUNT(DISTINCT CustomerID) AS NumberOfCustomers FROM Orders;

SELECT MAX(Price) AS HighestPrice FROM Products;
SELECT MIN(Price) AS HighestPrice FROM Products;

SELECT SUM(Price) AS HighestPrice FROM Products;

SELECT MID(City,1,4) AS ShortCity FROM Customers;
SELECT ProductName, Price, FORMAT(Now(),'YYYY-MM-DD') AS PerDate FROM Products;

-----------------------DATE------------------------
SELECT * FROM Orders WHERE OrderDate='2008-11-11';

select round(1.2);
select sysdate();
select month(sysdate());
select now();
select curdate();
select curtime();
select date(2015-10-10);
select datediff(2015-10-10, 2016-10-10);
select date format();


--------------------------------------------------












