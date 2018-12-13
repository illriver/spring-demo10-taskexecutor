package com.illriver.spring_demo10_taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 任务执行类
 * @author Pactera
 *
 */
@Service
public class AsyncTaskService {
	
	@Async
	public void executeAsncTask(Integer i) {
		System.out.println("执行异步任务："+i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("执行异步任务+1:"+(i+1));
	}
}
