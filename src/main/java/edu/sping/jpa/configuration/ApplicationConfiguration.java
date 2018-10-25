package edu.sping.jpa.configuration;

import edu.sping.jpa.service.ServiceLayerMarker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@ComponentScan(basePackageClasses = ServiceLayerMarker.class)
public class ApplicationConfiguration {

    @Bean
    public DataSource dataSource(){
        EmbeddedDatabaseBuilder databaseBuilder = new EmbeddedDatabaseBuilder();
        return databaseBuilder
                .setType(EmbeddedDatabaseType.H2)
                .addScripts("db/scripts/init.sql")
                .build();
    }
}
