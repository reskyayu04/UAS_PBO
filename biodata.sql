create database Biodata;
use Biodata;
create table biodata(
no_id int primary key,
nama varchar(20),
alamat varchar(50),
jk enum('L','P'),
email varchar(20));