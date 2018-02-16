CREATE TABLE job_title (
    job_id serial NOT NULL,
    title varchar(45),
    CONSTRAINT pk_job_title_job_id PRIMARY KEY (job_id)
);

CREATE TABLE department (
    department_id serial NOT NULL,
    department varchar(45) NOT NULL,
    CONSTRAINT pk_department_department_id PRIMARY KEY (department_id)
);

CREATE TABLE project (
    project_id serial NOT NULL,
    project varchar(45) NOT NULL
    start_date timestamp without time zone,
    employees integer NOT NULL,
    CONSTRAINT pk_project_project_id PRIMARY KEY (project_id)
);

CREATE TABLE employee (
    employee_id serial NOT NULL,
    job_id integer NOT NULL,
    last_name varchar(45) NOT NULL,
    first_name varchar(45) NOT NULL,
    gender varchar(45) NOT NULL,
    birthday timestamp without time zone,
    hire_date timestamp without time zone,
    department integer NOT NULL,
    project integer NOT NULL,
    CONSTRAINT pk_employee_employee_id PRIMARY KEY (employee_id),
    CONSTRAINT fk_job_id foreign key (job_id) REFERENCES job_title(job_id),
    CONSTRAINT fk_job_id foreign key (job_id) REFERENCES job_title(job_id),
    CONSTRAINT fk_department_id foreign key (department_id) REFERENCES department(department_id),
    CONSTRAINT fk_project_id foreign key (project_id) REFERENCES project(project_id)
);


insert into job_title (job_id, title) values (1, 'CEO');
insert into job_title (job_id, title) values (2, 'CO-CEO');
insert into depertment (department_id, department) values (1, 'Finance');
insert into project (project_id, project, start_date, employee) values (1, 'Startup', '2007-03-27 06:05:28.996577', 1);
insert into employee (employee_id, job_id, last_name, first_name, gender, birthday, hire_date) values (1, 1, 'Ross', 'Bob', 'M', '2007-01-27 06:05:28.996577', '2007-02-27 06:05:28.996577');
insert into employee (employee_id, job_id, last_name, first_name, gender, birthday, hire_date) values (2, 2, 'Doe', 'Jane', 'F', '2007-01-27 06:05:28.996577', '2007-03-27 06:05:28.996577');

