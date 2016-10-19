package com.inga.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

    public class LoginInterceptor extends HandlerInterceptorAdapter {

        private final String mainURL="login";
	

    /**
     * 禁止非登陆状态直接访问内部url  跳转到登陆页面
     * 
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       
    	//拦截器，开发之前暂停使用，
        /*boolean isOk=false;
        String url=request.getRequestURL().toString();

        if(url.contains(mainURL)){
            isOk=true;
        }else{
            HttpSession session=request.getSession();
            String username= (String) session.getAttribute("username");

            if(username==null){
                //response.sendRedirect(request.getContextPath() + "/login.action");
                  response.sendRedirect("login.jsp");
		}
                isOk=false;
            }
        }
        return isOk;
        */
    	return true;

    }


}
