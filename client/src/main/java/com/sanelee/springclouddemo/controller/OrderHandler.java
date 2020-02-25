package com.sanelee.springclouddemo.controller;

import com.netflix.ribbon.proxy.annotation.Http;
import com.sanelee.springclouddemo.entity.Menu;
import com.sanelee.springclouddemo.entity.Order;
import com.sanelee.springclouddemo.entity.OrderVO;
import com.sanelee.springclouddemo.entity.User;
import com.sanelee.springclouddemo.fegin.OrderFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/order")
public class OrderHandler {
    @Autowired
    private OrderFegin orderFegin;

    @GetMapping("save/{mid}")
    public String save(@PathVariable("mid") int mid, HttpSession session){
        User user = (User)session.getAttribute("user");
        Order order = new Order();
        order.setUser(user);
        Menu menu = new Menu();
        menu.setId(mid);
        order.setMenu(menu);
        orderFegin.save(order);
        return "index";
    }
    @GetMapping("/findAllByUid")
    @ResponseBody
    public OrderVO findAllByUid(@RequestParam("page") int page,@RequestParam("limit") int limit, HttpSession session){
        User user = (User) session.getAttribute("user");
        int index = (page-1)*limit;
        return orderFegin.findAllByUid(index,limit,user.getId());
    }
    @GetMapping("/findAll")
    @ResponseBody
    public OrderVO findAll(@RequestParam("page") int page,@RequestParam("limit") int limit){
        int index = (page-1)*limit;
        return orderFegin.findAll(index,limit);
    }

    @GetMapping("/updateState/{id}")
    public String updateState(@PathVariable("id") long id){
        orderFegin.updateState(id);
        return "redirect:/menu/redirect/orderHandler";
    }
}
