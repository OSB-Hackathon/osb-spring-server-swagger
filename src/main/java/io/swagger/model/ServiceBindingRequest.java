package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Context;
import io.swagger.model.ServiceBindingResouceObject;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceBindingRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-03T05:51:50.830Z[GMT]")


public class ServiceBindingRequest   {
  @JsonProperty("app_guid")
  private String appGuid = null;

  @JsonProperty("bind_resource")
  private ServiceBindingResouceObject bindResource = null;

  @JsonProperty("context")
  private Context context = null;

  @JsonProperty("parameters")
  private Object parameters = null;

  @JsonProperty("plan_id")
  private String planId = null;

  @JsonProperty("predecessor_binding_id")
  private String predecessorBindingId = null;

  @JsonProperty("service_id")
  private String serviceId = null;

  public ServiceBindingRequest appGuid(String appGuid) {
    this.appGuid = appGuid;
    return this;
  }

  /**
   * Get appGuid
   * @return appGuid
   **/
  @Schema(description = "")
  
    public String getAppGuid() {
    return appGuid;
  }

  public void setAppGuid(String appGuid) {
    this.appGuid = appGuid;
  }

  public ServiceBindingRequest bindResource(ServiceBindingResouceObject bindResource) {
    this.bindResource = bindResource;
    return this;
  }

  /**
   * Get bindResource
   * @return bindResource
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceBindingResouceObject getBindResource() {
    return bindResource;
  }

  public void setBindResource(ServiceBindingResouceObject bindResource) {
    this.bindResource = bindResource;
  }

  public ServiceBindingRequest context(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   **/
  @Schema(description = "")
  
    @Valid
    public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public ServiceBindingRequest parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @Schema(description = "")
  
    public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  public ServiceBindingRequest planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Get planId
   * @return planId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public ServiceBindingRequest predecessorBindingId(String predecessorBindingId) {
    this.predecessorBindingId = predecessorBindingId;
    return this;
  }

  /**
   * Get predecessorBindingId
   * @return predecessorBindingId
   **/
  @Schema(description = "")
  
    public String getPredecessorBindingId() {
    return predecessorBindingId;
  }

  public void setPredecessorBindingId(String predecessorBindingId) {
    this.predecessorBindingId = predecessorBindingId;
  }

  public ServiceBindingRequest serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingRequest serviceBindingRequest = (ServiceBindingRequest) o;
    return Objects.equals(this.appGuid, serviceBindingRequest.appGuid) &&
        Objects.equals(this.bindResource, serviceBindingRequest.bindResource) &&
        Objects.equals(this.context, serviceBindingRequest.context) &&
        Objects.equals(this.parameters, serviceBindingRequest.parameters) &&
        Objects.equals(this.planId, serviceBindingRequest.planId) &&
        Objects.equals(this.predecessorBindingId, serviceBindingRequest.predecessorBindingId) &&
        Objects.equals(this.serviceId, serviceBindingRequest.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appGuid, bindResource, context, parameters, planId, predecessorBindingId, serviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingRequest {\n");
    
    sb.append("    appGuid: ").append(toIndentedString(appGuid)).append("\n");
    sb.append("    bindResource: ").append(toIndentedString(bindResource)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    predecessorBindingId: ").append(toIndentedString(predecessorBindingId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
