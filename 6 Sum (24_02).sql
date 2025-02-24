-- https://github.com/annykh/genTech/blob/main/staff.txt

CREATE TABLE Staff (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    firstname VARCHAR(64) NOT NULL,
    lastname VARCHAR(64) NOT NULL,
    position VARCHAR(128),
    age INTEGER,
    has_child CHAR(1),
    username VARCHAR(128)
  );

INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Anna'
        , 'Daniels'
        , 'Senior Teacher'
        , 22
        , 'N'
        , 'annakhach5'
        );
        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Tom'
        , 'Austin'
        , 'Junior Blogger'
        , 25
        , 'Y'
        , 'tom12345'
        );
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Bill'
        , 'Lorentz'
        , 'Junior Web Developer'
        , 40
        , 'Y'
        , null
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Lily'
        , 'May'
        , 'Junior Backend Developer'
        , 25
        , 'Y'
        , 'lil12'
        );
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Nona'
        , 'Lucky'
        , 'Junior Teacher'
        , 20
        , 'N'
        , 'LuckyNona'
        ); 
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ( 'Nancy'
        , 'Greenberg'
        , 'Middle UI Designer'
        , 32
        , 'Y'
        , 'nancy1'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Daniel'
        , 'Faviet'
        , 'Senior UX Designer'
        , 43
        , 'Y'
        , 'favietD'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Ally'
        , 'Austin'
        , 'Junior UI Designer'
        , 28
        , 'N'
        , 'ally1'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Lily'
        , 'Chen'
        , 'Senior Teacher'
        , 25
        , 'Y'
        , null
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Anna'
        , 'Austin'
        , 'Middle Teacher'
        , 34
        , 'Y'
        , 'anna28'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Alexander'
        , 'Lorentz'
        , 'Junior Backend Developer'
        , 25
        , 'N'
        , 'alex12345'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Ashley'
        , 'Lorentz'
        , 'Junior UX Designer'
        , 18
        , 'N'
        , 'lorentz99'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Tom'
        , 'Lucky'
        , 'Middle Blogger'
        , 34
        , 'Y'
        , 'lucky78'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Ashley'
        , 'Weiss'
        , 'Junior Blogger'
        , 18
        , 'N'
        , 'weiss11'
        );
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Tom'
        , 'Weiss'
        , 'Junior UI Designer'
        , 18
        , 'N'
        , 'tom222'
        );   
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Anna'
        , 'Bloom'
        , 'Middle UX Designer'
        , 20
        , 'N'
        , 'bloom5'
        );   
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Tom'
        , 'Berg'
        , 'Middle Teacher'
        , 34
        , 'N'
        , 'tommy1'
        );   
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Ashley'
        , 'Berg'
        , 'Senior Teacher'
        , 37
        , 'N'
        , 'ash89'
        );
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Lily'
        , 'Weiss'
        , 'Middle Blogger'
        , 45
        , 'N'
        , 'lilyW1'
        );   
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Anna'
        , 'Lorentz'
        , 'Senior UX Designer'
        , 31
        , 'N'
        , null
        );   
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Ashley'
        , 'Weiss'
        , 'Middle UX Designer'
        , 18
        , 'N'
        , 'weiss1'
        );       
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Anna'
        , 'Keren'
        , 'Junior UX Designer'
        , 34
        , 'N'
        , 'annaK1'
        );       

-- 1. Создать новое поле experience_level и заполнить его значением:
	-- 	'Junior', если возраст меньше 25 лет.
	-- 	'Middle', если возраст от 25 до 35 лет.
	-- 	'Senior', если возраст больше 35 лет.
alter table Staff add column experience_level varchar(32);   
select age,
	case 
        when age < 25 then 'Junior'
        when age >= 25 and age < 35 then 'Middle'
        when age >= 35 then 'Senior'
	end as experience_level
from Staff;
    set sql_safe_updates = 0;
update Staff set experience_level = case
        when age < 25 then 'Junior'
        when age >= 25 and age < 35 then 'Middle'
        when age > 35 then 'Senior'
	end;

