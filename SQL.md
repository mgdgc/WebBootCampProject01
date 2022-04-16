# SQL Queries

## Create 'Theater' Database
```sql
create database Theater default character set utf8 collate utf8_bin;
```

## Create 'movie' Table
```sql
create table movie
(
    movie_id   varchar(45) primary key not null,
    movie_name varchar(45)             not null,
    director   varchar(45)             not null,
    type       varchar(45)             not null,
    moviecol   varchar(45)
);
```

## Insert Data To 'movie' Table
```sql
insert into movie(movie_id, movie_name, director, type)
values
    (1, '아이언맨1', '감독1', 'SF'),
    (2, '스파이더맨', '감독2', 'SF'),
    (3, '라이언킹', '감독3', '다큐멘터리');
```