package me.n1ar4.test.demos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/data")
class DataController {
    
    @GetMapping("/status")
    @ResponseBody
    public Map<String, String> getStatus() {
        Map<String, String> status = new HashMap<>();
        status.put("server", "running");
        status.put("time", String.valueOf(System.currentTimeMillis()));
        return status;
    }
    
    @PostMapping("/submit")
    @ResponseBody
    public String submitData(@RequestParam String data) {
        return "数据已提交: " + data;
    }
    
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    @ResponseBody
    public String healthCheck() {
        return "健康检查通过";
    }
}