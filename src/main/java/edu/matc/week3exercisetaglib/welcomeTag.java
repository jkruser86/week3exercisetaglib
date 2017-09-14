package edu.matc.week3exercisetaglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.*;


public class welcomeTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        LocalDateTime date = LocalDateTime.now();

        JspWriter out = getJspContext().getOut();

        if (date.getMonthValue() == 10 && date.getDayOfMonth() == 31) {
            out.println("Happy Halloween!");
        } else if (date.getHour() < 12) {
            out.println("Good morning!");
        } else if (date.getHour() < 17) {
            out.println("Good afternoon!");
        } else {
            out.println("Good evening!");
        }
    }
}
