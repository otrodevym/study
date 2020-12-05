@echo off
 
rem 현재 디렉토리 설정
pushd %~dp0
set KAFKA_HOME=%cd%
popd
 
rem jdk.8.0_131 이상 버전에서 지원
REM set JAVA_HOME=%KAFKA_HOME%\java\jdk-11.0.5
set PRODUCER_CONF=%KAFKA_HOME%\auth\producer_jaas.conf
 
%KAFKA_HOME%/bin/windows/kafka-console-producer.bat --broker-list "localhost:9092" --topic "local-topic" --producer.config=%PRODUCER_CONF%
 

 rem Producer 생성
%KAFKA_HOME%/bin/windows/kafka-acls.bat --add --producer --authorizer-properties "zookeeper.connect=localhost:2181" --allow-principal User:producer --topic "local-topic"

REM  Producer 권한 확인
%KAFKA_HOME%/bin/windows/kafka-acls.bat --list --authorizer-properties "zookeeper.connect=localhost:2181" --topic "local-topic"