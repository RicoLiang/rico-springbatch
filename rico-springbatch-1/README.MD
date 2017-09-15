#Lombok
[Lombok 安装、入门 - 消除冗长的 java 代码](http://www.blogjava.net/fancydeepin/archive/2012/07/12/lombok.html)<br/>
[Java奇淫巧技之Lombok](http://blog.csdn.net/ghsau/article/details/52334762)<br/>
[官方注解](https://projectlombok.org/features/all)

##eclipse / myeclipse 手动安装 lombok
1. 将 lombok.jar 复制到 myeclipse.ini / eclipse.ini 所在的文件夹目录下
2. 打开 eclipse.ini / myeclipse.ini，在最后面插入以下两行并保存：
    -Xbootclasspath/a:lombok.jar
    -javaagent:lombok.jar
3.重启 eclipse / myeclipse
