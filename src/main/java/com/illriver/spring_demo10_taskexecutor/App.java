package com.illriver.spring_demo10_taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主体类
 *
 */
public class App {
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        
        for (int i = 0; i < 10; i++) {
        	asyncTaskService.executeAsncTask(i);
        	asyncTaskService.executeAsyncTaskPlus(i);
		}
        context.close();
    }
}
