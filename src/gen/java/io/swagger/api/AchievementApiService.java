package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.AchievementItem;
import io.swagger.model.ModelApiResponse;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:37:14.645Z[GMT]")

public abstract class AchievementApiService {
    
    public abstract Response addachievement(AchievementItem body,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response deleteAchievement(Long achievementId,String apiKey,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getAchievementById(Long achievementId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getallachievements(SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response updateAchievement(AchievementItem body,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response uploadRecordedMessage(Long achievementId,Object body,SecurityContext securityContext) throws NotFoundException;
    
}

