package com.cqc.backend.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * author:Junqson
 * create:2018/4/15 14:27
 * des:
 */


    public class CrossOriginFilter implements Filter {

        /*跨域列表*/
    private final List<String> allowedOrigins = Arrays.asList("http://localhost:8080", "http://localhost:8100");

        @Override
        public void init(FilterConfig filterConfig) throws ServletException {

        }

        @Override
        public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
            HttpServletRequest request = (HttpServletRequest) req;
            HttpServletResponse response = (HttpServletResponse) res;
            String origin = request.getHeader("Origin");
            response.setHeader("Access-Control-Allow-Origin", origin);
            response.setHeader("Access-Control-Allow-Methods",

                    "GET, POST, PUT, DELETE, OPTIONS");
            response.setHeader("Access-Control-Allow-Credentials", "true");
            response.setHeader("Access-Control-Allow-Headers",
                    "Origin, X-Requested-With, Content-Type, Accept, Authorization");

            chain.doFilter(req, res);

        }

        @Override
        public void destroy() {

        }
    }

