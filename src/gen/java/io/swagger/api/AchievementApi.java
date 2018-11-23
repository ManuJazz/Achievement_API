package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AchievementApiService;
import io.swagger.api.factories.AchievementApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.AchievementItem;
import io.swagger.model.ModelApiResponse;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/achievement")


@io.swagger.annotations.Api(description = "the achievement API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:37:14.645Z[GMT]")

public class AchievementApi  {
   private final AchievementApiService delegate;

   public AchievementApi(@Context ServletConfig servletContext) {
      AchievementApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AchievementApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AchievementApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AchievementApiServiceFactory.getAchievementApi();
      }

      this.delegate = delegate;
   }


    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "add a new achievement in system", notes = "add a new achievement in system", response = Void.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ahievement created", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid Achievement Input", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Achievement already exist", response = Void.class) })
    public Response addachievement(@ApiParam(value = "Achievement to store" ,required=true) AchievementItem body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addachievement(body,securityContext);
    }

    @DELETE
    @Path("/{achievementId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a achievement", notes = "", response = Void.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Achievement not found", response = Void.class) })
    public Response deleteAchievement(@ApiParam(value = "Achievement id to delete",required=true) @PathParam("achievementId") Long achievementId
,@ApiParam(value = "" )@HeaderParam("api_key") String apiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAchievement(achievementId,apiKey,securityContext);
    }

    @GET
    @Path("/{achievementId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find memento by ID", notes = "Returns a single achievement", response = AchievementItem.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementItem.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Achievement not found", response = Void.class) })
    public Response getAchievementById(@ApiParam(value = "ID of achievement to return",required=true) @PathParam("achievementId") Long achievementId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAchievementById(achievementId,securityContext);
    }

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "returns all registried achievements.", notes = "returns all registried achievements.", response = AchievementItem.class, responseContainer = "List", tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response getallachievements(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getallachievements(securityContext);
    }

    @PUT
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Update an existing achievement", notes = "", response = Void.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Achievement not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    public Response updateAchievement(@ApiParam(value = "Achievement object that needs to be added to the store" ,required=true) AchievementItem body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAchievement(body,securityContext);
    }

    @POST
    @Path("/{achievementId}/uploadRecordedMessage")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "uploads a message recorded", notes = "", response = ModelApiResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class) })
    public Response uploadRecordedMessage(@ApiParam(value = "ID of achievement to update",required=true) @PathParam("achievementId") Long achievementId
,@ApiParam(value = "" ) Object body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.uploadRecordedMessage(achievementId,body,securityContext);
    }

}

