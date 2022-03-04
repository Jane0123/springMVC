package test;


import dao.AbcDao;
import dao.lmpl.AbcDaolmpl;
import entity.Abc;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class TextController{


        @RequestMapping("/test")
        public ModelAndView  hello() {
            System.out.println("Hello！  成功进入");
            AbcDao abcDao = new AbcDaolmpl();
            /**
             * 查询所有
             * @return
             */
            ModelAndView mav = new ModelAndView();
            List<Abc> abc = abcDao.queryAll(null);
            mav.addObject("msg", abc);
            mav.setViewName("test");
            return mav;

        }

        }


