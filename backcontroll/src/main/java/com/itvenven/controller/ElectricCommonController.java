package com.itvenven.controller;

import com.itvenven.service.CommonCalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/common")
public class ElectricCommonController {

    @Autowired
    private CommonCalService commonCalService;

    @RequestMapping("/getPower")
    private ModelMap getPower(@RequestParam double voltage, @RequestParam double current) {
        ModelMap map = new ModelMap();
        double power = commonCalService.getPower(voltage, current);
        if (power == -1){
            map.put("error_msg", "电压或电流输入有误~");
        }
        map.put("power", power);
        return map;
    }


}
