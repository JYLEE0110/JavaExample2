package com.hi.board.interceptor;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Log4j2
public class AuthCheckInterceptor implements HandlerInterceptor {

    // 요청
    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) throws Exception {


        HttpSession session = request.getSession();

        // 세션의 속성에서 "loginInfo" 속성 존재 유무에 따라

        if(session.getAttribute("loginInfo") != null){

            log.info("회원 로그인 체크 : 로그인 상태");
            // 있다면 return true

            return true;
        }

        // 없다면 /login 으로 redirect 처리
        log.info("회원 로그인 체크 : 비 로그인 상태");

        response.sendRedirect("/login");

        return false;
    }

    // 응답
    @Override
    public void postHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            ModelAndView modelAndView) throws Exception {

        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    // 요청 / 응답이 끝나고 다른 인터셉터가 있으면 다음 / 없으면 Controller로
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
