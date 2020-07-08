package com.bt.spqr.soap;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.bt.spqr.model.NBIResponse;
import com.bt.spqr.services.AvailabilityService;
import com.bt.spqr.soap.generated.GetNBIAvailabilityByEIRCodeRequest;
import com.bt.spqr.soap.generated.GetNBIAvailabilityByEIRCodeResponse;
import com.bt.spqr.soap.generated.NBIResponseDTO;

@Endpoint
public class NBIEndPoint {
	
	@Autowired
	AvailabilityService availabilityService;
	@Autowired
	ModelMapper modelMapper;

  @PayloadRoot(namespace = "http://generated.soap.spqr.bt.com", localPart = "GetNBIAvailabilityByEIRCodeRequest")
  @ResponsePayload
  public GetNBIAvailabilityByEIRCodeResponse GetNBIAvailabilityByEIRCode(@RequestPayload GetNBIAvailabilityByEIRCodeRequest request) {
	  GetNBIAvailabilityByEIRCodeResponse response = new GetNBIAvailabilityByEIRCodeResponse();
	  NBIResponse nbiResponse = availabilityService.getNBIAvailabilityStatus(request.getEirCode());
	  NBIResponseDTO nbiResponseDTO = modelMapper.map(nbiResponse, NBIResponseDTO.class);	  
	  response.setNBIResponseDTO(nbiResponseDTO);
    
    return response;
  }

}
