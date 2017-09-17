# Lombok
[Lombok 安装、入门 - 消除冗长的 java 代码](http://www.blogjava.net/fancydeepin/archive/2012/07/12/lombok.html)<br/>
[Java奇淫巧技之Lombok](http://blog.csdn.net/ghsau/article/details/52334762)<br/>
[官方注解](https://projectlombok.org/features/all)

## eclipse / myeclipse 手动安装 lombok
1. 将 lombok.jar 复制到 myeclipse.ini / eclipse.ini 所在的文件夹目录下<br/>
2. 打开 eclipse.ini / myeclipse.ini，在最后面插入以下两行并保存：<br/>
    -Xbootclasspath/a:lombok.jar<br/>
    -javaagent:lombok.jar<br/>
3.重启 eclipse / myeclipse<br/>

# SpringBatch学习文章
[使用 Spring Batch 构建企业级批处理应用](https://www.ibm.com/developerworks/cn/java/j-lo-springbatch1/)
[Spring Batch 之 JobParameters (十)](http://www.cnblogs.com/gulvzhe/archive/2012/01/31/2332530.html)
` Bean的scope属性为step(scope="step")，这是SpringBatch的一个后绑定技术，就是在生成Step的时候，才去创建bean。

# 问题记录
## Resource leak: 'context' is never closed
[Resource leak: 'context' is never closed](http://blog.csdn.net/seagal890/article/details/53958868)
## SpringBatch框架schema文件
[Batch Namespace](https://docs.spring.io/spring-batch/trunk/reference/html/domain.html)
## Spring注入枚举
[spring 注入一个以枚举类型对象](http://www.cnblogs.com/0201zcr/p/5082871.html)

# 待解决的问题
## spring注入java.lang.Class
[java反射方法时，方法里面的需要其他的bean怎么注入 ](http://bbs.csdn.net/topics/390853859)
[Spring如何为一个bean注入另一个bean的class](http://www.iteye.com/problems/50259)
