package com.example;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.example.config.WebAppConfig;
import com.example.config.WebRootConfig;
import org.jspecify.annotations.Nullable;
import org.springframework.aop.framework.autoproxy.target.AbstractBeanFactoryBasedTargetSourceCreator;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.lang.model.util.AbstractAnnotationValueVisitor6;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    //parent context
    //business logic
    protected Class<?> @Nullable [] getRootConfigClasses() {
        return new Class<?>[]{WebRootConfig.class};
    }

    @Override
    //child context
    // request mapping controller and view controller
    protected Class<?> @Nullable [] getServletConfigClasses() {

        return new Class<?>[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
