package himedia.myportal.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyInterceptor2 implements HandlerInterceptor {

	/**
	 * @Author : 202-12
	 * @Date   : 2025. 1. 17.
	 */
	private static Logger logger = LoggerFactory.getLogger(MyInterceptor2.class);
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.debug("MyInterceptor2.preHandle calls");
		
//		return HandlerInterceptor.super.preHandle(request, response, handler);
//		test로 인한 return값 true로 변경
		return true;
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.debug("MyInterceptor2.postHandle calls");		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.debug("MyInterceptor2.afterCompletion calls");
	}
	
	
	
}
