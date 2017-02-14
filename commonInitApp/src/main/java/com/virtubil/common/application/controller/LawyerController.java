/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.controller;

import com.virtubil.common.application.service.LawyerService;
import com.virtubil.common.application.beans.Lawyer;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Janadhi Nanayakkara
 */
@Controller
public class LawyerController {

    @Autowired
    private LawyerService lawyerService;

    @RequestMapping(value = {"/lawyer/add"}, method = RequestMethod.POST)
    public ModelAndView addLawyer(HttpServletRequest request, HttpSession userSession) {
        System.out.println("CALLED------------------------");

        String userName = request.getParameter("user_name");
        String password = request.getParameter("pw");
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String mobile = request.getParameter("mobile");

        Lawyer lawyer = new Lawyer();
        lawyer.setFirstName(firstName);
        lawyer.setLastName(lastName);
        lawyer.setUserName(userName);
        lawyer.setPassword(password);
        lawyer.setMobile(mobile);

        lawyerService.addLawyer(lawyer);
        request.setAttribute("result", "Added Successfully");

        ModelAndView view = new ModelAndView();
        view.setViewName("signup");
        return view;
    }
}
