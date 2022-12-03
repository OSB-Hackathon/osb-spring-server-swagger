package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceBindingVolumeMountDevice
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-03T05:51:50.830Z[GMT]")


public class ServiceBindingVolumeMountDevice   {
  @JsonProperty("mount_config")
  private Object mountConfig = null;

  @JsonProperty("volume_id")
  private String volumeId = null;

  public ServiceBindingVolumeMountDevice mountConfig(Object mountConfig) {
    this.mountConfig = mountConfig;
    return this;
  }

  /**
   * Get mountConfig
   * @return mountConfig
   **/
  @Schema(description = "")
  
    public Object getMountConfig() {
    return mountConfig;
  }

  public void setMountConfig(Object mountConfig) {
    this.mountConfig = mountConfig;
  }

  public ServiceBindingVolumeMountDevice volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  /**
   * Get volumeId
   * @return volumeId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingVolumeMountDevice serviceBindingVolumeMountDevice = (ServiceBindingVolumeMountDevice) o;
    return Objects.equals(this.mountConfig, serviceBindingVolumeMountDevice.mountConfig) &&
        Objects.equals(this.volumeId, serviceBindingVolumeMountDevice.volumeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountConfig, volumeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingVolumeMountDevice {\n");
    
    sb.append("    mountConfig: ").append(toIndentedString(mountConfig)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
