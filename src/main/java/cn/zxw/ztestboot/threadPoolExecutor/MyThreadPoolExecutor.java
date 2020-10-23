package cn.zxw.ztestboot.threadPoolExecutor;

import javassist.ClassPool;
import javassist.bytecode.ConstPool;
import javassist.bytecode.analysis.Executor;

/**
 * @author : ZXW
 * @version : 1.0
 * @date : 2020-10-16 14:08
 * @Description : 手写线程池
 */
public class MyThreadPoolExecutor extends Executor {
    public MyThreadPoolExecutor(ClassPool classPool, ConstPool constPool) {
        super(classPool, constPool);
    }
}
