package com.chengzhi.web.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class AccessFilter extends ZuulFilter {
	
	private static final Logger log = LoggerFactory.getLogger(AccessFilter.class);
	/**
	 * 过滤器具体逻辑
	 */
	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info("send {} request to {}",request.getMethod(),request.getRequestURL().toString());
		String token = request.getParameter("accessToken");
		if (token == null) {
			log.info("token is empty");
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
		}
		log.info("token is ok");
		return null;
	}
	/**
	 * 判断该过滤器是否需要被执行
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}
	/**
	 * 过滤器执行顺序
	 */
	@Override
	public int filterOrder() {
		return 0;
	}
	/**
	 * 过滤器类型
	 * 	pre：可以在请求被路由之前调用
	 *	routing：在路由请求时候被调用
	 *	post：在routing和error过滤器之后被调用
	 *	error：处理请求时发生错误时被调用
	 */
	@Override
	public String filterType() {
		return "pre";
	}

}
