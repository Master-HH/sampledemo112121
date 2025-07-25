package com.hossein_heidari.demo1.a;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {

   @RequestMapping("test")
   public String c() {
      return "Hello";
   }
}
