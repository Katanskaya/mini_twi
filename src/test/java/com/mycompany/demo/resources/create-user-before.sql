delete from user_role;
delete from usr;

insert into usr (id, active, password, username)
values
    (1, true, '$2a$08$kjawIl8xYSWjPXJkpKv4becIyI7HW7Z8c9SDTRkv00eahc8SqMPFy', 'Ivan_Ivanov'),
    (2, true, '$2a$08$kjawIl8xYSWjPXJkpKv4becIyI7HW7Z8c9SDTRkv00eahc8SqMPFy', 'Mike');

insert into user_role (user_id, roles)
values
    (1, 'USER'),
    (1, 'ADMIN'),
    (2, 'USER');