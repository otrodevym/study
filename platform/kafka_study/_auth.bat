rem --producer를 대신하는 명령어
%KAFKA_HOME%/bin/windows/kafka-acls.bat --add --authorizer-properties "zookeeper.connect=localhost:2181" --allow-principal User:p1 --allow-host 127.0.0.1 --operation Create --operation Write --operation Describe --topic "local-topic"
 
rem --consumer를 대신하는 명령어
%KAFKA_HOME%/bin/windows/kafka-acls.bat --add --authorizer-properties "zookeeper.connect=localhost:2181" --allow-principal User:c1 --allow-host 127.0.0.1 --operation Read --operation Describe --topic "local-topic" --group "local-group"
 
rem 권한 삭제
%KAFKA_HOME%/bin/windows/kafka-acls.bat --remove --authorizer-properties "zookeeper.connect=localhost:2181" --allow-principal User:p1 --allow-host 127.0.0.1 --operation Create --operation Write --operation Describe --topic "local-topic"