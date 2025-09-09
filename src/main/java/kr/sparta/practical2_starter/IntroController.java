package kr.sparta.practical2_starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/*
 Controller ?
 사용자의 요청을 처음으로 받아서
 어떤 작업을 해야 할지 판단하고** 그 작업을 Service에게 시키는 역할을 해요.
 */


@Controller
public class IntroController {
    @Autowired
    private MbtiEmojiService mbtiEmojiService;

    @GetMapping("/form")
    public String openForm(Model model){
        model.addAttribute("person",new Person());
        return "form";

    }

    @PostMapping("/intro")
    public String submitForm(@ModelAttribute("person") Person person, Model model) {
        System.out.println("--------------------intro");
        model.addAttribute("person", person);
        return "result";

    }



}
