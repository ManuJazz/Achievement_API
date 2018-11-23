package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.AchievementItem;
import io.swagger.model.ModelApiResponse;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:37:14.645Z[GMT]")

public class AchievementApiServiceImpl extends AchievementApiService {
    
    private ArrayList <AchievementItem> achievementList = new ArrayList <AchievementItem>();
    
    
    @Override
    public Response addachievement(AchievementItem body, SecurityContext securityContext) throws NotFoundException {
        achievementList.add(body);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "New Achievement: "+ body.getIdAchievement())).build();
    }
    
    @Override
    public Response deleteAchievement(Long achievementId, String apiKey, SecurityContext securityContext) throws NotFoundException {
        for(int i=0; i< achievementList.size(); i++){
            if(achievementList.get(i).getIdAchievement() == achievementId){
                achievementList.remove(i);
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Achievement: " + achievementId +"have been removed")).build();
    }
    
    @Override
    public Response getAchievementById(Long achievementId, SecurityContext securityContext) throws NotFoundException {
        AchievementItem aux = new AchievementItem();
        for(int i=0; i< achievementList.size(); i++){
            if(achievementList.get(i).getIdAchievement() == achievementId){
                aux = achievementList.get(i);
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Achievement return: "+aux.getTitle())).build();
    }
    
    @Override
    public Response getallachievements(SecurityContext securityContext) throws NotFoundException {
        String auxS = new String();
        for(int i=0; i< achievementList.size(); i++){
                auxS = auxS+ achievementList.get(i).getTitle()+"\n";
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, auxS)).build();
    }
    
    @Override
    public Response updateAchievement(AchievementItem body, SecurityContext securityContext) throws NotFoundException {
        for(int i=0; i< achievementList.size(); i++){
            if(achievementList.get(i).getIdAchievement() == body.getIdAchievement()){
                achievementList.get(i).setTitle(body.getTitle());
                 achievementList.get(i).setDescription(body.getDescription());
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Update Achievement: "+body.getTitle())).build();
    }
    
    @Override
    public Response uploadRecordedMessage(Long achievementId, Object body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Voice recorder have been processed")).build();
    }
    
}

