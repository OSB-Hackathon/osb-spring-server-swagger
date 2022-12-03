package io.swagger.api;

import io.swagger.model.Catalog;
import io.swagger.model.ErrorModelNamenamespaceioSwaggerModelNameAsyncOperation;
import io.swagger.model.ErrorModelNamenamespaceioSwaggerModelNameError;
import io.swagger.model.ErrorModelNamenamespaceioSwaggerModelNameServiceInstanceAsyncOperation;
import io.swagger.model.LastOperationResource;
import io.swagger.model.ServiceBindingRequest;
import io.swagger.model.ServiceBindingResource;
import io.swagger.model.ServiceBindingResponse;
import io.swagger.model.ServiceInstanceProvisionRequestBody;
import io.swagger.model.ServiceInstanceProvisionResponse;
import io.swagger.model.ServiceInstanceResource;
import io.swagger.model.ServiceInstanceUpdateRequestBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-03T05:51:50.830Z[GMT]")
@RestController
public class V2ApiController implements V2Api {

    private static final Logger log = LoggerFactory.getLogger(V2ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V2ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Catalog> catalogGetUsingGET(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema()) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Catalog>(objectMapper.readValue("{\n  \"services\" : [ {\n    \"bindable\" : false,\n    \"metadata\" : { },\n    \"plan_updateable\" : false,\n    \"plans\" : [ {\n      \"bindable\" : false,\n      \"metadata\" : null,\n      \"maintenance_info\" : {\n        \"description\" : \"description\",\n        \"version\" : \"version\"\n      },\n      \"plan_updateable\" : false,\n      \"schemas\" : {\n        \"service_binding\" : {\n          \"create\" : {\n            \"parameters\" : { }\n          }\n        },\n        \"service_instance\" : {\n          \"create\" : null,\n          \"update\" : null\n        }\n      },\n      \"binding_rotatable\" : false,\n      \"name\" : \"name\",\n      \"description\" : \"description\",\n      \"id\" : \"id\",\n      \"free\" : false,\n      \"maximum_polling_duration\" : 0\n    }, {\n      \"bindable\" : false,\n      \"metadata\" : null,\n      \"maintenance_info\" : {\n        \"description\" : \"description\",\n        \"version\" : \"version\"\n      },\n      \"plan_updateable\" : false,\n      \"schemas\" : {\n        \"service_binding\" : {\n          \"create\" : {\n            \"parameters\" : { }\n          }\n        },\n        \"service_instance\" : {\n          \"create\" : null,\n          \"update\" : null\n        }\n      },\n      \"binding_rotatable\" : false,\n      \"name\" : \"name\",\n      \"description\" : \"description\",\n      \"id\" : \"id\",\n      \"free\" : false,\n      \"maximum_polling_duration\" : 0\n    } ],\n    \"binding_rotatable\" : false,\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"dashboard_client\" : {\n      \"id\" : \"id\",\n      \"redirect_uri\" : \"redirect_uri\",\n      \"secret\" : \"secret\"\n    },\n    \"requires\" : [ \"route_forwarding\", \"route_forwarding\" ],\n    \"tags\" : [ \"tags\", \"tags\" ]\n  }, {\n    \"bindable\" : false,\n    \"metadata\" : { },\n    \"plan_updateable\" : false,\n    \"plans\" : [ {\n      \"bindable\" : false,\n      \"metadata\" : null,\n      \"maintenance_info\" : {\n        \"description\" : \"description\",\n        \"version\" : \"version\"\n      },\n      \"plan_updateable\" : false,\n      \"schemas\" : {\n        \"service_binding\" : {\n          \"create\" : {\n            \"parameters\" : { }\n          }\n        },\n        \"service_instance\" : {\n          \"create\" : null,\n          \"update\" : null\n        }\n      },\n      \"binding_rotatable\" : false,\n      \"name\" : \"name\",\n      \"description\" : \"description\",\n      \"id\" : \"id\",\n      \"free\" : false,\n      \"maximum_polling_duration\" : 0\n    }, {\n      \"bindable\" : false,\n      \"metadata\" : null,\n      \"maintenance_info\" : {\n        \"description\" : \"description\",\n        \"version\" : \"version\"\n      },\n      \"plan_updateable\" : false,\n      \"schemas\" : {\n        \"service_binding\" : {\n          \"create\" : {\n            \"parameters\" : { }\n          }\n        },\n        \"service_instance\" : {\n          \"create\" : null,\n          \"update\" : null\n        }\n      },\n      \"binding_rotatable\" : false,\n      \"name\" : \"name\",\n      \"description\" : \"description\",\n      \"id\" : \"id\",\n      \"free\" : false,\n      \"maximum_polling_duration\" : 0\n    } ],\n    \"binding_rotatable\" : false,\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"dashboard_client\" : {\n      \"id\" : \"id\",\n      \"redirect_uri\" : \"redirect_uri\",\n      \"secret\" : \"secret\"\n    },\n    \"requires\" : [ \"route_forwarding\", \"route_forwarding\" ],\n    \"tags\" : [ \"tags\", \"tags\" ]\n  } ]\n}", Catalog.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Catalog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Catalog>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceBindingResponse> serviceBindingBindingUsingPUT(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema()) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "instance id of instance to create a binding on", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@Parameter(in = ParameterIn.PATH, description = "binding id of binding to create", required=true, schema=@Schema()) @PathVariable("binding_id") String bindingId,@Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@Parameter(in = ParameterIn.QUERY, description = "asynchronous operations supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ServiceBindingRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceBindingResponse>(objectMapper.readValue("{\n  \"endpoints\" : [ {\n    \"protocol\" : \"all\",\n    \"host\" : \"host\",\n    \"ports\" : [ \"ports\", \"ports\" ]\n  }, {\n    \"protocol\" : \"all\",\n    \"host\" : \"host\",\n    \"ports\" : [ \"ports\", \"ports\" ]\n  } ],\n  \"metadata\" : {\n    \"expires_at\" : \"expires_at\",\n    \"renew_before\" : \"renew_before\"\n  },\n  \"route_service_url\" : \"route_service_url\",\n  \"credentials\" : { },\n  \"syslog_drain_url\" : \"syslog_drain_url\",\n  \"volume_mounts\" : [ {\n    \"mode\" : \"r\",\n    \"driver\" : \"driver\",\n    \"device_type\" : \"shared\",\n    \"device\" : {\n      \"volume_id\" : \"volume_id\",\n      \"mount_config\" : null\n    },\n    \"container_dir\" : \"container_dir\"\n  }, {\n    \"mode\" : \"r\",\n    \"driver\" : \"driver\",\n    \"device_type\" : \"shared\",\n    \"device\" : {\n      \"volume_id\" : \"volume_id\",\n      \"mount_config\" : null\n    },\n    \"container_dir\" : \"container_dir\"\n  } ]\n}", ServiceBindingResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceBindingResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceBindingResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceBindingResource> serviceBindingGetUsingGET(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema()) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "instance id of instance associated with the binding", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@Parameter(in = ParameterIn.PATH, description = "binding id of binding to fetch", required=true, schema=@Schema()) @PathVariable("binding_id") String bindingId,@Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = false) String serviceId,@Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = false) String planId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceBindingResource>(objectMapper.readValue("{\n  \"endpoints\" : [ {\n    \"protocol\" : \"all\",\n    \"host\" : \"host\",\n    \"ports\" : [ \"ports\", \"ports\" ]\n  }, {\n    \"protocol\" : \"all\",\n    \"host\" : \"host\",\n    \"ports\" : [ \"ports\", \"ports\" ]\n  } ],\n  \"metadata\" : {\n    \"expires_at\" : \"expires_at\",\n    \"renew_before\" : \"renew_before\"\n  },\n  \"route_service_url\" : \"route_service_url\",\n  \"credentials\" : { },\n  \"syslog_drain_url\" : \"syslog_drain_url\",\n  \"volume_mounts\" : [ {\n    \"mode\" : \"r\",\n    \"driver\" : \"driver\",\n    \"device_type\" : \"shared\",\n    \"device\" : {\n      \"volume_id\" : \"volume_id\",\n      \"mount_config\" : null\n    },\n    \"container_dir\" : \"container_dir\"\n  }, {\n    \"mode\" : \"r\",\n    \"driver\" : \"driver\",\n    \"device_type\" : \"shared\",\n    \"device\" : {\n      \"volume_id\" : \"volume_id\",\n      \"mount_config\" : null\n    },\n    \"container_dir\" : \"container_dir\"\n  } ],\n  \"parameters\" : null\n}", ServiceBindingResource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceBindingResource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceBindingResource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LastOperationResource> serviceBindingLastOperationGetUsingGET(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema()) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "instance id of instance to find last operation applied to it", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@Parameter(in = ParameterIn.PATH, description = "binding id of service binding to find last operation applied to it", required=true, schema=@Schema()) @PathVariable("binding_id") String bindingId,@Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = false) String serviceId,@Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = false) String planId,@Parameter(in = ParameterIn.QUERY, description = "a provided identifier for the operation" ,schema=@Schema()) @Valid @RequestParam(value = "operation", required = false) String operation) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LastOperationResource>(objectMapper.readValue("{\n  \"instance_usable\" : false,\n  \"update_repeatable\" : false,\n  \"description\" : \"description\",\n  \"state\" : \"failed\"\n}", LastOperationResource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LastOperationResource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LastOperationResource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> serviceBindingUnbindingUsingDELETE(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema()) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "id of the instance associated with the binding being deleted", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@Parameter(in = ParameterIn.PATH, description = "id of the binding being deleted", required=true, schema=@Schema()) @PathVariable("binding_id") String bindingId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance for which a binding is being deleted" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = true) String serviceId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance for which a binding is being deleted" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = true) String planId,@Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@Parameter(in = ParameterIn.QUERY, description = "asynchronous operations supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> serviceInstanceDeprovisionUsingDELETE(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema()) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "id of instance being deleted", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance being deleted" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = true) String serviceId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance being deleted" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = true) String planId,@Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@Parameter(in = ParameterIn.QUERY, description = "asynchronous deprovision supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceInstanceResource> serviceInstanceGetUsingGET(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema()) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "instance id of instance to fetch", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = false) String serviceId,@Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = false) String planId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceInstanceResource>(objectMapper.readValue("{\n  \"metadata\" : {\n    \"attributes\" : { },\n    \"labels\" : null\n  },\n  \"maintenance_info\" : {\n    \"description\" : \"description\",\n    \"version\" : \"version\"\n  },\n  \"service_id\" : \"service_id\",\n  \"dashboard_url\" : \"dashboard_url\",\n  \"parameters\" : null,\n  \"plan_id\" : \"plan_id\"\n}", ServiceInstanceResource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceInstanceResource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceInstanceResource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LastOperationResource> serviceInstanceLastOperationGetUsingGET(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema()) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "instance id of instance to find last operation applied to it", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = false) String serviceId,@Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = false) String planId,@Parameter(in = ParameterIn.QUERY, description = "a provided identifier for the operation" ,schema=@Schema()) @Valid @RequestParam(value = "operation", required = false) String operation) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LastOperationResource>(objectMapper.readValue("{\n  \"instance_usable\" : false,\n  \"update_repeatable\" : false,\n  \"description\" : \"description\",\n  \"state\" : \"failed\"\n}", LastOperationResource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LastOperationResource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LastOperationResource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceInstanceProvisionResponse> serviceInstanceProvisionUsingPUT(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema()) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "instance id of instance to provision", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@Parameter(in = ParameterIn.QUERY, description = "asynchronous operations supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ServiceInstanceProvisionRequestBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceInstanceProvisionResponse>(objectMapper.readValue("{\n  \"metadata\" : {\n    \"attributes\" : { },\n    \"labels\" : null\n  },\n  \"dashboard_url\" : \"dashboard_url\"\n}", ServiceInstanceProvisionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceInstanceProvisionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceInstanceProvisionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> serviceInstanceUpdateUsingPATCH(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema()) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@Parameter(in = ParameterIn.PATH, description = "instance id of instance to update", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId,@Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@Parameter(in = ParameterIn.QUERY, description = "asynchronous operations supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ServiceInstanceUpdateRequestBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
