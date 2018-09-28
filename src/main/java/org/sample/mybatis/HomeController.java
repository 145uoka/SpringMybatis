package org.sample.mybatis;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.sample.mybatis.dao.SampleTblDao;
import org.sample.mybatis.entity.SampleTbl;
import org.sample.mybatis.entity.SampleTblExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    @Autowired
    SampleTblDao sampleTblDao;

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate );

        SampleTblExample sampleTblExample = new SampleTblExample();
        List<SampleTbl> sampleTblList = sampleTblDao.selectByExample(sampleTblExample);

        for (SampleTbl sampleTbl : sampleTblList) {
            logger.info("sample_id = [" + sampleTbl.getSampleId() +
                    "], sample_name = [" + sampleTbl.getSampleName() +"]");
        }

        return "home";
    }
}
