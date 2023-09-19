DROP TABLE IF EXISTS project_category;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS step;
DROP TABLE IF EXISTS material;
DROP TABLE IF EXISTS project;

create table project (
    project_id int not null auto_increment,
    project_name varchar(128) not null,
    estimated_hours decimal(7,2),
    actual_hours decimal(7,2),
    difficulty int,
    notes text,
    PRIMARY KEY (project_id)
);

create table material (
    material_id int not null auto_increment,
    project_id int not null,
    material_name varchar(128) not null,
    num_required int,
    cost decimal(7,2),
    PRIMARY KEY (material_id),
    FOREIGN KEY (project_id) references project (projec_id)
);

create table step (
	step_id int not null auto_increment,
    project_id int not null references project(project_id),
    step_text text,
    step_order int,
    PRIMARY KEY step_id,
    FOREIGN KEY (project_id) references project (project_id)
);

create table category (
	category_id int not null primary key auto_increment,
    category_name varchar(128) not null
);

create table project_category (
	project_id int references project(project_id),
    category_id int references category(category_id),
    unique key (project_id, category_id)
)
