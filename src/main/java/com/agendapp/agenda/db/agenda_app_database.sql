create database agenda_db;
use agenda_db;
create table category(id_category INT PRIMARY KEY auto_increment, category_name varchar(20));
create table note(id_note INT PRIMARY KEY auto_increment, tittle varchar(30), image_path varchar(30));
create table notification(id_notification INT PRIMARY KEY auto_increment, notification_name varchar(20));
create table registry(id_registry INT PRIMARY KEY auto_increment, registry_name varchar(30));
create table item_status(id_item_status INT PRIMARY KEY auto_increment, item_status_name varchar(20));
create table item_type(id_item_type INT PRIMARY KEY auto_increment, item_type_name varchar(20));
create table task(id_task INT PRIMARY KEY auto_increment, task_tittle varchar(30), task_description varchar(200), started_datetime datetime, finished_datetime datetime, id_item_status int, id_category int);


