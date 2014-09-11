package hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @RequestMapping(value=Array("/"))
    def HelloWorld(): String=( "Hello, world")
}
