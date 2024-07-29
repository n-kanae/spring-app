package com.adconnect.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.adconnect.webapp.entity.User;
import com.adconnect.webapp.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    /** DI */
    private final UserService userService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("users", userService.findAllUser());
        return "user/list";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable Integer id, Model model,
            RedirectAttributes attributes) {
        User User = userService.findByIdUser(id);
        if (User != null) {
            // 対象データがある場合はモデルに格納
            model.addAttribute("user", userService.findByIdUser(id));
            return "user/detail";
        } else {
            // 対象データがない場合はフラッシュメッセージを設定
            attributes.addFlashAttribute("errorMessage", "対象データがありません");
            // リダイレクト
            return "redirect:/users";
        }
    }
}
