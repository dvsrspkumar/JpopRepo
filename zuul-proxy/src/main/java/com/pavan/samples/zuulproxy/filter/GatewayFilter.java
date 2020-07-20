package com.pavan.samples.zuulproxy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import javax.servlet.http.HttpServletRequest;

/**
 * Zuul filters store request and state information in (and share it by means of) the RequestContext.
 * You can use that to get at the HttpServletRequest and then log the HTTP method and URL of the request
 * before it is sent on its way
 */
public class GatewayFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(GatewayFilter.class);

    /**
    Zuul has four standard filter types.
    pre: filters run before the request is routed.
    route: filters can handle the actual routing of the request.
    post: filters run after the request has been routed.
    error: filters run if an error occurs in the course of handling the request.

    Returns a String that stands for the type of the filter — in this case, pre. (It would be route for a routing filter.)
    */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * Gives the order in which this filter is to be run, relative to other filters
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * Contains the logic that determines when to run this filter (this particular filter is always run).
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        return null;
    }
}
