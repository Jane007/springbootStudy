package com.hmzone.eureka.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class AccessFilter extends ZuulFilter {

    @Override
    public boolean shouldFilter() {
        return true;// 是否执行该过滤器，此处为true，说明需要过滤
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(String.format("%s demoFilter request to %s", request.getMethod(), request.getRequestURL().toString()));
        String username = request.getParameter("username");
        if(!StringUtils.isEmpty(username)&&username.equals("zhang")){
            ctx.setSendZuulResponse(true);//对该请求进行路由
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess",true);
        }else{
            ctx.setSendZuulResponse(false);//对请求不进行路由
            ctx.setResponseStatusCode(401);//// 返回错误码
            ctx.setResponseBody("{\"result\":\"usesrname is not correct!\"}");
            ctx.set("isSuccess",false);
        }
        return null;
    }

    /*
    pre：可以在请求被路由之前调用
    route：在路由请求时候被调用
    post：在route和error过滤器之后被调用
    error：处理请求时发生错误时被调用
    */
    @Override
    public String filterType() {
        return "pre";// 前置过滤器
    }


    @Override
    public int filterOrder() {
        return 0;// 优先级为0，数字越大，优先级越低
    }
}
