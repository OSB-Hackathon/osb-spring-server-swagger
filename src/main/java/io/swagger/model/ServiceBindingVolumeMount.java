package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.ServiceBindingVolumeMountDevice;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceBindingVolumeMount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-03T05:51:50.830Z[GMT]")


public class ServiceBindingVolumeMount   {
  @JsonProperty("container_dir")
  private String containerDir = null;

  @JsonProperty("device")
  private ServiceBindingVolumeMountDevice device = null;

  /**
   * Gets or Sets deviceType
   */
  public enum DeviceTypeEnum {
    SHARED("shared");

    private String value;

    DeviceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeviceTypeEnum fromValue(String text) {
      for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("device_type")
  private DeviceTypeEnum deviceType = null;

  @JsonProperty("driver")
  private String driver = null;

  /**
   * Gets or Sets mode
   */
  public enum ModeEnum {
    R("r"),
    
    RW("rw");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("mode")
  private ModeEnum mode = null;

  public ServiceBindingVolumeMount containerDir(String containerDir) {
    this.containerDir = containerDir;
    return this;
  }

  /**
   * Get containerDir
   * @return containerDir
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getContainerDir() {
    return containerDir;
  }

  public void setContainerDir(String containerDir) {
    this.containerDir = containerDir;
  }

  public ServiceBindingVolumeMount device(ServiceBindingVolumeMountDevice device) {
    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ServiceBindingVolumeMountDevice getDevice() {
    return device;
  }

  public void setDevice(ServiceBindingVolumeMountDevice device) {
    this.device = device;
  }

  public ServiceBindingVolumeMount deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Get deviceType
   * @return deviceType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }

  public ServiceBindingVolumeMount driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public ServiceBindingVolumeMount mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
   **/
  @Schema(required = true, description = "")
      @NotNull

    public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingVolumeMount serviceBindingVolumeMount = (ServiceBindingVolumeMount) o;
    return Objects.equals(this.containerDir, serviceBindingVolumeMount.containerDir) &&
        Objects.equals(this.device, serviceBindingVolumeMount.device) &&
        Objects.equals(this.deviceType, serviceBindingVolumeMount.deviceType) &&
        Objects.equals(this.driver, serviceBindingVolumeMount.driver) &&
        Objects.equals(this.mode, serviceBindingVolumeMount.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerDir, device, deviceType, driver, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingVolumeMount {\n");
    
    sb.append("    containerDir: ").append(toIndentedString(containerDir)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
