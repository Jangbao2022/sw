###mybatis-generator 
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
###flyway
mvn flyway:migrate

###git 
git status
git add . 
git commit -m ''
git pull origin master
git push origin master


###关闭8080端口
netstat -ano | findstr 8080
taskkill /F /PID 1234