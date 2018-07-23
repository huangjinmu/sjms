package com.jim.sjms.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by jim on 2018-07-22.
 */
public class FsProxy {
    public static  final String ln="\r\t";

    public static Object newProxyInstance(FsClassLoader classLoader,Class<?>[] interfaces,FsInvocationHandler h){
    try {

         //1.生成代理对象Java类
        String generateSrc = generateSrc(interfaces[0]);
        //2.将类输出到磁盘
        String path = FsProxy.class.getResource("").getPath();
        File f=new File(path+"$Proxy0.java");
        FileWriter fw = new FileWriter(f);
        fw.write(generateSrc);
        fw.close();
        //3.将java类编译成字节码文件
        JavaCompiler compiler= ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> javaFileObjects = manager.getJavaFileObjects(f);
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, javaFileObjects);
        task.call();
        manager.close();
        //4.将字节码动态加载到jvm;

        Class proxyClass = classLoader.findClass("$Proxy0");
        //5.返回被代理后的对象
        Constructor c = proxyClass.getConstructor(FsInvocationHandler.class);
        return c.newInstance(h);
    }catch (Exception e){
        e.printStackTrace();
    }

    return null;
    }

    private static String generateSrc(Class <?> interfaces){
        //生成代理类
        StringBuffer src=new StringBuffer();
        src.append("package com.jim.sjms.proxy.custom;"+ln);
        src.append("import java.lang.reflect.Method;" + ln);
        src.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);

        src.append("FsInvocationHandler h;" + ln);

        src.append("public $Proxy0(FsInvocationHandler h) {" + ln);
        src.append("this.h = h;" + ln);
        src.append("}" + ln);

        for (Method m : interfaces.getMethods()) {
            src.append("public " + m.getReturnType().getName() + " " + m.getName() + "(){" + ln);

            src.append("try{" + ln);
            src.append("Method m = " + interfaces.getName() + ".class.getMethod(\"" +m.getName()+"\",new Class[]{});" + ln);
            src.append("this.h.invoke(this,m,null);" + ln);
            src.append("}catch(Throwable e){e.printStackTrace();}" + ln);
            src.append("}" + ln);
        }

        src.append("}");



        return src.toString();

    }

}
