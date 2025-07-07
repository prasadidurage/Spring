package com.example.controller;

import com.example.dto.CustomerDTO;
import jakarta.servlet.annotation.MultipartConfig;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/customer")
@MultipartConfig
public class CustomerController {


//    save customer - form data
//            cname customer name
//            cid  customer id
//            caddress  custimoer address
    //====================================================== x-www form==========================================
   // @PostMapping
//    public String addCustomer(@ModelAttribute  CustomerDTO customerDTO) {
//        System.out.println(customerDTO.getCID());
//        System.out.println(customerDTO.getCName());
//        System.out.println(customerDTO.getCAddress());
//        return "Customer added";
//    }



    //===================================== Query parameter========================================
//    @PostMapping (params = {"cID","cName","cAddress"})
//    public String saveCustomerQueryparam(
//            @RequestParam("cID") String cID,
//            @RequestParam("cName") String cName,
//            @RequestParam("cAddress") String cAddress) {
//        System.out.println(cID);
//        System.out.println(cName);
//        System.out.println(cAddress);
//        return "Customer saved";
//
//    }
//

   //==================================== //path variable=================================================
//    @PostMapping(path = "saveWithPathVariable/{cID},{cName},{cAddress}")
//    public String customerSavePathVariable(
//           @PathVariable("cID") String cID,  //
//           @PathVariable("cName")  String cName,
//           @PathVariable("cAddress") String cAddress) {
//
//        System.out.println(cID);
//        System.out.println(cName);
//        System.out.println(cAddress);
//
//        return " saved";
//    }



    //=================================json===================================================================
    @PostMapping(path = "saveWithJSON",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String addCustomerWithJson(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO.getCID());
        System.out.println(customerDTO.getCName());
        System.out.println(customerDTO.getCAddress());
        return "success";

    }

    //===================RETURN JSON OBJECT ==========================
    @GetMapping(path = "getCustomer",produces ={MediaType.APPLICATION_JSON_VALUE} )
    public String  getCustomerWithJson() {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCID("001");
        customerDTO.setCName("tharusha");
        customerDTO.setCAddress("galle");
        System.out.println(customerDTO);
        return customerDTO.toString();
    }


}
