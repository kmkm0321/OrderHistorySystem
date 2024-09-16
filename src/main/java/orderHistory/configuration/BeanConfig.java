package orderHistory.configuration;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import orderHistory.entity.Areas;
import orderHistory.entity.Prefectures;
import orderHistory.entity.Shops;
import orderHistory.oh210.Oh210ResConboBoxDto;
import orderHistory.oh220.Oh220ResConboBoxDto;

@Configuration
public class BeanConfig {
	
	/*コンボボックスの値設定用Beanの中身の初期化処理*/
	@Bean
	Oh210ResConboBoxDto Oh210ResConboBox() {
		Oh210ResConboBoxDto resConboBox = new Oh210ResConboBoxDto();
		resConboBox.setAreas(new ArrayList<Areas>());
		resConboBox.setPrefs(new ArrayList<Prefectures>());
		resConboBox.setShops(new ArrayList<Shops>());
		return resConboBox;
	}
	
	@Bean
	Oh220ResConboBoxDto Oh220ResConboBox() {
		Oh220ResConboBoxDto resConboBox = new Oh220ResConboBoxDto();
		resConboBox.setAreas(new ArrayList<Areas>());
		resConboBox.setPrefs(new ArrayList<Prefectures>());
		resConboBox.setShops(new ArrayList<Shops>());
		return resConboBox;
	}
	
	/*Mapperの注入処理*/
	/*
	@Bean
	public MapperFactoryBean<Oh210Mapper> oh210Mapper() throws Exception {
		MapperFactoryBean<Oh210Mapper> factoryBean = new MapperFactoryBean<>(Oh210Mapper.class);
		factoryBean.setSqlSessionFactory(sqlSessionFactory());
		return factoryBean;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
		return factoryBean.getObject();
	}
	
	@Bean
	public DataSource dataSource() {
		return DataSourceBuilder.create().url("jdbc:postgresql:crud-sample?currentSchema=orders").build();
	}
	
	@Bean
	public Oh210Mapper userMapper() throws Exception {
		SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
		return sqlSessionTemplate.getMapper(Oh210Mapper.class);
	}
	*/

}
