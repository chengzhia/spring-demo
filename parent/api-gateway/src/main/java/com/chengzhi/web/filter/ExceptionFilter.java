package com.chengzhi.web.filter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class ExceptionFilter extends ZuulFilter {
	
	private static Logger log = LoggerFactory.getLogger(ExceptionFilter.class);
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		log.info("this is a pre filter,it will throw a RuntimeException");
		RequestContext context = RequestContext.getCurrentContext();
		try {
			throwException();
		} catch (Exception e) {
			context.set("error.status_code",HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			context.set("error.exception",e);
		}
		return null;
	}

	private void throwException() {
		throw new RuntimeException("exit some errors...");
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
