rem Topic 생성
set KAFKA_HOME=%cd%
%KAFKA_HOME%\bin\windows\kafka-topics.bat --create --zookeeper "localhost:2181" --replication-factor 1 --partitions 3 --topic "local-topic"

rem Topic 목록 확인
%KAFKA_HOME%\bin\windows\kafka-topics.bat --list --zookeeper "localhost:2181"

rem Producer 실행
%KAFKA_HOME%\bin\windows\kafka-console-producer.bat --broker-list "localhost:9092" --topic "local-topic"

%KAFKA_HOME%\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic "local-topic"