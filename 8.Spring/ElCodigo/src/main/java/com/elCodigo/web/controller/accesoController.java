package com.elCodigo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class accesoController {

	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String acceso (@RequestParam(value="code") String code, RedirectAttributes mensaje) {
		if (code.equals("bushido")) {
			return "code.jsp";
		}
		else {
			mensaje.addFlashAttribute("error","Debes entrenar mas duro");
			return "redirect:/";
		}
	}
}
