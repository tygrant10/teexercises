CREATE TABLE job_title (
    job_id serial not null,
    title varchar(45),
    CONSTRAINT pk_job_title_job_id PRIMARY KEY (job_id)
);

CREATE TABLE department (
    department_id serial not null,
    department varchar(45) not null,
    CONSTRAINT pk_department_department_id PRIMARY KEY (department_id)
);

CREATE TABLE project (
    project_id serial not null,
    project varchar(45) not null,
    start_date timestamp without time zone,
    CONSTRAINT pk_project_project_id PRIMARY KEY (project_id)
);

CREATE TABLE employee (
    employee_id serial not null,
    job_id integer not null,
    last_name varchar(45) not null,
    first_name varchar(45) not null,
    gender varchar(45) not null,
    birthday timestamp without time zone,
    hire_date timestamp without time zone,
    department_id integer not null,
    project_id integer not null,
    CONSTRAINT pk_employee_employee_id PRIMARY KEY (employee_id),
    CONSTRAINT fk_job_id foreign key (job_id) references job_title(job_id),
    CONSTRAINT fk_department_id foreign key (department_id) references department(department_id),
    CONSTRAINT fk_project_id foreign key (project_id) references project(project_id)
);

insert into job_title (job_id, title) values (1, 'CEO');
insert into job_title (job_id, title) values (2, 'CO-CEO');
insert into job_title (job_id, title) values (3, 'Pleon');

SELECT setval(pg_get_serial_sequence('job_title', 'job_id'), 3);

insert into department (department_id, department) values (1, 'Management');
insert into department (department_id, department) values (2, 'Finance');
insert into department (department_id, department) values (3, 'Grunt');

SELECT setval(pg_get_serial_sequence('department', 'department_id'), 3);

insert into project (project_id, project, start_date) values (1, 'Startup', '2007-03-27 06:05:28.996577');
insert into project (project_id, project, start_date) values (2, 'Taxes', '2007-03-27 06:05:28.996577');
insert into project (project_id, project, start_date) values (3, 'Ditch-Diggin', '2007-03-27 06:05:28.996577');
insert into project (project_id, project, start_date) values (4, 'Something-Else-Good', '2007-03-27 06:05:28.996577');

SELECT setval(pg_get_serial_sequence('project', 'project_id'), 4);

insert into employee (employee_id, job_id, last_name, first_name, gender, birthday, hire_date, department_id, project_id) values (1, 1, 'Ross', 'Bob', 'M', '2007-01-27 06:05:28.996577', '2007-02-27 06:05:28.996577', 1, 1);
insert into employee (employee_id, job_id, last_name, first_name, gender, birthday, hire_date, department_id, project_id) values (2, 2, 'Ross', 'Jane', 'F', '2007-01-27 06:05:28.996577', '2007-03-27 06:05:28.996577', 2, 2);
insert into employee (employee_id, job_id, last_name, first_name, gender, birthday, hire_date, department_id, project_id) values (3, 1, 'Ross', 'Rick', 'M', '2007-01-27 06:05:28.996577', '2007-02-27 06:05:28.996577', 3, 3);
insert into employee (employee_id, job_id, last_name, first_name, gender, birthday, hire_date, department_id, project_id) values (4, 2, 'Ross', 'Carloa', 'F', '2007-01-27 06:05:28.996577', '2007-03-27 06:05:28.996577', 1, 4);
insert into employee (employee_id, job_id, last_name, first_name, gender, birthday, hire_date, department_id, project_id) values (5, 3, 'Ross', 'Pickle', 'M', '2007-01-27 06:05:28.996577', '2007-02-27 06:05:28.996577', 2, 1);
insert into employee (employee_id, job_id, last_name, first_name, gender, birthday, hire_date, department_id, project_id) values (6, 2, 'Ross', 'Mary', 'F', '2007-01-27 06:05:28.996577', '2007-03-27 06:05:28.996577', 3, 1);
insert into employee (employee_id, job_id, last_name, first_name, gender, birthday, hire_date, department_id, project_id) values (7, 1, 'Ross', 'Bob-II', 'M', '2007-01-27 06:05:28.996577', '2007-02-27 06:05:28.996577', 1, 1);
insert into employee (employee_id, job_id, last_name, first_name, gender, birthday, hire_date, department_id, project_id) values (8, 2, 'Ross', 'Sean', 'F', '2007-01-27 06:05:28.996577', '2007-03-27 06:05:28.996577', 2, 1);

SELECT setval(pg_get_serial_sequence('employee', 'employee_id'), 8);