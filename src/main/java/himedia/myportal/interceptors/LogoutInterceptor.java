package himedia.myportal.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LogoutInterceptor implements HandlerInterceptor {

	/**
	 * @Author : 202-12
	 * @Date   : 2025. 1. 17.
	 */
	
	private static final Logger logger = LoggerFactory.getLogger(LogoutInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
//		세션 지우고, 홈페이지로 리다이렉트 작업 시작
		logger.debug("LogoutInterceptor.preHandle call");
//		세션 무효화
		request.getSession().invalidate();
//		홈페이지로 리다이렉션
		response.sendRedirect(request.getContextPath());
		return false;
	}
	
	
	
}
