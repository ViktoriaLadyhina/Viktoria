-- 1. Создать базу данных company_db
create database company_db;
/*
-- 2. В базе данных company_db создать таблицу employees с полями:
	id (INT, PRIMARY KEY, AUTO_INCREMENT)
	name (VARCHAR(50), NOT NULL)
	position (VARCHAR(50), NOT NULL)
	salary (DECIMAL(10,2), CHECK(salary > 0))
	hire_date (VARCHAR(10), NOT NULL)
*/    
create table employee (
	id int primary key auto_increment,
	name varchar(50) not null,
	position varchar(50) not null,
	salary varchar(50) not null,
	hire_date varchar(10) not null
);

-- 3. Добавить в таблицу employees поле email
alter table employee add column email varchar(50);

-- 4. Удалить поле hire_date из таблицы employees
alter table employee drop column hire_date;

-- 5. Переименовать поле position в job_title
alter table employee rename column position to job_title;

-- 6. Изменить тип данных поля salary на INTEGER
alter table employee modify column salary INTEGER;

-- 7. Добавить новое поле department после job_title
alter table employee add column department varchar(50) after job_title;

-- 8. Заполнить таблицу employees следующими данными:

-- Сотрудник с именем "Анна", фамилией "Иванова", должностью "Менеджер", отделом "Отдел продаж", зарплатой 60000 и адресом электронной почты "anna.ivanova@example.ru".
insert into employee(name, job_title, department, salary, email) 
values("Анна Иванова", "Менеджер", "Отдел продаж", 60000, "anna.ivanova@example.ru");

-- Сотрудник с именем "Иван", фамилией "Смирнов", должностью "Разработчик", отделом "IT", зарплатой 75000 и адресом электронной почты "ivan.smirnov@example.com".
insert into employee(name, job_title, department, salary, email) 
values("Иван Смирнов", "Разработчик", "IT", 75000, "ivan.smirnov@example.com");

-- Сотрудник с именем "Мария", фамилией "Петрова", должностью "Бухгалтер", отделом "Финансы", зарплатой 50000 и адресом электронной почты "maria.petrova@example.com".
insert into employee(name, job_title, department, salary, email) 
values("Мария Петрова", "Бухгалтер", "Финансы", 50000, "maria.petrova@example.com");

-- Сотрудник с именем "Петр", фамилией "Васильев", должностью "Разработчик", отделом "IT", зарплатой 80000 и адресом электронной почты "petr.vasiliev@example.ru".
insert into employee(name, job_title, department, salary, email) 
values("Петр Васильев", "Разработчик", "IT", 80000, "petr.vasiliev@example.ru");

-- Сотрудник с именем "Екатерина", фамилией "Соколова", должностью "HR-специалист", отделом "HR", зарплатой 55000 и адресом электронной почты "ekaterina.sokolova@example.com".
insert into employee(name, job_title, department, salary, email) 
values("Екатерина Соколова", "HR-специалист", "HR", 55000, "ekaterina.sokolova@example.com");

-- Сотрудник с именем "Алексей", фамилией "Кузнецов", должностью "Менеджер по продажам", отделом "Отдел продаж", зарплатой 65000 и адресом электронной почты "alexey.kuznetsov@example.ge".
insert into employee(name, job_title, department, salary, email) 
values("Алексей Кузнецов", "Менеджер по продажам", "Отдел продаж", 65000, "alexey.kuznetsov@example.ge");

-- Сотрудник с именем "Ольга", фамилией "Морозова", должностью "Аналитик", отделом "Финансы", зарплатой 70000 и адресом электронной почты "olga.morozova@example.com".
insert into employee(name, job_title, department, salary, email) 
values("Ольга Морозова", "Аналитик", "Финансы", 70000, "olga.morozova@example.com");

-- 9. Вывести всех сотрудников, работающих в отделе "IT" или "Финансы"
select * from employee where department in ("IT", "Финансы");

-- 10. Вывести всех сотрудников, у которых фамилия начинается с "С"
select * from employee where name like ("% С%");

-- 11. Вывести всех сотрудников, у которых email оканчивается на "@example.com"
select * from employee where email like '%@example.com';

-- 12. Вывести всех сотрудников, у которых зарплата от 60000 до 75000
select * from employee where salary between 60000 and 75000;

-- 13. Вывести всех сотрудников, у которых должность содержит слово "Менеджер"
select * from employee where job_title like '%Менеджер%';

-- 14. Вывести всех сотрудников, кроме тех, кто работает в отделе "HR"
select * from employee where department not in ("HR");

-- 15. Вывести всех сотрудников, у которых зарплата больше 70000 или они работают в отделе "Финансы"
select * from employee where salary > 70000 and department = "Финансы";

-- 16. Вывести всех сотрудников, у которых email содержит ".ru" или ".ge"
select * from employee where email like '%.ru%' or email like '%.ge%';

-- 17. Вывести всех сотрудников, у которых фамилия содержит "ов" или "ев"
select * from employee where name like '%ов%' or email like '%ев%';

-- 18. Вывести всех сотрудников, у которых зарплата меньше 55000 и они не работают в IT-отделе
select * from employee where salary < 55000 and department != "IT";

-- 19. Вывести всех сотрудников в алфавитном порядке по имени
select * from employee order by name;

-- 20. Вывести всех сотрудников в порядке убывания зарплаты
select * from employee order by salary desc;

-- 21. Вывести всех сотрудников, работающих в отделе "IT" или "Финансы", отсортировав их по зарплате (по убыванию)
select * from employee where department in ("IT", "Финансы") order by salary desc;

-- 22. Вывести всех сотрудников, у которых зарплата выше 60000, отсортировав по фамилии в алфавитном порядке
select * from employee where salary > 60000 order by substring_index(name, ' ', -1);

-- 23. Вывести все уникальные отделы, в которых работают сотрудники
select distinct department from employee;

-- 24. Вывести все уникальные должности сотрудников
select distinct job_title from employee;

-- 25. Удалить таблицу employees
drop table employee;