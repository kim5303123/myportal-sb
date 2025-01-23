package himedia.myportal.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

	/**
	 * @Author : 202-12
	 * @Date : 2025. 1. 17.
	 */

	private static Logger logger = LoggerFactory.getLogger(MyInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.debug("MyInterceptor.preHandel calls");
//		preHandle의 리턴값이 false면 -> 이 후의 인터셉터와 컨트롤러는 실행되지 않음
//		return HandlerInterceptor.super.preHandle(request, response, handler);
		
//		테스트로 인한 리턴값 true 변경
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.debug("MyInterceptor.postHandle calls");
//		호출된 handler 정보 확인
		if(handler instanceof HandlerMethod) {
			HandlerMethod handlerMethod = (HandlerMethod)handler;
			
//			호출된 컨트롤러 메서드의 정보 확인
			String controllerName = handlerMethod.getBeanType().getName();
			
//			호출된 메서드 이름 확인
			String methodName = handlerMethod.getMethod().getName();
			
			logger.debug("Controller: " + controllerName + ". Method:" + methodName);
		}
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
		

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.debug("MyInterceptor.afterCompletion calls");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
