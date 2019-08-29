package com.offcn.zuulgateway.web;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class RoleCheckFilter extends ZuulFilter {


    /*过滤器的类型*/
    @Override
    public String filterType() {
        return "pre";//前置过滤
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        //业务逻辑

        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        //token=offcn    token必须等于offcn，才让他请求到目标资源

        String token = request.getParameter("token");
        if(token!=null && token.equals("offcn")){
            System.out.println("验证通过");//放行，请求到目标资源
        }else{
            currentContext.setSendZuulResponse(false);//拦截
            currentContext.setResponseStatusCode(401);
            try {
                currentContext.getResponse().getWriter().write("yanzhengshibai");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return null;
    }
}
