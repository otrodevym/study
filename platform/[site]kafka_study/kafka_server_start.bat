rem kafka_server_start.bat
@echo off

rem 현재 디렉토리 설정
pushd %~dp0
set KAFKA_HOME=%cd%
popd 

rem jdk.8.0.131 이상 버전에서 지원
REM set JAVA_HOME=%KAFKA_HOME%\java\jdk-
REM set KAFKA_OPTS=%KAFKA_OPTS% -Dkafka.logs.dir=%KAFKA_HOME%\logs

REM %KAFKA_HOME%\bin\windows\kafka-server-start.bat %KAFKA_HOME%\config\server.properties


set KAFKA_OPTS=
set KAFKA_OPTS=%KAFKA_OPTS% -Dkafka.logs.dir=%KAFKA_HOME%\logs
set KAFKA_OPTS=%KAFKA_OPTS% -Djava.security.auth.login.config=%KAFKA_HOME%\auth\kafka_jaas.conf
 
%KAFKA_HOME%\bin\windows\kafka-server-start.bat %KAFKA_HOME%\config\server.properties