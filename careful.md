###mybaits generator查询错误
数据库表中字段名为describe ...

###application.properties 
&字符无需转义

###cookie添加
```java
class cookie{
        public void addCookie(){
            Cookie cookie = new Cookie("account", user.getAccount().toString());
            cookie.setMaxAge(TimeEnum.ONE_DAY.getTime());
            //一定要写setPath  不然会添加不上
            cookie.setPath("/");
            response.addCookie(cookie);
        }
}
 ```

