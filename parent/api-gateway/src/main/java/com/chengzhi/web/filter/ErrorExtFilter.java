package com.chengzhi.web.filter;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
@Component
public class ErrorExtFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		//仅处理post过滤器引起的异常
		RequestContext currentContext = RequestContext.getCurrentContext();
		ZuulFilter filter = (ZuulFilter) currentContext.get("failed.filter");
		if (filter != null && filter.filterType().equals("post")) {
			return true;
		}
		return false;
	}

	@Override
	public String filterType() {
		return "error";
	}

	@Override
	public int filterOrder() {
		return 30;
	}

}
