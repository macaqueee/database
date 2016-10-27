package universe.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by macaque on 21.10.2016.
 */
@Aspect
public class ServiceAspect {

    private static final Logger LOGGER = Logger.getLogger(ServiceAspect.class);

    @Around("execution(public * universe.service..*(..))")
    public Object getLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        LOGGER.info("Inside method: " + proceedingJoinPoint.getSignature());

        Object object = null;

        try{
            object = proceedingJoinPoint.proceed();
        } catch (Throwable e){
            e.printStackTrace();
            LOGGER.info("Exception: " + e);
            throw e;
        }

        LOGGER.info("Successfully ending method: " + proceedingJoinPoint.getSignature());
        return object;
    }

}
