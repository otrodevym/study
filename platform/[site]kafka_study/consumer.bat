@echo off
 
rem 현재 디렉토리 설정
pushd %~dp0
set KAFKA_HOME=%cd%
popd
 
rem jdk.8.0_131 이상 버전에서 지원
REM set JAVA_HOME=%KAFKA_HOME%\java\jdk-11.0.5
set CONSUMER_CONF=%KAFKA_HOME%\auth\consumer_jaas.conf
 
%KAFKA_HOME%/bin/windows/kafka-console-consumer.bat --bootstrap-server "localhost:9092" --topic "local-topic" --group "local-group" --consumer.config=%CONSUMER_CONF%



REM Consumer 권한 부여 스크립트 실행
rem Consumer 생성
%KAFKA_HOME%/bin/windows/kafka-acls.bat --add --consumer --authorizer-properties "zookeeper.connect=localhost:2181" --allow-principal User:dochi --topic "local-topic" --group "local-group"

REM Consumer 권한 확인
rem 권한 확인
%KAFKA_HOME%/bin/windows/kafka-acls.bat --list --authorizer-properties "zookeeper.connect=localhost:2181" --topic "local-topic"