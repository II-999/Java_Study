

# 卸载JDK

1. 删除Java的安装目录
2. 删除JavaHOME
3. 删除path下关于Java的目录
4. cmd中输入java -version，以此确认是否删除成功



# 安装JDK

1. [Java Downloads | Oracle](https://www.oracle.com/java/technologies/downloads/)

2. 双击安装JDK

3. **记住安装的路径**

4. 配置环境变量

   * 我的电脑-->鼠标右键-->属性

   * 我的电脑-->环境变量-->系统变量-->如下新建变量![image-20220212144552547](C:\Users\雕\AppData\Roaming\Typora\typora-user-images\image-20220212144552547.png)

     ![image-20220212145840701](C:\Users\雕\AppData\Roaming\Typora\typora-user-images\image-20220212145840701.png)

   * 系统变量-->单击Path-->右下角点击编辑-->新界面中单击新建-->输入`%JAVA_HOME%\bin`

5. cmd中输入java -version，以此确认是否安装成功
