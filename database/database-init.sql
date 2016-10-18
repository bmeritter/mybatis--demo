# create DB
DROP DATABASE IF EXISTS testMybatis;
CREATE DATABASE testMybatis;

# use DB
USE testMybatis;

# create table
DROP TABLE IF EXISTS  users;
CREATE TABLE  users (
    id int not null primary key AUTO_INCREMENT,
    name varchar(100) not null,
    sex varchar(6) not null
);

# insert some user information into table
INSERT INTO users(name, sex) VALUES( 'AAA', 'f');
INSERT INTO users(name, sex) VALUES( 'BBB', 'm');
INSERT INTO users(name, sex) VALUES( 'CCC', 'f');
INSERT INTO users(name, sex) VALUES( 'DDD', 'm');

# show all user information from users
SELECT * FROM testMybatis.users;