package top.whq6.study.config;

import com.alibaba.druid.pool.DruidDataSource;
import java.io.IOException;
import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author whq
 * @version 1.0 date: 2019-07-30
 */
@Slf4j
@Configuration
@MapperScan("top.whq6.study.mapper")
public class BaseConfig {

  @Bean
  public InternalResourceViewResolver internalResourceViewResolver() {
    final InternalResourceViewResolver internalResourceViewResolver =
        new InternalResourceViewResolver();
    internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
    internalResourceViewResolver.setSuffix(".jsp");
    return internalResourceViewResolver;
  }

  @Bean
  public DataSource dataSource(
      @Value("${jdbc.url}") String url,
      @Value("${jdbc.driver}") String driver,
      @Value("${jdbc.username}") String username,
      @Value("${jdbc.password}") String password,
      @Value("${jdbc.max.active}") Integer maxActive,
      @Value("${jdbc.min.idle}") Integer minIdle) {

    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setUrl(url);
    dataSource.setDriverClassName(driver);
    dataSource.setUsername(username);
    dataSource.setPassword(password);

    dataSource.setMaxActive(maxActive);
    dataSource.setMinIdle(minIdle);

    return dataSource;
  }

  @Bean
  public SqlSessionFactoryBean sqlSessionFactory(
      @Autowired DataSource dataSource,
      @Value("${mybatis.config.local}") String configLocal,
      @Value("${mybatis.xml.local}") String xmlLocal)
      throws IOException {
    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(dataSource);
    sqlSessionFactoryBean.setConfigLocation(resolver.getResource(configLocal));
    Resource[] resources = resolver.getResources(xmlLocal);
    sqlSessionFactoryBean.setMapperLocations(resources);

    return sqlSessionFactoryBean;
  }

  @Bean
  public SqlSessionTemplate sqlSessionTemplate(@Autowired SqlSessionFactoryBean sqlSessionFactory)
      throws Exception {

    final SqlSessionFactory object = sqlSessionFactory.getObject();
    if (object == null){
      log.error("SqlSessionFactory is NULL.");
      return null;
    }
    return new SqlSessionTemplate(object);
  }
}
