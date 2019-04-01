package br.com.mediacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.mediacao.daos.ParteDao;
import br.com.mediacao.models.Parte;

@Controller
public class PartesController {
	
	@Autowired
    private ParteDao parteDao;
	
	@RequestMapping("/partes/form")
    public String form(){
        return "partes/form";
    }
	
	@RequestMapping(value="/partes", method=RequestMethod.POST)
	public String gravar(Parte parte){
		System.out.println(parte);
		parteDao.gravar(parte);

	    return "partes/ok";
	}
	
	@RequestMapping(value="/partes", method=RequestMethod.GET)
	public ModelAndView listar(){
	    List<Parte> partes = parteDao.listar();
	    ModelAndView modelAndView = new ModelAndView("/partes/lista");
	    modelAndView.addObject("partes", partes);
	    return modelAndView;
	}
	
	@RequestMapping("partes/detalhe/{id}")
	public ModelAndView detalhe(@PathVariable("id") Integer id){
	    ModelAndView modelAndView = new ModelAndView("/partes/detalhe");
	    Parte parte = parteDao.find(id);
	    modelAndView.addObject("parte", parte);
	    return modelAndView;
	}
}


