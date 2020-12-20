create table account
(
    id       not null
        constraint account_pkey
            primary key,
    status  varchar(255),
    content varchar(255)
);

alter table account
    owner to postgres;

create table developer
(
    id_developer bigint not null
        constraint developer_pkey
            primary key,
    firstname    varchar(255),
    lastname     varchar(255),
    account_id   bigint
        constraint fk797nvx3iu2b2h8h56stx30gxy
            references account
);

alter table developer
    owner to postgres;

create table skill
(
    id_skill bigint not null
        constraint skill_pkey
            primary key,
    name     varchar(255)
);

alter table skill
    owner to postgres;

create table developer_skill
(
    developer_id_developer bigint not null
        constraint fk6kxbophc26barl1nun0frqi0w
            references developer,
    skills_id_skill        bigint not null
        constraint fk93m3v3dhc51hm54jt201ja9xp
            references skill,
    constraint developer_skill_pkey
        primary key (developer_id_developer, skills_id_skill)
);

alter table developer_skill
    owner to postgres;

