package org.example;

import org.testng.annotations.Test;

import java.util.logging.Logger;

public class ESPNTest {

    static Logger log = Logger.getLogger(ESPNTest.class.getName());

    @Test(groups = {"grupo1"})
    public void login(){
        log.info("Click on user icon\n");
        log.info("Click on Log in button\n");
        log.info("Input username or email address  (test1045@test.com)\n");
        log.info("Input password (Aaaa@1111)\n");
        log.info("Click on Log In button\n");
    }

    @Test(groups = {"grupo1"})
    public void logout(){
        log.info("User has done LOG IN\n");
        log.info("Click on user icon\n");
        log.info("Click on Log Out button\n");
    }

    @Test(groups = {"grupo1"})
    public void deleteAccount(){
        log.info("User has done LOG IN\n");
        log.info("Click on user icon\n");
        log.info("Click on ESPN Profile button\n");
        log.info("Scroll down\n");
        log.info("Click on Delete Account text link\n");
    }

}
