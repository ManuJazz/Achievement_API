package io.swagger.api.factories;

import io.swagger.api.AchievementApiService;
import io.swagger.api.impl.AchievementApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:37:14.645Z[GMT]")
public class AchievementApiServiceFactory {
    private final static AchievementApiService service = new AchievementApiServiceImpl();

    public static AchievementApiService getAchievementApi() {
        return service;
    }
}
