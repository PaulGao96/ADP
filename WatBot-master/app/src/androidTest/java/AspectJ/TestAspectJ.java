package AspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

/**
 * Created by Liubaiyu on 2017/6/28.
 */

    @Aspect
    public class TestAspectJ {
        private static final String TAG = "tagliubaiyu";
        @Pointcut("execution(* com.example.vmac.WatBot.MainActivity.on*(..))")
        public void test(){}

    @Around("test()")

    public Object process(ProceedingJoinPoint point) throws Throwable {

        System.out.println("@Around：执行目标方法之前...");

        //访问目标方法的参数：

        Object[] args = point.getArgs();

        if (args != null && args.length > 0 && args[0].getClass() == String.class) {

            args[0] = "改变后的参数1";

        }

        //用改变后的参数执行目标方法

        Object returnValue = point.proceed(args);

        System.out.println("@Around：执行目标方法之后...");

        System.out.println("@Around：被织入的目标对象为：" + point.getTarget());

        return "原返回值：" + returnValue + "，这是返回结果的后缀";

    }

//    public void permissionCheck(JoinPoint point) {
//
//        System.out.println("@Before：模拟权限检查...");
//
//        System.out.println("@Before：目标方法为：" +
//
//                point.getSignature().getDeclaringTypeName() +
//
//                "." + point.getSignature().getName());
//
//        System.out.println("@Before：参数为：" + Arrays.toString(point.getArgs()));
//
//        System.out.println("@Before：被织入的目标对象为：" + point.getTarget());
//
//    }

//
//   public void releaseResource(JoinPoint point) {
//
//       System.out.println("@After：模拟释放资源...");
//
//       System.out.println("@After：目标方法为：" +
//
//               point.getSignature().getDeclaringTypeName() +
//
//               "." + point.getSignature().getName());
//
//       System.out.println("@After：参数为：" + Arrays.toString(point.getArgs()));
//
//       System.out.println("@After：被织入的目标对象为：" + point.getTarget());
//
//   }

}

