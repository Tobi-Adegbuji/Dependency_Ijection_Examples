package edu.gsu.diexample.config;

import edu.gsu.diexample.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    //@Value MUST BE USED if you want use properties (for annotations and java configs)

    @Value("${musician.name}")
    String name;
    @Value("${musician.instrument}")
    String instrument;
    @Value("${musician.genre}")
    String genre;
    @Value("${musician.url}")
    String url;

    @Bean
    public FakeDataSource fakeDataSourceBean(){
        return new FakeDataSource();
    }

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setName(name);
        fakeDataSource.setGenre(genre);
        fakeDataSource.setInstrument(instrument);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

}
