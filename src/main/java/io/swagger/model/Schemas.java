package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ServiceBindingSchema;
import io.swagger.model.ServiceInstanceSchema;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Schemas
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-03T05:51:50.830Z[GMT]")


public class Schemas   {
  @JsonProperty("service_binding")
  private ServiceBindingSchema serviceBinding = null;

  @JsonProperty("service_instance")
  private ServiceInstanceSchema serviceInstance = null;

  public Schemas serviceBinding(ServiceBindingSchema serviceBinding) {
    this.serviceBinding = serviceBinding;
    return this;
  }

  /**
   * Get serviceBinding
   * @return serviceBinding
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceBindingSchema getServiceBinding() {
    return serviceBinding;
  }

  public void setServiceBinding(ServiceBindingSchema serviceBinding) {
    this.serviceBinding = serviceBinding;
  }

  public Schemas serviceInstance(ServiceInstanceSchema serviceInstance) {
    this.serviceInstance = serviceInstance;
    return this;
  }

  /**
   * Get serviceInstance
   * @return serviceInstance
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceInstanceSchema getServiceInstance() {
    return serviceInstance;
  }

  public void setServiceInstance(ServiceInstanceSchema serviceInstance) {
    this.serviceInstance = serviceInstance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schemas schemas = (Schemas) o;
    return Objects.equals(this.serviceBinding, schemas.serviceBinding) &&
        Objects.equals(this.serviceInstance, schemas.serviceInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceBinding, serviceInstance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schemas {\n");
    
    sb.append("    serviceBinding: ").append(toIndentedString(serviceBinding)).append("\n");
    sb.append("    serviceInstance: ").append(toIndentedString(serviceInstance)).append("\n");
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
