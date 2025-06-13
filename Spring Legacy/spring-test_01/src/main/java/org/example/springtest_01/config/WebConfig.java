// 글로벌 웹에 관련된 설정, CORS, 필터 등을 설정
// Root,Servlet 설정 파일들을 불러와서 최종적으로 적용

package org.example.springtest_01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;


@Configuration
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    // RootConfig 의 기본 설정 불러오기
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                RootConfig.class
        };
    }
    // ServletConfig 의 서블릿 설정 불러오기
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                ServletConfig.class
        };
    }

    // 스프링의 FrontController인 DispatcherServlet이 담당할 Url 매핑 패턴, / : 모든 요청에 대해 매핑
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 문자 인코딩 필터설정, UTF-8설정
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return new Filter[]{characterEncodingFilter};
    }
}
