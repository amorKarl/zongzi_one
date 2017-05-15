package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/5/15/015.
 */
@org.springframework.stereotype.Controller
public class Controller {



    @RequestMapping(value = "demo",method = RequestMethod.GET)
    @ResponseBody
    public void demo(){



    }
}
