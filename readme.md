###mybatis-generator 
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
###flyway
mvn flyway:migrate