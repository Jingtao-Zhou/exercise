# Jingtao's practice project

## Framework
This project is developed based on SpringBoot Framework and Spring Data.

## Database Dependencies
1、`Mysql 5.7` and could be managed by `phpmyadmin:4.8`(run by docker container).

## Features/Practices
1、Whether service is on could be check by sending GET request to `http://47.103.124.197:2333/health`
without any request header or body.

2、Could get user list by sending GET request to `http://47.103.124.197:2333/api/list`
without any request header or body.

3、Could add user by sending POST request to `http://47.103.124.197:2333/api/sign_up`
with request body: 
```
{
    "name": {user name}
}
```
The user name could not be null, or it will return invalid message(Implemented by Spring AOP).
