/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.acrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class IndexController {

    @GetMapping
    public String getIndexView(){
        return "index.html";
    }

    @GetMapping("/home")
    public String getHomeView() {
        return "webpages/home.html";
    }

    @GetMapping("/product-page")
    public String getProductsView() {
        return "webpages/product-page.html";
    }

    @GetMapping("/cart-page")
    public String getShoppingCartsView() {
        return "webpages/cart-page.html";
    }

    @GetMapping("/service-page")
    public String getServicePageView() {
        return "webpages/service-page.html";
    }

    @GetMapping("/account-page")
    public String getAccountPageView() {
        return "webpages/account-page.html";
    }

}