-- 2. Создать новое поле family_status и заполнить его значением:
	-- 'Has children', если has_child равно 'Y'.
	-- 'No children', если has_child равно 'N'.staff
alter table Staff add column family_status varchar(32);   
select has_child,
	case 
        when has_child = 'Y' then 'Has children'
        when has_child = 'N' then 'No children'
	end as family_status
from Staff;

update Staff set family_status = case
        when has_child = 'Y' then 'Has children'
        when has_child = 'N' then 'No children'
	end;
  
-- 3. Вывести фамилии всех сотрудников в верхнем регистре.
select lastname, upper(lastname) from Staff;  
 
-- 4. Вывести имена всех сотрудников в нижнем регистре.
select firstname, lower(firstname) from Staff; 

-- 5. Создать новое поле fullname и заполнить его объединением имени и фамилии (например, "Anna Daniels").
alter table Staff add column fullname varchar(64);  
select concat(firstname, ' ', lastname) as fullname from Staff; 
update Staff set fullname = concat(firstname, ' ', lastname);

-- 6. Вычислить длину имени каждого сотрудника и вывести как новое поле firstname_length.
select firstname, length(firstname) as firstname_length from Staff; 

-- 7. Найти сотрудников, у которых длина фамилии больше 6 символов.
select lastname, length(lastname) as lastname_length from Staff where length(lastname) > 6; 

-- 8. Создать новое поле child_bonus и заполнить его значением:
	-- 	500, если has_child равно 'Y'.
	-- 	0, если has_child равно 'N'.
alter table Staff add column child_bonus int;  
select has_child,
	case 
        when has_child = 'Y' then 500
        when has_child = 'N' then 0
	end as child_bonus
from Staff;

update Staff set child_bonus = case
        when has_child = 'Y' then 500
        when has_child = 'N' then 0
	end;
    
-- 9. Вывести возраст всех сотрудников, увеличенный на 5 лет.
select age, age + 5 from Staff; 

-- 10.Создать новое поле salary_category и заполнить его значением:
	-- 	'High', если возраст больше 30 и has_child равно 'Y'.
	-- 	'Medium', если возраст больше 30 и has_child равно 'N'.
	-- 	'Low' для остальных.
alter table Staff add column salary_category varchar(32);  
select age,
	case 
        when age > 30 and has_child = 'Y' then 'High'
        when age > 30 and has_child = 'N' then 'Medium'
        else 'Low'
	end as salary_category
from Staff;

update Staff set salary_category = case
        when age > 30 and has_child = 'Y' then 'High'
        when age > 30 and has_child = 'N' then 'Medium'
        else 'Low'
	end;    

-- 11. Найти сотрудников, у которых в фамилии есть символ 's'.
select lastname from Staff where lastname like "%s%"; 

-- 12. Создать новое поле position_rank и заполнить его значением:
	-- 	'Teacher', если должность содержит слово 'Teacher'.
	-- 	'Designer', если должность содержит слово 'Designer'.
	-- 	'Other' для остальных.
alter table Staff add column position_rank varchar(32);  
select position,
	case 
        when position like "%Teacher%" then 'Teacher'
        when position like "%Designer%" then 'Designer'
        else 'Other'
	end as position_rank
from Staff;

update Staff set position_rank = case
        when position like "%Teacher%" then 'Teacher'
        when position like "%Designer%" then 'Designer'
        else 'Other'
	end;   
    
-- 13. Найти сотрудников, чьи имена заканчиваются на 'y'.
select firstname from Staff where firstname like "%y"; 

-- 14. Найти сотрудников, у которых фамилии начинаются с 'A' или 'L'.
select lastname from Staff where lastname like "A%" or lastname like "L%"; 

-- 15. Создать новое поле username_default и заполнить его значением:
	-- 	username, если имя пользователя указано.
	-- 	'unknown', если имя пользователя не указано.
alter table Staff add column username_default varchar(32);  
select username,
	case 
        when username is null then 'unknown'
        when username is not null then 'username'
	end as username_default
from Staff;

update Staff set username_default = case
        when username is null then 'unknown'
        when username is not null then username
	end;       
    
    select * from Staff; 