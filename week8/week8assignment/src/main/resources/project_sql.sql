create table project (
    project_id int not null primary,
    project_name varchar(128) not null,
    estimated_hours decimal(7,2) not null,
    actual_hours decimal(7,2) not null,
    difficulty int,
    notes text
)
