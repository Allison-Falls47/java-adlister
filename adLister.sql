use adlister_db;

create table user
(
    id int unsigned not null auto_increment,
    username varchar(255) not null,
    email varchar(255) not null,
    password varchar(255) not null,
    primary key (id)
);

create table ads
(
    id int unsigned not null auto_increment,
    user_id int unsigned not null,
    title varchar (200) not null,
    description text not null,
    primary key (id),
    foreign key (user_id) references user (id)
        on delete cascade
);