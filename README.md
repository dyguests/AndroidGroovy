#About

这是一个 Groovy on android 的样例项目

开发工具请用Android Studio

#Usage

1.  在项目的build.grade中加入以下代码:

        classpath 'me.champeau.gradle:gradle-groovy-android-plugin:0.3.4'//第一步.

2.  在Module的build.grade中加入以下代码:

        apply plugin: 'me.champeau.gradle.groovy-android'//第二步.

        compile 'org.codehaus.groovy:groovy:2.4.0-beta-3:grooid'//第三步

enjoy it.

#Reference

1.别人的项目,我这个是抄的他的项目

https://github.com/DaleKocian/GroovyAndroid

2.我正在练习的项目

https://github.com/dyguests/HearthStone-android-groovy