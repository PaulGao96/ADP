package org.opensourcecurrency.hack.model.com.test.liubaiyu;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

/**
 * Created by Cooper on 2017/5/19 0019.
 */

@Aspect

public class AspectTest {

    private static final String TAG = "tag";
    @Pointcut("execution(* org.opensourcecurrency.hack.Send.onReceive(..))")
    public void test(){}
    @Before("test()")
    public void permissionCheck(JoinPoint point) {

        System.out.println("@Before：模拟权限检查...");

        System.out.println("@Before：目标方法为：" +

                point.getSignature().getDeclaringTypeName() +

                "." + point.getSignature().getName());

        System.out.println("@Before：参数为：" + Arrays.toString(point.getArgs()));

        System.out.println("@Before：被织入的目标对象为：" + point.getTarget());

    }
}

