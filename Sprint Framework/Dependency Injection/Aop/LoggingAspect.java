package Aop;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect{
    @Before("execution(* com.example.service.*.*(..))")
    public void LogBefore(){
        System.out.println("Method execution started");
    }
}